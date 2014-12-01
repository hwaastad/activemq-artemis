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
package org.apache.activemq.core.protocol.core.impl.wireformat;

import org.apache.activemq.api.core.ActiveMQBuffer;
import org.apache.activemq.api.core.SimpleString;
import org.apache.activemq.core.protocol.core.impl.PacketImpl;

public class ScaleDownAnnounceMessage extends PacketImpl
{
   private SimpleString targetNodeId;
   private SimpleString scaledDownNodeId;

   public ScaleDownAnnounceMessage()
   {
      super(SCALEDOWN_ANNOUNCEMENT);
   }

   public ScaleDownAnnounceMessage(SimpleString targetNodeId, SimpleString scaledDownNodeId)
   {
      super(SCALEDOWN_ANNOUNCEMENT);
      this.targetNodeId = targetNodeId;
      this.scaledDownNodeId = scaledDownNodeId;
   }

   @Override
   public void encodeRest(ActiveMQBuffer buffer)
   {
      buffer.writeSimpleString(targetNodeId);
      buffer.writeSimpleString(scaledDownNodeId);
   }

   @Override
   public void decodeRest(ActiveMQBuffer buffer)
   {
      targetNodeId = buffer.readSimpleString();
      scaledDownNodeId = buffer.readSimpleString();
   }

   public SimpleString getTargetNodeId()
   {
      return targetNodeId;
   }

   public SimpleString getScaledDownNodeId()
   {
      return scaledDownNodeId;
   }
}
