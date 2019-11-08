package com.example.hw06;

public class MyClass {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("請輸入西元年數 :");
        int inp=scanner.nextInt();

        if(inp%4==0)
            System.out.println("是閏年");
        else
            System.out.println("不是閏年");
    }
}
