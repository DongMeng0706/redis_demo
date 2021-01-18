package com.sxt.redis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.dong.redis.TestConnection;
import redis.clients.jedis.Jedis;

/**
 * 测试连接
 * 
 * @author LJH
 *
 */
public class TestString {
	private static final String HOST = "192.168.72.140";
	private static final int PORT = 6379;

	public static void main(String[] args) {
		Jedis jedis= TestConnection.getConnectJedis();
		System.out.println(jedis);
		//操作string
		//String string = jedis.get("k2");

		jedis.select(1);
		Set<String> keys = jedis.keys("*");
		for (String k : keys) {
			System.out.println(k);
			String value = jedis.get(k);
			System.out.println(value);

		}
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("xiaomi");
		list.add("hauwei");
		jedis.lpush("mobie",list.toString());
		//添加一个key
		/*jedis.select(1);
		jedis.set("k","李四");*/
		
	}
}
