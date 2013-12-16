/* Copyright 2012-2013 the original author or authors.
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
package test.query;

import org.junit.Test;
import org.snaker.engine.access.Page;
import org.snaker.engine.entity.Task;
import org.snaker.engine.entity.WorkItem;
import org.snaker.engine.test.TestSnakerBase;

/**
 * @author yuqs
 * @version 1.0
 */
public class TestQueryTask extends TestSnakerBase {
	@Test
	public void test() {
		Page<WorkItem> page = new Page<WorkItem>();
		System.out.println(queryService.getActiveTasks(new Page<Task>(), "1"));
		System.out.println(queryService.getWorkItems(page, null));
		System.out.println(page.getTotalCount());
	}
}
