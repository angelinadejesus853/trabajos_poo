package herencia;

public class Lacteos extends producto {
	
private String fecha_caducidad;
private String Descuento;

public Lacteos(String nombre, String codigo, double precio, String marca, String tipo, String fecha_caducidad,
		String descuentos) {
	super(nombre, codigo, precio, marca, tipo);
	this.fecha_caducidad = fecha_caducidad;
	this.Descuento = descuentos;
}
public void mostrarDatos(){
	System.out.println("NOMBRE DEL LACTEOS:"+ "\n nombre:"+getNombre()+"\n codigo:"+getCodigo()+"\n precio:"+getPrecio()+
			"\n marca:"+getMarca()+"\n tipo:"+getTipo()+"\n fecha de caducidad:"+fecha_caducidad+"\n Descuento:"+Descuento);
 }

}
