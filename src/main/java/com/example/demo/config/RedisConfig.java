package com.example.demo.config;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.time.Duration;

@Configuration
public class RedisConfig {

//    @Bean
//    RedisTemplate<Object,User>userRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        RedisTemplate<Object,User> template = new RedisTemplate<Object,User>();
//        template.setConnectionFactory(redisConnectionFactory);
//        Jackson2JsonRedisSerializer<User> ser = new Jackson2JsonRedisSerializer<User>(User.class);
//        template.setDefaultSerializer(ser);
//        return  template;
//    }

    @Bean
    public RedisCacheManager userCacheManager(RedisConnectionFactory redisConnectionFactory){
        //初始化一个redisCacheWriter
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory);
//初始化序列化方式为json
        RedisSerializer redisSerializer = new GenericJackson2JsonRedisSerializer();
        RedisSerializationContext.SerializationPair pair = RedisSerializationContext.SerializationPair.fromSerializer(redisSerializer);
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().serializeValuesWith(pair);

        return new RedisCacheManager(redisCacheWriter,redisCacheConfiguration);
    }
}
