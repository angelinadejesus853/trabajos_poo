/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 * 
 * Clase principal
 *@version 1.0
 * @author TECNOLOGICO
 */
public class Principal {
    
public static void main(String[] args) {
// TODO code application logic here
/**
 * Construye los objetos
 * @see interfaz CRUD_empleado y clase implementar_crud_empleado
 */
  CRUD_Empleado operaciones= new implementar_crud_empleado();
  
  operaciones. insertarEmpleado(1,"gabriel");
  operaciones.actualizadoEmpleado("gabriel");
  operaciones.borrarEmpleado(1);
  operaciones.consultarEmpleado(1, "gabriel");
}
}