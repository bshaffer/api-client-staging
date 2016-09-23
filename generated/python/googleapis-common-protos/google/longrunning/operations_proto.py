# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/longrunning/operations.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/longrunning/operations.proto',
  package='google.longrunning',
  syntax='proto3',
  serialized_pb=_b('\n#google/longrunning/operations.proto\x12\x12google.longrunning\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/protobuf/any.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x17google/rpc/status.proto\"\xa8\x01\n\tOperation\x12\x0c\n\x04name\x18\x01 \x01(\t\x12&\n\x08metadata\x18\x02 \x01(\x0b\x32\x14.google.protobuf.Any\x12\x0c\n\x04\x64one\x18\x03 \x01(\x08\x12#\n\x05\x65rror\x18\x04 \x01(\x0b\x32\x12.google.rpc.StatusH\x00\x12(\n\x08response\x18\x05 \x01(\x0b\x32\x14.google.protobuf.AnyH\x00\x42\x08\n\x06result\"#\n\x13GetOperationRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"\\\n\x15ListOperationsRequest\x12\x0c\n\x04name\x18\x04 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x01 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"d\n\x16ListOperationsResponse\x12\x31\n\noperations\x18\x01 \x03(\x0b\x32\x1d.google.longrunning.Operation\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"&\n\x16\x43\x61ncelOperationRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"&\n\x16\x44\x65leteOperationRequest\x12\x0c\n\x04name\x18\x01 \x01(\t2\x8c\x04\n\nOperations\x12x\n\x0cGetOperation\x12\'.google.longrunning.GetOperationRequest\x1a\x1d.google.longrunning.Operation\" \x82\xd3\xe4\x93\x02\x1a\x12\x18/v1/{name=operations/**}\x12\x86\x01\n\x0eListOperations\x12).google.longrunning.ListOperationsRequest\x1a*.google.longrunning.ListOperationsResponse\"\x1d\x82\xd3\xe4\x93\x02\x17\x12\x15/v1/{name=operations}\x12\x81\x01\n\x0f\x43\x61ncelOperation\x12*.google.longrunning.CancelOperationRequest\x1a\x16.google.protobuf.Empty\"*\x82\xd3\xe4\x93\x02$\"\x1f/v1/{name=operations/**}:cancel:\x01*\x12w\n\x0f\x44\x65leteOperation\x12*.google.longrunning.DeleteOperationRequest\x1a\x16.google.protobuf.Empty\" \x82\xd3\xe4\x93\x02\x1a*\x18/v1/{name=operations/**}B+\n\x16\x63om.google.longrunningB\x0fOperationsProtoP\x01\x62\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_any__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])
_sym_db.RegisterFileDescriptor(DESCRIPTOR)




_OPERATION = _descriptor.Descriptor(
  name='Operation',
  full_name='google.longrunning.Operation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.longrunning.Operation.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.longrunning.Operation.metadata', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='done', full_name='google.longrunning.Operation.done', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='error', full_name='google.longrunning.Operation.error', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='response', full_name='google.longrunning.Operation.response', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='result', full_name='google.longrunning.Operation.result',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=171,
  serialized_end=339,
)


_GETOPERATIONREQUEST = _descriptor.Descriptor(
  name='GetOperationRequest',
  full_name='google.longrunning.GetOperationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.longrunning.GetOperationRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=341,
  serialized_end=376,
)


_LISTOPERATIONSREQUEST = _descriptor.Descriptor(
  name='ListOperationsRequest',
  full_name='google.longrunning.ListOperationsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.longrunning.ListOperationsRequest.name', index=0,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='filter', full_name='google.longrunning.ListOperationsRequest.filter', index=1,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.longrunning.ListOperationsRequest.page_size', index=2,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.longrunning.ListOperationsRequest.page_token', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=378,
  serialized_end=470,
)


_LISTOPERATIONSRESPONSE = _descriptor.Descriptor(
  name='ListOperationsResponse',
  full_name='google.longrunning.ListOperationsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.longrunning.ListOperationsResponse.operations', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.longrunning.ListOperationsResponse.next_page_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=472,
  serialized_end=572,
)


_CANCELOPERATIONREQUEST = _descriptor.Descriptor(
  name='CancelOperationRequest',
  full_name='google.longrunning.CancelOperationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.longrunning.CancelOperationRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=574,
  serialized_end=612,
)


_DELETEOPERATIONREQUEST = _descriptor.Descriptor(
  name='DeleteOperationRequest',
  full_name='google.longrunning.DeleteOperationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.longrunning.DeleteOperationRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=614,
  serialized_end=652,
)

_OPERATION.fields_by_name['metadata'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_OPERATION.fields_by_name['error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_OPERATION.fields_by_name['response'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_OPERATION.oneofs_by_name['result'].fields.append(
  _OPERATION.fields_by_name['error'])
_OPERATION.fields_by_name['error'].containing_oneof = _OPERATION.oneofs_by_name['result']
_OPERATION.oneofs_by_name['result'].fields.append(
  _OPERATION.fields_by_name['response'])
_OPERATION.fields_by_name['response'].containing_oneof = _OPERATION.oneofs_by_name['result']
_LISTOPERATIONSRESPONSE.fields_by_name['operations'].message_type = _OPERATION
DESCRIPTOR.message_types_by_name['Operation'] = _OPERATION
DESCRIPTOR.message_types_by_name['GetOperationRequest'] = _GETOPERATIONREQUEST
DESCRIPTOR.message_types_by_name['ListOperationsRequest'] = _LISTOPERATIONSREQUEST
DESCRIPTOR.message_types_by_name['ListOperationsResponse'] = _LISTOPERATIONSRESPONSE
DESCRIPTOR.message_types_by_name['CancelOperationRequest'] = _CANCELOPERATIONREQUEST
DESCRIPTOR.message_types_by_name['DeleteOperationRequest'] = _DELETEOPERATIONREQUEST

Operation = _reflection.GeneratedProtocolMessageType('Operation', (_message.Message,), dict(
  DESCRIPTOR = _OPERATION,
  __module__ = 'google.longrunning.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.longrunning.Operation)
  ))
_sym_db.RegisterMessage(Operation)

GetOperationRequest = _reflection.GeneratedProtocolMessageType('GetOperationRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETOPERATIONREQUEST,
  __module__ = 'google.longrunning.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.longrunning.GetOperationRequest)
  ))
_sym_db.RegisterMessage(GetOperationRequest)

ListOperationsRequest = _reflection.GeneratedProtocolMessageType('ListOperationsRequest', (_message.Message,), dict(
  DESCRIPTOR = _LISTOPERATIONSREQUEST,
  __module__ = 'google.longrunning.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.longrunning.ListOperationsRequest)
  ))
_sym_db.RegisterMessage(ListOperationsRequest)

ListOperationsResponse = _reflection.GeneratedProtocolMessageType('ListOperationsResponse', (_message.Message,), dict(
  DESCRIPTOR = _LISTOPERATIONSRESPONSE,
  __module__ = 'google.longrunning.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.longrunning.ListOperationsResponse)
  ))
_sym_db.RegisterMessage(ListOperationsResponse)

CancelOperationRequest = _reflection.GeneratedProtocolMessageType('CancelOperationRequest', (_message.Message,), dict(
  DESCRIPTOR = _CANCELOPERATIONREQUEST,
  __module__ = 'google.longrunning.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.longrunning.CancelOperationRequest)
  ))
_sym_db.RegisterMessage(CancelOperationRequest)

DeleteOperationRequest = _reflection.GeneratedProtocolMessageType('DeleteOperationRequest', (_message.Message,), dict(
  DESCRIPTOR = _DELETEOPERATIONREQUEST,
  __module__ = 'google.longrunning.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.longrunning.DeleteOperationRequest)
  ))
_sym_db.RegisterMessage(DeleteOperationRequest)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\026com.google.longrunningB\017OperationsProtoP\001'))
# @@protoc_insertion_point(module_scope)