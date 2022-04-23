package com.example.fisconft.service.impl;

import com.example.fisconft.service.INftService;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import java.util.List;

@Service
public class NftService implements INftService {
    @Override
    public void mint(String to, BigInteger tokenId) {

    }

    @Override
    public void burn(BigInteger tokenId) {

    }

    @Override
    public void TransferFrom(String from, String to, BigInteger tokenId) {

    }

    @Override
    public void setApprovalForAll(String operator, Boolean approved) {

    }

    @Override
    public String getApproved(BigInteger tokenId) {
        return null;
    }

    @Override
    public void approve(String to, BigInteger tokenId) {

    }

    @Override
    public BigInteger balanceOf(String owner) {
        return null;
    }

    @Override
    public String ownerOf(BigInteger tokenId) {
        return null;
    }

    @Override
    public List<BigInteger> tokensOf(String owner) {
        return null;
    }
}
