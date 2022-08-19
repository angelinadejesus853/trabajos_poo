/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada_salida_de_datos;

import java.util.Scanner;

/**
 *
 * @author TECNOLOGICO
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura_promedio=new Scanner(System.in);
        String curso="poo";
        System.out.println("Anota calificacion");
        String promedio=captura_promedio.nextLine();
        
        if (Integer.parseInt(promedio)>=70 && curso=="poo"){
             System.out.println("bienvenido al curso de POO");
        }else{
        System.out.println("no aprobaste el curso de POO");
        }  
       
    }
    }
    

