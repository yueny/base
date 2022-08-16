package com.whosly.demo.service.impl;

import cn.hutool.core.date.SystemClock;
import com.whosly.demo.service.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class DemoServiceImpl implements IDemoService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Date nowDate() {
        Date date =  new Date();

        log.info("date:{}.", date);

        return date;
    }

    @Override
    public Long nowLong() {
        Long rs = SystemClock.now();

        log.info("start");
        stringRedisTemplate.opsForValue().set("demo:" + rs, rs.toString(), 5, TimeUnit.MINUTES);

        log.info("rs:{}.", rs);
        log.info("rs cache:{}.", stringRedisTemplate.opsForValue().get("demo:" + rs));

        return rs;
    }

}
