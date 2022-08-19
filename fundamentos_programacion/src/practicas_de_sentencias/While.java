package practicas_de_sentencias;

import java.util.Scanner;

public class While {

	
	public static void main(String[] args) {
		   
		 Scanner entrada =new Scanner(System.in);
		  char respuesta;
       do{
           System.out.println("anota el nombre del alumno:");
           String nombre_alumno =entrada.next();
           System.out.println("anota el apellido paterno:");
           String apellidos_alumnos =entrada.next();
           System.out.println("anota la edad:");
           int edad_alumno = entrada.nextInt();
           System.out.println("\n alumno :"+nombre_alumno+"\n apellido : "+apellidos_alumnos +"\n edad : "+edad_alumno+"\n registrado correctamente: ");
           System.out.print("\ndesea realizar otro registro ? s/n");
           respuesta=entrada.next().charAt(0);
           System.out.println("");
           }while(respuesta=='s'||respuesta=='S');
       

     System.out.println("alumnos registrados correctamente");
      
}
}

