package com.helium.networking.server;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 *
 * Created by isuru on 7/10/16.
 */
public class BrokerManagerTest {

    @InjectMocks
    private AbstractBroker brokerMock = new Broker();


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    //@Test
    //public void initializeBrokerManager() {
        //when(Broker.getInstance()).thenReturn(brokerManagerMock);
        //Broker brokerManager = Broker.getInstance();
        //assertThat("broker manager is not null", brokerManager, is(brokerManagerMock));
    //}

    @Test
    public void initializeBroker() {
        AbstractBroker broker = new Broker();
        broker.initializeBroker("localhost", 5565, 5567);
        assertNotNull("Expects broker address not to be null", broker.brokerAddress);
        assertNotNull("Expects inbound port not to be null", broker.inboundPort);
        assertNotNull("Expects outbound port not to be null", broker.outboundPort);
    }

    @Test
    public void initializeBrokerContext() {
        AbstractBroker broker = new Broker();
        broker.initializeBrokerContext(1);
        assertNotNull("Expects broker context not to be null", broker.context);
    }

    @Test
    public void bootstrap() {
        AbstractBroker broker = new Broker();
        broker.bootstrap("localhost", 5565, 5567, 1);
        assertNotNull("Expects inbound socket not to be null", broker.inboundSocket);
        assertNotNull("Expects outbound socket not to be null", broker.outboundSocket);
    }
}
