/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jyc.cmpr_net_bd.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-12-30")
public class RelItem implements org.apache.thrift.TBase<RelItem, RelItem._Fields>, java.io.Serializable, Cloneable, Comparable<RelItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RelItem");

  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("target", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.DOUBLE, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RelItemStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RelItemTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String source; // required
  public @org.apache.thrift.annotation.Nullable String target; // required
  public double weight; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE((short)1, "source"),
    TARGET((short)2, "target"),
    WEIGHT((short)3, "weight");

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
        case 1: // SOURCE
          return SOURCE;
        case 2: // TARGET
          return TARGET;
        case 3: // WEIGHT
          return WEIGHT;
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
  private static final int __WEIGHT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TARGET, new org.apache.thrift.meta_data.FieldMetaData("target", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RelItem.class, metaDataMap);
  }

  public RelItem() {
  }

  public RelItem(
    String source,
    String target,
    double weight)
  {
    this();
    this.source = source;
    this.target = target;
    this.weight = weight;
    setWeightIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RelItem(RelItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSource()) {
      this.source = other.source;
    }
    if (other.isSetTarget()) {
      this.target = other.target;
    }
    this.weight = other.weight;
  }

  public RelItem deepCopy() {
    return new RelItem(this);
  }

  @Override
  public void clear() {
    this.source = null;
    this.target = null;
    setWeightIsSet(false);
    this.weight = 0.0;
  }

  @org.apache.thrift.annotation.Nullable
  public String getSource() {
    return this.source;
  }

  public RelItem setSource(@org.apache.thrift.annotation.Nullable String source) {
    this.source = source;
    return this;
  }

  public void unsetSource() {
    this.source = null;
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return this.source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getTarget() {
    return this.target;
  }

  public RelItem setTarget(@org.apache.thrift.annotation.Nullable String target) {
    this.target = target;
    return this;
  }

  public void unsetTarget() {
    this.target = null;
  }

  /** Returns true if field target is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget() {
    return this.target != null;
  }

  public void setTargetIsSet(boolean value) {
    if (!value) {
      this.target = null;
    }
  }

  public double getWeight() {
    return this.weight;
  }

  public RelItem setWeight(double weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((String)value);
      }
      break;

    case TARGET:
      if (value == null) {
        unsetTarget();
      } else {
        setTarget((String)value);
      }
      break;

    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE:
      return getSource();

    case TARGET:
      return getTarget();

    case WEIGHT:
      return getWeight();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SOURCE:
      return isSetSource();
    case TARGET:
      return isSetTarget();
    case WEIGHT:
      return isSetWeight();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that instanceof RelItem)
      return this.equals((RelItem)that);
    return false;
  }

  public boolean equals(RelItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_source = true && this.isSetSource();
    boolean that_present_source = true && that.isSetSource();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_target = true && this.isSetTarget();
    boolean that_present_target = true && that.isSetTarget();
    if (this_present_target || that_present_target) {
      if (!(this_present_target && that_present_target))
        return false;
      if (!this.target.equals(that.target))
        return false;
    }

    boolean this_present_weight = true;
    boolean that_present_weight = true;
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSource()) ? 131071 : 524287);
    if (isSetSource())
      hashCode = hashCode * 8191 + source.hashCode();

    hashCode = hashCode * 8191 + ((isSetTarget()) ? 131071 : 524287);
    if (isSetTarget())
      hashCode = hashCode * 8191 + target.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(weight);

    return hashCode;
  }

  @Override
  public int compareTo(RelItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.compare(isSetSource(), other.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, other.source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.compare(isSetTarget(), other.isSetTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target, other.target);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.compare(isSetWeight(), other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
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
    StringBuilder sb = new StringBuilder("RelItem(");
    boolean first = true;

    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      sb.append(this.source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("target:");
    if (this.target == null) {
      sb.append("null");
    } else {
      sb.append(this.target);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("weight:");
    sb.append(this.weight);
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

  private static class RelItemStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RelItemStandardScheme getScheme() {
      return new RelItemStandardScheme();
    }
  }

  private static class RelItemStandardScheme extends org.apache.thrift.scheme.StandardScheme<RelItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RelItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.source = iprot.readString();
              struct.setSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.target = iprot.readString();
              struct.setTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.weight = iprot.readDouble();
              struct.setWeightIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RelItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeString(struct.source);
        oprot.writeFieldEnd();
      }
      if (struct.target != null) {
        oprot.writeFieldBegin(TARGET_FIELD_DESC);
        oprot.writeString(struct.target);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
      oprot.writeDouble(struct.weight);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RelItemTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RelItemTupleScheme getScheme() {
      return new RelItemTupleScheme();
    }
  }

  private static class RelItemTupleScheme extends org.apache.thrift.scheme.TupleScheme<RelItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RelItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSource()) {
        optionals.set(0);
      }
      if (struct.isSetTarget()) {
        optionals.set(1);
      }
      if (struct.isSetWeight()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSource()) {
        oprot.writeString(struct.source);
      }
      if (struct.isSetTarget()) {
        oprot.writeString(struct.target);
      }
      if (struct.isSetWeight()) {
        oprot.writeDouble(struct.weight);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RelItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.source = iprot.readString();
        struct.setSourceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.target = iprot.readString();
        struct.setTargetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.weight = iprot.readDouble();
        struct.setWeightIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

