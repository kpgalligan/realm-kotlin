package io.realm.compiler

import io.realm.compiler.Names.DEFAULT_COMPANION
import io.realm.compiler.Names.SCHEMA_METHOD
import org.jetbrains.kotlin.descriptors.*
import org.jetbrains.kotlin.descriptors.annotations.Annotations
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.builtIns
import org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension

class RealmModelSyntheticCompanionExtension : SyntheticResolveExtension {

    override fun getSyntheticCompanionObjectNameIfNeeded(thisDescriptor: ClassDescriptor): Name?  = DEFAULT_COMPANION

    override fun getSyntheticFunctionNames(thisDescriptor: ClassDescriptor): List<Name> {
        return if (thisDescriptor.isRealmObjectCompanion) {
            listOf(SCHEMA_METHOD)
        } else {
            emptyList()
        }
    }

    override fun generateSyntheticMethods(thisDescriptor: ClassDescriptor, name: Name, bindingContext: BindingContext, fromSupertypes: List<SimpleFunctionDescriptor>, result: MutableCollection<SimpleFunctionDescriptor>) {
        if (name != SCHEMA_METHOD) return
        if (thisDescriptor.isRealmObjectCompanion) {
            val classDescriptor = thisDescriptor.containingDeclaration as ClassDescriptor
            result.add(createRealmObjectCompanionSchemaGetterDescriptor(thisDescriptor, classDescriptor))
        }
    }

    private fun createRealmObjectCompanionSchemaGetterDescriptor(
            companionClass: ClassDescriptor,
            realmObjectClass: ClassDescriptor
    ): SimpleFunctionDescriptor {

        return SimpleFunctionDescriptorImpl.create(
                companionClass,
                Annotations.EMPTY,
                SCHEMA_METHOD,
                CallableMemberDescriptor.Kind.SYNTHESIZED,
                companionClass.source
        ).apply {
            initialize(null,
                    companionClass.thisAsReceiverParameter,
                    emptyList(),
                    emptyList(),
                    realmObjectClass.builtIns.stringType,
                    Modality.FINAL,
                    DescriptorVisibilities.PUBLIC
            )
        }
    }
}