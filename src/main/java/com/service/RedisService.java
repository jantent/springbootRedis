package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;

@Component
public class RedisService {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

//    @Autowired
//    private ValueOperations<String,String> valueOperator;
//
//    @Autowired
//    private HashOperations<String,String,Object> hashOperations;
//
//    @Autowired
//    private ListOperations<String,Object> listOperations;
//
//    @Autowired
//    private SetOperations<String,Object> setOperations;
//
//    @Autowired
//    private ZSetOperations<String,Object> zSetOperations;
}
