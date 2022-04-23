package com.example.fisconft.vo;

import com.example.fisconft.modal.Nft;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NftVO {

    private String data;

    private Nft nft;

    private String transactionId;

}