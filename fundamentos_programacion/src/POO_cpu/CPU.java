package POO_cpu;

public class CPU {
	private String Marca;
	private String procesador;
	private String color;
	private String capacidad_alm;
	private int Num_procesador;
	//set_atributo("") establecer un valor
	//get obtener algo(argumento)
	//constructor inicialicar una clase, tendra el mismo nombre que la clase
	public CPU(String _marca, String _procesador, String _color, String _capacidad_alm, int _num_procesador) {
		super();
		Marca = _marca;
		this.procesador = _procesador;
		this.color = _color;
		this.capacidad_alm = _capacidad_alm;
		Num_procesador = _num_procesador;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCapacidad_alm() {
		return capacidad_alm;
	}
	public void setCapacidad_alm(String capacidad_alm) {
		this.capacidad_alm = capacidad_alm;
	}
	public int getNum_procesador() {
		return Num_procesador;
	}
	public void setNum_procesador(int num_procesador) {
		Num_procesador = num_procesador;
	}
	

}

