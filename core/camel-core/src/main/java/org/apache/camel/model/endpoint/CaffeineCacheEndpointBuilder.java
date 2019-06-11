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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The caffeine-cache component is used for integration with Caffeine Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CaffeineCacheEndpointBuilder {


    public static class CaffeineCacheCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        CaffeineCacheCommonBuilder(String path) {
            super("caffeine-cache", path);
        }
        /**
         * the cache name. The option is a <code>java.lang.String</code> type.
         */
        public T cacheName(String cacheName) {
            this.properties.put("cacheName", cacheName);
            return (T) this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured. The option is a <code>boolean</code> type.
         */
        public T createCacheIfNotExist(boolean createCacheIfNotExist) {
            this.properties.put("createCacheIfNotExist", createCacheIfNotExist);
            return (T) this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T createCacheIfNotExist(String createCacheIfNotExist) {
            this.properties.put("createCacheIfNotExist", createCacheIfNotExist);
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
         * The cache key type, default java.lang.Object. The option is a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         */
        public T keyType(Class<Object> keyType) {
            this.properties.put("keyType", keyType);
            return (T) this;
        }
        /**
         * The cache key type, default java.lang.Object. The option will be
         * converted to a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         */
        public T keyType(String keyType) {
            this.properties.put("keyType", keyType);
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
         * The cache value type, default java.lang.Object. The option is a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         */
        public T valueType(Class<Object> valueType) {
            this.properties.put("valueType", valueType);
            return (T) this;
        }
        /**
         * The cache value type, default java.lang.Object. The option will be
         * converted to a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         */
        public T valueType(String valueType) {
            this.properties.put("valueType", valueType);
            return (T) this;
        }
    }

    public static class CaffeineCacheConsumerBuilder
            extends
                CaffeineCacheCommonBuilder<CaffeineCacheConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public CaffeineCacheConsumerBuilder(String path) {
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
        public CaffeineCacheConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CaffeineCacheConsumerBuilder) this;
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
        public CaffeineCacheConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CaffeineCacheConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public CaffeineCacheConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CaffeineCacheConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public CaffeineCacheConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CaffeineCacheConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public CaffeineCacheConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CaffeineCacheConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public CaffeineCacheConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CaffeineCacheConsumerBuilder) this;
        }
    }

    public static class CaffeineCacheProducerBuilder
            extends
                CaffeineCacheCommonBuilder<CaffeineCacheProducerBuilder>
            implements
                EndpointProducerBuilder {
        public CaffeineCacheProducerBuilder(String path) {
            super(path);
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * The option is a <code>java.lang.String</code> type.
         */
        public CaffeineCacheProducerBuilder action(String action) {
            this.properties.put("action", action);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To configure an already instantiated cache to be used. The option is
         * a <code>com.github.benmanes.caffeine.cache.Cache</code> type.
         */
        public CaffeineCacheProducerBuilder cache(Object cache) {
            this.properties.put("cache", cache);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To configure an already instantiated cache to be used. The option
         * will be converted to a
         * <code>com.github.benmanes.caffeine.cache.Cache</code> type.
         */
        public CaffeineCacheProducerBuilder cache(String cache) {
            this.properties.put("cache", cache);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use. The option is
         * a <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         */
        public CaffeineCacheProducerBuilder cacheLoader(Object cacheLoader) {
            this.properties.put("cacheLoader", cacheLoader);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use. The option
         * will be converted to a
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         */
        public CaffeineCacheProducerBuilder cacheLoader(String cacheLoader) {
            this.properties.put("cacheLoader", cacheLoader);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the eviction Type for this cache. The option is a
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         */
        public CaffeineCacheProducerBuilder evictionType(
                EvictionType evictionType) {
            this.properties.put("evictionType", evictionType);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the eviction Type for this cache. The option will be converted to
         * a <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         */
        public CaffeineCacheProducerBuilder evictionType(String evictionType) {
            this.properties.put("evictionType", evictionType);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds). The option is a <code>int</code> type.
         */
        public CaffeineCacheProducerBuilder expireAfterAccessTime(
                int expireAfterAccessTime) {
            this.properties.put("expireAfterAccessTime", expireAfterAccessTime);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds). The option will be converted to a <code>int</code> type.
         */
        public CaffeineCacheProducerBuilder expireAfterAccessTime(
                String expireAfterAccessTime) {
            this.properties.put("expireAfterAccessTime", expireAfterAccessTime);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds). The option is a <code>int</code> type.
         */
        public CaffeineCacheProducerBuilder expireAfterWriteTime(
                int expireAfterWriteTime) {
            this.properties.put("expireAfterWriteTime", expireAfterWriteTime);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds). The option will be converted to a <code>int</code> type.
         */
        public CaffeineCacheProducerBuilder expireAfterWriteTime(
                String expireAfterWriteTime) {
            this.properties.put("expireAfterWriteTime", expireAfterWriteTime);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the initial Capacity for the cache. The option is a
         * <code>int</code> type.
         */
        public CaffeineCacheProducerBuilder initialCapacity(int initialCapacity) {
            this.properties.put("initialCapacity", initialCapacity);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the initial Capacity for the cache. The option will be converted
         * to a <code>int</code> type.
         */
        public CaffeineCacheProducerBuilder initialCapacity(
                String initialCapacity) {
            this.properties.put("initialCapacity", initialCapacity);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence. The option is
         * a <code>java.lang.Object</code> type.
         */
        public CaffeineCacheProducerBuilder key(Object key) {
            this.properties.put("key", key);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence. The option
         * will be converted to a <code>java.lang.Object</code> type.
         */
        public CaffeineCacheProducerBuilder key(String key) {
            this.properties.put("key", key);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the maximum size for the cache. The option is a <code>int</code>
         * type.
         */
        public CaffeineCacheProducerBuilder maximumSize(int maximumSize) {
            this.properties.put("maximumSize", maximumSize);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set the maximum size for the cache. The option will be converted to a
         * <code>int</code> type.
         */
        public CaffeineCacheProducerBuilder maximumSize(String maximumSize) {
            this.properties.put("maximumSize", maximumSize);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set a specific removal Listener for the cache. The option is a
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         */
        public CaffeineCacheProducerBuilder removalListener(
                Object removalListener) {
            this.properties.put("removalListener", removalListener);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set a specific removal Listener for the cache. The option will be
         * converted to a
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         */
        public CaffeineCacheProducerBuilder removalListener(
                String removalListener) {
            this.properties.put("removalListener", removalListener);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set a specific Stats Counter for the cache stats. The option is a
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         */
        public CaffeineCacheProducerBuilder statsCounter(Object statsCounter) {
            this.properties.put("statsCounter", statsCounter);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * Set a specific Stats Counter for the cache stats. The option will be
         * converted to a
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         */
        public CaffeineCacheProducerBuilder statsCounter(String statsCounter) {
            this.properties.put("statsCounter", statsCounter);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To enable stats on the cache. The option is a <code>boolean</code>
         * type.
         */
        public CaffeineCacheProducerBuilder statsEnabled(boolean statsEnabled) {
            this.properties.put("statsEnabled", statsEnabled);
            return (CaffeineCacheProducerBuilder) this;
        }
        /**
         * To enable stats on the cache. The option will be converted to a
         * <code>boolean</code> type.
         */
        public CaffeineCacheProducerBuilder statsEnabled(String statsEnabled) {
            this.properties.put("statsEnabled", statsEnabled);
            return (CaffeineCacheProducerBuilder) this;
        }
    }

    public static enum EvictionType {
        size_based, time_based;
    }
    public default CaffeineCacheConsumerBuilder fromCaffeineCache(String path) {
        return new CaffeineCacheConsumerBuilder(path);
    }
    public default CaffeineCacheProducerBuilder toCaffeineCache(String path) {
        return new CaffeineCacheProducerBuilder(path);
    }
}