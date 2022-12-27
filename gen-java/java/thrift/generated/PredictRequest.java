/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package java.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-12-26")
public class PredictRequest implements org.apache.thrift.TBase<PredictRequest, PredictRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PredictRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PredictRequest");

  private static final org.apache.thrift.protocol.TField SYMPTOMS_FIELD_DESC = new org.apache.thrift.protocol.TField("symptoms", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PredictRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PredictRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> symptoms; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SYMPTOMS((short)1, "symptoms");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

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
        case 1: // SYMPTOMS
          return SYMPTOMS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SYMPTOMS, new org.apache.thrift.meta_data.FieldMetaData("symptoms", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PredictRequest.class, metaDataMap);
  }

  public PredictRequest() {
  }

  public PredictRequest(
    java.util.List<java.lang.Integer> symptoms)
  {
    this();
    this.symptoms = symptoms;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PredictRequest(PredictRequest other) {
    if (other.isSetSymptoms()) {
      java.util.List<java.lang.Integer> __this__symptoms = new java.util.ArrayList<java.lang.Integer>(other.symptoms);
      this.symptoms = __this__symptoms;
    }
  }

  public PredictRequest deepCopy() {
    return new PredictRequest(this);
  }

  @Override
  public void clear() {
    this.symptoms = null;
  }

  public int getSymptomsSize() {
    return (this.symptoms == null) ? 0 : this.symptoms.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getSymptomsIterator() {
    return (this.symptoms == null) ? null : this.symptoms.iterator();
  }

  public void addToSymptoms(int elem) {
    if (this.symptoms == null) {
      this.symptoms = new java.util.ArrayList<java.lang.Integer>();
    }
    this.symptoms.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getSymptoms() {
    return this.symptoms;
  }

  public PredictRequest setSymptoms(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> symptoms) {
    this.symptoms = symptoms;
    return this;
  }

  public void unsetSymptoms() {
    this.symptoms = null;
  }

  /** Returns true if field symptoms is set (has been assigned a value) and false otherwise */
  public boolean isSetSymptoms() {
    return this.symptoms != null;
  }

  public void setSymptomsIsSet(boolean value) {
    if (!value) {
      this.symptoms = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SYMPTOMS:
      if (value == null) {
        unsetSymptoms();
      } else {
        setSymptoms((java.util.List<java.lang.Integer>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SYMPTOMS:
      return getSymptoms();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SYMPTOMS:
      return isSetSymptoms();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PredictRequest)
      return this.equals((PredictRequest)that);
    return false;
  }

  public boolean equals(PredictRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_symptoms = true && this.isSetSymptoms();
    boolean that_present_symptoms = true && that.isSetSymptoms();
    if (this_present_symptoms || that_present_symptoms) {
      if (!(this_present_symptoms && that_present_symptoms))
        return false;
      if (!this.symptoms.equals(that.symptoms))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSymptoms()) ? 131071 : 524287);
    if (isSetSymptoms())
      hashCode = hashCode * 8191 + symptoms.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PredictRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSymptoms(), other.isSetSymptoms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSymptoms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.symptoms, other.symptoms);
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
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PredictRequest(");
    boolean first = true;

    sb.append("symptoms:");
    if (this.symptoms == null) {
      sb.append("null");
    } else {
      sb.append(this.symptoms);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
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
          case 1: // SYMPTOMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.symptoms = new java.util.ArrayList<java.lang.Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.symptoms.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSymptomsIsSet(true);
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
      if (struct.symptoms != null) {
        oprot.writeFieldBegin(SYMPTOMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.symptoms.size()));
          for (int _iter3 : struct.symptoms)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
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
      if (struct.isSetSymptoms()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSymptoms()) {
        {
          oprot.writeI32(struct.symptoms.size());
          for (int _iter4 : struct.symptoms)
          {
            oprot.writeI32(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PredictRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.symptoms = new java.util.ArrayList<java.lang.Integer>(_list5.size);
          int _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readI32();
            struct.symptoms.add(_elem6);
          }
        }
        struct.setSymptomsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

