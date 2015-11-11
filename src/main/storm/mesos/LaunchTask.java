/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package storm.mesos;

import org.apache.mesos.Protos;

import static storm.mesos.PrettyProtobuf.offerToString;
import static storm.mesos.PrettyProtobuf.taskInfoToString;

class LaunchTask {
  public Protos.TaskInfo getTask() {
    return task;
  }

  public Protos.Offer getOffer() {
    return offer;
  }

  private final Protos.TaskInfo task;
  private final Protos.Offer offer;

  public LaunchTask(final Protos.TaskInfo task, final Protos.Offer offer) {
    this.task = task;
    this.offer = offer;
  }

  @Override
  public String toString() {
    return "Offer: " + offerToString(offer) + " TaskInfo: " + taskInfoToString(task);
  }
}