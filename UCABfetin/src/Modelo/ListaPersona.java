package Modelo;

import java.util.ArrayList;
import Modelo.Empleado;

import javax.swing.*;
public class ListaPersona {
    ArrayList<Persona> lista = new ArrayList<>();
    
    public void agregarUsuario(Persona user){
        if (this.lista!=null){
        this.lista.add(user);
       }
        if(this.lista==null){
        lista.add(user);
        }
    }
    
    public boolean eliminarUsuario(Persona user){
        return this.lista.remove(user);
      
    }
    
    public boolean eliminarUsuario(String cedula){
        Persona temp = null;
        int numeroCedula= Integer.valueOf(cedula);
        for(Persona user: this.lista){
            if(user.getCedula().equals(numeroCedula)){
                temp = user;
            }
        }
        if(temp != null){
            return eliminarUsuario(temp);
        }
        return false;
    }
    
    public Persona buscarUsuario(String cedula){
        Persona temp= null;
        int numeroCedula= Integer.valueOf(cedula);
        for(Persona user: this.lista){
            if(user.getCedula().equals(numeroCedula)){
                temp = user;
            }
        }
        return temp;
    }
 
    public void imprimirLista(){
        for(Persona user: this.lista){
            System.out.println("nombre:"+user.nombre);
            System.out.print("apellido:"+user.apellido);
            System.out.print("cedula:"+user.cedula);
            System.out.print("direccion:"+user.direccion);
            System.out.print("mail:"+user.email);
            
        }
    }
    public ArrayList<Persona> devolverLista()
    {
        return this.lista;
    }

  
    
}