package com.chengzhi.jedis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.swing.text.EditorKit;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @param
 * @author RCZ
 * @create 2017-12-23 15:56
 */
public class JedisTest {
    public static void main(String args[]) throws IOException {
        Set<HostAndPort> jedisClusterNode = new HashSet<HostAndPort>();
        jedisClusterNode.add(new HostAndPort("192.168.50.130",7001));
        jedisClusterNode.add(new HostAndPort("192.168.50.130",7002));
        jedisClusterNode.add(new HostAndPort("192.168.50.130",7003));
        jedisClusterNode.add(new HostAndPort("192.168.50.130",7004));
        jedisClusterNode.add(new HostAndPort("192.168.50.131",7005));
        jedisClusterNode.add(new HostAndPort("192.168.50.131",7006));
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(100);
        jedisPoolConfig.setMaxIdle(20);
        jedisPoolConfig.setTestOnBorrow(true);
        JedisCluster jedisCluster = new JedisCluster(jedisClusterNode, 6000, 100, jedisPoolConfig);
//        jedisCluster.set("name","rcz");
        String name = jedisCluster.get("name");
        System.out.println(name);
        jedisCluster.close();
    }
}
