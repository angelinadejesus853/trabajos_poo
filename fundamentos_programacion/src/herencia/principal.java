package herencia;

public class principal {

	public static void main(String[]args) {
		
		bebidas crear_bebidas = new bebidas("Mirinda","CGKT",35.5,"THE COCA COLA","Bebida","Naranja","Get");
		System.out.println("DATOS DE LA BEBIDA:");
		System.out.println("Nombre: "+ crear_bebidas.getNombre());
		System.out.println("Codigo:"+ crear_bebidas.getCodigo());
		System.out.println("Precio: $"+crear_bebidas.getPrecio());
		System.out.println("Marca: "+crear_bebidas.getMarca());
		System.out.println("Tipo: "+crear_bebidas.getTipo());
		System.out.println("Sabor: "+crear_bebidas.getSabor());
		System.out.println("Presentacion: "+crear_bebidas.getPresentacion()+"\n");
		
        Lacteos lap =new Lacteos("lala","B01",20.0, "mexicana", "envase","20/12/2022","10%");
        lap.mostrarDatos();
        	
        
	}
}
