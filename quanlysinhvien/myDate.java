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
public class myDate {
    
    //thuoc tinh
    private int ngay;
    private int thang;
    private int nam;

    //phuong thuc

    /**
     *
     */
    public myDate() {
        this(0,0,0);
    }

    public myDate(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public myDate(myDate d){
        this.ngay = d.ngay;
        this.thang = d.thang;
        this.nam = d.nam;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean dk = true;
        while (dk) {
            try {
                System.out.print("Nhap ngay: ");
                this.ngay = sc.nextInt();
                System.out.print("Nhap thang ");
                this.thang = sc.nextInt();
                System.out.print("Nhap nam: ");
                this.nam = sc.nextInt();
                dk = false;
            } catch (Exception e) {
                System.out.println("Yeu cau nhap lai");
                sc.next();
            }
        }
    }
    public void xuat(){
        System.out.println(ngay + "/" + thang + "/" + nam);
    } 
    @Override
    public String toString(){
        return ngay + "/" + thang + "/" + nam;
    }
    public int getYear(){
        return this.nam;
    }
}