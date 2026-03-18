/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectouno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author lenov
 */
public class Login{
    
    
    public  ArrayList<Empleado>  listaEmpleado (){
        
        ArrayList<Empleado> listaEmpleado=new ArrayList<>();
        
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\lenov\\Downloads\\Empleados.txt"))){
            String linea;
            
            while((linea=br.readLine())!=null){
                String[] partes=linea.split(",");
                
                String cedula=partes[0].trim();
                String nombre=partes[1].trim();
                String cargo=partes[2].trim();
                String correo=partes[3].trim();
                String contrasena=partes[4].trim();
                String rutaFoto=partes[5].trim();
                
                Empleado emp=new Empleado(cedula,nombre,cargo,correo,contrasena,rutaFoto);
                listaEmpleado.add(emp);
            }
            
        }catch (IOException e) {
            System.out.println("Error al leer el archivo: ");
        }
                
        return listaEmpleado;
         }
    
        public  ArrayList<Usuario>  listaUsuario (){
        ArrayList<Usuario> listaUsuario=new ArrayList<>();
        
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\lenov\\Downloads\\Usuarios.txt"))){
            String linea;
            
            
            while((linea=br.readLine())!=null){
                String[] partes=linea.split(",");
                
                
                
                String cedula=partes[0].trim();
                String nombre=partes[1].trim();
                String pais=partes[2].trim();
                String ciudad=partes[3].trim();
                String direccion=partes[4].trim();
                String telefono=partes[5].trim();
                String correo=partes[6].trim();
                String RutaFoto=partes[7].trim();
                String rutaCE=partes[8].trim();
                String rutaCA=partes[9].trim();



                
                
                Usuario usu= new Usuario(cedula,nombre,pais,ciudad,direccion,telefono,correo, RutaFoto, rutaCE, rutaCA);
                listaUsuario.add(usu);
            }  
        }catch (IOException e) {
            System.out.println("Error al leer el archivo: ");
        }
                return listaUsuario;

         }
    
    
    public  ArrayList<Carro>  listaCarro (){
        
        ArrayList<Carro> listaCarro=new ArrayList<>();
        
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\lenov\\Downloads\\Vehiculos.txt"))){
            String linea;
            
            while((linea=br.readLine())!=null){
                String[] partes=linea.split(",");
                
                String marca=partes[0].trim();
                String color=partes[1].trim();
                String modelo=partes[2].trim();
                String categoria=partes[3].trim();
                String tipoSistema=partes[4].trim();
                String placa=partes[5].trim();
                String ImagenVehiculo=partes[6].trim();
                        
                Carro car=new Carro(marca,color,modelo,categoria,tipoSistema,ImagenVehiculo,placa);
                listaCarro.add(car);
            }
            
        }catch (IOException e) {
            System.out.println("Error al leer el archivo: ");
        }
                
        return listaCarro;
         }
        }


           
