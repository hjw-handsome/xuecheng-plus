package com.xuecheng.base.config;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class LocalDateTimeConfig {

    /*
     * 序列化内容
     * LocalDateTime -> String
     * 当服务端返回 LocalDateTime 类型数据给客户端时，会自动按此格式转换为字符串
     * */
    @Bean
    public LocalDateTimeSerializer localDateTimeSerializer() {
        return new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /*
     * 反序列化内容
     * String -> LocalDateTime
     * 当客户端传来的 JSON 中包含日期时间字符串时，会按此格式解析为 LocalDateTime 对象
     * */
    @Bean
    public LocalDateDeserializer localDateDeserializer() {
        return new LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    //    创建一个 Jackson2ObjectMapperBuilderCustomizer 定制器
//    为 LocalDateTime 类型注册上面定义的序列化器和反序列化器
//    这样 Spring MVC 在处理 JSON 时就会自动应用这些转换规则
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        return builder -> {
            builder.serializerByType(LocalDateTime.class, localDateTimeSerializer());
            builder.deserializerByType(LocalDateTime.class, localDateDeserializer());
        };
    }
}