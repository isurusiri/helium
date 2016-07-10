package com.helium.networking.server;

import org.zeromq.ZMQ;

/**
 *
 * Created by isuru on 7/10/16.
 */
public class Broker {
    public ZMQ.Socket inboundSocket;
    public ZMQ.Socket outboundSocket;
    public String brokerAddress;
    public int inboundPort;
    public int outboundPort;
    public ZMQ.Context context;

//    private Broker() {}
//
//    public static Broker getInstance() {
//        if (instance == null) {
//            instance = new Broker();
//        }
//        return instance;
//    }

    public void initializeBroker(String brokerAddress, int inboundPort, int outboundPort) {
        this.brokerAddress = brokerAddress;
        this.inboundPort = inboundPort;
        this.outboundPort = outboundPort;
    }

    public void bootstrap() {

    }

    public void initializeBrokerContext(int ioThreads) {
        context = ZMQ.context(ioThreads);
    }
}
