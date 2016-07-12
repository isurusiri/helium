package com.helium.networking.server;

import org.zeromq.ZMQ;

/**
 *
 * Created by isuru on 7/10/16.
 */
@SuppressWarnings("WeakerAccess")
public class Broker extends AbstractBroker {

    @Override
    public void initializeBroker(String brokerAddress, int inboundPort, int outboundPort) {
        this.brokerAddress = brokerAddress;
        this.inboundPort = inboundPort;
        this.outboundPort = outboundPort;
    }

    @Override
    public void bootstrap(String brokerAddress, int inboundPort, int outboundPort, int ioThreads) {
        initializeBroker(brokerAddress, inboundPort, outboundPort);
        initializeBrokerContext(ioThreads);
        inboundSocket = context.socket(ZMQ.SUB);
        outboundSocket = context.socket(ZMQ.PUB);
    }

    @Override
    public void initializeBrokerContext(int ioThreads) {
        context = ZMQ.context(ioThreads);
    }
}
