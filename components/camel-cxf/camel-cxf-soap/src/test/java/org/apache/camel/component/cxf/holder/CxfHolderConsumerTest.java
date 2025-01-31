/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.cxf.holder;

import jakarta.xml.ws.Holder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.CXFTestSupport;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.cxf.frontend.ClientFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CxfHolderConsumerTest extends CamelTestSupport {
    protected static final String ADDRESS = "http://localhost:"
                                            + CXFTestSupport.getPort1() + "/CxfHolderConsumerTest/test";
    protected static final String CXF_ENDPOINT_URI = "cxf://" + ADDRESS
                                                     + "?serviceClass=org.apache.camel.component.cxf.holder.MyOrderEndpoint"
                                                     + "&loggingFeatureEnabled=true";

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from(CXF_ENDPOINT_URI).process(new MyProcessor());
            }
        };
    }

    @Test
    public void testInvokingServiceFromCXFClient() throws Exception {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        ClientFactoryBean clientBean = proxyFactory.getClientFactoryBean();
        clientBean.setAddress(ADDRESS);
        clientBean.setServiceClass(MyOrderEndpoint.class);

        MyOrderEndpoint client = (MyOrderEndpoint) proxyFactory.create();

        Holder<String> strPart = new Holder<>();
        strPart.value = "parts";
        Holder<String> strCustomer = new Holder<>();
        strCustomer.value = "";

        String result = client.myOrder(strPart, 2, strCustomer);
        assertEquals("Ordered ammount 2", result, "Get a wrong order result");
        assertEquals("parts", strPart.value, "Get a wrong parts");
        assertEquals("newCustomer", strCustomer.value, "Get a wrong customer");
    }

    @Test
    public void testInvokingServiceWithSoapHeaderFromCXFClient() throws Exception {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        ClientFactoryBean clientBean = proxyFactory.getClientFactoryBean();
        clientBean.setAddress(ADDRESS);
        clientBean.setServiceClass(MyOrderEndpoint.class);

        MyOrderEndpoint client = (MyOrderEndpoint) proxyFactory.create();

        Holder<String> header = new Holder<>();
        header.value = "parts";

        String result = client.mySecureOrder(1, header);
        assertEquals("Ordered ammount 1", result, "Get a wrong order result");
        assertEquals("secureParts", header.value, "Get a wrong parts");

    }

}
