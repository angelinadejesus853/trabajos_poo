package POO_practica1;

public class practica1 {
	private String diseño;
	private String marca;
	private String distribuidor;
	private String color;
	private String tamaño;
	
	
	public practica1(String diseño, String marca, String distribuidor, String color, String tamaño) {
		super();
		this.diseño = diseño;
		this.marca = marca;
		this.distribuidor = distribuidor;
		this.color = color;
		this.tamaño=tamaño;
		
	}
	public String getDiseño() {
		return diseño;
	}
	public void setDiseño(String diseño) {
		this.diseño = diseño;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDistribuidor() {
		return distribuidor;
	}
	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.color = tamaño;
	}
}
