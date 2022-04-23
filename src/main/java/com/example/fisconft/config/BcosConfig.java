package com.example.fisconft.config;

import lombok.Data;
import lombok.ToString;
import org.fisco.bcos.sdk.config.model.AmopTopic;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author LiYunYan
 * @Date： 2021/12/7
 * @Description:
 */
@Component
//使用@ConfigurationProperties不能注册到bean中，添加@EnableConfigurationProperties
@ConfigurationProperties
@EnableConfigurationProperties
@PropertySource(value = "classpath:fisco-config.properties", ignoreResourceNotFound = true, encoding = "UTF-8")
@ToString
@Data
public class BcosConfig {

    private Map<String, Object> cryptoMaterial;

    public Map<String, List<String>> network;

    public List<AmopTopic> amop;

    public Map<String, Object> account;

    public Map<String, Object> threadPool;
}
