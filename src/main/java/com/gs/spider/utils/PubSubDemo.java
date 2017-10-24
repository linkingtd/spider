package com.gs.spider.utils;

import redis.clients.jedis.JedisPool;

public class PubSubDemo {

	public static void main(String[] args) {
		// 替换成你的reids地址和端口
		
		JedisPool jedisPool = RedisUtils.getJedisPool();

		SubThread subThread = new SubThread(jedisPool);
		subThread.start();

//		Publisher publisher = new Publisher(jedisPool);
//		publisher.start();
	}
}
