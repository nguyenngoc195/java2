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
public class DemoMenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean cont = true;
        for (;;) {
            System.out.println("---------MENU--------");
            System.out.println("1. Danh sách sv");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.println("----------------------");
            System.out.println("Chọn chắc năng : [1-5]");

            int chon = input.nextInt();

            switch (chon) {
                case 1:
                    System.out.println("----------------------");
                    System.out.println("1. Hiển thị danh sách sv");
                    break;
                case 2:
                    System.out.println("----------------------");
                    System.out.println("2. Thêm sinh viên");
                    break;
                case 3:
                    System.out.println("----------------------");
                    System.out.println("3. Sửa sinh viên");
                    break;
                case 4:
                    System.out.println("----------------------");
                    System.out.println("4. Xóa sinh viên");
                    break;
                case 5:
                    System.out.println("----------------------");
                    System.out.println("5. Thoát");
                    break;    
                default:
                    System.out.println("Bạn nhập ko đúng!!!");
                    cont = false;
                    break;
            }

        }
    }
}
