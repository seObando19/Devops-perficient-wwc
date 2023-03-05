package com.myorg;
/**
 * calculator
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello word...");
  }

  public int sum(int a, int b){
    return a + b;
  }

  public int rest(int a, int b){
    return a - b;
  }

  public int multy(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    if(b == 0){
      return 0;
    }
    return a / b;
  }
}