package com.xmm.bk;

/**
 * Created by XiongMM on 2018/2/23.
 */
public class Block {


    private String hash;//当前区块的签名


    private String preHash;//前一个区块的签名


    private String data;//当前区块的值


    private long timestamp;//unix时间戳


    public Block(String data,String preHash) {
        this.hash = EncryptUtils.SHA256(data);
        this.preHash = preHash;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }


    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
