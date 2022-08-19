package POO_practica1;

import javax.swing.JOptionPane;

public class principal {
	
	public static void main (String[]args) {
		 practica1 crear_moch= new practica1("Escolar","NICK","Mexico","Gris","Grande");
		System.out.println("DATOS de la mochila :");
		System.out.println("Diseño:"+ crear_moch.getDiseño());
		System.out.println("MARCA::"+ crear_moch.getMarca());
		System.out.println("color de mochila:"+ crear_moch.getColor());
		System.out.println("Distribuidor de la mochila:"+ crear_moch.getDistribuidor());
		System.out.println("Tamaño:"+ crear_moch.getTamaño());
		
		practica1 mochila2=new practica1("juvenil","nick","eua","cafe","pequeño");
		System.out.println("\n DATOS MOCHILA 2:");
		System.out.println("MARCA (MOCHILA):"+mochila2.getMarca());
		mochila2.setMarca("Jansport");
		mochila2.setTamaño("Pequeño");
		System.out.println("Tamaño de la mochila 2:"+ mochila2.getTamaño());
			
			System.out.println("MARCA de la mochila 2:"+ mochila2.getMarca());	
			
			
			JOptionPane.showMessageDialog(null, "Marca mochila: "+crear_moch.getMarca()+
					"\n Tamaño: "+ crear_moch.getTamaño());
	}
}
