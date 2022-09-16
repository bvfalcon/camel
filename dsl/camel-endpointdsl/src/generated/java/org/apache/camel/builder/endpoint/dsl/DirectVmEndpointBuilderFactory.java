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
 * Call another endpoint from any Camel Context in the same JVM synchronously.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DirectVmEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Direct VM component.
     */
    public interface DirectVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedDirectVmEndpointConsumerBuilder advanced() {
            return (AdvancedDirectVmEndpointConsumerBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Direct VM component.
     */
    public interface AdvancedDirectVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default DirectVmEndpointConsumerBuilder basic() {
            return (DirectVmEndpointConsumerBuilder) this;
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
        default AdvancedDirectVmEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedDirectVmEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedDirectVmEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedDirectVmEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedDirectVmEndpointConsumerBuilder exchangePattern(
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
        default AdvancedDirectVmEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param propagateProperties the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointConsumerBuilder propagateProperties(
                boolean propagateProperties) {
            doSetProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param propagateProperties the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointConsumerBuilder propagateProperties(
                String propagateProperties) {
            doSetProperty("propagateProperties", propagateProperties);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Direct VM component.
     */
    public interface DirectVmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDirectVmEndpointProducerBuilder advanced() {
            return (AdvancedDirectVmEndpointProducerBuilder) this;
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param block the value to set
         * @return the dsl builder
         */
        default DirectVmEndpointProducerBuilder block(boolean block) {
            doSetProperty("block", block);
            return this;
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param block the value to set
         * @return the dsl builder
         */
        default DirectVmEndpointProducerBuilder block(String block) {
            doSetProperty("block", block);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a Direct-VM endpoint with no active consumers.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param failIfNoConsumers the value to set
         * @return the dsl builder
         */
        default DirectVmEndpointProducerBuilder failIfNoConsumers(
                boolean failIfNoConsumers) {
            doSetProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a Direct-VM endpoint with no active consumers.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param failIfNoConsumers the value to set
         * @return the dsl builder
         */
        default DirectVmEndpointProducerBuilder failIfNoConsumers(
                String failIfNoConsumers) {
            doSetProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * The timeout value to use if block is enabled.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default DirectVmEndpointProducerBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The timeout value to use if block is enabled.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default DirectVmEndpointProducerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Direct VM component.
     */
    public interface AdvancedDirectVmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default DirectVmEndpointProducerBuilder basic() {
            return (DirectVmEndpointProducerBuilder) this;
        }
        /**
         * Sets a HeaderFilterStrategy that will only be applied on producer
         * endpoints (on both directions: request and response). Default value:
         * none.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: producer (advanced)
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointProducerBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Sets a HeaderFilterStrategy that will only be applied on producer
         * endpoints (on both directions: request and response). Default value:
         * none.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: producer (advanced)
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointProducerBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param propagateProperties the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointProducerBuilder propagateProperties(
                boolean propagateProperties) {
            doSetProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param propagateProperties the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointProducerBuilder propagateProperties(
                String propagateProperties) {
            doSetProperty("propagateProperties", propagateProperties);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Direct VM component.
     */
    public interface DirectVmEndpointBuilder
            extends
                DirectVmEndpointConsumerBuilder,
                DirectVmEndpointProducerBuilder {
        default AdvancedDirectVmEndpointBuilder advanced() {
            return (AdvancedDirectVmEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Direct VM component.
     */
    public interface AdvancedDirectVmEndpointBuilder
            extends
                AdvancedDirectVmEndpointConsumerBuilder,
                AdvancedDirectVmEndpointProducerBuilder {
        default DirectVmEndpointBuilder basic() {
            return (DirectVmEndpointBuilder) this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param propagateProperties the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointBuilder propagateProperties(
                boolean propagateProperties) {
            doSetProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param propagateProperties the value to set
         * @return the dsl builder
         */
        default AdvancedDirectVmEndpointBuilder propagateProperties(
                String propagateProperties) {
            doSetProperty("propagateProperties", propagateProperties);
            return this;
        }
    }

    public interface DirectVmBuilders {
        /**
         * Direct VM (camel-directvm)
         * Call another endpoint from any Camel Context in the same JVM
         * synchronously.
         * 
         * Category: core,endpoint
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-directvm
         * 
         * Syntax: <code>direct-vm:name</code>
         * 
         * Path parameter: name (required)
         * Name of direct-vm endpoint
         * 
         * @param path name
         * @return the dsl builder
         */
        default DirectVmEndpointBuilder directVm(String path) {
            return DirectVmEndpointBuilderFactory.endpointBuilder("direct-vm", path);
        }
        /**
         * Direct VM (camel-directvm)
         * Call another endpoint from any Camel Context in the same JVM
         * synchronously.
         * 
         * Category: core,endpoint
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-directvm
         * 
         * Syntax: <code>direct-vm:name</code>
         * 
         * Path parameter: name (required)
         * Name of direct-vm endpoint
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default DirectVmEndpointBuilder directVm(
                String componentName,
                String path) {
            return DirectVmEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DirectVmEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class DirectVmEndpointBuilderImpl extends AbstractEndpointBuilder implements DirectVmEndpointBuilder, AdvancedDirectVmEndpointBuilder {
            public DirectVmEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DirectVmEndpointBuilderImpl(path);
    }
}