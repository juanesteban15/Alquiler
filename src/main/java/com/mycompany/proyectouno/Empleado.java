
package com.mycompany.proyectouno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Empleado extends ProyectoUno {
     
     private String cargo ;
     protected String contrasena;
     public String loginCedula;
     public String loginContrasena;
     
     
         public Empleado() {
        // Constructor vacío necesario para crear el objeto en la clase Principal
    }

          
               
    public  Empleado(String cedula,String nombre,String cargo,String correo,String contrasena,String rutaFoto){
         this.cedula=cedula;
         this.nombre=nombre;
         this.cargo=cargo;
         this.correo=correo;
         this.contrasena=contrasena;
         this.rutaFoto=rutaFoto;
     }     
          
          
     public String getContrasena(){
         return contrasena;
     }
     
     
     public String getCargo(){
     return cargo;
     }
     
     
        @Override    
         public String toString(){
          return getCedula()+","+getNombre()+","+cargo+","+getCorreo()+","+contrasena+","+getRutaFoto();
        //Aqui es donde los llama para guardar los datos en un archivo 
        
            } 
         
     
     public void guardarArchivos(){
         try(FileWriter escritor=new FileWriter("C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\Empleados.txt",true)){
          escritor.write(this.toString()+"\n");   
          System.out.println("Datos guardados");   
         }catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
     }
     
     
     
     public boolean yaEstaRegistrado(String cedula) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\Empleados.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Compara la cédula del usuario registrado con la nueva cédula
                String[] partes = linea.split(",");
                
                String cedulaGuardada = partes[0].trim();  // Suponiendo que la cédula es la primera columna
                if (cedulaGuardada.equals(cedula)) {
                    return true; // Si encuentra la cédula, devuelve true
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios: " + e.getMessage());
        }
        return false; // Si no encuentra la cédula, devuelve false
    }
     
     
     
     
     
          public String cargo(String cedula) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\Empleados.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Compara la cédula del empleado con la digitada
                String[] partes = linea.split(",");
                
                String cedulaGuardada = partes[0].trim();  //la cédula esta en la primera columna
                if (cedulaGuardada.equals(cedula)) {
                   //necesitamos  saber el cargo del usuario
                   
                   return partes[2].trim();
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios: " + e.getMessage());
        }
        return null; // Si no encuentra la cédula, devuelve false
    }
     
     
     
     
     
     
     
     
    
     public boolean loginEmpleado(ArrayList<Empleado> empleados,String loginCedula,String loginContrasena ){     

         this.loginCedula=loginCedula;
         this.loginContrasena=loginContrasena;
         
         
         
         for(Empleado emp:empleados)
           
                if (emp.getCedula().equals(loginCedula) && emp.contrasena.equals(loginContrasena)) {
             Empleado empleadoEncontrado = emp;
                    sesion.iniciarSesion(empleadoEncontrado);

                    return true;
        }
        return false;
}   
     
     
     }
