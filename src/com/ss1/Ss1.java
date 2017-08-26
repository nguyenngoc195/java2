/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ss1;

/**
 *
 * @author Lan
 */
public class Ss1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names = " Nam, Trường, Dũng, Danh, Tùng, Khánh, Linh, Đông, Chiến";

        String[] arrayName = names.split(",");

       

        

        for (int i = 0; i < arrayName.length; i++){
            System.out.println(i + 1 + "." + arrayName[i].trim());
        }
        
        
        
        
        
        
    }

}
