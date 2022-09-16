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
 * Access NoSQL databases using the Apache Gora framework.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoraEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Gora component.
     */
    public interface GoraEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGoraEndpointConsumerBuilder advanced() {
            return (AdvancedGoraEndpointConsumerBuilder) this;
        }
        /**
         * The type of the dataStore.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param dataStoreClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder dataStoreClass(String dataStoreClass) {
            doSetProperty("dataStoreClass", dataStoreClass);
            return this;
        }
        /**
         * The type class of the key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param keyClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder keyClass(String keyClass) {
            doSetProperty("keyClass", keyClass);
            return this;
        }
        /**
         * The type of the value.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param valueClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder valueClass(String valueClass) {
            doSetProperty("valueClass", valueClass);
            return this;
        }
        /**
         * Number of concurrent consumers.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of concurrent consumers.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The End Key.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param endKey the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder endKey(Object endKey) {
            doSetProperty("endKey", endKey);
            return this;
        }
        /**
         * The End Key.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param endKey the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder endKey(String endKey) {
            doSetProperty("endKey", endKey);
            return this;
        }
        /**
         * The End Time.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param endTime the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder endTime(long endTime) {
            doSetProperty("endTime", endTime);
            return this;
        }
        /**
         * The End Time.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param endTime the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder endTime(String endTime) {
            doSetProperty("endTime", endTime);
            return this;
        }
        /**
         * The Fields.
         * 
         * The option is a:
         * &lt;code&gt;com.google.common.base.Strings&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param fields the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder fields(
                com.google.common.base.Strings fields) {
            doSetProperty("fields", fields);
            return this;
        }
        /**
         * The Fields.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.google.common.base.Strings&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param fields the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder fields(String fields) {
            doSetProperty("fields", fields);
            return this;
        }
        /**
         * The Key Range From.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param keyRangeFrom the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder keyRangeFrom(Object keyRangeFrom) {
            doSetProperty("keyRangeFrom", keyRangeFrom);
            return this;
        }
        /**
         * The Key Range From.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param keyRangeFrom the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder keyRangeFrom(String keyRangeFrom) {
            doSetProperty("keyRangeFrom", keyRangeFrom);
            return this;
        }
        /**
         * The Key Range To.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param keyRangeTo the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder keyRangeTo(Object keyRangeTo) {
            doSetProperty("keyRangeTo", keyRangeTo);
            return this;
        }
        /**
         * The Key Range To.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param keyRangeTo the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder keyRangeTo(String keyRangeTo) {
            doSetProperty("keyRangeTo", keyRangeTo);
            return this;
        }
        /**
         * The Limit.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param limit the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder limit(long limit) {
            doSetProperty("limit", limit);
            return this;
        }
        /**
         * The Limit.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param limit the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder limit(String limit) {
            doSetProperty("limit", limit);
            return this;
        }
        /**
         * The Start Key.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param startKey the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder startKey(Object startKey) {
            doSetProperty("startKey", startKey);
            return this;
        }
        /**
         * The Start Key.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param startKey the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder startKey(String startKey) {
            doSetProperty("startKey", startKey);
            return this;
        }
        /**
         * The Start Time.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param startTime the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder startTime(long startTime) {
            doSetProperty("startTime", startTime);
            return this;
        }
        /**
         * The Start Time.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param startTime the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder startTime(String startTime) {
            doSetProperty("startTime", startTime);
            return this;
        }
        /**
         * The Time Range From.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timeRangeFrom the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder timeRangeFrom(long timeRangeFrom) {
            doSetProperty("timeRangeFrom", timeRangeFrom);
            return this;
        }
        /**
         * The Time Range From.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timeRangeFrom the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder timeRangeFrom(String timeRangeFrom) {
            doSetProperty("timeRangeFrom", timeRangeFrom);
            return this;
        }
        /**
         * The Time Range To.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timeRangeTo the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder timeRangeTo(long timeRangeTo) {
            doSetProperty("timeRangeTo", timeRangeTo);
            return this;
        }
        /**
         * The Time Range To.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timeRangeTo the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder timeRangeTo(String timeRangeTo) {
            doSetProperty("timeRangeTo", timeRangeTo);
            return this;
        }
        /**
         * The Timestamp.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timestamp the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder timestamp(long timestamp) {
            doSetProperty("timestamp", timestamp);
            return this;
        }
        /**
         * The Timestamp.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param timestamp the value to set
         * @return the dsl builder
         */
        default GoraEndpointConsumerBuilder timestamp(String timestamp) {
            doSetProperty("timestamp", timestamp);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Gora component.
     */
    public interface AdvancedGoraEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GoraEndpointConsumerBuilder basic() {
            return (GoraEndpointConsumerBuilder) this;
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
        default AdvancedGoraEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedGoraEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedGoraEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGoraEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGoraEndpointConsumerBuilder exchangePattern(
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
        default AdvancedGoraEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Hadoop Configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.hadoop.conf.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hadoopConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedGoraEndpointConsumerBuilder hadoopConfiguration(
                org.apache.hadoop.conf.Configuration hadoopConfiguration) {
            doSetProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Hadoop Configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.hadoop.conf.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hadoopConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedGoraEndpointConsumerBuilder hadoopConfiguration(
                String hadoopConfiguration) {
            doSetProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Gora component.
     */
    public interface GoraEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoraEndpointProducerBuilder advanced() {
            return (AdvancedGoraEndpointProducerBuilder) this;
        }
        /**
         * The type of the dataStore.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param dataStoreClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointProducerBuilder dataStoreClass(String dataStoreClass) {
            doSetProperty("dataStoreClass", dataStoreClass);
            return this;
        }
        /**
         * The type class of the key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param keyClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointProducerBuilder keyClass(String keyClass) {
            doSetProperty("keyClass", keyClass);
            return this;
        }
        /**
         * The type of the value.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param valueClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointProducerBuilder valueClass(String valueClass) {
            doSetProperty("valueClass", valueClass);
            return this;
        }
        /**
         * Flush on every operation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param flushOnEveryOperation the value to set
         * @return the dsl builder
         */
        default GoraEndpointProducerBuilder flushOnEveryOperation(
                boolean flushOnEveryOperation) {
            doSetProperty("flushOnEveryOperation", flushOnEveryOperation);
            return this;
        }
        /**
         * Flush on every operation.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param flushOnEveryOperation the value to set
         * @return the dsl builder
         */
        default GoraEndpointProducerBuilder flushOnEveryOperation(
                String flushOnEveryOperation) {
            doSetProperty("flushOnEveryOperation", flushOnEveryOperation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Gora component.
     */
    public interface AdvancedGoraEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GoraEndpointProducerBuilder basic() {
            return (GoraEndpointProducerBuilder) this;
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
        default AdvancedGoraEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedGoraEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Hadoop Configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.hadoop.conf.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hadoopConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedGoraEndpointProducerBuilder hadoopConfiguration(
                org.apache.hadoop.conf.Configuration hadoopConfiguration) {
            doSetProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Hadoop Configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.hadoop.conf.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hadoopConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedGoraEndpointProducerBuilder hadoopConfiguration(
                String hadoopConfiguration) {
            doSetProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Gora component.
     */
    public interface GoraEndpointBuilder
            extends
                GoraEndpointConsumerBuilder,
                GoraEndpointProducerBuilder {
        default AdvancedGoraEndpointBuilder advanced() {
            return (AdvancedGoraEndpointBuilder) this;
        }
        /**
         * The type of the dataStore.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param dataStoreClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointBuilder dataStoreClass(String dataStoreClass) {
            doSetProperty("dataStoreClass", dataStoreClass);
            return this;
        }
        /**
         * The type class of the key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param keyClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointBuilder keyClass(String keyClass) {
            doSetProperty("keyClass", keyClass);
            return this;
        }
        /**
         * The type of the value.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param valueClass the value to set
         * @return the dsl builder
         */
        default GoraEndpointBuilder valueClass(String valueClass) {
            doSetProperty("valueClass", valueClass);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Gora component.
     */
    public interface AdvancedGoraEndpointBuilder
            extends
                AdvancedGoraEndpointConsumerBuilder,
                AdvancedGoraEndpointProducerBuilder {
        default GoraEndpointBuilder basic() {
            return (GoraEndpointBuilder) this;
        }
        /**
         * Hadoop Configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.hadoop.conf.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hadoopConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedGoraEndpointBuilder hadoopConfiguration(
                org.apache.hadoop.conf.Configuration hadoopConfiguration) {
            doSetProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Hadoop Configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.hadoop.conf.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hadoopConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedGoraEndpointBuilder hadoopConfiguration(
                String hadoopConfiguration) {
            doSetProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
    }

    public interface GoraBuilders {
        /**
         * Gora (camel-gora)
         * Access NoSQL databases using the Apache Gora framework.
         * 
         * Category: database,nosql,bigdata
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-gora
         * 
         * @return the dsl builder for the headers' name.
         */
        default GoraHeaderNameBuilder gora() {
            return GoraHeaderNameBuilder.INSTANCE;
        }
        /**
         * Gora (camel-gora)
         * Access NoSQL databases using the Apache Gora framework.
         * 
         * Category: database,nosql,bigdata
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-gora
         * 
         * Syntax: <code>gora:name</code>
         * 
         * Path parameter: name (required)
         * Instance name
         * 
         * @param path name
         * @return the dsl builder
         */
        default GoraEndpointBuilder gora(String path) {
            return GoraEndpointBuilderFactory.endpointBuilder("gora", path);
        }
        /**
         * Gora (camel-gora)
         * Access NoSQL databases using the Apache Gora framework.
         * 
         * Category: database,nosql,bigdata
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-gora
         * 
         * Syntax: <code>gora:name</code>
         * 
         * Path parameter: name (required)
         * Instance name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default GoraEndpointBuilder gora(String componentName, String path) {
            return GoraEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Gora component.
     */
    public static class GoraHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final GoraHeaderNameBuilder INSTANCE = new GoraHeaderNameBuilder();

        /**
         * Used in order to define the datum key for the operations need it.
         * 
         * The option is a: {@code Object} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code goraKey}.
         */
        public String goraKey() {
            return "goraKey";
        }

        /**
         * Used in order to define the operation to execute.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code goraOperation}.
         */
        public String goraOperation() {
            return "goraOperation";
        }
    }
    static GoraEndpointBuilder endpointBuilder(String componentName, String path) {
        class GoraEndpointBuilderImpl extends AbstractEndpointBuilder implements GoraEndpointBuilder, AdvancedGoraEndpointBuilder {
            public GoraEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoraEndpointBuilderImpl(path);
    }
}