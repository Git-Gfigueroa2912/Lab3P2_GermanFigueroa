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
}
