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
 * 实体类型
 * 
 * @author Andrew Shvayka
 */
public enum EntityType {
    /**
     * 租户
     */
    TENANT,
    /**
     * 客户
     */
    CUSTOMER,
    /**
     * 用户
     */
    USER,
    /**
     * 指示板
     */
    DASHBOARD,
    /**
     * 资产
     */
    ASSET,
    /**
     * 设备
     */
    DEVICE,
    /**
     * 告警
     */
    ALARM,
    /**
     * 规则链
     */
    RULE_CHAIN,
    /**
     * 规则节点
     */
    RULE_NODE,
    /**
     * 实体视图
     */
    ENTITY_VIEW,
    /**
     * 部件库
     */
    WIDGETS_BUNDLE,
    /**
     * 部件类型
     */
    WIDGET_TYPE,
    /**
     * 租户配置
     */
    TENANT_PROFILE,
    /**
     * 设备配置
     */
    DEVICE_PROFILE,
    /**
     * 接口使用统计?
     */
    API_USAGE_STATE,
    /**
     * tb菜单?
     */
    TB_RESOURCE,
    /**
     * ota包?
     */
    OTA_PACKAGE,
    /**
     * 边缘端?
     */
    EDGE,
    /**
     * 远程调用
     */
    RPC;

}
