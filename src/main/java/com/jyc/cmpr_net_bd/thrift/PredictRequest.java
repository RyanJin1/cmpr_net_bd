/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jyc.cmpr_net_bd.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-02-18")
public class PredictRequest implements org.apache.thrift.TBase<PredictRequest, PredictRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PredictRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PredictRequest");

  private static final org.apache.thrift.protocol.TField DISEASE_FIELD_DESC = new org.apache.thrift.protocol.TField("disease", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PredictRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PredictRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String disease; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DISEASE((short)1, "disease");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DISEASE
          return DISEASE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DISEASE, new org.apache.thrift.meta_data.FieldMetaData("disease", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PredictRequest.class, metaDataMap);
  }

  public PredictRequest() {
  }

  public PredictRequest(
    String disease)
  {
    this();
    this.disease = disease;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PredictRequest(PredictRequest other) {
    if (other.isSetDisease()) {
      this.disease = other.disease;
    }
  }

  public PredictRequest deepCopy() {
    return new PredictRequest(this);
  }

  @Override
  public void clear() {
    this.disease = null;
  }

  @org.apache.thrift.annotation.Nullable
  public String getDisease() {
    return this.disease;
  }

  public PredictRequest setDisease(@org.apache.thrift.annotation.Nullable String disease) {
    this.disease = disease;
    return this;
  }

  public void unsetDisease() {
    this.disease = null;
  }

  /** Returns true if field disease is set (has been assigned a value) and false otherwise */
  public boolean isSetDisease() {
    return this.disease != null;
  }

  public void setDiseaseIsSet(boolean value) {
    if (!value) {
      this.disease = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case DISEASE:
      if (value == null) {
        unsetDisease();
      } else {
        setDisease((String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DISEASE:
      return getDisease();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DISEASE:
      return isSetDisease();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that instanceof PredictRequest)
      return this.equals((PredictRequest)that);
    return false;
  }

  public boolean equals(PredictRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_disease = true && this.isSetDisease();
    boolean that_present_disease = true && that.isSetDisease();
    if (this_present_disease || that_present_disease) {
      if (!(this_present_disease && that_present_disease))
        return false;
      if (!this.disease.equals(that.disease))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDisease()) ? 131071 : 524287);
    if (isSetDisease())
      hashCode = hashCode * 8191 + disease.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PredictRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.compare(isSetDisease(), other.isSetDisease());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisease()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disease, other.disease);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PredictRequest(");
    boolean first = true;

    sb.append("disease:");
    if (this.disease == null) {
      sb.append("null");
    } else {
      sb.append(this.disease);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PredictRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PredictRequestStandardScheme getScheme() {
      return new PredictRequestStandardScheme();
    }
  }

  private static class PredictRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<PredictRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PredictRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DISEASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.disease = iprot.readString();
              struct.setDiseaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PredictRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.disease != null) {
        oprot.writeFieldBegin(DISEASE_FIELD_DESC);
        oprot.writeString(struct.disease);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PredictRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PredictRequestTupleScheme getScheme() {
      return new PredictRequestTupleScheme();
    }
  }

  private static class PredictRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<PredictRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PredictRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDisease()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDisease()) {
        oprot.writeString(struct.disease);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PredictRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.disease = iprot.readString();
        struct.setDiseaseIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

