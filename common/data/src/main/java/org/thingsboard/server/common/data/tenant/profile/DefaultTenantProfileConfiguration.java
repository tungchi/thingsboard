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
package org.thingsboard.server.common.data.tenant.profile;

import org.thingsboard.server.common.data.ApiUsageRecordKey;
import org.thingsboard.server.common.data.TenantProfileType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 默认租户配置实现类
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DefaultTenantProfileConfiguration implements TenantProfileConfiguration {

    /**
     * 最大设备数
     */
    private long maxDevices;
    /**
     * 最大资产数量
     */
    private long maxAssets;
    /**
     * 最大客户数
     */
    private long maxCustomers;
    /**
     * 最大用户数
     */
    private long maxUsers;
    /**
     * 仪表盘最大数量
     */
    private long maxDashboards;
    /**
     * 最大规则链数
     */
    private long maxRuleChains;
    private long maxResourcesInBytes;
    private long maxOtaPackagesInBytes;

    /**
     * 租户传输消息速率限制
     */
    private String transportTenantMsgRateLimit;
    /**
     * 租户遥测消息速率限制
     */
    private String transportTenantTelemetryMsgRateLimit;
    /**
     * 租户遥测数据点速率限制
     */
    private String transportTenantTelemetryDataPointsRateLimit;
    /**
     * 设备消息速率限制
     */
    private String transportDeviceMsgRateLimit;
    /**
     * 设备遥测消息速率限制
     */
    private String transportDeviceTelemetryMsgRateLimit;
    /**
     * 设备遥测数据点速率限制
     */
    private String transportDeviceTelemetryDataPointsRateLimit;

    /**
     * 最大传输消息数
     */
    private long maxTransportMessages;
    /**
     * 传输数据点的最大数量
     */
    private long maxTransportDataPoints;
    /**
     * 最大规则引擎执行数量
     */
    private long maxREExecutions;
    /**
     * 最大JavaScript 执行数
     */
    private long maxJSExecutions;
    /**
     * 最大日存储数据点数
     */
    private long maxDPStorageDays;
    /**
     * 每条消息的最大规则节点执行数
     */
    private int maxRuleNodeExecutionsPerMessage;
    /**
     * 发送的最大邮件数
     */
    private long maxEmails;
    /**
     * 发送的最大短信数
     */
    private long maxSms;
    private long maxCreatedAlarms;

    /**
     * 默认存储etl天数
     */
    private int defaultStorageTtlDays;
    private int alarmsTtlDays;
    private int rpcTtlDays;

    private double warnThreshold;

    @Override
    public long getProfileThreshold(ApiUsageRecordKey key) {
        switch (key) {
            case TRANSPORT_MSG_COUNT:
                return maxTransportMessages;
            case TRANSPORT_DP_COUNT:
                return maxTransportDataPoints;
            case JS_EXEC_COUNT:
                return maxJSExecutions;
            case RE_EXEC_COUNT:
                return maxREExecutions;
            case STORAGE_DP_COUNT:
                return maxDPStorageDays;
            case EMAIL_EXEC_COUNT:
                return maxEmails;
            case SMS_EXEC_COUNT:
                return maxSms;
            case CREATED_ALARMS_COUNT:
                return maxCreatedAlarms;
        }
        return 0L;
    }

    @Override
    public long getWarnThreshold(ApiUsageRecordKey key) {
        return (long) (getProfileThreshold(key) * (warnThreshold > 0.0 ? warnThreshold : 0.8));
    }

    @Override
    public TenantProfileType getType() {
        return TenantProfileType.DEFAULT;
    }

    @Override
    public int getMaxRuleNodeExecsPerMessage() {
        return maxRuleNodeExecutionsPerMessage;
    }
}
