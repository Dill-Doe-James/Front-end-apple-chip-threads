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

public class Mydate {

    //thuoc tinh
    private int ngay;
    private int thang;
    private int nam;

    //phuong thuc

    /**
     *
     */
    public Mydate() {
        this(0,0,0);
    }

    public Mydate(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public Mydate(Mydate d){
        this.ngay = d.ngay;
        this.thang = d.thang;
        this.nam = d.nam;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean dk = true;
        while (dk) {
            try {
                System.out.println("Nhap ngay: ");
                this.ngay = sc.nextInt();
                System.out.println("Nhap thang ");
                this.thang = sc.nextInt();
                System.out.println("Nhap nam: ");
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
    public boolean checkNam() {
        return this.nam > 0;
    }

    public boolean checkThang() {
        return this.thang > 0 && this.thang < 13;
    }

    @SuppressWarnings("fallthrough")
    public int maxDay() {
        int res = 0;
        switch (thang) {
            case 4:
                res = 30;
            case 6:
                res = 30;
            case 9:
                res = 30;
            case 11:
                res = 30;
            case 1:
                res = 31;
            case 3:
                res = 31;
            case 5:
                res = 31;
            case 7:
                res = 31;
            case 8:
                res = 31;
            case 10:
                res = 31;
            case 12:
                res = 31;
            case 2:
                if (nam % 4 == 0 && nam % 100 != 0) {
                    res = 29;
                } else {
                    res = 28;
                }
        }
        return res;
    }
    public boolean hopLe(){
        int max = maxDay();
        boolean res = false;
        if(checkNam()&&checkThang()){
            if(this.ngay < max) res = true;
        }
        return res;
    }
    public Mydate ngayHomsau(){
        Mydate today = new Mydate();
        int max = maxDay();
        if(today.ngay == max) {
            if(today.thang == 12){
                today.ngay = 1;
                today.thang = 1;
                today.nam++;
            }else{
                today.ngay = 1;
                today.thang++;
            }
        } else today.ngay++;
        return today;
    }
    @Override
    public String toString(){
        return ngay + "/" + thang + "/" + nam;
    }
}