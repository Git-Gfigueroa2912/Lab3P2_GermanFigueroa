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
                    System.out.println("Planet Clash"); 
                    menu(opcion);
                    
                    break;
                    
                case 2:
                    crearGalaxia();
                    
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
            System.out.println("SUBMENU");
            System.out.println("1. Agregar Planeta");
            System.out.println("2. Editar Planeta");
            System.out.println("3. Eliminar Planeta");
            System.out.println("4. Listar Planeta");
            System.out.println("5. Estadistica de Planeta");
            System.out.println("6. Colision de Planeta");
            
            try{
                resp = entrada.nextInt();
            }catch(Exception e){
                System.out.println("Intente de nuevo, la opcion no existe");
            }
        }
        return resp;
    }
    public static void crearGalaxia(){
        System.out.println("Ingrese el nombre del planeta: ");
        String nombre = entrada.nextLine();
        do{
           try{
               
           }catch(Exception e){
               System.out.println("Error al crear galaxia");
           }
        }while(false);
    }

}    