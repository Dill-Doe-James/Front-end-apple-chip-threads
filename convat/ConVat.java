/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convat;

/**
 *
 * @author student
 */
public abstract class ConVat {
    private String species;
    private String fur;
    private int weight;
    public ConVat(){
        this.species = "UNKNOWN";
        this.fur = "UNKNOWN";
        this.weight = 0;
    }
    public ConVat(String species, String fur, int weight){
        this.species = species;
        this.fur = fur;
        this.weight = weight;
    }
    public abstract void Keu();
}
