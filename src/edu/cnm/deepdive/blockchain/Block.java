package edu.cnm.deepdive.blockchain;

import java.io.Serializable;
import java.util.Date;

public class Block implements Serializable {

  private String prevHash;
  private String hash;
  private String data;
  private Long timeStamp;

  public Block(String prevHash, String data) {

    this.prevHash = prevHash;
    this.data = data;

    timeStamp = System.currentTimeMillis()/1000;

  }


  public String calculateHash(){

  }

}
