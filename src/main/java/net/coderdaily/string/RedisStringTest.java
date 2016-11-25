package net.coderdaily.string;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2016/11/23 23:14
 * Blog: coderdaily.net
 */
public class RedisStringTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.ping());
    }

    private Jedis jedis;

    @Before
    public void setUp(){
        jedis = new Jedis("localhost");
    }

    @Test
    public void testString() {
        jedis.set("foo","bar");
        System.out.println(jedis.get("foo"));
    }
    @Test
    public void testList(){

    }

}
