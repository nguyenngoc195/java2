/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author Lan
 */
public class MainThread {

    public static void main(String[] args) {
        Customer customer0 = new Customer(435, "Nguyễn Văn Ngọc", "ngocnvd00435@fpt.edu.vn", "14/12/1995", 2354, "(*_*)", "Hàng hịn");
        customer0.selectProduct("Fenyr Supersport");
        customer0.checkout();
        System.out.println(customer0.toString());
    }
}
