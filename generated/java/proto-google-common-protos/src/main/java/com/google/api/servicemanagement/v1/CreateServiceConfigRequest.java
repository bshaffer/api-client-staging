// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Request message for CreateServiceConfig method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceConfigRequest}
 */
public  final class CreateServiceConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.CreateServiceConfigRequest)
    CreateServiceConfigRequestOrBuilder {
  // Use CreateServiceConfigRequest.newBuilder() to construct.
  private CreateServiceConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServiceConfigRequest() {
    serviceName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateServiceConfigRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceName_ = s;
            break;
          }
          case 18: {
            com.google.api.Service.Builder subBuilder = null;
            if (serviceConfig_ != null) {
              subBuilder = serviceConfig_.toBuilder();
            }
            serviceConfig_ = input.readMessage(com.google.api.Service.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serviceConfig_);
              serviceConfig_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceConfigRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.CreateServiceConfigRequest.class, com.google.api.servicemanagement.v1.CreateServiceConfigRequest.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_CONFIG_FIELD_NUMBER = 2;
  private com.google.api.Service serviceConfig_;
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  public boolean hasServiceConfig() {
    return serviceConfig_ != null;
  }
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  public com.google.api.Service getServiceConfig() {
    return serviceConfig_ == null ? com.google.api.Service.getDefaultInstance() : serviceConfig_;
  }
  /**
   * <pre>
   * The service configuration resource.
   * </pre>
   *
   * <code>optional .google.api.Service service_config = 2;</code>
   */
  public com.google.api.ServiceOrBuilder getServiceConfigOrBuilder() {
    return getServiceConfig();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (serviceConfig_ != null) {
      output.writeMessage(2, getServiceConfig());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (serviceConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getServiceConfig());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.api.servicemanagement.v1.CreateServiceConfigRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.CreateServiceConfigRequest other = (com.google.api.servicemanagement.v1.CreateServiceConfigRequest) obj;

    boolean result = true;
    result = result && getServiceName()
        .equals(other.getServiceName());
    result = result && (hasServiceConfig() == other.hasServiceConfig());
    if (hasServiceConfig()) {
      result = result && getServiceConfig()
          .equals(other.getServiceConfig());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    if (hasServiceConfig()) {
      hash = (37 * hash) + SERVICE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getServiceConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.CreateServiceConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for CreateServiceConfig method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.CreateServiceConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.CreateServiceConfigRequest)
      com.google.api.servicemanagement.v1.CreateServiceConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceConfigRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.CreateServiceConfigRequest.class, com.google.api.servicemanagement.v1.CreateServiceConfigRequest.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.CreateServiceConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      serviceName_ = "";

      if (serviceConfigBuilder_ == null) {
        serviceConfig_ = null;
      } else {
        serviceConfig_ = null;
        serviceConfigBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_CreateServiceConfigRequest_descriptor;
    }

    public com.google.api.servicemanagement.v1.CreateServiceConfigRequest getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.CreateServiceConfigRequest.getDefaultInstance();
    }

    public com.google.api.servicemanagement.v1.CreateServiceConfigRequest build() {
      com.google.api.servicemanagement.v1.CreateServiceConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.servicemanagement.v1.CreateServiceConfigRequest buildPartial() {
      com.google.api.servicemanagement.v1.CreateServiceConfigRequest result = new com.google.api.servicemanagement.v1.CreateServiceConfigRequest(this);
      result.serviceName_ = serviceName_;
      if (serviceConfigBuilder_ == null) {
        result.serviceConfig_ = serviceConfig_;
      } else {
        result.serviceConfig_ = serviceConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.servicemanagement.v1.CreateServiceConfigRequest) {
        return mergeFrom((com.google.api.servicemanagement.v1.CreateServiceConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.CreateServiceConfigRequest other) {
      if (other == com.google.api.servicemanagement.v1.CreateServiceConfigRequest.getDefaultInstance()) return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (other.hasServiceConfig()) {
        mergeServiceConfig(other.getServiceConfig());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.servicemanagement.v1.CreateServiceConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.servicemanagement.v1.CreateServiceConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder clearServiceName() {
      
      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceName_ = value;
      onChanged();
      return this;
    }

    private com.google.api.Service serviceConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder> serviceConfigBuilder_;
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public boolean hasServiceConfig() {
      return serviceConfigBuilder_ != null || serviceConfig_ != null;
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public com.google.api.Service getServiceConfig() {
      if (serviceConfigBuilder_ == null) {
        return serviceConfig_ == null ? com.google.api.Service.getDefaultInstance() : serviceConfig_;
      } else {
        return serviceConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder setServiceConfig(com.google.api.Service value) {
      if (serviceConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceConfig_ = value;
        onChanged();
      } else {
        serviceConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder setServiceConfig(
        com.google.api.Service.Builder builderForValue) {
      if (serviceConfigBuilder_ == null) {
        serviceConfig_ = builderForValue.build();
        onChanged();
      } else {
        serviceConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder mergeServiceConfig(com.google.api.Service value) {
      if (serviceConfigBuilder_ == null) {
        if (serviceConfig_ != null) {
          serviceConfig_ =
            com.google.api.Service.newBuilder(serviceConfig_).mergeFrom(value).buildPartial();
        } else {
          serviceConfig_ = value;
        }
        onChanged();
      } else {
        serviceConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public Builder clearServiceConfig() {
      if (serviceConfigBuilder_ == null) {
        serviceConfig_ = null;
        onChanged();
      } else {
        serviceConfig_ = null;
        serviceConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public com.google.api.Service.Builder getServiceConfigBuilder() {
      
      onChanged();
      return getServiceConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    public com.google.api.ServiceOrBuilder getServiceConfigOrBuilder() {
      if (serviceConfigBuilder_ != null) {
        return serviceConfigBuilder_.getMessageOrBuilder();
      } else {
        return serviceConfig_ == null ?
            com.google.api.Service.getDefaultInstance() : serviceConfig_;
      }
    }
    /**
     * <pre>
     * The service configuration resource.
     * </pre>
     *
     * <code>optional .google.api.Service service_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder> 
        getServiceConfigFieldBuilder() {
      if (serviceConfigBuilder_ == null) {
        serviceConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder>(
                getServiceConfig(),
                getParentForChildren(),
                isClean());
        serviceConfig_ = null;
      }
      return serviceConfigBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.CreateServiceConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.CreateServiceConfigRequest)
  private static final com.google.api.servicemanagement.v1.CreateServiceConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.CreateServiceConfigRequest();
  }

  public static com.google.api.servicemanagement.v1.CreateServiceConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateServiceConfigRequest>() {
    public CreateServiceConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateServiceConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateServiceConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceConfigRequest> getParserForType() {
    return PARSER;
  }

  public com.google.api.servicemanagement.v1.CreateServiceConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
