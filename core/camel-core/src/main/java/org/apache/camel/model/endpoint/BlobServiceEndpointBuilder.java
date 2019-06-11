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
 * The azure-blob component is used for storing and retrieving blobs from Azure
 * Storage Blob Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BlobServiceEndpointBuilder {


    public static class BlobServiceCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        BlobServiceCommonBuilder(String path) {
            super("azure-blob", path);
        }
        /**
         * Container or Blob compact Uri. The option is a
         * <code>java.lang.String</code> type.
         */
        public T containerOrBlobUri(String containerOrBlobUri) {
            this.properties.put("containerOrBlobUri", containerOrBlobUri);
            return (T) this;
        }
        /**
         * The blob service client. The option is a
         * <code>com.microsoft.azure.storage.blob.CloudBlob</code> type.
         */
        public T azureBlobClient(Object azureBlobClient) {
            this.properties.put("azureBlobClient", azureBlobClient);
            return (T) this;
        }
        /**
         * The blob service client. The option will be converted to a
         * <code>com.microsoft.azure.storage.blob.CloudBlob</code> type.
         */
        public T azureBlobClient(String azureBlobClient) {
            this.properties.put("azureBlobClient", azureBlobClient);
            return (T) this;
        }
        /**
         * Set the blob offset for the upload or download operations, default is
         * 0. The option is a <code>java.lang.Long</code> type.
         */
        public T blobOffset(Long blobOffset) {
            this.properties.put("blobOffset", blobOffset);
            return (T) this;
        }
        /**
         * Set the blob offset for the upload or download operations, default is
         * 0. The option will be converted to a <code>java.lang.Long</code>
         * type.
         */
        public T blobOffset(String blobOffset) {
            this.properties.put("blobOffset", blobOffset);
            return (T) this;
        }
        /**
         * Set a blob type, 'blockblob' is default. The option is a
         * <code>org.apache.camel.component.azure.blob.BlobType</code> type.
         */
        public T blobType(BlobType blobType) {
            this.properties.put("blobType", blobType);
            return (T) this;
        }
        /**
         * Set a blob type, 'blockblob' is default. The option will be converted
         * to a <code>org.apache.camel.component.azure.blob.BlobType</code>
         * type.
         */
        public T blobType(String blobType) {
            this.properties.put("blobType", blobType);
            return (T) this;
        }
        /**
         * Close the stream after read or keep it open, default is true. The
         * option is a <code>boolean</code> type.
         */
        public T closeStreamAfterRead(boolean closeStreamAfterRead) {
            this.properties.put("closeStreamAfterRead", closeStreamAfterRead);
            return (T) this;
        }
        /**
         * Close the stream after read or keep it open, default is true. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T closeStreamAfterRead(String closeStreamAfterRead) {
            this.properties.put("closeStreamAfterRead", closeStreamAfterRead);
            return (T) this;
        }
        /**
         * Set the storage credentials, required in most cases. The option is a
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         */
        public T credentials(Object credentials) {
            this.properties.put("credentials", credentials);
            return (T) this;
        }
        /**
         * Set the storage credentials, required in most cases. The option will
         * be converted to a
         * <code>com.microsoft.azure.storage.StorageCredentials</code> type.
         */
        public T credentials(String credentials) {
            this.properties.put("credentials", credentials);
            return (T) this;
        }
        /**
         * Set the data length for the download or page blob upload operations.
         * The option is a <code>java.lang.Long</code> type.
         */
        public T dataLength(Long dataLength) {
            this.properties.put("dataLength", dataLength);
            return (T) this;
        }
        /**
         * Set the data length for the download or page blob upload operations.
         * The option will be converted to a <code>java.lang.Long</code> type.
         */
        public T dataLength(String dataLength) {
            this.properties.put("dataLength", dataLength);
            return (T) this;
        }
        /**
         * Set the file directory where the downloaded blobs will be saved to.
         * The option is a <code>java.lang.String</code> type.
         */
        public T fileDir(String fileDir) {
            this.properties.put("fileDir", fileDir);
            return (T) this;
        }
        /**
         * Storage resources can be public for reading their content, if this
         * property is enabled then the credentials do not have to be set. The
         * option is a <code>boolean</code> type.
         */
        public T publicForRead(boolean publicForRead) {
            this.properties.put("publicForRead", publicForRead);
            return (T) this;
        }
        /**
         * Storage resources can be public for reading their content, if this
         * property is enabled then the credentials do not have to be set. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T publicForRead(String publicForRead) {
            this.properties.put("publicForRead", publicForRead);
            return (T) this;
        }
        /**
         * Set the minimum read size in bytes when reading the blob content. The
         * option is a <code>int</code> type.
         */
        public T streamReadSize(int streamReadSize) {
            this.properties.put("streamReadSize", streamReadSize);
            return (T) this;
        }
        /**
         * Set the minimum read size in bytes when reading the blob content. The
         * option will be converted to a <code>int</code> type.
         */
        public T streamReadSize(String streamReadSize) {
            this.properties.put("streamReadSize", streamReadSize);
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
    }

    public static class BlobServiceConsumerBuilder
            extends
                BlobServiceCommonBuilder<BlobServiceConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public BlobServiceConsumerBuilder(String path) {
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
        public BlobServiceConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (BlobServiceConsumerBuilder) this;
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
        public BlobServiceConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (BlobServiceConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public BlobServiceConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (BlobServiceConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public BlobServiceConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (BlobServiceConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public BlobServiceConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (BlobServiceConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public BlobServiceConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (BlobServiceConsumerBuilder) this;
        }
    }

    public static class BlobServiceProducerBuilder
            extends
                BlobServiceCommonBuilder<BlobServiceProducerBuilder>
            implements
                EndpointProducerBuilder {
        public BlobServiceProducerBuilder(String path) {
            super(path);
        }
        /**
         * Set the blob meta-data. The option is a
         * <code>java.util.Map&lt;java.lang.String, java.lang.String&gt;</code>
         * type.
         */
        public BlobServiceProducerBuilder blobMetadata(
                Map<String, String> blobMetadata) {
            this.properties.put("blobMetadata", blobMetadata);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Set the blob meta-data. The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.String&gt;</code>
         * type.
         */
        public BlobServiceProducerBuilder blobMetadata(String blobMetadata) {
            this.properties.put("blobMetadata", blobMetadata);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Set a prefix which can be used for listing the blobs. The option is a
         * <code>java.lang.String</code> type.
         */
        public BlobServiceProducerBuilder blobPrefix(String blobPrefix) {
            this.properties.put("blobPrefix", blobPrefix);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Close the stream after write or keep it open, default is true. The
         * option is a <code>boolean</code> type.
         */
        public BlobServiceProducerBuilder closeStreamAfterWrite(
                boolean closeStreamAfterWrite) {
            this.properties.put("closeStreamAfterWrite", closeStreamAfterWrite);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Close the stream after write or keep it open, default is true. The
         * option will be converted to a <code>boolean</code> type.
         */
        public BlobServiceProducerBuilder closeStreamAfterWrite(
                String closeStreamAfterWrite) {
            this.properties.put("closeStreamAfterWrite", closeStreamAfterWrite);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Blob service operation hint to the producer. The option is a
         * <code>org.apache.camel.component.azure.blob.BlobServiceOperations</code> type.
         */
        public BlobServiceProducerBuilder operation(
                BlobServiceOperations operation) {
            this.properties.put("operation", operation);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Blob service operation hint to the producer. The option will be
         * converted to a
         * <code>org.apache.camel.component.azure.blob.BlobServiceOperations</code> type.
         */
        public BlobServiceProducerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Set the size of the buffer for writing block and page blocks. The
         * option is a <code>int</code> type.
         */
        public BlobServiceProducerBuilder streamWriteSize(int streamWriteSize) {
            this.properties.put("streamWriteSize", streamWriteSize);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Set the size of the buffer for writing block and page blocks. The
         * option will be converted to a <code>int</code> type.
         */
        public BlobServiceProducerBuilder streamWriteSize(String streamWriteSize) {
            this.properties.put("streamWriteSize", streamWriteSize);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Specify if the flat or hierarchical blob listing should be used. The
         * option is a <code>boolean</code> type.
         */
        public BlobServiceProducerBuilder useFlatListing(boolean useFlatListing) {
            this.properties.put("useFlatListing", useFlatListing);
            return (BlobServiceProducerBuilder) this;
        }
        /**
         * Specify if the flat or hierarchical blob listing should be used. The
         * option will be converted to a <code>boolean</code> type.
         */
        public BlobServiceProducerBuilder useFlatListing(String useFlatListing) {
            this.properties.put("useFlatListing", useFlatListing);
            return (BlobServiceProducerBuilder) this;
        }
    }

    public static enum BlobType {
        blockblob, appendblob, pageblob;
    }

    public static enum BlobServiceOperations {
        getBlob, deleteBlob, listBlobs, updateBlockBlob, uploadBlobBlocks, commitBlobBlockList, getBlobBlockList, createAppendBlob, updateAppendBlob, createPageBlob, updatePageBlob, resizePageBlob, clearPageBlob, getPageBlobRanges;
    }
    public default BlobServiceConsumerBuilder fromBlobService(String path) {
        return new BlobServiceConsumerBuilder(path);
    }
    public default BlobServiceProducerBuilder toBlobService(String path) {
        return new BlobServiceProducerBuilder(path);
    }
}