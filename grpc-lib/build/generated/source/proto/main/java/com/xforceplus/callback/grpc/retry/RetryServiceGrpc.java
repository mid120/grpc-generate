package com.xforceplus.callback.grpc.retry;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: retry.proto")
public class RetryServiceGrpc {

  private RetryServiceGrpc() {}

  public static final String SERVICE_NAME = "RetryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.xforceplus.callback.grpc.retry.RetryRequest,
      com.xforceplus.callback.grpc.retry.RetryResponse> METHOD_RETRY_RECORD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "RetryService", "retryRecord"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.xforceplus.callback.grpc.retry.RetryRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.xforceplus.callback.grpc.retry.RetryResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RetryServiceStub newStub(io.grpc.Channel channel) {
    return new RetryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RetryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RetryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RetryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RetryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RetryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void retryRecord(com.xforceplus.callback.grpc.retry.RetryRequest request,
        io.grpc.stub.StreamObserver<com.xforceplus.callback.grpc.retry.RetryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRY_RECORD, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_RETRY_RECORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.xforceplus.callback.grpc.retry.RetryRequest,
                com.xforceplus.callback.grpc.retry.RetryResponse>(
                  this, METHODID_RETRY_RECORD)))
          .build();
    }
  }

  /**
   */
  public static final class RetryServiceStub extends io.grpc.stub.AbstractStub<RetryServiceStub> {
    private RetryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RetryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RetryServiceStub(channel, callOptions);
    }

    /**
     */
    public void retryRecord(com.xforceplus.callback.grpc.retry.RetryRequest request,
        io.grpc.stub.StreamObserver<com.xforceplus.callback.grpc.retry.RetryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRY_RECORD, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RetryServiceBlockingStub extends io.grpc.stub.AbstractStub<RetryServiceBlockingStub> {
    private RetryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RetryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RetryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xforceplus.callback.grpc.retry.RetryResponse retryRecord(com.xforceplus.callback.grpc.retry.RetryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRY_RECORD, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RetryServiceFutureStub extends io.grpc.stub.AbstractStub<RetryServiceFutureStub> {
    private RetryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RetryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RetryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xforceplus.callback.grpc.retry.RetryResponse> retryRecord(
        com.xforceplus.callback.grpc.retry.RetryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRY_RECORD, getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRY_RECORD = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RetryServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(RetryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETRY_RECORD:
          serviceImpl.retryRecord((com.xforceplus.callback.grpc.retry.RetryRequest) request,
              (io.grpc.stub.StreamObserver<com.xforceplus.callback.grpc.retry.RetryResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_RETRY_RECORD);
  }

}
