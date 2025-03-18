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
public class CThu extends CNguoi {

    private int so;
    private String vtri;
    private long bthang;
    private String mua;
    private String clbo;

    public CThu() {

    }

    public CThu(CThu c) {
        super(c);
        this.so = c.so;
        this.bthang = c.bthang;
        this.vtri = c.vtri;
        this.mua = c.mua;
        this.clbo = c.clbo;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so ao: ");
        this.so = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("Vi tri thi dau: ");
        this.vtri = sc.nextLine();
        System.out.print("So ban thang : ");
        this.bthang = sc.nextLong();
        sc = new Scanner(System.in);
        System.out.print("Mua giai thi dau: ");
        this.mua = sc.nextLine();
        System.out.print("Cau lac bo: ");
        this.clbo = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So ao: " + this.so);
        System.out.println("Vi tri thi dau: " + this.vtri);
        System.out.println("So ban thang : " + this.bthang);
        System.out.println("Mua giai thi dau: " + this.mua);
        System.out.println("Cau lac bo: " + this.clbo);
    }
    public long tinhLuong(){
        long luongcb = 7000000;
        switch(this.vtri){
            case "thu mon" -> luongcb+=3000000;
            case "hau ve" -> luongcb+=4000000;
            case "trung ve" -> luongcb+=4500000;
            case "tien ve" -> luongcb+=5000000;
            case "tien dao" -> luongcb+=7000000;
        }
        luongcb+=500000*this.bthang;
        return (long) (0.9*luongcb);
    }
    public void hienThiLuong(){
        System.out.print(this.getName()+": " + this.tinhLuong()+" VND\n");       
    }
    public static int thongKe(CThu ds[],int n, int s, int t){
        int count=0;
        for(int i=0;i<n;i++){
            if(ds[i].getYear()>=s && ds[i].getYear()<=t){
                count+=ds[i].bthang;
            }
        }
        return count;
    }
    @Override
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so cau thu: ");
        int n = sc.nextInt();
        CThu []ds;
        ds = new CThu[n];
        for(int i=0;i<n;i++){
            ds[i] = new CThu();
        }
        for(int i=0;i<n;i++){
            ds[i].nhap();
        }
        for(int i=0;i<n;i++){
            ds[i].xuat();
        }
        for(int i=0;i<n;i++){
            ds[i].hienThiLuong();
        }
        int count = thongKe(ds,n,18,25);
        System.out.println("So ban thang do tuoi 18->25: " + count);
    }
}
