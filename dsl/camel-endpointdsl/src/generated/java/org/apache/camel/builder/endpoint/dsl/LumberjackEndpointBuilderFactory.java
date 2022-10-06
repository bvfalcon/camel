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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import jakarta.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Receive logs messages using the Lumberjack protocol.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LumberjackEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Lumberjack component.
     */
    public interface LumberjackEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedLumberjackEndpointBuilder advanced() {
            return (AdvancedLumberjackEndpointBuilder) this;
        }
        /**
         * SSL configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default LumberjackEndpointBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * SSL configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default LumberjackEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Lumberjack component.
     */
    public interface AdvancedLumberjackEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default LumberjackEndpointBuilder basic() {
            return (LumberjackEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedLumberjackEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedLumberjackEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedLumberjackEndpointBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedLumberjackEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedLumberjackEndpointBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedLumberjackEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    public interface LumberjackBuilders {
        /**
         * Lumberjack (camel-lumberjack)
         * Receive logs messages using the Lumberjack protocol.
         * 
         * Category: log
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-lumberjack
         * 
         * Syntax: <code>lumberjack:host:port</code>
         * 
         * Path parameter: host (required)
         * Network interface on which to listen for Lumberjack
         * 
         * Path parameter: port
         * Network port on which to listen for Lumberjack
         * Default value: 5044
         * 
         * @param path host:port
         * @return the dsl builder
         */
        default LumberjackEndpointBuilder lumberjack(String path) {
            return LumberjackEndpointBuilderFactory.endpointBuilder("lumberjack", path);
        }
        /**
         * Lumberjack (camel-lumberjack)
         * Receive logs messages using the Lumberjack protocol.
         * 
         * Category: log
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-lumberjack
         * 
         * Syntax: <code>lumberjack:host:port</code>
         * 
         * Path parameter: host (required)
         * Network interface on which to listen for Lumberjack
         * 
         * Path parameter: port
         * Network port on which to listen for Lumberjack
         * Default value: 5044
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port
         * @return the dsl builder
         */
        default LumberjackEndpointBuilder lumberjack(
                String componentName,
                String path) {
            return LumberjackEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static LumberjackEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class LumberjackEndpointBuilderImpl extends AbstractEndpointBuilder implements LumberjackEndpointBuilder, AdvancedLumberjackEndpointBuilder {
            public LumberjackEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new LumberjackEndpointBuilderImpl(path);
    }
}