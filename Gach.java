/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gach;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Gach {
    private String maso;
    private String mau;
    private int soluong;
    private int dai;
    private int ngang;
    private long giaban;
    //constructor
    public Gach(){
        
    }
    public Gach(String maso, String mau, int soluong, int dai, int ngang, long giaban){
        this.maso = maso;
        this.mau = mau;
        this.soluong = soluong;
        this.dai = dai;
        this.ngang = ngang;
    }
    public Gach(Gach G){
        this.maso = G.maso;
        this.mau = G.mau;
        this.soluong = G.soluong;
        this.dai = G.dai;
        this.ngang = G.ngang;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        boolean dk = true;
        while(dk){
            try{
                System.out.println("Nhap ma so: ");
                this.maso = sc.nextLine();
                System.out.println("Nhap mau: ");
                this.mau = sc.nextLine();
                System.out.println("Nhap so luong: ");
                this.soluong = sc.nextInt();
                System.out.println("Nhap chieu dai: ");
                this.dai = sc.nextInt();
                System.out.println("Nhap chieu ngang: ");
                this.ngang = sc.nextInt();
                System.out.println("Nhap gia ban: ");
                this.giaban = sc.nextLong();
                dk = false;
            }
            catch(Exception e){
                System.out.println("Yeu cau nhap lai");
            }
        }
    }
    public void hienthi(){
        System.out.println("Ma so: " + maso);
        System.out.println("Mau: " + mau);
        System.out.println("So luong vien trong hop: " + soluong);
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu ngang: " + ngang);
        System.out.println("Gia ban: " + giaban);
    }
    public String getmaso(){
        return maso;
    }
    public float giaBanLe(){
        giaban += 0.2*giaban;
        return (float)giaban;
    }
    public int dienTich(){
        return dai*ngang;
    }
    public int soLuongHop(int D,int N){
        int dt = this.soluong*this.dai*this.ngang;
        int DT = D*N;
        return Math.round(DT/dt);
    }
    public long gia(){
        return this.giaban;
    }
    public long giaDienTich(){
        Gach G = new Gach();
        long chiphi = G.giaban/G.soLuongHop(dai, dai);
        return chiphi;
    }
}
