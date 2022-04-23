package com.example.fisconft.config;

import com.example.fisconft.common.ResponseEnum;
import com.example.fisconft.contract.ERC721;
import com.example.fisconft.exception.ChainException;
import lombok.extern.slf4j.Slf4j;
import org.fisco.bcos.sdk.BcosSDK;
import org.fisco.bcos.sdk.client.Client;
import org.fisco.bcos.sdk.crypto.keypair.CryptoKeyPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author LiYunYan
 * @Date： 2021/12/20
 * @Description:
 */
@Component
@Slf4j
public class ContractConfig {

    @Autowired
    private BcosSDK bcosSDK;

    @Bean
    public ERC721 digitalMall() {
        Client client = bcosSDK.getClient(1);
        CryptoKeyPair cryptoKeyPair = client.getCryptoSuite().getCryptoKeyPair();

        try {
            String contractAddress = ERC721.deploy(client, cryptoKeyPair, "erc721", "symbol").getContractAddress();
            log.info("contract deploy address is {}", contractAddress);
            return ERC721.load(contractAddress, client, cryptoKeyPair);
        } catch (Exception e) {
            log.error("合约部署/加载失败：{}", e.getMessage());
            throw new ChainException(ResponseEnum.CONTRACT_INIT_ERROR);
        }
    }
}
