package practicas_de_sentencias;
 import java.util.Scanner;

public class calificaciones {

	public static void calificaciones() {
		Scanner cal= new Scanner(System.in);
		
		System.out.println("introduzca el nombre de la asignatura");
		String asig= cal.next();
		System.out.println("introduzca los cuatros calificaciones");
		System.out.println("introduce el primer calificacion:");
		int c1=cal.nextInt();
		System.out.println("introduce la segunda calificacion::");
		int c2=cal.nextInt();
		System.out.println("introduce la tercera calificacion::");
		int c3=cal.nextInt();
		System.out.println("introduce la cuarta calificacion::");
		int c4=cal.nextInt();
		
	    int prom=(c1+c2+c3+c4)/4;
			  
        if(prom>=70) {
			 System.out.println("aprobado");
		}else {
			System.out.println("advertencia");
		}
        System.out.println("el nombre de la asignatura:  "+asig);
		
		System.out.println("el promedio es: "+prom);
		
	}
	
	public static void main(String []args) {
		
		 calificaciones.calificaciones();
		
	
	
}
}
