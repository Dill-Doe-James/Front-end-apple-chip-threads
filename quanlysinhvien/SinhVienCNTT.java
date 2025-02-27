/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysinhvien;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class SinhVienCNTT extends SinhVien {
    private String taikhoan;
    private String matkhau;
    private String email;
    public SinhVienCNTT(){
        super();
        this.taikhoan = new String("NULL");
        this.matkhau = new String("NULL");
        this.email = new String("NULL");
    }
    public SinhVienCNTT(SinhVienCNTT sv){
        super(sv);
        this.taikhoan = new String(sv.taikhoan);
        this.matkhau = new String(sv.matkhau);
        this.email = new String(sv.email);
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap tai khoan: ");
        this.taikhoan = sc.nextLine();
        System.out.println("Nhap mat khau: ");
        this.matkhau = sc.nextLine();
        System.out.println("Nhap e-mail: ");
        this.email = sc.nextLine();
    }
    @Override
    public String toString(){
            String info1 = super.toString();
            String info2 = "\nTai khoan: " + this.taikhoan +
                           "\nemai: " + this.email;
            return info1 + info2;
    }
    public void doiMatKhau(String newpass){
        this.matkhau = newpass;
    }
    public String getEmail(){
        return this.email;
    }
}
