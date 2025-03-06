/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysinhvien;

/**
 *
 * @author student
 */
public class Quanlysinhvien {

    /**
     * @param args the command line arguments
     */
    public static void sameBirthday(LopHoc room){
        for(int i=0;i<room.getNumber()-room.getNumberNN();i++){
            if(room.getBirthday(i) == 2004){
                room.xuat(i);
            }
        }
        for(int i=0;i<room.getNumberNN();i++){
            if(room.getBirthdayNN(i) == 2004){
                room.xuatNN(i);
            }
        }
    }
    public static void main(String[] args) {
        SinhVien []list;
//        list = new SinhVien[100];
        LopHoc room = new LopHoc();
        room.nhap();
//        list = sameBirthday(room);
        sameBirthday(room);
     }
    
}
