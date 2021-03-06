/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.jdbc.core;

import com.dangdang.ddframe.rdb.sharding.jdbc.core.connection.ShardingConnectionTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.datasource.MasterSlaveDataSourceTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.datasource.ShardingDataSourceTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.resultset.GeneratedKeysResultSetMetaDataTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.resultset.GeneratedKeysResultSetTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.resultset.ShardingResultSetTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.statement.ShardingPreparedStatementTableOnlyTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.statement.ShardingPreparedStatementTest;
import com.dangdang.ddframe.rdb.sharding.jdbc.core.statement.ShardingStatementTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ShardingDataSourceTest.class, 
        MasterSlaveDataSourceTest.class, 
        ShardingConnectionTest.class, 
        ShardingStatementTest.class, 
        ShardingPreparedStatementTest.class, 
        ShardingPreparedStatementTableOnlyTest.class,
        ShardingResultSetTest.class, 
        GeneratedKeysResultSetTest.class, 
        GeneratedKeysResultSetMetaDataTest.class 
    })
public class AllCoreTests {
}
