/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.arrayx;


import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.SoundbankResource;

public class ArrayExample {
    
    static List<Persona> personas=new ArrayList<>();
    
    public static void main(String[] args) {
        Persona p=new Persona();
        p.setDni("72072476");
        p.setNombre("Cristhian");
        p.setEdad(20);
        personas.add(p);
        p.setDni("72072476");
        p.setNombre("Cristhian");
        p.setEdad(20);
        personas.add(p);
        System.out.println("");
        for (Persona  px : personas) {
            System.out.println("DNI");}
        
        
       
            
        }
        
        
        
    }
    
}
