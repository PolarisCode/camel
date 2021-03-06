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

import java.nio.file.Path;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The camel-ipfs component provides access to the Interplanetary File System
 * (IPFS).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IPFSEndpointBuilderFactory {


    /**
     * Builder for endpoint for the IPFS component.
     */
    public interface IPFSEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedIPFSEndpointBuilder advanced() {
            return (AdvancedIPFSEndpointBuilder) this;
        }
        /**
         * The ipfs output directory.
         * 
         * The option is a: <code>java.nio.file.Path</code> type.
         * 
         * Group: producer
         */
        default IPFSEndpointBuilder outdir(Path outdir) {
            doSetProperty("outdir", outdir);
            return this;
        }
        /**
         * The ipfs output directory.
         * 
         * The option will be converted to a <code>java.nio.file.Path</code>
         * type.
         * 
         * Group: producer
         */
        default IPFSEndpointBuilder outdir(String outdir) {
            doSetProperty("outdir", outdir);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the IPFS component.
     */
    public interface AdvancedIPFSEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IPFSEndpointBuilder basic() {
            return (IPFSEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedIPFSEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedIPFSEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedIPFSEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedIPFSEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * IPFS (camel-ipfs)
     * The camel-ipfs component provides access to the Interplanetary File
     * System (IPFS).
     * 
     * Category: file,ipfs
     * Available as of version: 2.23
     * Maven coordinates: org.apache.camel:camel-ipfs
     * 
     * Syntax: <code>ipfs:ipfsHost:ipfsPort/ipfsCmd</code>
     * 
     * Path parameter: ipfsHost
     * The ipfs host
     * 
     * Path parameter: ipfsPort
     * The ipfs port
     * 
     * Path parameter: ipfsCmd
     * The ipfs command
     * The value can be one of: add, cat, get, version
     */
    default IPFSEndpointBuilder ipfs(String path) {
        class IPFSEndpointBuilderImpl extends AbstractEndpointBuilder implements IPFSEndpointBuilder, AdvancedIPFSEndpointBuilder {
            public IPFSEndpointBuilderImpl(String path) {
                super("ipfs", path);
            }
        }
        return new IPFSEndpointBuilderImpl(path);
    }
}