// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * Results of inspecting a list of items.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.InspectContentResponse}
 */
public  final class InspectContentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.InspectContentResponse)
    InspectContentResponseOrBuilder {
  // Use InspectContentResponse.newBuilder() to construct.
  private InspectContentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InspectContentResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InspectContentResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              results_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta1.InspectResult>();
              mutable_bitField0_ |= 0x00000001;
            }
            results_.add(
                input.readMessage(com.google.privacy.dlp.v2beta1.InspectResult.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.InspectContentResponse.class, com.google.privacy.dlp.v2beta1.InspectContentResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.privacy.dlp.v2beta1.InspectResult> results_;
  /**
   * <pre>
   * Each content_item from the request has a result in this list, in the
   * same order as the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2beta1.InspectResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * Each content_item from the request has a result in this list, in the
   * same order as the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2beta1.InspectResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * Each content_item from the request has a result in this list, in the
   * same order as the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
   */
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * Each content_item from the request has a result in this list, in the
   * same order as the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.InspectResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * Each content_item from the request has a result in this list, in the
   * same order as the request.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.InspectResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, results_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.InspectContentResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.InspectContentResponse other = (com.google.privacy.dlp.v2beta1.InspectContentResponse) obj;

    boolean result = true;
    result = result && getResultsList()
        .equals(other.getResultsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.InspectContentResponse parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.InspectContentResponse prototype) {
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
   * Results of inspecting a list of items.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.InspectContentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.InspectContentResponse)
      com.google.privacy.dlp.v2beta1.InspectContentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.InspectContentResponse.class, com.google.privacy.dlp.v2beta1.InspectContentResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.InspectContentResponse.newBuilder()
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
        getResultsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_InspectContentResponse_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.InspectContentResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.InspectContentResponse.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.InspectContentResponse build() {
      com.google.privacy.dlp.v2beta1.InspectContentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.InspectContentResponse buildPartial() {
      com.google.privacy.dlp.v2beta1.InspectContentResponse result = new com.google.privacy.dlp.v2beta1.InspectContentResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2beta1.InspectContentResponse) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.InspectContentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.InspectContentResponse other) {
      if (other == com.google.privacy.dlp.v2beta1.InspectContentResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
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
      com.google.privacy.dlp.v2beta1.InspectContentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.InspectContentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.privacy.dlp.v2beta1.InspectResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        results_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta1.InspectResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.InspectResult, com.google.privacy.dlp.v2beta1.InspectResult.Builder, com.google.privacy.dlp.v2beta1.InspectResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta1.InspectResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.privacy.dlp.v2beta1.InspectResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.privacy.dlp.v2beta1.InspectResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder addResults(com.google.privacy.dlp.v2beta1.InspectResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.privacy.dlp.v2beta1.InspectResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder addResults(
        com.google.privacy.dlp.v2beta1.InspectResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.privacy.dlp.v2beta1.InspectResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2beta1.InspectResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2beta1.InspectResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2beta1.InspectResult.getDefaultInstance());
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.InspectResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2beta1.InspectResult.getDefaultInstance());
    }
    /**
     * <pre>
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta1.InspectResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.InspectResult, com.google.privacy.dlp.v2beta1.InspectResult.Builder, com.google.privacy.dlp.v2beta1.InspectResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.InspectResult, com.google.privacy.dlp.v2beta1.InspectResult.Builder, com.google.privacy.dlp.v2beta1.InspectResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.InspectContentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.InspectContentResponse)
  private static final com.google.privacy.dlp.v2beta1.InspectContentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.InspectContentResponse();
  }

  public static com.google.privacy.dlp.v2beta1.InspectContentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InspectContentResponse>
      PARSER = new com.google.protobuf.AbstractParser<InspectContentResponse>() {
    public InspectContentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InspectContentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InspectContentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InspectContentResponse> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.InspectContentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

