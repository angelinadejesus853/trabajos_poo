package listas;

import java.util.ArrayList;

 public class practica1 {
 public static  void main (String [] arg) {
		
		ArrayList<String> lista_marcas_laps= new ArrayList<String>();
		lista_marcas_laps.add("LENOVO");
		lista_marcas_laps.add("HP");
		lista_marcas_laps.add("HUAWEI");
		lista_marcas_laps.add("DELL");
		
		
		System.out.println("marcas laptops"+lista_marcas_laps);
		
		System.out.println(lista_marcas_laps.get(3));
		
		System.out.println(lista_marcas_laps.size());
		
		
		
		lista_marcas_laps.remove(2);
		System.out.println(lista_marcas_laps);
		
		lista_marcas_laps.set(1,"TOSHIBA");
		System.out.println(lista_marcas_laps);
		
		for(String i:lista_marcas_laps) {
			System.out.println(i);
	}
		
			
		}
 
}
