/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.servicedirectory.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Service Directory API for looking up service data at runtime.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/servicedirectory/v1beta1/lookup_service.proto")
public final class LookupServiceGrpc {

  private LookupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.servicedirectory.v1beta1.LookupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest,
          com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>
      getResolveServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveService",
      requestType = com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest.class,
      responseType = com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest,
          com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>
      getResolveServiceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest,
            com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>
        getResolveServiceMethod;
    if ((getResolveServiceMethod = LookupServiceGrpc.getResolveServiceMethod) == null) {
      synchronized (LookupServiceGrpc.class) {
        if ((getResolveServiceMethod = LookupServiceGrpc.getResolveServiceMethod) == null) {
          LookupServiceGrpc.getResolveServiceMethod =
              getResolveServiceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest,
                          com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveService"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new LookupServiceMethodDescriptorSupplier("ResolveService"))
                      .build();
        }
      }
    }
    return getResolveServiceMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static LookupServiceStub newStub(io.grpc.Channel channel) {
    return new LookupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LookupServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new LookupServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static LookupServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new LookupServiceFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * Service Directory API for looking up service data at runtime.
   * </pre>
   */
  public abstract static class LookupServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Returns a [service][google.cloud.servicedirectory.v1beta1.Service] and its
     * associated endpoints.
     * Resolving a service is not considered an active developer method.
     * </pre>
     */
    public void resolveService(
        com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getResolveServiceMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getResolveServiceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest,
                      com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>(
                      this, METHODID_RESOLVE_SERVICE)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Service Directory API for looking up service data at runtime.
   * </pre>
   */
  public static final class LookupServiceStub extends io.grpc.stub.AbstractStub<LookupServiceStub> {
    private LookupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LookupServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LookupServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LookupServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns a [service][google.cloud.servicedirectory.v1beta1.Service] and its
     * associated endpoints.
     * Resolving a service is not considered an active developer method.
     * </pre>
     */
    public void resolveService(
        com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResolveServiceMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Service Directory API for looking up service data at runtime.
   * </pre>
   */
  public static final class LookupServiceBlockingStub
      extends io.grpc.stub.AbstractStub<LookupServiceBlockingStub> {
    private LookupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LookupServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LookupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LookupServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns a [service][google.cloud.servicedirectory.v1beta1.Service] and its
     * associated endpoints.
     * Resolving a service is not considered an active developer method.
     * </pre>
     */
    public com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse resolveService(
        com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest request) {
      return blockingUnaryCall(getChannel(), getResolveServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Service Directory API for looking up service data at runtime.
   * </pre>
   */
  public static final class LookupServiceFutureStub
      extends io.grpc.stub.AbstractStub<LookupServiceFutureStub> {
    private LookupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LookupServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LookupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LookupServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns a [service][google.cloud.servicedirectory.v1beta1.Service] and its
     * associated endpoints.
     * Resolving a service is not considered an active developer method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>
        resolveService(com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResolveServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESOLVE_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LookupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LookupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESOLVE_SERVICE:
          serviceImpl.resolveService(
              (com.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class LookupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LookupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.servicedirectory.v1beta1.LookupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LookupService");
    }
  }

  private static final class LookupServiceFileDescriptorSupplier
      extends LookupServiceBaseDescriptorSupplier {
    LookupServiceFileDescriptorSupplier() {}
  }

  private static final class LookupServiceMethodDescriptorSupplier
      extends LookupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LookupServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LookupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new LookupServiceFileDescriptorSupplier())
                      .addMethod(getResolveServiceMethod())
                      .build();
        }
      }
    }
    return result;
  }
}