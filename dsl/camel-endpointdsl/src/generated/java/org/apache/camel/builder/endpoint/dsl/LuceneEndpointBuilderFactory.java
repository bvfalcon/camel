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
 * Perform inserts or queries against Apache Lucene databases.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LuceneEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Lucene component.
     */
    public interface LuceneEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLuceneEndpointBuilder advanced() {
            return (AdvancedLuceneEndpointBuilder) this;
        }
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.lucene.analysis.Analyzer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param analyzer the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder analyzer(
                org.apache.lucene.analysis.Analyzer analyzer) {
            doSetProperty("analyzer", analyzer);
            return this;
        }
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.lucene.analysis.Analyzer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param analyzer the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder analyzer(String analyzer) {
            doSetProperty("analyzer", analyzer);
            return this;
        }
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer.
         * 
         * The option is a: &lt;code&gt;java.io.File&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param indexDir the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder indexDir(java.io.File indexDir) {
            doSetProperty("indexDir", indexDir);
            return this;
        }
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.io.File&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param indexDir the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder indexDir(String indexDir) {
            doSetProperty("indexDir", indexDir);
            return this;
        }
        /**
         * An integer value that limits the result set of the search operation.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param maxHits the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder maxHits(int maxHits) {
            doSetProperty("maxHits", maxHits);
            return this;
        }
        /**
         * An integer value that limits the result set of the search operation.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param maxHits the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder maxHits(String maxHits) {
            doSetProperty("maxHits", maxHits);
            return this;
        }
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         * 
         * The option is a: &lt;code&gt;java.io.File&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param srcDir the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder srcDir(java.io.File srcDir) {
            doSetProperty("srcDir", srcDir);
            return this;
        }
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.io.File&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param srcDir the value to set
         * @return the dsl builder
         */
        default LuceneEndpointBuilder srcDir(String srcDir) {
            doSetProperty("srcDir", srcDir);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Lucene component.
     */
    public interface AdvancedLuceneEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LuceneEndpointBuilder basic() {
            return (LuceneEndpointBuilder) this;
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
        default AdvancedLuceneEndpointBuilder lazyStartProducer(
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
        default AdvancedLuceneEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface LuceneBuilders {
        /**
         * Lucene (camel-lucene)
         * Perform inserts or queries against Apache Lucene databases.
         * 
         * Category: database,search
         * Since: 2.2
         * Maven coordinates: org.apache.camel:camel-lucene
         * 
         * @return the dsl builder for the headers' name.
         */
        default LuceneHeaderNameBuilder lucene() {
            return LuceneHeaderNameBuilder.INSTANCE;
        }
        /**
         * Lucene (camel-lucene)
         * Perform inserts or queries against Apache Lucene databases.
         * 
         * Category: database,search
         * Since: 2.2
         * Maven coordinates: org.apache.camel:camel-lucene
         * 
         * Syntax: <code>lucene:host:operation</code>
         * 
         * Path parameter: host (required)
         * The URL to the lucene server
         * 
         * Path parameter: operation (required)
         * Operation to do such as insert or query.
         * There are 2 enums and the value can be one of: insert, query
         * 
         * @param path host:operation
         * @return the dsl builder
         */
        default LuceneEndpointBuilder lucene(String path) {
            return LuceneEndpointBuilderFactory.endpointBuilder("lucene", path);
        }
        /**
         * Lucene (camel-lucene)
         * Perform inserts or queries against Apache Lucene databases.
         * 
         * Category: database,search
         * Since: 2.2
         * Maven coordinates: org.apache.camel:camel-lucene
         * 
         * Syntax: <code>lucene:host:operation</code>
         * 
         * Path parameter: host (required)
         * The URL to the lucene server
         * 
         * Path parameter: operation (required)
         * Operation to do such as insert or query.
         * There are 2 enums and the value can be one of: insert, query
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:operation
         * @return the dsl builder
         */
        default LuceneEndpointBuilder lucene(String componentName, String path) {
            return LuceneEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Lucene component.
     */
    public static class LuceneHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final LuceneHeaderNameBuilder INSTANCE = new LuceneHeaderNameBuilder();

        /**
         * The Lucene Query to performed on the index. The query may include
         * wildcards and phrases.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code QUERY}.
         */
        public String qUERY() {
            return "QUERY";
        }

        /**
         * Set this header to true to include the actual Lucene documentation
         * when returning hit information.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code RETURN_LUCENE_DOCS}.
         */
        public String returnLuceneDocs() {
            return "RETURN_LUCENE_DOCS";
        }
    }
    static LuceneEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class LuceneEndpointBuilderImpl extends AbstractEndpointBuilder implements LuceneEndpointBuilder, AdvancedLuceneEndpointBuilder {
            public LuceneEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new LuceneEndpointBuilderImpl(path);
    }
}