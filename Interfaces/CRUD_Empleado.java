/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *Interfaz metodos empleado
 * @author TECNOLOGICO
 */
public interface CRUD_Empleado {
    /**
     * Lista metodos 
     * 
     * @param id
     * @param nombre
     * @return 
     */
    
    public String insertarEmpleado(int id, String nombre);
    
    public String actualizadoEmpleado(String nombre);
    
    public String borrarEmpleado(int id);
    
    public String consultarEmpleado(int id, String nombre);
    
}
