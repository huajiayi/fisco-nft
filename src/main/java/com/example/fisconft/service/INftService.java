package com.example.fisconft.service;

import java.math.BigInteger;
import java.util.List;

public interface INftService {

    void mint(String to, BigInteger tokenId);

    void burn(BigInteger tokenId);

    void TransferFrom(String from, String to, BigInteger tokenId);

    void setApprovalForAll(String operator, Boolean approved);

    String getApproved(BigInteger tokenId);

    void approve(String to, BigInteger tokenId);

    BigInteger balanceOf(String owner);

    String ownerOf(BigInteger tokenId);

    List<BigInteger> tokensOf(String owner);

}
