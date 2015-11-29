/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import Modelo.Empleado;

import javax.swing.*;
public class ListaEmpleado {
    ArrayList<Empleado> listaempleado = new ArrayList<>();
 
   // ArrayList<Empleado> listaEmpleado=new ArrayList<>();
    public void agregarEmpleado(Empleado user){
        this.listaempleado.add(user);
    }
    
    public boolean eliminarEmpleado(Empleado user){
        return this.listaempleado.remove(user);
    }
    
//////////////////////////////////  
    public void agregarUsuario(Empleado user){
        if (this.listaempleado!=null){
        this.listaempleado.add(user);
       
      
        }
    }
    
    
    public boolean eliminarUsuario(Persona user){
        return this.listaempleado.remove(user);
      
    }
    
    public boolean eliminarUsuario(String cedula){
        Persona temp = null;
        int numeroCedula= Integer.valueOf(cedula);
        for(Persona user: this.listaempleado){
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
        for(Persona user: this.listaempleado){
            if(user.getCedula().equals(numeroCedula)){
                temp = user;
            }
        }
        return temp;
    }
  public Empleado buscarUsuarioLogin(String usuario, String contraseña){
       Empleado temp=null;
        for(Empleado user: this.listaempleado){
         temp =(Empleado) user;
            if((temp.nick.equals(usuario))&&(temp.contraseña.equals(contraseña))){
                return temp;
            }
        }
       return null;
    }
    public void imprimirLista(){
        for(Empleado user: this.listaempleado){
            System.out.println("nombre:"+user.nombre);
            System.out.print("apellido:"+user.apellido);
            System.out.print("cedula:"+user.cedula);
            System.out.print("direccion:"+user.direccion);
            System.out.print("mail:"+user.email);
            System.out.println("CARGOOOOO   :"+user.cargo);
            
            
        }
    }
    
  
    
}