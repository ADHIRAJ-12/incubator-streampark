/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.console.core.service;

import org.apache.streampark.common.enums.FlinkExecutionMode;
import org.apache.streampark.console.base.domain.RestRequest;
import org.apache.streampark.console.core.bean.ResponseResult;
import org.apache.streampark.console.core.entity.YarnQueue;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

public interface YarnQueueService extends IService<YarnQueue> {

  IPage<YarnQueue> findYarnQueues(YarnQueue yarnQueue, RestRequest restRequest);

  ResponseResult<String> checkYarnQueue(YarnQueue yarnQueue);

  boolean createYarnQueue(YarnQueue yarnQueue);

  void updateYarnQueue(YarnQueue yarnQueue);

  void deleteYarnQueue(YarnQueue yarnQueue);

  void checkQueueLabel(FlinkExecutionMode executionModeEnum, String queueLabel);

  boolean isDefaultQueue(String queueLabel);

  boolean existByQueueLabel(String queueLabel);

  boolean existByTeamIdQueueLabel(Long teamId, String queueLabel);
}
