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
 * Access data in OpenStack Cinder block storage.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CinderEndpointBuilderFactory {


    /**
     * Builder for endpoint for the OpenStack Cinder component.
     */
    public interface CinderEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCinderEndpointBuilder advanced() {
            return (AdvancedCinderEndpointBuilder) this;
        }
        /**
         * OpenStack API version.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: V3
         * Group: producer
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.openstack4j.core.transport.Config&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param config the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder config(
                org.openstack4j.core.transport.Config config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.openstack4j.core.transport.Config&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param config the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder config(String config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * Authentication domain.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: default
         * Group: producer
         * 
         * @param domain the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder domain(String domain) {
            doSetProperty("domain", domain);
            return this;
        }
        /**
         * The operation to do.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * OpenStack password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The project ID.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param project the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder project(String project) {
            doSetProperty("project", project);
            return this;
        }
        /**
         * OpenStack Cinder subsystem.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param subsystem the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder subsystem(String subsystem) {
            doSetProperty("subsystem", subsystem);
            return this;
        }
        /**
         * OpenStack username.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default CinderEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OpenStack Cinder component.
     */
    public interface AdvancedCinderEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CinderEndpointBuilder basic() {
            return (CinderEndpointBuilder) this;
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
        default AdvancedCinderEndpointBuilder lazyStartProducer(
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
        default AdvancedCinderEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface CinderBuilders {
        /**
         * OpenStack Cinder (camel-openstack)
         * Access data in OpenStack Cinder block storage.
         * 
         * Category: cloud,paas
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * @return the dsl builder for the headers' name.
         */
        default CinderHeaderNameBuilder openstackCinder() {
            return CinderHeaderNameBuilder.INSTANCE;
        }
        /**
         * OpenStack Cinder (camel-openstack)
         * Access data in OpenStack Cinder block storage.
         * 
         * Category: cloud,paas
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * Syntax: <code>openstack-cinder:host</code>
         * 
         * Path parameter: host (required)
         * OpenStack host url
         * 
         * @param path host
         * @return the dsl builder
         */
        default CinderEndpointBuilder openstackCinder(String path) {
            return CinderEndpointBuilderFactory.endpointBuilder("openstack-cinder", path);
        }
        /**
         * OpenStack Cinder (camel-openstack)
         * Access data in OpenStack Cinder block storage.
         * 
         * Category: cloud,paas
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * Syntax: <code>openstack-cinder:host</code>
         * 
         * Path parameter: host (required)
         * OpenStack host url
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host
         * @return the dsl builder
         */
        default CinderEndpointBuilder openstackCinder(
                String componentName,
                String path) {
            return CinderEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the OpenStack Cinder component.
     */
    public static class CinderHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final CinderHeaderNameBuilder INSTANCE = new CinderHeaderNameBuilder();

        /**
         * Size of volume.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: volume
         * 
         * @return the name of the header {@code size}.
         */
        public String size() {
            return "size";
        }

        /**
         * Volume type.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: volume
         * 
         * @return the name of the header {@code volumeType}.
         */
        public String volumeType() {
            return "volumeType";
        }

        /**
         * ID of image.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: volume
         * 
         * @return the name of the header {@code imageRef}.
         */
        public String imageRef() {
            return "imageRef";
        }

        /**
         * ID of snapshot.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: volume
         * 
         * @return the name of the header {@code snapshotId}.
         */
        public String snapshotId() {
            return "snapshotId";
        }

        /**
         * Is bootable.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: volume
         * 
         * @return the name of the header {@code isBootable}.
         */
        public String isBootable() {
            return "isBootable";
        }

        /**
         * The Volume ID.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: snapshot
         * 
         * @return the name of the header {@code volumeId}.
         */
        public String volumeId() {
            return "volumeId";
        }

        /**
         * Force.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: snapshot
         * 
         * @return the name of the header {@code force}.
         */
        public String force() {
            return "force";
        }

        /**
         * The operation to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code operation}.
         */
        public String operation() {
            return "operation";
        }

        /**
         * The ID.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ID}.
         */
        public String iD() {
            return "ID";
        }

        /**
         * The name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code name}.
         */
        public String name() {
            return "name";
        }

        /**
         * The description.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code description}.
         */
        public String description() {
            return "description";
        }
    }
    static CinderEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class CinderEndpointBuilderImpl extends AbstractEndpointBuilder implements CinderEndpointBuilder, AdvancedCinderEndpointBuilder {
            public CinderEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new CinderEndpointBuilderImpl(path);
    }
}