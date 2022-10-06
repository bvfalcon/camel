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
 * Verify XML payloads using the XML signature specification.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface XmlVerifierEndpointBuilderFactory {


    /**
     * Builder for endpoint for the XML Security Verify component.
     */
    public interface XmlVerifierEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedXmlVerifierEndpointBuilder advanced() {
            return (AdvancedXmlVerifierEndpointBuilder) this;
        }
        /**
         * You can set a base URI which is used in the URI dereferencing.
         * Relative URIs are then concatenated with the base URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param baseUri the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder baseUri(String baseUri) {
            doSetProperty("baseUri", baseUri);
            return this;
        }
        /**
         * Determines if the XML signature specific headers be cleared after
         * signing and verification. Defaults to true.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param clearHeaders the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder clearHeaders(Boolean clearHeaders) {
            doSetProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * Determines if the XML signature specific headers be cleared after
         * signing and verification. Defaults to true.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param clearHeaders the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder clearHeaders(String clearHeaders) {
            doSetProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * Sets the crypto context properties. See {link
         * XMLCryptoContext#setProperty(String, Object)}. Possible properties
         * are defined in XMLSignContext an XMLValidateContext (see Supported
         * Properties). The following properties are set by default to the value
         * Boolean#TRUE for the XML validation. If you want to switch these
         * features off you must set the property value to Boolean#FALSE.
         * org.jcp.xml.dsig.validateManifests
         * javax.xml.crypto.dsig.cacheReference.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param cryptoContextProperties the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder cryptoContextProperties(
                Map<java.lang.String, java.lang.Object> cryptoContextProperties) {
            doSetProperty("cryptoContextProperties", cryptoContextProperties);
            return this;
        }
        /**
         * Sets the crypto context properties. See {link
         * XMLCryptoContext#setProperty(String, Object)}. Possible properties
         * are defined in XMLSignContext an XMLValidateContext (see Supported
         * Properties). The following properties are set by default to the value
         * Boolean#TRUE for the XML validation. If you want to switch these
         * features off you must set the property value to Boolean#FALSE.
         * org.jcp.xml.dsig.validateManifests
         * javax.xml.crypto.dsig.cacheReference.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param cryptoContextProperties the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder cryptoContextProperties(
                String cryptoContextProperties) {
            doSetProperty("cryptoContextProperties", cryptoContextProperties);
            return this;
        }
        /**
         * Disallows that the incoming XML document contains DTD DOCTYPE
         * declaration. The default value is Boolean#TRUE.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param disallowDoctypeDecl the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder disallowDoctypeDecl(
                Boolean disallowDoctypeDecl) {
            doSetProperty("disallowDoctypeDecl", disallowDoctypeDecl);
            return this;
        }
        /**
         * Disallows that the incoming XML document contains DTD DOCTYPE
         * declaration. The default value is Boolean#TRUE.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param disallowDoctypeDecl the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder disallowDoctypeDecl(
                String disallowDoctypeDecl) {
            doSetProperty("disallowDoctypeDecl", disallowDoctypeDecl);
            return this;
        }
        /**
         * Provides the key for validating the XML signature.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.crypto.KeySelector&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keySelector the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder keySelector(
                javax.xml.crypto.KeySelector keySelector) {
            doSetProperty("keySelector", keySelector);
            return this;
        }
        /**
         * Provides the key for validating the XML signature.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.xml.crypto.KeySelector&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keySelector the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder keySelector(String keySelector) {
            doSetProperty("keySelector", keySelector);
            return this;
        }
        /**
         * Indicator whether the XML declaration in the outgoing message body
         * should be omitted. Default value is false. Can be overwritten by the
         * header XmlSignatureConstants#HEADER_OMIT_XML_DECLARATION.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param omitXmlDeclaration the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder omitXmlDeclaration(
                Boolean omitXmlDeclaration) {
            doSetProperty("omitXmlDeclaration", omitXmlDeclaration);
            return this;
        }
        /**
         * Indicator whether the XML declaration in the outgoing message body
         * should be omitted. Default value is false. Can be overwritten by the
         * header XmlSignatureConstants#HEADER_OMIT_XML_DECLARATION.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param omitXmlDeclaration the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder omitXmlDeclaration(
                String omitXmlDeclaration) {
            doSetProperty("omitXmlDeclaration", omitXmlDeclaration);
            return this;
        }
        /**
         * Sets the output node search value for determining the node from the
         * XML signature document which shall be set to the output message body.
         * The class of the value depends on the type of the output node search.
         * The output node search is forwarded to XmlSignature2Message.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param outputNodeSearch the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder outputNodeSearch(
                Object outputNodeSearch) {
            doSetProperty("outputNodeSearch", outputNodeSearch);
            return this;
        }
        /**
         * Sets the output node search value for determining the node from the
         * XML signature document which shall be set to the output message body.
         * The class of the value depends on the type of the output node search.
         * The output node search is forwarded to XmlSignature2Message.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param outputNodeSearch the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder outputNodeSearch(
                String outputNodeSearch) {
            doSetProperty("outputNodeSearch", outputNodeSearch);
            return this;
        }
        /**
         * Determines the search type for determining the output node which is
         * serialized into the output message bodyF. See
         * setOutputNodeSearch(Object). The supported default search types you
         * can find in DefaultXmlSignature2Message.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: Default
         * Group: producer
         * 
         * @param outputNodeSearchType the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder outputNodeSearchType(
                String outputNodeSearchType) {
            doSetProperty("outputNodeSearchType", outputNodeSearchType);
            return this;
        }
        /**
         * The character encoding of the resulting signed XML document. If null
         * then the encoding of the original XML document is used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param outputXmlEncoding the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder outputXmlEncoding(
                String outputXmlEncoding) {
            doSetProperty("outputXmlEncoding", outputXmlEncoding);
            return this;
        }
        /**
         * Indicator whether the XML signature elements (elements with local
         * name Signature and namesapce http://www.w3.org/2000/09/xmldsig#)
         * shall be removed from the document set to the output message.
         * Normally, this is only necessary, if the XML signature is enveloped.
         * The default value is Boolean#FALSE. This parameter is forwarded to
         * XmlSignature2Message. This indicator has no effect if the output node
         * search is of type
         * DefaultXmlSignature2Message#OUTPUT_NODE_SEARCH_TYPE_DEFAULT.F.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param removeSignatureElements the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder removeSignatureElements(
                Boolean removeSignatureElements) {
            doSetProperty("removeSignatureElements", removeSignatureElements);
            return this;
        }
        /**
         * Indicator whether the XML signature elements (elements with local
         * name Signature and namesapce http://www.w3.org/2000/09/xmldsig#)
         * shall be removed from the document set to the output message.
         * Normally, this is only necessary, if the XML signature is enveloped.
         * The default value is Boolean#FALSE. This parameter is forwarded to
         * XmlSignature2Message. This indicator has no effect if the output node
         * search is of type
         * DefaultXmlSignature2Message#OUTPUT_NODE_SEARCH_TYPE_DEFAULT.F.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param removeSignatureElements the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder removeSignatureElements(
                String removeSignatureElements) {
            doSetProperty("removeSignatureElements", removeSignatureElements);
            return this;
        }
        /**
         * Classpath to the XML Schema. Must be specified in the detached XML
         * Signature case for determining the ID attributes, might be set in the
         * enveloped and enveloping case. If set, then the XML document is
         * validated with the specified XML schema. The schema resource URI can
         * be overwritten by the header
         * XmlSignatureConstants#HEADER_SCHEMA_RESOURCE_URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param schemaResourceUri the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder schemaResourceUri(
                String schemaResourceUri) {
            doSetProperty("schemaResourceUri", schemaResourceUri);
            return this;
        }
        /**
         * Enables secure validation. If true then secure validation is enabled.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param secureValidation the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder secureValidation(
                Boolean secureValidation) {
            doSetProperty("secureValidation", secureValidation);
            return this;
        }
        /**
         * Enables secure validation. If true then secure validation is enabled.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param secureValidation the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder secureValidation(
                String secureValidation) {
            doSetProperty("secureValidation", secureValidation);
            return this;
        }
        /**
         * Handles the different validation failed situations. The default
         * implementation throws specific exceptions for the different
         * situations (All exceptions have the package name
         * org.apache.camel.component.xmlsecurity.api and are a sub-class of
         * XmlSignatureInvalidException. If the signature value validation
         * fails, a XmlSignatureInvalidValueException is thrown. If a reference
         * validation fails, a XmlSignatureInvalidContentHashException is
         * thrown. For more detailed information, see the JavaDoc.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param validationFailedHandler the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder validationFailedHandler(
                org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler validationFailedHandler) {
            doSetProperty("validationFailedHandler", validationFailedHandler);
            return this;
        }
        /**
         * Handles the different validation failed situations. The default
         * implementation throws specific exceptions for the different
         * situations (All exceptions have the package name
         * org.apache.camel.component.xmlsecurity.api and are a sub-class of
         * XmlSignatureInvalidException. If the signature value validation
         * fails, a XmlSignatureInvalidValueException is thrown. If a reference
         * validation fails, a XmlSignatureInvalidContentHashException is
         * thrown. For more detailed information, see the JavaDoc.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param validationFailedHandler the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder validationFailedHandler(
                String validationFailedHandler) {
            doSetProperty("validationFailedHandler", validationFailedHandler);
            return this;
        }
        /**
         * Bean which maps the XML signature to the output-message after the
         * validation. How this mapping should be done can be configured by the
         * options outputNodeSearchType, outputNodeSearch, and
         * removeSignatureElements. The default implementation offers three
         * possibilities which are related to the three output node search types
         * Default, ElementName, and XPath. The default implementation
         * determines a node which is then serialized and set to the body of the
         * output message If the search type is ElementName then the output node
         * (which must be in this case an element) is determined by the local
         * name and namespace defined in the search value (see option
         * outputNodeSearch). If the search type is XPath then the output node
         * is determined by the XPath specified in the search value (in this
         * case the output node can be of type Element, TextNode or Document).
         * If the output node search type is Default then the following rules
         * apply: In the enveloped XML signature case (there is a reference with
         * URI= and transform
         * http://www.w3.org/2000/09/xmldsig#enveloped-signature), the incoming
         * XML document without the Signature element is set to the output
         * message body. In the non-enveloped XML signature case, the message
         * body is determined from a referenced Object; this is explained in
         * more detail in chapter Output Node Determination in Enveloping XML
         * Signature Case.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.XmlSignature2Message&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param xmlSignature2Message the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder xmlSignature2Message(
                org.apache.camel.component.xmlsecurity.api.XmlSignature2Message xmlSignature2Message) {
            doSetProperty("xmlSignature2Message", xmlSignature2Message);
            return this;
        }
        /**
         * Bean which maps the XML signature to the output-message after the
         * validation. How this mapping should be done can be configured by the
         * options outputNodeSearchType, outputNodeSearch, and
         * removeSignatureElements. The default implementation offers three
         * possibilities which are related to the three output node search types
         * Default, ElementName, and XPath. The default implementation
         * determines a node which is then serialized and set to the body of the
         * output message If the search type is ElementName then the output node
         * (which must be in this case an element) is determined by the local
         * name and namespace defined in the search value (see option
         * outputNodeSearch). If the search type is XPath then the output node
         * is determined by the XPath specified in the search value (in this
         * case the output node can be of type Element, TextNode or Document).
         * If the output node search type is Default then the following rules
         * apply: In the enveloped XML signature case (there is a reference with
         * URI= and transform
         * http://www.w3.org/2000/09/xmldsig#enveloped-signature), the incoming
         * XML document without the Signature element is set to the output
         * message body. In the non-enveloped XML signature case, the message
         * body is determined from a referenced Object; this is explained in
         * more detail in chapter Output Node Determination in Enveloping XML
         * Signature Case.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.XmlSignature2Message&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param xmlSignature2Message the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder xmlSignature2Message(
                String xmlSignature2Message) {
            doSetProperty("xmlSignature2Message", xmlSignature2Message);
            return this;
        }
        /**
         * This interface allows the application to check the XML signature
         * before the validation is executed. This step is recommended in
         * http://www.w3.org/TR/xmldsig-bestpractices/#check-what-is-signed.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param xmlSignatureChecker the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder xmlSignatureChecker(
                org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker xmlSignatureChecker) {
            doSetProperty("xmlSignatureChecker", xmlSignatureChecker);
            return this;
        }
        /**
         * This interface allows the application to check the XML signature
         * before the validation is executed. This step is recommended in
         * http://www.w3.org/TR/xmldsig-bestpractices/#check-what-is-signed.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param xmlSignatureChecker the value to set
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder xmlSignatureChecker(
                String xmlSignatureChecker) {
            doSetProperty("xmlSignatureChecker", xmlSignatureChecker);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the XML Security Verify component.
     */
    public interface AdvancedXmlVerifierEndpointBuilder
            extends
                EndpointProducerBuilder {
        default XmlVerifierEndpointBuilder basic() {
            return (XmlVerifierEndpointBuilder) this;
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
        default AdvancedXmlVerifierEndpointBuilder lazyStartProducer(
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
        default AdvancedXmlVerifierEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * If you want to restrict the remote access via reference URIs, you can
         * set an own dereferencer. Optional parameter. If not set the provider
         * default dereferencer is used which can resolve URI fragments, HTTP,
         * file and XPpointer URIs. Attention: The implementation is provider
         * dependent!.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.crypto.URIDereferencer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriDereferencer the value to set
         * @return the dsl builder
         */
        default AdvancedXmlVerifierEndpointBuilder uriDereferencer(
                javax.xml.crypto.URIDereferencer uriDereferencer) {
            doSetProperty("uriDereferencer", uriDereferencer);
            return this;
        }
        /**
         * If you want to restrict the remote access via reference URIs, you can
         * set an own dereferencer. Optional parameter. If not set the provider
         * default dereferencer is used which can resolve URI fragments, HTTP,
         * file and XPpointer URIs. Attention: The implementation is provider
         * dependent!.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.xml.crypto.URIDereferencer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriDereferencer the value to set
         * @return the dsl builder
         */
        default AdvancedXmlVerifierEndpointBuilder uriDereferencer(
                String uriDereferencer) {
            doSetProperty("uriDereferencer", uriDereferencer);
            return this;
        }
    }

    public interface XmlVerifierBuilders {
        /**
         * XML Security Verify (camel-xmlsecurity)
         * Verify XML payloads using the XML signature specification.
         * 
         * Category: security,transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-xmlsecurity
         * 
         * @return the dsl builder for the headers' name.
         */
        default XmlVerifierHeaderNameBuilder xmlsecurityVerify() {
            return XmlVerifierHeaderNameBuilder.INSTANCE;
        }
        /**
         * XML Security Verify (camel-xmlsecurity)
         * Verify XML payloads using the XML signature specification.
         * 
         * Category: security,transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-xmlsecurity
         * 
         * Syntax: <code>xmlsecurity-verify:name</code>
         * 
         * Path parameter: name (required)
         * The name part in the URI can be chosen by the user to distinguish
         * between different verify endpoints within the camel context.
         * 
         * @param path name
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder xmlsecurityVerify(String path) {
            return XmlVerifierEndpointBuilderFactory.endpointBuilder("xmlsecurity-verify", path);
        }
        /**
         * XML Security Verify (camel-xmlsecurity)
         * Verify XML payloads using the XML signature specification.
         * 
         * Category: security,transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-xmlsecurity
         * 
         * Syntax: <code>xmlsecurity-verify:name</code>
         * 
         * Path parameter: name (required)
         * The name part in the URI can be chosen by the user to distinguish
         * between different verify endpoints within the camel context.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default XmlVerifierEndpointBuilder xmlsecurityVerify(
                String componentName,
                String path) {
            return XmlVerifierEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the XML Security Verify component.
     */
    public static class XmlVerifierHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final XmlVerifierHeaderNameBuilder INSTANCE = new XmlVerifierHeaderNameBuilder();

        /**
         * Header which indicates that either the resulting signature document
         * in the signature generation case or the resulting output of the
         * verifier should not contain an XML declaration. If the header is not
         * specified then a XML declaration is created. There is one exception:
         * If the verifier result is a plain text this header has no effect.
         * Possible values of the header are Boolean#TRUE or Boolean#FALSE.
         * Overwrites the configuration parameter
         * XmlSignatureConfiguration#setOmitXmlDeclaration(Boolean).
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * XmlSignatureOmitXmlDeclaration}.
         */
        public String xmlSignatureOmitXmlDeclaration() {
            return "XmlSignatureOmitXmlDeclaration";
        }

        /**
         * The schema resource URI.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * XmlSignatureSchemaResourceUri}.
         */
        public String xmlSignatureSchemaResourceUri() {
            return "XmlSignatureSchemaResourceUri";
        }

        /**
         * XPaths to id attributes.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * XmlSignatureXpathsToIdAttributes}.
         */
        public String xmlSignatureXpathsToIdAttributes() {
            return "XmlSignatureXpathsToIdAttributes";
        }

        /**
         * for the 'Id' attribute value of QualifyingProperties element.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * XmlSignatureXAdESQualifyingPropertiesId}.
         */
        public String xmlSignatureXAdESQualifyingPropertiesId() {
            return "XmlSignatureXAdESQualifyingPropertiesId";
        }

        /**
         * for the 'Id' attribute value of SignedDataObjectProperties element.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * XmlSignatureXAdESSignedDataObjectPropertiesId}.
         */
        public String xmlSignatureXAdESSignedDataObjectPropertiesId() {
            return "XmlSignatureXAdESSignedDataObjectPropertiesId";
        }

        /**
         * for the 'Id' attribute value of SignedSignatureProperties element.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * XmlSignatureXAdESSignedSignaturePropertiesId}.
         */
        public String xmlSignatureXAdESSignedSignaturePropertiesId() {
            return "XmlSignatureXAdESSignedSignaturePropertiesId";
        }

        /**
         * for the value of the Encoding element of the DataObjectFormat
         * element.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * XmlSignatureXAdESDataObjectFormatEncoding}.
         */
        public String xmlSignatureXAdESDataObjectFormatEncoding() {
            return "XmlSignatureXAdESDataObjectFormatEncoding";
        }

        /**
         * overwrites the XAdES namespace parameter value.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code XmlSignatureXAdESNamespace}.
         */
        public String xmlSignatureXAdESNamespace() {
            return "XmlSignatureXAdESNamespace";
        }

        /**
         * overwrites the XAdES prefix parameter value.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code XmlSignatureXAdESPrefix}.
         */
        public String xmlSignatureXAdESPrefix() {
            return "XmlSignatureXAdESPrefix";
        }

        /**
         * The name of the charset.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CharsetName}.
         */
        public String charsetName() {
            return "CharsetName";
        }
    }
    static XmlVerifierEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class XmlVerifierEndpointBuilderImpl extends AbstractEndpointBuilder implements XmlVerifierEndpointBuilder, AdvancedXmlVerifierEndpointBuilder {
            public XmlVerifierEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new XmlVerifierEndpointBuilderImpl(path);
    }
}