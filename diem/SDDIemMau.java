/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem;

/**
 *
 * @author student
 */
public class SDDIemMau {
    public static void main(String []args){
        DiemMau A = new DiemMau(5,10,"trang");
        A.xuat();
        DiemMau B = new DiemMau();
        B.nhap();
        B.doidiem(8, 10);
        B.xuat();
        B.GanMau("Vang");
    }
}
