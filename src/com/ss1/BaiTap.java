/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ss1;

import java.util.Scanner;

/**
 *
 * @author Lan
 */
public class BaiTap {
    public static void Capnhat(int[] a, int n){
        Scanner in=new Scanner(System.in);
        for(int i=1;i<=n;i++){
            System.out.print("a["+i+"]=");
            a[i]=in.nextInt();
        }
    }
    public static  void Hienthi(int[] a,int n){
        for (int i=1;i<=n;i++)
        System.out.print("\t"+a[i]);
    }
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.print("Nhập số phần tử n: ");
    int n=in.nextInt();
    int chon;
    do
    {
      System.out.println("1. Nhập");
      System.out.println("2. Hiển thị ");
      System.out.println("3. Sắp xếp tăng dần");
      System.out.println("4. Sắp xếp giảm dần");
      System.out.println("5. Hiển thị số nguyên tố");
      System.out.println("6. Sắp xếp theo chẵn trước lẻ sau");
      System.out.println("7. Loại bỏ các phần tử âm");
      System.out.println("8. Loại bỏ các phần tử trùng nhau");
      System.out.println("9. Exit");
      System.out.println("____________________________");
      System.out.println("Mời chọn : ");
      chon=in.nextInt();
    
  }
    while(chon!=0);
}
}
