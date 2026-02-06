/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_germanfigueroa;

import java.util.ArrayList;
/**
 *
 * @author gafm2
 */
public class Galaxia {
    private String nombre;
    private int minimo_planetas;
    private int maximo_planetas;
    private String planetas;
    
    Galaxia(String nombre, int minimo_planetas, int maximo_planetas, String planetas){
        this.nombre = nombre;
        this.minimo_planetas = minimo_planetas;
        this.maximo_planetas = maximo_planetas;
        this.planetas = planetas;
    }
    public String nombre(){
        return nombre;
    }
    public String setNombre(){
        return this.nombre;
    }
    public int getMinimo_planetas(){
        return minimo_planetas;
    }
    public int setMinimi_planetas(){
        return this.minimo_planetas;
    }
    public int getMaximo_planetas(){
        return maximo_planetas;
    }
    public String getPlanetas(){
        return planetas;
    }
    public String setPlanetas(){
        return this.planetas;
    }
    @Override
    public String toString(){
        return "Nombre : " + nombre + ", su minimo es: " + minimo_planetas + ", su maximo es: " + maximo_planetas;
    }
    public ArrayList<Planeta> getlistaPlaneta(){
        return listaPlaneta;
    }
    public void setlistaPlaneta(){
        
    }
}
