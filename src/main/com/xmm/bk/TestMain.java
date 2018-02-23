package com.xmm.bk;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XiongMM on 2018/2/23.
 */
public class TestMain {

    public static List<Block> blockchain = new ArrayList<>();

    public static void main(String[] args){
        blockchain.add(new Block("block1....","0"));
        blockchain.add(new Block("block2....",blockchain.get(blockchain.size() - 1).getHash()));
        blockchain.add(new Block("block3....",blockchain.get(blockchain.size() - 1).getHash()));

        System.out.println(JSON.toJSONString(blockchain,true));
    }
}
