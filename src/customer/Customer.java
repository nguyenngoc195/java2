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
public class Customer {

    private int Id;
    private String Name;
    private String Email;
    private String BirthDay;
    private int Balance;
    private String Avatar;
    private String Status;

    public Customer(int id, String name, String email, String birthday, int balance, String avatar, String status) {
        this.Id = id;
        this.Name = name;
        this.Email = email;
        this.BirthDay = birthday;
        this.Balance = balance;
        this.Avatar = avatar;
        this.Status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void selectProduct(String productName) {
        System.out.println("Khách hàng đã lựa chọn sản phẩm: " + productName);
    }

    public void checkout() {
        System.out.println("-------------------");
    }

    @Override
    public String toString() {
        return "Thông tin KH \n"
                + "Mã số KH:" + Id + "\n"
                + "Họ tên:" + Name + "\n"
                + "Email:" + Email + "\n"
                + "Ngày sinh:" + BirthDay + "\n"
                + "Tài khoản:" + Balance + " TỶ VND\n"
                + "Ảnh:" + Avatar + "\n"
                + "Review:" + Status;

    }
}
