package com.dong.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestRedis {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:application*.xml");
		JedisPool jedisPool = context.getBean(JedisPool.class);
		Jedis resource = jedisPool.getResource();
		resource.auth("redis123456");
		resource.select(1);
		String string = resource.get("k");
		System.out.println(string);
		resource.close();
		jedisPool.close();
		
	}
	
	
}
