/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
public class Planeta {
    private String nombre;
    private int masa;
    private int velocidad;
    private int gravedad;
    private String tipo;
    
    Planeta(String nombre, int masa, int velocidad, int gravedad, String tipo){
        this.nombre = nombre;
        this.masa = masa;
        this.velocidad = velocidad;
        this.gravedad = gravedad;
        this.tipo = tipo;
    }
    public String getNombre(){
        return nombre;
    }
    public String setNombre(){
        return this.nombre;
    }
    public int getMasa(){
        return masa;
    }
    public int setMasa(){
        return this.masa;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public int setVelocidad(){
        return this.velocidad;
    }
    public int getGravedad(){
        return gravedad;
    }
    public int setGravedad(){
        return this.gravedad;
    }
    public String getTipo(){
        return tipo;
    }
    public String setTipo(){
        return this.tipo;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + ", su masa es: " + masa + ", su velocidad es: " + velocidad + ", su gravedad es: " + gravedad + "y el tipo es :" + tipo;
    }
}
