package practicas_de_sentencias;

import java.util.Scanner;
public class edad {
	public static void main (String []args) {
		Scanner capturar_edad=new Scanner(System.in);
		
		System.out.println("anota tu edad");
        int edad = capturar_edad.nextInt();
		
		if (0<edad && edad <=10) {
			System.out.println("\"la infancia es increible...");	
		
		}else if (edad >=10 && edad <=20){
		    System.out.println("muchos cambios ,mucho estudio...");
		}else if(20 <= edad && edad < 30){
			System.out.println("Amor y mucho trabajo...");
		}else{
			System.out.println("edad no encontrada,estas cañon");
			
			
		}System.out.println("tienes "+edad+" años de edad ");
		
		}
		}
	


