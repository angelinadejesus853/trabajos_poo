/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author TECNOLOGICO
 */
public  class implementar_crud_empleado implements CRUD_Empleado{
/**
 * 
 * Metodos para insertar datos empleado
 * @see CRUD_empleado(interfaz)
 */
    @Override
    public String insertarEmpleado(int id, String nombre) {
      System.out.println("datos guardados"+"\nCon id: "+id+"\nNombre: "+nombre);
      return null;
    }

    @Override
    public String actualizadoEmpleado(String nombre) {
    System.out.println("datos del empleado"+nombre+"actualizado correctamente");
      return null;    
    }

    @Override
    public String borrarEmpleado(int id) {
    System.out.println("datos con id:"+id+"eliminado");
      return null;    
    }

    @Override
    public String consultarEmpleado(int id, String nombre) {
     System.out.println("datos del emplado: "+"\nid emplado:"+id+"\nNombre empleado: "+nombre);
      return null;   
    }

  
}
