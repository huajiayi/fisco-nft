package com.example.fisconft.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Nft {

    private String owner;

    private String tokenApproval;

    private String tokenId;

    private String data;
}