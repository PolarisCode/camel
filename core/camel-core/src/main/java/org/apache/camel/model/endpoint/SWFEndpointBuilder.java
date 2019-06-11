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
 * The aws-swf component is used for managing workflows from Amazon Simple
 * Workflow.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SWFEndpointBuilder {


    public static class SWFCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        SWFCommonBuilder(String path) {
            super("aws-swf", path);
        }
        /**
         * Activity or workflow. The option is a <code>java.lang.String</code>
         * type.
         */
        public T type(String type) {
            this.properties.put("type", type);
            return (T) this;
        }
        /**
         * To use the given AmazonSimpleWorkflowClient as client. The option is
         * a
         * <code>com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient</code> type.
         */
        public T amazonSWClient(Object amazonSWClient) {
            this.properties.put("amazonSWClient", amazonSWClient);
            return (T) this;
        }
        /**
         * To use the given AmazonSimpleWorkflowClient as client. The option
         * will be converted to a
         * <code>com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient</code> type.
         */
        public T amazonSWClient(String amazonSWClient) {
            this.properties.put("amazonSWClient", amazonSWClient);
            return (T) this;
        }
        /**
         * An instance of
         * com.amazonaws.services.simpleworkflow.flow.DataConverter to use for
         * serializing/deserializing the data. The option is a
         * <code>com.amazonaws.services.simpleworkflow.flow.DataConverter</code>
         * type.
         */
        public T dataConverter(Object dataConverter) {
            this.properties.put("dataConverter", dataConverter);
            return (T) this;
        }
        /**
         * An instance of
         * com.amazonaws.services.simpleworkflow.flow.DataConverter to use for
         * serializing/deserializing the data. The option will be converted to a
         * <code>com.amazonaws.services.simpleworkflow.flow.DataConverter</code>
         * type.
         */
        public T dataConverter(String dataConverter) {
            this.properties.put("dataConverter", dataConverter);
            return (T) this;
        }
        /**
         * The workflow domain to use. The option is a
         * <code>java.lang.String</code> type.
         */
        public T domainName(String domainName) {
            this.properties.put("domainName", domainName);
            return (T) this;
        }
        /**
         * The workflow or activity event name to use. The option is a
         * <code>java.lang.String</code> type.
         */
        public T eventName(String eventName) {
            this.properties.put("eventName", eventName);
            return (T) this;
        }
        /**
         * Amazon AWS Region. The option is a <code>java.lang.String</code>
         * type.
         */
        public T region(String region) {
            this.properties.put("region", region);
            return (T) this;
        }
        /**
         * The workflow or activity event version to use. The option is a
         * <code>java.lang.String</code> type.
         */
        public T version(String version) {
            this.properties.put("version", version);
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
         * To configure the ClientConfiguration using the key/values from the
         * Map. The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public T clientConfigurationParameters(
                Map<String, Object> clientConfigurationParameters) {
            this.properties.put("clientConfigurationParameters", clientConfigurationParameters);
            return (T) this;
        }
        /**
         * To configure the ClientConfiguration using the key/values from the
         * Map. The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public T clientConfigurationParameters(
                String clientConfigurationParameters) {
            this.properties.put("clientConfigurationParameters", clientConfigurationParameters);
            return (T) this;
        }
        /**
         * To configure the StartWorkflowOptions using the key/values from the
         * Map. The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public T startWorkflowOptionsParameters(
                Map<String, Object> startWorkflowOptionsParameters) {
            this.properties.put("startWorkflowOptionsParameters", startWorkflowOptionsParameters);
            return (T) this;
        }
        /**
         * To configure the StartWorkflowOptions using the key/values from the
         * Map. The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public T startWorkflowOptionsParameters(
                String startWorkflowOptionsParameters) {
            this.properties.put("startWorkflowOptionsParameters", startWorkflowOptionsParameters);
            return (T) this;
        }
        /**
         * To configure the AmazonSimpleWorkflowClient using the key/values from
         * the Map. The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         */
        public T sWClientParameters(Map<String, Object> sWClientParameters) {
            this.properties.put("sWClientParameters", sWClientParameters);
            return (T) this;
        }
        /**
         * To configure the AmazonSimpleWorkflowClient using the key/values from
         * the Map. The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         */
        public T sWClientParameters(String sWClientParameters) {
            this.properties.put("sWClientParameters", sWClientParameters);
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
         * Amazon AWS Access Key. The option is a <code>java.lang.String</code>
         * type.
         */
        public T accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (T) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a <code>java.lang.String</code>
         * type.
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
    }

    public static class SWFConsumerBuilder
            extends
                SWFCommonBuilder<SWFConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public SWFConsumerBuilder(String path) {
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
        public SWFConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SWFConsumerBuilder) this;
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
        public SWFConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (SWFConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public SWFConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SWFConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public SWFConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SWFConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public SWFConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (SWFConsumerBuilder) this;
        }
        /**
         * The list name to consume activities from. The option is a
         * <code>java.lang.String</code> type.
         */
        public SWFConsumerBuilder activityList(String activityList) {
            this.properties.put("activityList", activityList);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Maximum number of threads in work pool for activity. The option is a
         * <code>int</code> type.
         */
        public SWFConsumerBuilder activityThreadPoolSize(
                int activityThreadPoolSize) {
            this.properties.put("activityThreadPoolSize", activityThreadPoolSize);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Maximum number of threads in work pool for activity. The option will
         * be converted to a <code>int</code> type.
         */
        public SWFConsumerBuilder activityThreadPoolSize(
                String activityThreadPoolSize) {
            this.properties.put("activityThreadPoolSize", activityThreadPoolSize);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Activity execution options. The option is a
         * <code>com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions</code> type.
         */
        public SWFConsumerBuilder activityTypeExecutionOptions(
                Object activityTypeExecutionOptions) {
            this.properties.put("activityTypeExecutionOptions", activityTypeExecutionOptions);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Activity execution options. The option will be converted to a
         * <code>com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions</code> type.
         */
        public SWFConsumerBuilder activityTypeExecutionOptions(
                String activityTypeExecutionOptions) {
            this.properties.put("activityTypeExecutionOptions", activityTypeExecutionOptions);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Activity registration options. The option is a
         * <code>com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions</code> type.
         */
        public SWFConsumerBuilder activityTypeRegistrationOptions(
                Object activityTypeRegistrationOptions) {
            this.properties.put("activityTypeRegistrationOptions", activityTypeRegistrationOptions);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Activity registration options. The option will be converted to a
         * <code>com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions</code> type.
         */
        public SWFConsumerBuilder activityTypeRegistrationOptions(
                String activityTypeRegistrationOptions) {
            this.properties.put("activityTypeRegistrationOptions", activityTypeRegistrationOptions);
            return (SWFConsumerBuilder) this;
        }
        /**
         * The list name to consume workflows from. The option is a
         * <code>java.lang.String</code> type.
         */
        public SWFConsumerBuilder workflowList(String workflowList) {
            this.properties.put("workflowList", workflowList);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Workflow registration options. The option is a
         * <code>com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions</code> type.
         */
        public SWFConsumerBuilder workflowTypeRegistrationOptions(
                Object workflowTypeRegistrationOptions) {
            this.properties.put("workflowTypeRegistrationOptions", workflowTypeRegistrationOptions);
            return (SWFConsumerBuilder) this;
        }
        /**
         * Workflow registration options. The option will be converted to a
         * <code>com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions</code> type.
         */
        public SWFConsumerBuilder workflowTypeRegistrationOptions(
                String workflowTypeRegistrationOptions) {
            this.properties.put("workflowTypeRegistrationOptions", workflowTypeRegistrationOptions);
            return (SWFConsumerBuilder) this;
        }
    }

    public static class SWFProducerBuilder
            extends
                SWFCommonBuilder<SWFProducerBuilder>
            implements
                EndpointProducerBuilder {
        public SWFProducerBuilder(String path) {
            super(path);
        }
        /**
         * Activity scheduling options. The option is a
         * <code>com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions</code> type.
         */
        public SWFProducerBuilder activitySchedulingOptions(
                Object activitySchedulingOptions) {
            this.properties.put("activitySchedulingOptions", activitySchedulingOptions);
            return (SWFProducerBuilder) this;
        }
        /**
         * Activity scheduling options. The option will be converted to a
         * <code>com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions</code> type.
         */
        public SWFProducerBuilder activitySchedulingOptions(
                String activitySchedulingOptions) {
            this.properties.put("activitySchedulingOptions", activitySchedulingOptions);
            return (SWFProducerBuilder) this;
        }
        /**
         * The policy to use on child workflows when terminating a workflow. The
         * option is a <code>java.lang.String</code> type.
         */
        public SWFProducerBuilder childPolicy(String childPolicy) {
            this.properties.put("childPolicy", childPolicy);
            return (SWFProducerBuilder) this;
        }
        /**
         * Set the execution start to close timeout. The option is a
         * <code>java.lang.String</code> type.
         */
        public SWFProducerBuilder executionStartToCloseTimeout(
                String executionStartToCloseTimeout) {
            this.properties.put("executionStartToCloseTimeout", executionStartToCloseTimeout);
            return (SWFProducerBuilder) this;
        }
        /**
         * Workflow operation. The option is a <code>java.lang.String</code>
         * type.
         */
        public SWFProducerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (SWFProducerBuilder) this;
        }
        /**
         * The name of the signal to send to the workflow. The option is a
         * <code>java.lang.String</code> type.
         */
        public SWFProducerBuilder signalName(String signalName) {
            this.properties.put("signalName", signalName);
            return (SWFProducerBuilder) this;
        }
        /**
         * The type of the result when a workflow state is queried. The option
         * is a <code>java.lang.String</code> type.
         */
        public SWFProducerBuilder stateResultType(String stateResultType) {
            this.properties.put("stateResultType", stateResultType);
            return (SWFProducerBuilder) this;
        }
        /**
         * Set the task start to close timeout. The option is a
         * <code>java.lang.String</code> type.
         */
        public SWFProducerBuilder taskStartToCloseTimeout(
                String taskStartToCloseTimeout) {
            this.properties.put("taskStartToCloseTimeout", taskStartToCloseTimeout);
            return (SWFProducerBuilder) this;
        }
        /**
         * Details for terminating a workflow. The option is a
         * <code>java.lang.String</code> type.
         */
        public SWFProducerBuilder terminationDetails(String terminationDetails) {
            this.properties.put("terminationDetails", terminationDetails);
            return (SWFProducerBuilder) this;
        }
        /**
         * The reason for terminating a workflow. The option is a
         * <code>java.lang.String</code> type.
         */
        public SWFProducerBuilder terminationReason(String terminationReason) {
            this.properties.put("terminationReason", terminationReason);
            return (SWFProducerBuilder) this;
        }
    }
    public default SWFConsumerBuilder fromSWF(String path) {
        return new SWFConsumerBuilder(path);
    }
    public default SWFProducerBuilder toSWF(String path) {
        return new SWFProducerBuilder(path);
    }
}