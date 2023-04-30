/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author Usuario
 */
public class Personas {
     private String nombre;
    private int num,edad;
    
    
    //constructor vacio

    public Personas() {
    }
   
     //constructor con parametros

    public Personas(String nombre, int num, int edad) {
        this.nombre = nombre;
        this.num = num;
        this.edad = edad;
    }
    
    //get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
