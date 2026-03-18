package com.mycompany.proyectouno;
        
import java.util.Scanner;// biblioteca para activar sistemas 

class ProyectoUno {
    Scanner sc=new Scanner(System.in);    
    protected String cedula;
    protected String nombre;
    protected String correo;
    protected String rutaFoto;

    
    public String getRutaFoto(){
        return rutaFoto;
    }
    
        public void setRutaFoto(String rutaFoto){
        this.rutaFoto=rutaFoto;
    }
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    public void setNombre(){
        this.nombre=nombre;                
    }
    public void setCedula(){
        this.cedula=cedula;
    }
    public void setCorreo(){
        this.correo=correo;
    }
    public String getCorreo(){
        return correo;
    }
}
