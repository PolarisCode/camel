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
import java.util.Set;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The ehcache component enables you to perform caching operations using Ehcache
 * as cache implementation.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EhcacheEndpointBuilder {


    public static class EhcacheCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        EhcacheCommonBuilder(String path) {
            super("ehcache", path);
        }
        /**
         * the cache name. The option is a <code>java.lang.String</code> type.
         */
        public T cacheName(String cacheName) {
            this.properties.put("cacheName", cacheName);
            return (T) this;
        }
        /**
         * The cache manager. The option is a
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         */
        public T cacheManager(Object cacheManager) {
            this.properties.put("cacheManager", cacheManager);
            return (T) this;
        }
        /**
         * The cache manager. The option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         */
        public T cacheManager(String cacheManager) {
            this.properties.put("cacheManager", cacheManager);
            return (T) this;
        }
        /**
         * The cache manager configuration. The option is a
         * <code>org.ehcache.config.Configuration</code> type.
         */
        public T cacheManagerConfiguration(Object cacheManagerConfiguration) {
            this.properties.put("cacheManagerConfiguration", cacheManagerConfiguration);
            return (T) this;
        }
        /**
         * The cache manager configuration. The option will be converted to a
         * <code>org.ehcache.config.Configuration</code> type.
         */
        public T cacheManagerConfiguration(String cacheManagerConfiguration) {
            this.properties.put("cacheManagerConfiguration", cacheManagerConfiguration);
            return (T) this;
        }
        /**
         * URI pointing to the Ehcache XML configuration file's location. The
         * option is a <code>java.lang.String</code> type.
         */
        public T configurationUri(String configurationUri) {
            this.properties.put("configurationUri", configurationUri);
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
         * The default cache configuration to be used to create caches. The
         * option is a
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         */
        public T configuration(Object configuration) {
            this.properties.put("configuration", configuration);
            return (T) this;
        }
        /**
         * The default cache configuration to be used to create caches. The
         * option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         */
        public T configuration(String configuration) {
            this.properties.put("configuration", configuration);
            return (T) this;
        }
        /**
         * A map of cache configuration to be used to create caches. The option
         * is a <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&lt;java.lang.Object,
         * java.lang.Object&gt;&gt;</code> type.
         */
        public T configurations(Map<String, Object> configurations) {
            this.properties.put("configurations", configurations);
            return (T) this;
        }
        /**
         * A map of cache configuration to be used to create caches. The option
         * will be converted to a <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&lt;java.lang.Object,
         * java.lang.Object&gt;&gt;</code> type.
         */
        public T configurations(String configurations) {
            this.properties.put("configurations", configurations);
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

    public static class EhcacheConsumerBuilder
            extends
                EhcacheCommonBuilder<EhcacheConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public EhcacheConsumerBuilder(String path) {
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
        public EhcacheConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (EhcacheConsumerBuilder) this;
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
        public EhcacheConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Set the delivery mode (synchronous, asynchronous). The option is a
         * <code>org.ehcache.event.EventFiring</code> type.
         */
        public EhcacheConsumerBuilder eventFiring(EventFiring eventFiring) {
            this.properties.put("eventFiring", eventFiring);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Set the delivery mode (synchronous, asynchronous). The option will be
         * converted to a <code>org.ehcache.event.EventFiring</code> type.
         */
        public EhcacheConsumerBuilder eventFiring(String eventFiring) {
            this.properties.put("eventFiring", eventFiring);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Set the delivery mode (ordered, unordered). The option is a
         * <code>org.ehcache.event.EventOrdering</code> type.
         */
        public EhcacheConsumerBuilder eventOrdering(EventOrdering eventOrdering) {
            this.properties.put("eventOrdering", eventOrdering);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Set the delivery mode (ordered, unordered). The option will be
         * converted to a <code>org.ehcache.event.EventOrdering</code> type.
         */
        public EhcacheConsumerBuilder eventOrdering(String eventOrdering) {
            this.properties.put("eventOrdering", eventOrdering);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Set the type of events to listen for. The option is a
         * <code>java.util.Set&lt;org.ehcache.event.EventType&gt;</code> type.
         */
        public EhcacheConsumerBuilder eventTypes(Set<EventType> eventTypes) {
            this.properties.put("eventTypes", eventTypes);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Set the type of events to listen for. The option will be converted to
         * a <code>java.util.Set&lt;org.ehcache.event.EventType&gt;</code> type.
         */
        public EhcacheConsumerBuilder eventTypes(String eventTypes) {
            this.properties.put("eventTypes", eventTypes);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public EhcacheConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public EhcacheConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public EhcacheConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (EhcacheConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public EhcacheConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (EhcacheConsumerBuilder) this;
        }
    }

    public static class EhcacheProducerBuilder
            extends
                EhcacheCommonBuilder<EhcacheProducerBuilder>
            implements
                EndpointProducerBuilder {
        public EhcacheProducerBuilder(String path) {
            super(path);
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * The option is a <code>java.lang.String</code> type.
         */
        public EhcacheProducerBuilder action(String action) {
            this.properties.put("action", action);
            return (EhcacheProducerBuilder) this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence. The option is
         * a <code>java.lang.Object</code> type.
         */
        public EhcacheProducerBuilder key(Object key) {
            this.properties.put("key", key);
            return (EhcacheProducerBuilder) this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence. The option
         * will be converted to a <code>java.lang.Object</code> type.
         */
        public EhcacheProducerBuilder key(String key) {
            this.properties.put("key", key);
            return (EhcacheProducerBuilder) this;
        }
    }

    public static enum EventFiring {
        ASYNCHRONOUS, SYNCHRONOUS;
    }

    public static enum EventOrdering {
        UNORDERED, ORDERED;
    }

    public static enum EventType {
        EVICTED, EXPIRED, REMOVED, CREATED, UPDATED;
    }
    public default EhcacheConsumerBuilder fromEhcache(String path) {
        return new EhcacheConsumerBuilder(path);
    }
    public default EhcacheProducerBuilder toEhcache(String path) {
        return new EhcacheProducerBuilder(path);
    }
}