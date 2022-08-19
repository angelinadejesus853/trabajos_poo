package herencia;

public class producto {
	
		private String nombre;
		private String Codigo;
		private double precio;
		private String marca;
		private String tipo;
	
		public producto(String nombre, String codigo, double precio, String marca, String tipo) {
			super();
			this.nombre = nombre;
			this.Codigo = codigo;
			this.precio = precio;
			this.marca = marca;
			this.tipo = tipo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCodigo() {
			return Codigo;
		}

		public void setCodigo(String codigo) {
			this.Codigo = codigo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
			
		}
		
		}
		
