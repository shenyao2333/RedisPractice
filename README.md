# RedisPractice
## Redis多数据结构练习

### 1、项目介绍

> SpringBoot2.2.2+Mybatis+HikariDataSource连接池+logback日志收集
>
> 

#### a、Hash、List、Set、String、ZSet类型的练习

#### b、集成对Cache支持，使用注解操作Reids。

- 具有目录结构，有效防止键重复和键的归类

- 注解介绍，具体介绍查看博客

  > #### **@Cacheable:** 放入缓存
  >
  > #### @CachePut：更新缓存
  >
  > #### @CacheEvict： 清理缓存

  

#### c、Redis常用工具类



### 2、Redis原生操作常用命令

------

服务端常用

- ping：测试是否正常连接
- select：切换到指定的数据库，索引号index用数字值指定，以0开始
- quit关闭连接
- auth：密码认证

------

对key的操作

- exists （key）：确认key是否存在。
- del (key): 删除key
- type(key)：返回值的类型
- keys(pattern)：返回满足条件的所有key。比如：keys test* 返回所有test开头的key
- keyrename(oldname,newname)：重命名key
- dbsize：返回当前数据库中的key数目
- ttl：获取key剩余时间（单位秒）
- move（key，index）：移动当前的key到index数据库
- flushdb：删除当前数据库的所有key
- flushall：删除Redis里所有key



------

对String的操作

- set(key, value)：给数据库中名称为 key 的 string 赋予值 value
- get(key)：返回数据库中名称为 key 的 string 的 value
- getset(key, value)：给名称为 key 的 string 赋予上一次的 value
- setnx(key, value)：添加 string，名称为 key，值为 value
- setex(key, time, value)：向库中添加 string，设定过期时间 time
- mset(key N, value N)：批量设置多个 string 的值
- msetnx(key N, value N)：如果所有名称为 key i 的 string 都不存在
- incr(key)：名称为 key 的 string 增 1 操作，并返回增加后的值。
- incrby(key, integer)：名称为 key 的 string 增加 integer，并返回增加后的值。
- decr(key)：名称为 key 的 string 减 1 操作，并返回
- decrby(key, integer)：名称为 key 的 string 减少 integer，并返回
- append(key, value)：名称为 key 的 string 的值附加 value



------

对List的操作

- rpush(key, value)：在名称为 key 的 list 尾添加一个值为 value 的元素
- lpush(key, value)：在名称为 key 的 list 头添加一个值为 value 的元素
- llen(key)：返回名称为 key 的 list 的长度
- lrange(key, start, end)：返回名称为 key 的 list 中 start 至 end 之间的元素。-1代表最后
- ltrim(key, start, end)：截取名称为 key 的 list
- lindex(key, index)：返回名称为 key 的 list 中 index 位置的元素
- lset(key, index, value)：给名称为 key 的 list 中 index 位置的元素赋值
- lrem(key, count, value)：删除 count 个 key 的 list 中值为 value 的元素
- lpop(key)：返回并删除名称为 key 的 list 中的首元素
- rpop(key)：返回并删除名称为 key 的 list 中的尾元素
- blpop(key1, key2,… key N, timeout)：lpop 命令的 block 版本。
- brpop(key1, key2,… key N, timeout)：rpop 的 block 版本



------

对Set的操作

- sadd(key, member)：向名称为 key 的 set 中添加元素 member
- smembers(key) ：返回名称为 key 的 set 的所有元素
- srem(key, member) ：删除名称为 key 的 set 中的元素 member
- sinter(key1, key2,…key N) ：求交集，把key1..keyN里的集合元素相同的找出来
- sismember(key, member) ：member 是否是名称为 key 的 set 的元素
- sinterstore(dstkey, (keys)) ：求交集并将交集保存到 dstkey 的集合
- sdiff(key1, (keys)) ：求差集



------



对hash的操作

- hset(key, field, value)：向名称为 key 的 hash 中添加元素 field
- hget(key, field)：返回名称为 key 的 hash 中 field 对应的 value
- hincrby(key, field, integer)：将名称为 key 的 hash 中 field 的 value 增加 integer
- hexists(key, field)：名称为 key 的 hash 中是否存在键为 field 的域
- hdel(key, field)：删除名称为 key 的 hash 中键为 field 的域
- hlen(key)：返回名称为 key 的 hash 中元素个数
- hkeys(key)：返回名称为 key 的 hash 中所有键
- hvals(key)：返回名称为 key 的 hash 中所有键对应的 value



#### 3、待完善。。。。。。。。。。

