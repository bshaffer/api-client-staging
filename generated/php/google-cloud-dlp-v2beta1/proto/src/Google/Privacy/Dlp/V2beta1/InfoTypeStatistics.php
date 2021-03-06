<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2beta1/dlp.proto

namespace Google\Privacy\Dlp\V2beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Statistics regarding a specific InfoType.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2beta1.InfoTypeStatistics</code>
 */
class InfoTypeStatistics extends \Google\Protobuf\Internal\Message
{
    /**
     * The type of finding this stat is for.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
     */
    private $info_type = null;
    /**
     * Number of findings for this info type.
     *
     * Generated from protobuf field <code>int64 count = 2;</code>
     */
    private $count = 0;

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2Beta1\Dlp::initOnce();
        parent::__construct();
    }

    /**
     * The type of finding this stat is for.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
     * @return \Google\Privacy\Dlp\V2beta1\InfoType
     */
    public function getInfoType()
    {
        return $this->info_type;
    }

    /**
     * The type of finding this stat is for.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
     * @param \Google\Privacy\Dlp\V2beta1\InfoType $var
     * @return $this
     */
    public function setInfoType($var)
    {
        GPBUtil::checkMessage($var, \Google\Privacy\Dlp\V2beta1\InfoType::class);
        $this->info_type = $var;

        return $this;
    }

    /**
     * Number of findings for this info type.
     *
     * Generated from protobuf field <code>int64 count = 2;</code>
     * @return int|string
     */
    public function getCount()
    {
        return $this->count;
    }

    /**
     * Number of findings for this info type.
     *
     * Generated from protobuf field <code>int64 count = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setCount($var)
    {
        GPBUtil::checkInt64($var);
        $this->count = $var;

        return $this;
    }

}

