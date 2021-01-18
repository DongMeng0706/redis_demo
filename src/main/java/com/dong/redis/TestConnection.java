package com.dong.redis;

import redis.clients.jedis.Jedis;

/**
 * 测试连接
 * 
 * @author LJH
 *
 */
public class TestConnection {
	private static final String HOST = "47.111.107.197";
	private static final int PORT = 6379;


	public static Jedis getConnectJedis(){
		Jedis jedis=new Jedis(HOST, PORT);
		jedis.auth("redis123456");
		System.out.println(jedis);
		System.out.println("redis连接成功");
		String ping = jedis.ping();
		System.out.println(ping);
		return jedis;
	}

	public static void main(String[] args) {
		Jedis jedis=new Jedis(HOST, PORT);
		jedis.auth("redis123456");
		System.out.println(jedis);
		System.out.println("redis连接成功");
		String ping = jedis.ping();
		System.out.println(ping);
	}
}
