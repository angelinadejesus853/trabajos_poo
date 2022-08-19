package POO_cpu;

import javax.swing.JOptionPane;

public class principal {
	public static void main (String[]args) {
	
		CPU crear_cpu= new CPU("HP","INTEL", " NEGRO", "500 GB",2);
		System.out.println("DATOS CPU 1:");
	System.out.println("MARCA CPU:"+ crear_cpu.getMarca());
	System.out.println("procesador CPU:"+ crear_cpu.getProcesador());
	System.out.println("color CPU:"+ crear_cpu.getColor());
	System.out.println("ALMACENAMIENTO CPU:"+ crear_cpu.getCapacidad_alm());
	System.out.println("Num procesador CPU:"+ crear_cpu.getNum_procesador());
	
	CPU cpu2=new CPU("Lenovo","AMD","gris","256 gb",4);
	
	System.out.println("\n DATOS CPU 2:");
	System.out.println("MARCA CPU:"+cpu2.getMarca());
	cpu2.setMarca("ACER");
	cpu2.setCapacidad_alm("1 TB");
		System.out.println("MARCA CPU:"+ cpu2.getMarca());	
		System.out.println("almacenamiento CPU:"+ cpu2.getCapacidad_alm());
		
		JOptionPane.showMessageDialog(null, "Marca computadora: "+crear_cpu.getMarca()+
				"\n almacenamiento cpu: "+ crear_cpu.getCapacidad_alm());
	}

}
