/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class realm_property_type_e {
  public final static realm_property_type_e RLM_PROPERTY_TYPE_INT = new realm_property_type_e("RLM_PROPERTY_TYPE_INT", realmcJNI.RLM_PROPERTY_TYPE_INT_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_BOOL = new realm_property_type_e("RLM_PROPERTY_TYPE_BOOL", realmcJNI.RLM_PROPERTY_TYPE_BOOL_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_STRING = new realm_property_type_e("RLM_PROPERTY_TYPE_STRING", realmcJNI.RLM_PROPERTY_TYPE_STRING_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_BINARY = new realm_property_type_e("RLM_PROPERTY_TYPE_BINARY", realmcJNI.RLM_PROPERTY_TYPE_BINARY_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_ANY = new realm_property_type_e("RLM_PROPERTY_TYPE_ANY", realmcJNI.RLM_PROPERTY_TYPE_ANY_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_TIMESTAMP = new realm_property_type_e("RLM_PROPERTY_TYPE_TIMESTAMP", realmcJNI.RLM_PROPERTY_TYPE_TIMESTAMP_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_FLOAT = new realm_property_type_e("RLM_PROPERTY_TYPE_FLOAT", realmcJNI.RLM_PROPERTY_TYPE_FLOAT_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_DOUBLE = new realm_property_type_e("RLM_PROPERTY_TYPE_DOUBLE", realmcJNI.RLM_PROPERTY_TYPE_DOUBLE_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_DECIMAL128 = new realm_property_type_e("RLM_PROPERTY_TYPE_DECIMAL128", realmcJNI.RLM_PROPERTY_TYPE_DECIMAL128_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_OBJECT = new realm_property_type_e("RLM_PROPERTY_TYPE_OBJECT", realmcJNI.RLM_PROPERTY_TYPE_OBJECT_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_LINKING_OBJECTS = new realm_property_type_e("RLM_PROPERTY_TYPE_LINKING_OBJECTS", realmcJNI.RLM_PROPERTY_TYPE_LINKING_OBJECTS_get());
  public final static realm_property_type_e RLM_PROPERTY_TYPE_OBJECT_ID = new realm_property_type_e("RLM_PROPERTY_TYPE_OBJECT_ID", realmcJNI.RLM_PROPERTY_TYPE_OBJECT_ID_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static realm_property_type_e swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + realm_property_type_e.class + " with value " + swigValue);
  }

  private realm_property_type_e(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private realm_property_type_e(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private realm_property_type_e(String swigName, realm_property_type_e swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static realm_property_type_e[] swigValues = { RLM_PROPERTY_TYPE_INT, RLM_PROPERTY_TYPE_BOOL, RLM_PROPERTY_TYPE_STRING, RLM_PROPERTY_TYPE_BINARY, RLM_PROPERTY_TYPE_ANY, RLM_PROPERTY_TYPE_TIMESTAMP, RLM_PROPERTY_TYPE_FLOAT, RLM_PROPERTY_TYPE_DOUBLE, RLM_PROPERTY_TYPE_DECIMAL128, RLM_PROPERTY_TYPE_OBJECT, RLM_PROPERTY_TYPE_LINKING_OBJECTS, RLM_PROPERTY_TYPE_OBJECT_ID };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
