package com.config;

import com.domain.UserVo;
import com.util.RedisKeyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConfigTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testObj() throws Exception{
        UserVo userVo = new UserVo();
        userVo.setAddress("上海");
        userVo.setName("测试dfas");
        userVo.setAge(123);
        ValueOperations<String,Object> operations = redisTemplate.opsForValue();
//        redisTemplate.delete("com.domain.UserVo");
        String key = RedisKeyUtil.getKey(UserVo.Table,"name",userVo.getName());
//        operations.set(key,userVo);
        UserVo vo = (UserVo) operations.get(key);
        System.out.println(vo);
    }



}