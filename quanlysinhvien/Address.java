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

public class Address {

    private int so;
    private String duong;
    private String phuong;
    private String tinh;
    private String quan;

    public Address() {

    }

    public Address(int so, String duong, String phuong, String tinh, String quan) {
        this.so = so;
        this.duong = duong;
        this.phuong = phuong;
        this.tinh = tinh;
        this.quan = quan;
    }

    public Address(Address d) {
        this.so = d.so;
        this.duong = new String(d.duong);
        this.phuong = new String(d.phuong);
        this.tinh = new String(d.tinh);
        this.quan = new String(d.quan);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean dk = true;
        do {
            try {
                System.out.println("Nhap so nha: ");
                this.so = sc.nextInt();
                sc = new Scanner(System.in);
                System.out.println("Nhap duong: ");
                this.duong = sc.nextLine();
                System.out.println("Nhap phuong: ");
                this.phuong = sc.nextLine();
                System.out.println("Nhap quan: ");
                this.quan = sc.nextLine();
                System.out.println("Nhap tinh: ");
                this.tinh = sc.nextLine();
                dk = false;
            } catch (Exception e) {
                System.out.println("Yeu cau nhap lai!");
                sc.next();
            }
        }while(dk==true);
    }

    public void xuat() {
        System.out.println(so + " duong " + duong + ", phuong " + phuong
                + ", quan " + ", tinh " + tinh);
    }
}
