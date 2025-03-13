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
     */
    public static void sameBirthday(LopHoc room){
        for(int i=0;i<room.getNumber();i++){
            if(room.getBirthday(i) == 2004){
                room.xuat(i);
            }
        }
    }
    public static void trungtinh(LopHoc room){
        for(int i=0;i<room.getNumber();i++){
            if (room.getTinh(i).equals("can tho")){
                room.xuat(i);
            }
        }
    }
    public static void main(String[] args) {
        LopHoc room = new LopHoc();
        room.nhap();
//        sameBirthday(room);
        room.sapxepDTB();
        room.xuat();
     }
    
}
