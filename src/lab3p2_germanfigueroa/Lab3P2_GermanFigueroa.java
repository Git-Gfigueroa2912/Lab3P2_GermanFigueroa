/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_germanfigueroa;

import java.util.Scanner;
/**
 *
 * @author gafm2
 */
public class Lab3P2_GermanFigueroa {
   
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion = 0;
        do{
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("1. Planet Clash ");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                    
                case 1:
                    crearGalaxia();
                    break;
                    
                case 2:
                    administrarGalaxia();
                    break;
                    
                case 3:
                    listarGalaxia();
                    break;
                    
                case 4:
                    rankingGalaxia();
                    break;
                    
                case 5:
                    poder();
                    
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcion != 0);
    }
    public static int menu(int resp){
        System.out.println("==============MENU===============");
        System.out.println("1. Crear Galaxia");
        System.out.println("2. Administrar Galaxia");
        System.out.println("3. Listar Galaxia");
        System.out.println("4. Ranking de Galaxia");
        System.out.println("Ingrese una opcion: ");
        resp = entrada.nextInt();
        
        if(resp == 2){
            System.out.println("==========SUBMENU============");
            System.out.println("1. Agregar Planeta");
            System.out.println("2. Editar Planeta");
            System.out.println("3. Eliminar Planeta");
            System.out.println("4. Listar Planeta");
            System.out.println("5. Estadistica de Planeta");
            System.out.println("6. Colision de Planeta");
            
            
            
        }
        return resp;
    }
    public static void crearGalaxia(){
        System.out.println("Ingrese el nombre de la galaxia: ");
        String nombre = entrada.nextLine();
        do{
           try{
               System.out.println("Esta vacio, ingrese otro nombre");
           }catch(Exception e){
               System.out.println("Error al crear galaxia");
               System.out.println(e);
           }
        }while(false);
        
        int minimo = 0;
        do{
            System.out.println("Ingrese el minimo del planeta: ");
            
            try{
               minimo = entrada.nextInt();
               if(minimo < 1){
                   System.out.println("El minimo no puede ser menor a 1, ingrese otro numero");
                   minimo = entrada.nextInt();
               }
            }catch(Exception e){
                System.out.println("El numero es invalido");
            }
        }while(false);
        
        int maximo = 0;
        do{
            System.out.println("Ingrese el maximo del planeta: ");
            
            try{
               if(minimo>0){
                   System.out.println("");
               }
            }catch(Exception e){
                System.out.println("El numero es invalido");
                System.out.println(e);
            }
        }while(false);
    }
    public static void administrarGalaxia(){
        int posicion = 0;
        do{
           try{
               
           }catch(Exception e){
               
           }
        }while(false);
    }
    public static void listarGalaxia(){
        for(int i = 0; galaxia.size(); i++){
            System.out.println(i+"");
        }
    }
    public static void rankingGalaxia(){
        
    }
    public static double poder(Planeta planeta){
        int masa = planeta.getMasa();
        int velocidad = planeta.getVelocidad();
        int gravedad = planeta.getGravedad();
        double poder = masa*(velocidad*2)*(0.5*gravedad)*(0.5*gravedad);
        return poder;
    }
    public static void verEstadisticas(){
        int posicion = 0;
        do{
            System.out.println("Ingrese el planeta que desea ver");
        }while(false);
    }
    public static void listarPlaneta(){
        
    }
    public static void eliminarPlaneta(){
        int posicion = entrada.nextInt();
        do{
            System.out.println("Ingrese el planeta que desea eliminar: ");
            
            try{
                
            }catch(Exception e){
                
            }
        }while(false);
    }
}    