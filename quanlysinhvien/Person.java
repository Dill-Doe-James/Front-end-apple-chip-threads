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
    private Mydate birthday;
    public Person(){
        this.hoten = "unnamed";
        this.diachi = new Address();
        this.birthday = new Mydate();
    }
    public Person(String hoten, Address diachi, Mydate birthday){
        this.hoten = hoten;
        this.diachi = new Address(diachi);
        this.birthday = new Mydate(birthday);
    }
    public Person(Person p){
        this.hoten = new String(p.hoten);
        this.diachi = new Address(p.diachi);
        this.birthday = new Mydate(p.birthday);
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        this.hoten = sc.nextLine();
//        this.diachi.nhap();
        System.out.println("Nhap ngay sinh: ");
        this.birthday.nhap();
    }
    public void xuat(){
        System.out.println("Ho va ten: " + this.hoten);
        System.out.print("Dia chi: ");
//        this.diachi.xuat();
        this.birthday.xuat();
    }
    public String getName(){
        return this.hoten;
    }
}