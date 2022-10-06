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
 * Send messages to Spring Batch for further processing.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SpringBatchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spring Batch component.
     */
    public interface SpringBatchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSpringBatchEndpointBuilder advanced() {
            return (AdvancedSpringBatchEndpointBuilder) this;
        }
        /**
         * Explicitly defines if the jobName should be taken from the headers
         * instead of the URI.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param jobFromHeader the value to set
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder jobFromHeader(boolean jobFromHeader) {
            doSetProperty("jobFromHeader", jobFromHeader);
            return this;
        }
        /**
         * Explicitly defines if the jobName should be taken from the headers
         * instead of the URI.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param jobFromHeader the value to set
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder jobFromHeader(String jobFromHeader) {
            doSetProperty("jobFromHeader", jobFromHeader);
            return this;
        }
        /**
         * Explicitly specifies a JobLauncher to be used.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.batch.core.launch.JobLauncher&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param jobLauncher the value to set
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder jobLauncher(
                org.springframework.batch.core.launch.JobLauncher jobLauncher) {
            doSetProperty("jobLauncher", jobLauncher);
            return this;
        }
        /**
         * Explicitly specifies a JobLauncher to be used.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.batch.core.launch.JobLauncher&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param jobLauncher the value to set
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder jobLauncher(String jobLauncher) {
            doSetProperty("jobLauncher", jobLauncher);
            return this;
        }
        /**
         * Explicitly specifies a JobRegistry to be used.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.batch.core.configuration.JobRegistry&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param jobRegistry the value to set
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder jobRegistry(
                org.springframework.batch.core.configuration.JobRegistry jobRegistry) {
            doSetProperty("jobRegistry", jobRegistry);
            return this;
        }
        /**
         * Explicitly specifies a JobRegistry to be used.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.batch.core.configuration.JobRegistry&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param jobRegistry the value to set
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder jobRegistry(String jobRegistry) {
            doSetProperty("jobRegistry", jobRegistry);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spring Batch component.
     */
    public interface AdvancedSpringBatchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SpringBatchEndpointBuilder basic() {
            return (SpringBatchEndpointBuilder) this;
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
        default AdvancedSpringBatchEndpointBuilder lazyStartProducer(
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
        default AdvancedSpringBatchEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface SpringBatchBuilders {
        /**
         * Spring Batch (camel-spring-batch)
         * Send messages to Spring Batch for further processing.
         * 
         * Category: spring,batch,scheduling
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-spring-batch
         * 
         * Syntax: <code>spring-batch:jobName</code>
         * 
         * Path parameter: jobName (required)
         * The name of the Spring Batch job located in the registry.
         * 
         * @param path jobName
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder springBatch(String path) {
            return SpringBatchEndpointBuilderFactory.endpointBuilder("spring-batch", path);
        }
        /**
         * Spring Batch (camel-spring-batch)
         * Send messages to Spring Batch for further processing.
         * 
         * Category: spring,batch,scheduling
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-spring-batch
         * 
         * Syntax: <code>spring-batch:jobName</code>
         * 
         * Path parameter: jobName (required)
         * The name of the Spring Batch job located in the registry.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path jobName
         * @return the dsl builder
         */
        default SpringBatchEndpointBuilder springBatch(
                String componentName,
                String path) {
            return SpringBatchEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static SpringBatchEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SpringBatchEndpointBuilderImpl extends AbstractEndpointBuilder implements SpringBatchEndpointBuilder, AdvancedSpringBatchEndpointBuilder {
            public SpringBatchEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SpringBatchEndpointBuilderImpl(path);
    }
}