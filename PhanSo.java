/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai03;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner

public class PhanSo {

    private int mau;
    private int tu;

    //constructor
    public PhanSo() {

    }

    public PhanSo(int mau, int tu) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(PhanSo s){
        this.tu = s.tu;
        this.mau = s.mau;
    }
    void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean dk = true;
        while (dk) {
            try {
                System.out.println("Nhap mau so: ");
                this.mau = sc.nextInt();
                System.out.println("Nhap tu so: ");
                this.tu = sc.nextInt();
                if (mau == 0) {
                    System.out.println("Yeu cau nhap lai");
                    dk = true;
                } else {
                    dk = false;
                }
            } catch (Exception e) {
                System.out.println("Yeu cau nhap lai");
            }
        }
    }
    void hienthi(){
        if(this.tu == 0) System.out.println(0);
        if(this.mau == 1) System.out.print(tu);
        else{
            System.out.print(tu + "/" + mau);
        }
    }
    public void UCLN(){
        
    }
    
    public void nghichDao(){
        int temp;
        temp = this.mau;
        this.mau = this.tu;
        this.tu = temp;
    }
    public PhanSo giaTriNghichDao(){
        PhanSo n = new PhanSo();
        n.tu = this.mau;
        n.mau = this.tu;
        return n;   
    }
    public float giaTriThuc(){
        return this.tu/this.mau;
    }
    public boolean lonHon(PhanSo a){
        float x = giaTriThuc();
        float y = a.tu/a.mau;
        return x < y;
    }
    public PhanSo cong(PhanSo a){
        
    }
}
