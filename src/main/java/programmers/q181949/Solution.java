package programmers.q181949;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String result = "";
    for (int i = 0; i < a.length(); i++) {
      char alphabet = a.charAt(i);
      if (Character.isUpperCase(alphabet)) {
        result += String.valueOf(alphabet).toLowerCase();
      } else {
        result += String.valueOf(alphabet).toUpperCase();
      }
    }
    System.out.println(result);
  }
}
