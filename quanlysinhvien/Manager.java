/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysinhvien;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Manager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien");
        int n = sc.nextInt();
        SinhVienCNTT []ds;
        ds = new SinhVienCNTT[n];
        for(int i=0;i<n;i++){
            ds[i] = new SinhVienCNTT();           
        }
        for(int i=0;i<n;i++){
            ds[i].nhap();
        }
        System.out.println("Nhap email can tim: ");
        sc = new Scanner(System.in);
        String mail = sc.nextLine();
        for(int i=0;i<n;i++){
            if(ds[i].getEmail().equals(mail)){
                System.out.println("-----------------------");
                String getinfo = ds[i].toString();
                System.out.println(getinfo);
                System.out.println("-----------------------");
            }
            else{
                System.out.println("Khong tim thay sinh vien!");
            }
        }
    }
}