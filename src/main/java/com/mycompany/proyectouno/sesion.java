/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectouno;

/**
 *
 * @author lenov
 */
public class sesion {
    
    public static Empleado empleadoActual;
    
    public static void iniciarSesion(Empleado emp){
        empleadoActual=emp;
    }
    
    public static Empleado getEmpleado(){
        
        return empleadoActual;
    }
    
    
    public static void cerrarSesion(){

    empleadoActual = null; // elimina el usuario actual
    }
  
   
}
