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
public class Person {
    private String hoten;
    private Address diachi;
    private myDate birthday;
    public Person(){
        this.hoten = "unnamed";
        this.diachi = new Address();
        this.birthday = new myDate();
    }
    public Person(String hoten, Address diachi, myDate birthday){
        this.hoten = hoten;
        this.diachi = new Address(diachi);
        this.birthday = new myDate(birthday);
    }
    public Person(Person p){
        this.hoten = new String(p.hoten);
        this.diachi = new Address(p.diachi);
        this.birthday = new myDate(p.birthday);
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        this.hoten = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diachi.nhap();
        System.out.println("Nhap ngay sinh: ");
        this.birthday.nhap();
    }
    public void xuat(){
        System.out.println("Ho va ten: " + this.hoten);
        System.out.print("Dia chi: ");
        this.diachi.xuat();
        System.out.print("Ngay sinh: ");
        this.birthday.xuat();
    }
    public String getName(){
        return this.hoten;
    }
    public int getYear(){
        return this.birthday.getYear();
    }
}