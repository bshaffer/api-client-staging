/*!
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
'use strict';

var iamApi = require('./iam_api');
var gax = require('google-gax');
var extend = require('extend');

function v1(options) {
  options = extend({
    scopes: v1.ALL_SCOPES
  }, options);
  var gaxGrpc = gax.grpc(options);
  return iamApi(gaxGrpc);
}
v1.SERVICE_ADDRESS = iamApi.SERVICE_ADDRESS;
v1.ALL_SCOPES = iamApi.ALL_SCOPES;
module.exports = v1;
