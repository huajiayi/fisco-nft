package com.example.fisconft.controller;

import com.example.fisconft.service.INftService;
import com.example.fisconft.vo.NftVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.util.List;

@Api(tags = "NFT控制器")
@RestController
@RequestMapping("/nft")
public class NftController {

    @Autowired
    private INftService nftService;

    @ApiOperation("自然人注册接口")
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/user/register")
    @SneakyThrows
    public String userRegister(@RequestParam String userId) {
        return null;
    }

    @ApiOperation("查询用户信息接口")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/user/query")
    @SneakyThrows
    public String userQuery(@RequestParam String userId) {
        return null;
    }

    @ApiOperation("发行 NFT")
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/publish")
    @SneakyThrows
    public NftVO publish(@RequestParam String userId, @RequestParam BigInteger tokenId) {
        return null;
    }

    @ApiOperation("查询 NFT 发行结果")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/publish/result")
    public String publishResult(@RequestParam BigInteger tokenId) {
        return "使用web2实现";
    }

    @ApiOperation("NFT 元信息查询")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/info")
    public String info(@RequestParam BigInteger tokenId) {
        return "使用web2实现";
    }

    @ApiOperation("查询账户NFT列表")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/address/list")
    public List<NftVO> addressList(@RequestParam String userId) {
        return null;
    }

    @ApiOperation("NFT 转移")
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/transfer")
    @SneakyThrows
    public NftVO transfer(@RequestParam String userIdFrom, @RequestParam String userIdTo, @RequestParam BigInteger tokenId) {
        return null;
    }

    @ApiOperation("NFT 转移状态查询")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/transfer/result")
    public String transferResult() {
        return "使用web2实现";
    }

    @ApiOperation("ownerOf")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/ownerOf")
    @SneakyThrows
    public String ownerOf(@RequestParam BigInteger tokenId) {
        return nftService.ownerOf(tokenId);
    }

    @ApiOperation("getApproved")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/getApproved")
    @SneakyThrows
    public String getApproved(@RequestParam BigInteger tokenId) {
        return nftService.getApproved(tokenId);
    }

    @ApiOperation("balanceOf")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/balanceOf")
    @SneakyThrows
    public BigInteger balanceOf(@RequestParam String userId) {
        return nftService.balanceOf(userId);
    }

}