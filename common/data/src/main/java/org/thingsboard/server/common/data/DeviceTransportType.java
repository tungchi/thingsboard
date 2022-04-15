/**
 * Copyright © 2016-2022 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data;

/**
 * @date 2022-04-15 传输类型定义
 * @author tungchi
 */

public enum DeviceTransportType {
    /**
     * 传输方式类型,default
     */
    DEFAULT,
    /**
     * 传输方式类型,MQTT
     */
    MQTT,
    /**
     * 传输方式类型,COAP
     */
    COAP,
    /**
     * 传输方式类型,LWM2M
     */
    LWM2M,
    /**
     * 传输方式类型,SNMP
     */
    SNMP
}
