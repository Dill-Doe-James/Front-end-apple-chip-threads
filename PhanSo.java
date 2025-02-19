/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai03;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class PhanSo {

    private int mau;
    private int tu;

    //constructor
    public PhanSo() {

    }
    public PhanSo(int tu){
        this.tu = tu;
    }
    public PhanSo(int mau){
        this.mau = mau;
    }
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(PhanSo s){
        this.tu = new PhanSo(s.tu);
        this.mau = s.mau;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean dk = true;
        while (dk) {
            try {
                System.out.println("Nhap tu so: ");
                this.tu = sc.nextInt();
                System.out.println("Nhap mau so: ");
                this.mau = sc.nextInt();
                if (mau == 0) {
                    System.out.println("Yeu cau nhap lai");
                    dk = true;
                } else {
                    dk = false;
                }
            } catch (Exception e) {
                System.out.println("Yeu cau nhap lai");
                sc.next();
            }
        }
    }
    public void hienthi(){
        if(this.tu == 0) System.out.println(0);
        if(this.mau == 1) System.out.println(tu);
        else{
            System.out.println(tu + "/" + mau);
        }
    }
    public int UCLN(){
        //ucln 6 va 4 = 2
        int min = Math.min(this.mau,this.tu);
        for(int i = min;i>=2;i--){
            if(this.mau%i==0 && this.tu%i==0)
                return i;
        }
        return 1;
    }
    public int BCNN(int a, int b){
        int max = Math.max(a,b);
        int save = max;
        for (int i = max; i<=a*b;i++){
            if(i%a==0 && i%b==0){
                save = i;
            }
        }
        return save;
    }
    public void nghichDao(){
        int temp;
        temp = this.mau;
        this.mau = this.tu;
        this.tu = temp;
    }
    public PhanSo giaTriNghichDao(){
        PhanSo n = new PhanSo();
        int temp = this.tu;
        n.tu = this.mau;
        n.mau = temp;
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
    public  PhanSo toiGian(){
        int r = this.UCLN();
        if(r>0){
            this.tu /= r;
            this.mau/= r;
        }
        return this;
    }
    public PhanSo cong(PhanSo a){
        PhanSo n = new PhanSo(this);
        int lcm = BCNN(n.mau,a.mau);
        a.tu = a.tu*(lcm/a.mau);
        n.tu = n.tu*(lcm/n.mau);
        n.tu=n.tu+a.tu;
        n.mau = lcm;
        n = n.toiGian();
        return n;
    }
    public PhanSo tru(PhanSo a){
        int lcm = BCNN(this.mau,a.mau);
        a.tu = a.tu*lcm/a.mau;
        this.tu = this.tu*lcm/this.mau;
        a.tu = this.tu-a.tu;
        a.mau = lcm;
        a = a.toiGian();
        return a;
    }
    public PhanSo nhan(PhanSo a){
        a.tu = a.tu*this.tu;
        a.mau = a.mau*this.mau;
        a = a.toiGian();
        return a;
    }
    public PhanSo chia(PhanSo a){
        PhanSo n = a.giaTriNghichDao();
        n.tu = this.tu*n.tu;
        n.mau = n.mau*this.mau;
        n = n.toiGian();
        return n;
    }
}
