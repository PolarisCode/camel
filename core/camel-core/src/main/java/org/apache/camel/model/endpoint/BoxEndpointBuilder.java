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
package org.apache.camel.model.endpoint;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * For uploading downloading and managing files folders groups collaborations
 * etc on box DOT com.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BoxEndpointBuilder {


    public static class BoxCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        BoxCommonBuilder(String path) {
            super("box", path);
        }
        /**
         * What kind of operation to perform. The option is a
         * <code>org.apache.camel.component.box.internal.BoxApiName</code> type.
         */
        public T apiName(BoxApiName apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What kind of operation to perform. The option will be converted to a
         * <code>org.apache.camel.component.box.internal.BoxApiName</code> type.
         */
        public T apiName(String apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What sub operation to use for the selected operation. The option is a
         * <code>java.lang.String</code> type.
         */
        public T methodName(String methodName) {
            this.properties.put("methodName", methodName);
            return (T) this;
        }
        /**
         * Box application client ID. The option is a
         * <code>java.lang.String</code> type.
         */
        public T clientId(String clientId) {
            this.properties.put("clientId", clientId);
            return (T) this;
        }
        /**
         * The enterprise ID to use for an App Enterprise. The option is a
         * <code>java.lang.String</code> type.
         */
        public T enterpriseId(String enterpriseId) {
            this.properties.put("enterpriseId", enterpriseId);
            return (T) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a <code>java.lang.String</code> type.
         */
        public T inBody(String inBody) {
            this.properties.put("inBody", inBody);
            return (T) this;
        }
        /**
         * The user ID to use for an App User. The option is a
         * <code>java.lang.String</code> type.
         */
        public T userId(String userId) {
            this.properties.put("userId", userId);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a <code>boolean</code> type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Custom HTTP params for settings like proxy host. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public T httpParams(Map<String, Object> httpParams) {
            this.properties.put("httpParams", httpParams);
            return (T) this;
        }
        /**
         * Custom HTTP params for settings like proxy host. The option will be
         * converted to a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public T httpParams(String httpParams) {
            this.properties.put("httpParams", httpParams);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a <code>boolean</code> type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * will be converted to a <code>boolean</code> type.
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Custom Access Token Cache for storing and retrieving access tokens.
         * The option is a <code>com.box.sdk.IAccessTokenCache</code> type.
         */
        public T accessTokenCache(Object accessTokenCache) {
            this.properties.put("accessTokenCache", accessTokenCache);
            return (T) this;
        }
        /**
         * Custom Access Token Cache for storing and retrieving access tokens.
         * The option will be converted to a
         * <code>com.box.sdk.IAccessTokenCache</code> type.
         */
        public T accessTokenCache(String accessTokenCache) {
            this.properties.put("accessTokenCache", accessTokenCache);
            return (T) this;
        }
        /**
         * Box application client secret. The option is a
         * <code>java.lang.String</code> type.
         */
        public T clientSecret(String clientSecret) {
            this.properties.put("clientSecret", clientSecret);
            return (T) this;
        }
        /**
         * The type of encryption algorithm for JWT. Supported Algorithms:
         * RSA_SHA_256 RSA_SHA_384 RSA_SHA_512. The option is a
         * <code>com.box.sdk.EncryptionAlgorithm</code> type.
         */
        public T encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.properties.put("encryptionAlgorithm", encryptionAlgorithm);
            return (T) this;
        }
        /**
         * The type of encryption algorithm for JWT. Supported Algorithms:
         * RSA_SHA_256 RSA_SHA_384 RSA_SHA_512. The option will be converted to
         * a <code>com.box.sdk.EncryptionAlgorithm</code> type.
         */
        public T encryptionAlgorithm(String encryptionAlgorithm) {
            this.properties.put("encryptionAlgorithm", encryptionAlgorithm);
            return (T) this;
        }
        /**
         * The maximum number of access tokens in cache. The option is a
         * <code>int</code> type.
         */
        public T maxCacheEntries(int maxCacheEntries) {
            this.properties.put("maxCacheEntries", maxCacheEntries);
            return (T) this;
        }
        /**
         * The maximum number of access tokens in cache. The option will be
         * converted to a <code>int</code> type.
         */
        public T maxCacheEntries(String maxCacheEntries) {
            this.properties.put("maxCacheEntries", maxCacheEntries);
            return (T) this;
        }
        /**
         * The type of authentication for connection. Types of Authentication:
         * STANDARD_AUTHENTICATION - OAuth 2.0 (3-legged) SERVER_AUTHENTICATION
         * - OAuth 2.0 with JSON Web Tokens. The option is a
         * <code>java.lang.String</code> type.
         */
        public T authenticationType(String authenticationType) {
            this.properties.put("authenticationType", authenticationType);
            return (T) this;
        }
        /**
         * The private key for generating the JWT signature. The option is a
         * <code>java.lang.String</code> type.
         */
        public T privateKeyFile(String privateKeyFile) {
            this.properties.put("privateKeyFile", privateKeyFile);
            return (T) this;
        }
        /**
         * The password for the private key. The option is a
         * <code>java.lang.String</code> type.
         */
        public T privateKeyPassword(String privateKeyPassword) {
            this.properties.put("privateKeyPassword", privateKeyPassword);
            return (T) this;
        }
        /**
         * The ID for public key for validating the JWT signature. The option is
         * a <code>java.lang.String</code> type.
         */
        public T publicKeyId(String publicKeyId) {
            this.properties.put("publicKeyId", publicKeyId);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option will be
         * converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         */
        public T sslContextParameters(String sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * Box user name, MUST be provided. The option is a
         * <code>java.lang.String</code> type.
         */
        public T userName(String userName) {
            this.properties.put("userName", userName);
            return (T) this;
        }
        /**
         * Box user password, MUST be provided if authSecureStorage is not set,
         * or returns null on first call. The option is a
         * <code>java.lang.String</code> type.
         */
        public T userPassword(String userPassword) {
            this.properties.put("userPassword", userPassword);
            return (T) this;
        }
    }

    public static class BoxConsumerBuilder
            extends
                BoxCommonBuilder<BoxConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public BoxConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a <code>boolean</code> type.
         */
        public BoxConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (BoxConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option will be converted to a <code>boolean</code> type.
         */
        public BoxConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (BoxConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public BoxConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (BoxConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public BoxConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (BoxConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public BoxConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (BoxConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public BoxConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (BoxConsumerBuilder) this;
        }
    }

    public static class BoxProducerBuilder
            extends
                BoxCommonBuilder<BoxProducerBuilder>
            implements
                EndpointProducerBuilder {
        public BoxProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum BoxApiName {
        COLLABORATIONS, COMMENTS, EVENT_LOGS, FILES, FOLDERS, GROUPS, EVENTS, SEARCH, TASKS, USERS;
    }

    public static enum EncryptionAlgorithm {
        RSA_SHA_256, RSA_SHA_384, RSA_SHA_512;
    }
    public default BoxConsumerBuilder fromBox(String path) {
        return new BoxConsumerBuilder(path);
    }
    public default BoxProducerBuilder toBox(String path) {
        return new BoxProducerBuilder(path);
    }
}