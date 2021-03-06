<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

namespace Google\Cloud\Videointelligence\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Label annotation.
 *
 * Generated from protobuf message <code>google.cloud.videointelligence.v1beta1.LabelAnnotation</code>
 */
class LabelAnnotation extends \Google\Protobuf\Internal\Message
{
    /**
     * Textual description, e.g. `Fixed-gear bicycle`.
     *
     * Generated from protobuf field <code>string description = 1;</code>
     */
    private $description = '';
    /**
     * Language code for `description` in BCP-47 format.
     *
     * Generated from protobuf field <code>string language_code = 2;</code>
     */
    private $language_code = '';
    /**
     * Where the label was detected and with what confidence.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.LabelLocation locations = 3;</code>
     */
    private $locations;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Videointelligence\V1Beta1\VideoIntelligence::initOnce();
        parent::__construct();
    }

    /**
     * Textual description, e.g. `Fixed-gear bicycle`.
     *
     * Generated from protobuf field <code>string description = 1;</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Textual description, e.g. `Fixed-gear bicycle`.
     *
     * Generated from protobuf field <code>string description = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;

        return $this;
    }

    /**
     * Language code for `description` in BCP-47 format.
     *
     * Generated from protobuf field <code>string language_code = 2;</code>
     * @return string
     */
    public function getLanguageCode()
    {
        return $this->language_code;
    }

    /**
     * Language code for `description` in BCP-47 format.
     *
     * Generated from protobuf field <code>string language_code = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setLanguageCode($var)
    {
        GPBUtil::checkString($var, True);
        $this->language_code = $var;

        return $this;
    }

    /**
     * Where the label was detected and with what confidence.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.LabelLocation locations = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getLocations()
    {
        return $this->locations;
    }

    /**
     * Where the label was detected and with what confidence.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.LabelLocation locations = 3;</code>
     * @param \Google\Cloud\Videointelligence\V1beta1\LabelLocation[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setLocations($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Videointelligence\V1beta1\LabelLocation::class);
        $this->locations = $arr;

        return $this;
    }

}

