package com.example.fisconft.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.fisco.bcos.sdk.BcosSDK;
import org.fisco.bcos.sdk.config.ConfigOption;
import org.fisco.bcos.sdk.config.exceptions.ConfigException;
import org.fisco.bcos.sdk.config.model.ConfigProperty;
import org.fisco.bcos.sdk.model.CryptoType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @Author LiYunYan
 * @Date： 2021/12/8
 * @Description: 初始化bcosSDK（将fisco-config.yml中的属性加载到bcosSdk中）
 */
@Component
@Slf4j
@Data
public class FiscoBcos {

    @Autowired
    private BcosConfig bcosConfig;

    @Bean
    public BcosSDK bcosSDK() {

        ConfigProperty configProperty = loadProperty();
        ConfigOption configOption = null;
        try {
            configOption = new ConfigOption(configProperty, CryptoType.ECDSA_TYPE);
        } catch (ConfigException e) {
            log.error("configOperation init fail : {}", e.toString());
            e.printStackTrace();
            return null;
        }
        return new BcosSDK(configOption);

    }

    public ConfigProperty loadProperty() {
        ConfigProperty configProperty = new ConfigProperty();
        configProperty.setCryptoMaterial(bcosConfig.getCryptoMaterial());
        configProperty.setAmop(bcosConfig.getAmop());
        configProperty.setNetwork(new HashMap<>() {
            {
                put("peers", bcosConfig.network.get("peers"));
            }
        });
        configProperty.setAccount(bcosConfig.getAccount());
        configProperty.setThreadPool(bcosConfig.getThreadPool());
        return configProperty;
    }
}
