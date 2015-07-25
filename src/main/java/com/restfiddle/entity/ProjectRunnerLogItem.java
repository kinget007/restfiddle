/*
 * Copyright 2014 Ranjan Kumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.restfiddle.entity;

public class ProjectRunnerLogItem extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    private Long nodeId;

    private Long loggedConversationId;

    public Long getNodeId() {
	return nodeId;
    }

    public void setNodeId(Long nodeId) {
	this.nodeId = nodeId;
    }

    public Long getLoggedConversationId() {
	return loggedConversationId;
    }

    public void setLoggedConversationId(Long loggedConversationId) {
	this.loggedConversationId = loggedConversationId;
    }

}
