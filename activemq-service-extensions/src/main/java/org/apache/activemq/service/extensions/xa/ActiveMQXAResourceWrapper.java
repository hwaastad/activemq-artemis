/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.service.extensions.xa;

import javax.transaction.xa.XAResource;

/**
 * @author <a href="mailto:mtaylor@redhat.com">Martyn Taylor</a>
 */

public interface ActiveMQXAResourceWrapper extends XAResource
{
   // List of supported properties
   String ACTIVEMQ_JNDI_NAME = "ACTIVEMQ_JNDI_ID";

   String ACTIVEMQ_PRODUCT_NAME = "ACTIVEMQ_PRODUCT_NAME";

   String ACTIVEMQ_PRODUCT_VERSION = "ACTIVEMQ_PRODUCT_VERSION";

   String ACTIVEMQ_NODE_ID = "ACTIVEMQ_NODE_ID";
}
