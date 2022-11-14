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
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Access Google Cloud BigQuery service using SQL queries.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleBigQuerySQLEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google BigQuery Standard SQL component.
     */
    public interface GoogleBigQuerySQLEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoogleBigQuerySQLEndpointBuilder advanced() {
            return (AdvancedGoogleBigQuerySQLEndpointBuilder) this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If not
         * provided the default one will be used.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default GoogleBigQuerySQLEndpointBuilder connectionFactory(
                org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If not
         * provided the default one will be used.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default GoogleBigQuerySQLEndpointBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Service account key in json format to authenticate an application as
         * a service account to google cloud platform.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GoogleBigQuerySQLEndpointBuilder serviceAccountKey(
                String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google BigQuery Standard SQL
     * component.
     */
    public interface AdvancedGoogleBigQuerySQLEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GoogleBigQuerySQLEndpointBuilder basic() {
            return (GoogleBigQuerySQLEndpointBuilder) this;
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
        default AdvancedGoogleBigQuerySQLEndpointBuilder lazyStartProducer(
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
        default AdvancedGoogleBigQuerySQLEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface GoogleBigQuerySQLBuilders {
        /**
         * Google BigQuery Standard SQL (camel-google-bigquery)
         * Access Google Cloud BigQuery service using SQL queries.
         * 
         * Category: cloud,messaging
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-google-bigquery
         * 
         * @return the dsl builder for the headers' name.
         */
        default GoogleBigQuerySQLHeaderNameBuilder googleBigquerySql() {
            return GoogleBigQuerySQLHeaderNameBuilder.INSTANCE;
        }
        /**
         * Google BigQuery Standard SQL (camel-google-bigquery)
         * Access Google Cloud BigQuery service using SQL queries.
         * 
         * Category: cloud,messaging
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-google-bigquery
         * 
         * Syntax: <code>google-bigquery-sql:projectId:queryString</code>
         * 
         * Path parameter: projectId (required)
         * Google Cloud Project Id
         * 
         * Path parameter: queryString (required)
         * BigQuery standard SQL query
         * 
         * @param path projectId:queryString
         * @return the dsl builder
         */
        default GoogleBigQuerySQLEndpointBuilder googleBigquerySql(String path) {
            return GoogleBigQuerySQLEndpointBuilderFactory.endpointBuilder("google-bigquery-sql", path);
        }
        /**
         * Google BigQuery Standard SQL (camel-google-bigquery)
         * Access Google Cloud BigQuery service using SQL queries.
         * 
         * Category: cloud,messaging
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-google-bigquery
         * 
         * Syntax: <code>google-bigquery-sql:projectId:queryString</code>
         * 
         * Path parameter: projectId (required)
         * Google Cloud Project Id
         * 
         * Path parameter: queryString (required)
         * BigQuery standard SQL query
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path projectId:queryString
         * @return the dsl builder
         */
        default GoogleBigQuerySQLEndpointBuilder googleBigquerySql(
                String componentName,
                String path) {
            return GoogleBigQuerySQLEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Google BigQuery Standard SQL
     * component.
     */
    public static class GoogleBigQuerySQLHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final GoogleBigQuerySQLHeaderNameBuilder INSTANCE = new GoogleBigQuerySQLHeaderNameBuilder();

        /**
         * Preprocessed query text.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * GoogleBigQueryTranslatedQuery}.
         */
        public String googleBigQueryTranslatedQuery() {
            return "GoogleBigQueryTranslatedQuery";
        }

        /**
         * A custom JobId to use.
         * 
         * The option is a: {@code com.google.cloud.bigquery.JobId} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code GoogleBigQueryJobId}.
         */
        public String googleBigQueryJobId() {
            return "GoogleBigQueryJobId";
        }
    }
    static GoogleBigQuerySQLEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GoogleBigQuerySQLEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleBigQuerySQLEndpointBuilder, AdvancedGoogleBigQuerySQLEndpointBuilder {
            public GoogleBigQuerySQLEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoogleBigQuerySQLEndpointBuilderImpl(path);
    }
}