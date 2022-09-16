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
package org.apache.camel.model.loadbalancer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.apache.camel.model.LoadBalancerDefinition;
import org.apache.camel.spi.Metadata;

/**
 * Topic which sends to all destinations.
 */
@Metadata(label = "eip,routing")
@XmlRootElement(name = "topic")
@XmlAccessorType(XmlAccessType.FIELD)
public class TopicLoadBalancerDefinition extends LoadBalancerDefinition {

    public TopicLoadBalancerDefinition() {
    }

    @Override
    public String toString() {
        return "TopicLoadBalancer";
    }
}
