package com.helium.networking.server;

import org.zeromq.ZMQ;

/**
 *
 * Created by isuru on 7/12/2016.
 */
public abstract class AbstractBroker {

    public ZMQ.Socket inboundSocket = null;
    public ZMQ.Socket outboundSocket = null;
    public ZMQ.Context context = null;
    public String brokerAddress = null;
    public int inboundPort = 0;
    public int outboundPort = 0;

    public abstract void initializeBroker(String brokerAddress, int inboundPort, int outboundPort);

    public abstract void bootstrap(String brokerAddress, int inboundPort, int outboundPort, int ioThreads);

    public abstract void initializeBrokerContext(int ioThreads);

    public abstract void bindBroker();
}
