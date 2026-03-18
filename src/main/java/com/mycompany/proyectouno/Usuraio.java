package com.mycompany.proyectouno;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class Usuario extends ProyectoUno {
    
    private String direccion;
    private String pais;
    private String ciudad;
    private String telefono;
    public String rutaCE;
    public String rutaCA;
    
    
        public Usuario() {
        // Constructor vacío necesario para crear el objeto en la clase Principal
    }

  
        public Usuario(String cedula,String nombre,String pais,String ciudad,String direccion,String telefono,String correo,String RutaFoto,String rutaCE,String rutaCA) {
            this.cedula=cedula;
            this.nombre=nombre;
            this.pais=pais;
            this.ciudad=ciudad;
            this.direccion=direccion;
            this.telefono=telefono;
            this.correo=correo;
            this.rutaFoto=RutaFoto;
            this.rutaCE=rutaCE;
            this.rutaCA=rutaCA;
            
            
            
            
    }
    
        public boolean yaEstaRegistrado(String cedula) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\Usuarios.txt"))) {
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

   
    // Métodos Getters
    public String getDireccion() {
        return direccion;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }


        @Override    
         public String toString(){
          return getCedula()+","+nombre+","+pais+","+ciudad+","+direccion+","+telefono+","+getCorreo()+","+getRutaFoto()+","+rutaCE+","+rutaCA;
         
         }
         
           public void guardarArchivos(){
         try(FileWriter escritor=new FileWriter("C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\Usuarios.txt",true)){
          escritor.write(this.toString()+"\n");   
          System.out.println("Datos guardados");   
         }catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
     }  

    public String getRutaCE() {
        return rutaCE;
    }

    public String getRutaCA() {
        return rutaCA;

    }
    
} 