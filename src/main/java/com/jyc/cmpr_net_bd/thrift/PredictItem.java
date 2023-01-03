/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jyc.cmpr_net_bd.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-01-01")
public class PredictItem implements org.apache.thrift.TBase<PredictItem, PredictItem._Fields>, java.io.Serializable, Cloneable, Comparable<PredictItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PredictItem");

  private static final org.apache.thrift.protocol.TField HERB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("herb_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("score", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PredictItemStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PredictItemTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String herb_id; // required
  public double score; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HERB_ID((short)1, "herb_id"),
    SCORE((short)2, "score");

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
        case 1: // HERB_ID
          return HERB_ID;
        case 2: // SCORE
          return SCORE;
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
  private static final int __SCORE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HERB_ID, new org.apache.thrift.meta_data.FieldMetaData("herb_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCORE, new org.apache.thrift.meta_data.FieldMetaData("score", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PredictItem.class, metaDataMap);
  }

  public PredictItem() {
  }

  public PredictItem(
    String herb_id,
    double score)
  {
    this();
    this.herb_id = herb_id;
    this.score = score;
    setScoreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PredictItem(PredictItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHerb_id()) {
      this.herb_id = other.herb_id;
    }
    this.score = other.score;
  }

  public PredictItem deepCopy() {
    return new PredictItem(this);
  }

  @Override
  public void clear() {
    this.herb_id = null;
    setScoreIsSet(false);
    this.score = 0.0;
  }

  @org.apache.thrift.annotation.Nullable
  public String getHerb_id() {
    return this.herb_id;
  }

  public PredictItem setHerb_id(@org.apache.thrift.annotation.Nullable String herb_id) {
    this.herb_id = herb_id;
    return this;
  }

  public void unsetHerb_id() {
    this.herb_id = null;
  }

  /** Returns true if field herb_id is set (has been assigned a value) and false otherwise */
  public boolean isSetHerb_id() {
    return this.herb_id != null;
  }

  public void setHerb_idIsSet(boolean value) {
    if (!value) {
      this.herb_id = null;
    }
  }

  public double getScore() {
    return this.score;
  }

  public PredictItem setScore(double score) {
    this.score = score;
    setScoreIsSet(true);
    return this;
  }

  public void unsetScore() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  /** Returns true if field score is set (has been assigned a value) and false otherwise */
  public boolean isSetScore() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  public void setScoreIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCORE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case HERB_ID:
      if (value == null) {
        unsetHerb_id();
      } else {
        setHerb_id((String)value);
      }
      break;

    case SCORE:
      if (value == null) {
        unsetScore();
      } else {
        setScore((Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HERB_ID:
      return getHerb_id();

    case SCORE:
      return getScore();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HERB_ID:
      return isSetHerb_id();
    case SCORE:
      return isSetScore();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that instanceof PredictItem)
      return this.equals((PredictItem)that);
    return false;
  }

  public boolean equals(PredictItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_herb_id = true && this.isSetHerb_id();
    boolean that_present_herb_id = true && that.isSetHerb_id();
    if (this_present_herb_id || that_present_herb_id) {
      if (!(this_present_herb_id && that_present_herb_id))
        return false;
      if (!this.herb_id.equals(that.herb_id))
        return false;
    }

    boolean this_present_score = true;
    boolean that_present_score = true;
    if (this_present_score || that_present_score) {
      if (!(this_present_score && that_present_score))
        return false;
      if (this.score != that.score)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHerb_id()) ? 131071 : 524287);
    if (isSetHerb_id())
      hashCode = hashCode * 8191 + herb_id.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(score);

    return hashCode;
  }

  @Override
  public int compareTo(PredictItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.compare(isSetHerb_id(), other.isSetHerb_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHerb_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.herb_id, other.herb_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.compare(isSetScore(), other.isSetScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.score, other.score);
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
    StringBuilder sb = new StringBuilder("PredictItem(");
    boolean first = true;

    sb.append("herb_id:");
    if (this.herb_id == null) {
      sb.append("null");
    } else {
      sb.append(this.herb_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("score:");
    sb.append(this.score);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PredictItemStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PredictItemStandardScheme getScheme() {
      return new PredictItemStandardScheme();
    }
  }

  private static class PredictItemStandardScheme extends org.apache.thrift.scheme.StandardScheme<PredictItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PredictItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HERB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.herb_id = iprot.readString();
              struct.setHerb_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCORE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.score = iprot.readDouble();
              struct.setScoreIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PredictItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.herb_id != null) {
        oprot.writeFieldBegin(HERB_ID_FIELD_DESC);
        oprot.writeString(struct.herb_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SCORE_FIELD_DESC);
      oprot.writeDouble(struct.score);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PredictItemTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PredictItemTupleScheme getScheme() {
      return new PredictItemTupleScheme();
    }
  }

  private static class PredictItemTupleScheme extends org.apache.thrift.scheme.TupleScheme<PredictItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PredictItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHerb_id()) {
        optionals.set(0);
      }
      if (struct.isSetScore()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHerb_id()) {
        oprot.writeString(struct.herb_id);
      }
      if (struct.isSetScore()) {
        oprot.writeDouble(struct.score);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PredictItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.herb_id = iprot.readString();
        struct.setHerb_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.score = iprot.readDouble();
        struct.setScoreIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

