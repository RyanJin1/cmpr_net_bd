/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jyc.cmpr_net_bd.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-01-01")
public class GraphRequset implements org.apache.thrift.TBase<GraphRequset, GraphRequset._Fields>, java.io.Serializable, Cloneable, Comparable<GraphRequset> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GraphRequset");

  private static final org.apache.thrift.protocol.TField HERBS_FIELD_DESC = new org.apache.thrift.protocol.TField("herbs", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EMBED_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("embedType", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GraphRequsetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GraphRequsetTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<String> herbs; // required
  public @org.apache.thrift.annotation.Nullable String embedType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HERBS((short)1, "herbs"),
    EMBED_TYPE((short)2, "embedType");

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
        case 1: // HERBS
          return HERBS;
        case 2: // EMBED_TYPE
          return EMBED_TYPE;
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
    tmpMap.put(_Fields.HERBS, new org.apache.thrift.meta_data.FieldMetaData("herbs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EMBED_TYPE, new org.apache.thrift.meta_data.FieldMetaData("embedType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GraphRequset.class, metaDataMap);
  }

  public GraphRequset() {
  }

  public GraphRequset(
    java.util.List<String> herbs,
    String embedType)
  {
    this();
    this.herbs = herbs;
    this.embedType = embedType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GraphRequset(GraphRequset other) {
    if (other.isSetHerbs()) {
      java.util.List<String> __this__herbs = new java.util.ArrayList<String>(other.herbs);
      this.herbs = __this__herbs;
    }
    if (other.isSetEmbedType()) {
      this.embedType = other.embedType;
    }
  }

  public GraphRequset deepCopy() {
    return new GraphRequset(this);
  }

  @Override
  public void clear() {
    this.herbs = null;
    this.embedType = null;
  }

  public int getHerbsSize() {
    return (this.herbs == null) ? 0 : this.herbs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<String> getHerbsIterator() {
    return (this.herbs == null) ? null : this.herbs.iterator();
  }

  public void addToHerbs(String elem) {
    if (this.herbs == null) {
      this.herbs = new java.util.ArrayList<String>();
    }
    this.herbs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<String> getHerbs() {
    return this.herbs;
  }

  public GraphRequset setHerbs(@org.apache.thrift.annotation.Nullable java.util.List<String> herbs) {
    this.herbs = herbs;
    return this;
  }

  public void unsetHerbs() {
    this.herbs = null;
  }

  /** Returns true if field herbs is set (has been assigned a value) and false otherwise */
  public boolean isSetHerbs() {
    return this.herbs != null;
  }

  public void setHerbsIsSet(boolean value) {
    if (!value) {
      this.herbs = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getEmbedType() {
    return this.embedType;
  }

  public GraphRequset setEmbedType(@org.apache.thrift.annotation.Nullable String embedType) {
    this.embedType = embedType;
    return this;
  }

  public void unsetEmbedType() {
    this.embedType = null;
  }

  /** Returns true if field embedType is set (has been assigned a value) and false otherwise */
  public boolean isSetEmbedType() {
    return this.embedType != null;
  }

  public void setEmbedTypeIsSet(boolean value) {
    if (!value) {
      this.embedType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case HERBS:
      if (value == null) {
        unsetHerbs();
      } else {
        setHerbs((java.util.List<String>)value);
      }
      break;

    case EMBED_TYPE:
      if (value == null) {
        unsetEmbedType();
      } else {
        setEmbedType((String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HERBS:
      return getHerbs();

    case EMBED_TYPE:
      return getEmbedType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HERBS:
      return isSetHerbs();
    case EMBED_TYPE:
      return isSetEmbedType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that instanceof GraphRequset)
      return this.equals((GraphRequset)that);
    return false;
  }

  public boolean equals(GraphRequset that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_herbs = true && this.isSetHerbs();
    boolean that_present_herbs = true && that.isSetHerbs();
    if (this_present_herbs || that_present_herbs) {
      if (!(this_present_herbs && that_present_herbs))
        return false;
      if (!this.herbs.equals(that.herbs))
        return false;
    }

    boolean this_present_embedType = true && this.isSetEmbedType();
    boolean that_present_embedType = true && that.isSetEmbedType();
    if (this_present_embedType || that_present_embedType) {
      if (!(this_present_embedType && that_present_embedType))
        return false;
      if (!this.embedType.equals(that.embedType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHerbs()) ? 131071 : 524287);
    if (isSetHerbs())
      hashCode = hashCode * 8191 + herbs.hashCode();

    hashCode = hashCode * 8191 + ((isSetEmbedType()) ? 131071 : 524287);
    if (isSetEmbedType())
      hashCode = hashCode * 8191 + embedType.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GraphRequset other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.compare(isSetHerbs(), other.isSetHerbs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHerbs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.herbs, other.herbs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.compare(isSetEmbedType(), other.isSetEmbedType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmbedType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.embedType, other.embedType);
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
    StringBuilder sb = new StringBuilder("GraphRequset(");
    boolean first = true;

    sb.append("herbs:");
    if (this.herbs == null) {
      sb.append("null");
    } else {
      sb.append(this.herbs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("embedType:");
    if (this.embedType == null) {
      sb.append("null");
    } else {
      sb.append(this.embedType);
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

  private static class GraphRequsetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GraphRequsetStandardScheme getScheme() {
      return new GraphRequsetStandardScheme();
    }
  }

  private static class GraphRequsetStandardScheme extends org.apache.thrift.scheme.StandardScheme<GraphRequset> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GraphRequset struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HERBS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.herbs = new java.util.ArrayList<String>(_list16.size);
                @org.apache.thrift.annotation.Nullable String _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readString();
                  struct.herbs.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setHerbsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EMBED_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.embedType = iprot.readString();
              struct.setEmbedTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GraphRequset struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.herbs != null) {
        oprot.writeFieldBegin(HERBS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.herbs.size()));
          for (String _iter19 : struct.herbs)
          {
            oprot.writeString(_iter19);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.embedType != null) {
        oprot.writeFieldBegin(EMBED_TYPE_FIELD_DESC);
        oprot.writeString(struct.embedType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GraphRequsetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GraphRequsetTupleScheme getScheme() {
      return new GraphRequsetTupleScheme();
    }
  }

  private static class GraphRequsetTupleScheme extends org.apache.thrift.scheme.TupleScheme<GraphRequset> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GraphRequset struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHerbs()) {
        optionals.set(0);
      }
      if (struct.isSetEmbedType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHerbs()) {
        {
          oprot.writeI32(struct.herbs.size());
          for (String _iter20 : struct.herbs)
          {
            oprot.writeString(_iter20);
          }
        }
      }
      if (struct.isSetEmbedType()) {
        oprot.writeString(struct.embedType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GraphRequset struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.herbs = new java.util.ArrayList<String>(_list21.size);
          @org.apache.thrift.annotation.Nullable String _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readString();
            struct.herbs.add(_elem22);
          }
        }
        struct.setHerbsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.embedType = iprot.readString();
        struct.setEmbedTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

