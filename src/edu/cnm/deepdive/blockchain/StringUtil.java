package edu.cnm.deepdive.blockchain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringUtil {

  private static MessageDigest md;

  static {
    try {
      md = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException ignored) { }
  }

  public static String computeHash(String...strings) {

    md.reset();
    for (String string : strings) {
      md.update(string.getBytes());
    }
    System.out.println(md.digest().toString());
    return "test";

  }




}
