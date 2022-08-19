package herencia;

public class bebidas extends producto {
	
	private String sabor;
	private String presentacion;
	
	public bebidas(String nombre, String codigo, double precio, String marca, String tipo, String sabor,
	String presentacion) {
	super(nombre, codigo, precio, marca, tipo);
	
	this.sabor = sabor;
	this.presentacion = presentacion;
	}
	// TODO Auto-generated constructor stub

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

		}
	


