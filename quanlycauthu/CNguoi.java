/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycauthu;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CNguoi {
    private String id;
    private String hten;
    private String ngay;
    private String phai;
    public CNguoi(){
        
    }
    public CNguoi(CNguoi cn){
        this.id = cn.id;
        this.hten = cn.hten;
        this.ngay = cn.ngay;
        this.phai = cn.phai;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap CCCD: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ho va ten: ");
        this.hten = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngay = sc.nextLine();
        System.out.print("Nhap phai (nam/nu): ");
        this.phai = sc.nextLine();
    }
    public void xuat(){
        System.out.println("\nCCCD: " + this.id);
        System.out.println("Ho va ten: " + this.hten);
        System.out.println("ngay sinh: " + this.ngay);
        System.out.println("Phai: " + this.phai);
    }
    public void main(){
        CNguoi c1 = new CNguoi();
        c1.nhap();
        c1.xuat();
        CNguoi c2 = new CNguoi(c1);
        c2.xuat();
    }
    public String getName(){
        return this.hten;
    }
    public int getYear(){
        String yearStr = this.ngay.substring(6);
        int year = Integer.parseInt(yearStr);
        return 2025 - year;
    }
}
