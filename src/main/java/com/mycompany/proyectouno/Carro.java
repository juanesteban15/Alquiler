/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectouno;

import java.io.FileWriter;
import java.io.IOException;






public class Carro {
 private String marca;
private String color;
private String modelo;
private String categoria;
private String tipoSistema;
public String ImagenVehiculo;
private String placa;

public  Carro (){}

    public Carro(String marca,String color,String modelo,String categoria,String tipoSistema,String ImagenVehiculo,String placa){
        this.marca=marca;
        this.color=color;
        this.modelo=modelo;
        this.categoria=categoria;
        this.tipoSistema=tipoSistema;
        this.ImagenVehiculo=ImagenVehiculo;
        this.placa=placa;

    }

    
    @Override    
         public String toString(){
          return marca+","+color+","+modelo+","+categoria+","+tipoSistema+","+ImagenVehiculo+","+placa;
        //Aqui es donde los llama para guardar los datos en un archivo 
         } 
         
     
     public void guardarArchivos(){
         try(FileWriter escritor=new FileWriter("C:\\Users\\lenov\\OneDrive\\Documents\\NetBeansProjects\\ProyectoUno\\Vehiculos.txt",true)){
          escritor.write(this.toString()+"\n");   
          System.out.println("Datos guardados");   
         }catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
     }
    
    
    public String getMarca(){
        return marca;
    }
    
        public String getColor(){
        return color;
    }
            public String getModelo(){
        return modelo;
    }

            public String getCategoria(){
    return categoria;
}

public String getSistema(){
    return tipoSistema;
}

public String getImagen(){
    return ImagenVehiculo;
}

public String getPlaca(){
    return placa;
}


}
