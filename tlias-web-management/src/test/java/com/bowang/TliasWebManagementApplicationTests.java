package com.bowang;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static io.jsonwebtoken.SignatureAlgorithm.HS256;

@SpringBootTest
class TliasWebManagementApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 测试JWT令牌的生成
     */
    @Test
    public void testGenJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("name", "tom");
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "test") // 签名算法
                .setClaims(claims) // 自定义内容
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000)) // 设置有效期为一小时
                .compact();
        System.out.println(jwt);
    }

//    @Test
//    public void testParseJwt() {
//        Claims claims = Jwts.parser()
//                .setSigningKey("test")
//                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidG9tIiwiaWQiOjEsImV4cCI6MTY4NTYzODU3OH0.l031rceOaWdTtz0MCXaYkAHeGMuBJyC30iosVVKmp0U")
//                .getBody();
//        System.out.println(claims);
//    }

}
