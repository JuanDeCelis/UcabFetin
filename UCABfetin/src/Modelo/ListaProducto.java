/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LAB_L11
 */
public class ListaProducto {
        ArrayList<Producto> lista = new ArrayList<>();
    
    public void agregarProducto(Producto mercancia){
        if (this.lista!=null){
        this.lista.add(mercancia);
       }
        if(this.lista==null){
        lista.add(mercancia);
        }
    }
    
    public boolean eliminarProducto(Producto mercancia){
        return this.lista.remove(mercancia);
      
    }
    
    public boolean eliminarProducto(String codigo){
        Producto temp = null;
        int codigoBarras= Integer.valueOf(codigo);
        for(Producto mercancia: this.lista){
            if(mercancia.getCodigo().equals(codigo)){
                temp = mercancia;
            }
        }
        if(temp != null){
            return eliminarProducto(temp);
        }
        return false;
    }
    
    public Producto buscarUsuario(String codigo){
        Producto temp= null;
        int codigoBarras= Integer.valueOf(codigo);
        for(Producto mercancia: this.lista){
            if(mercancia.getCodigo().equals(codigoBarras)){
                temp = mercancia;
            }
        }
        return temp;
    }
 
    public void imprimirLista(){
        for(Producto mercancia: this.lista){
            System.out.println("nombre:"+mercancia.nombre);
            System.out.print("apellido:"+mercancia.codigo);
            System.out.print("cedula:"+mercancia.fechaCaducidad);
            System.out.print("direccion:"+mercancia.fechaCaducidad);
            System.out.print("mail:"+mercancia.tipo);
            
        }
    }
    public ArrayList<Producto> devolverLista()
    {
        return this.lista;
    }

  
}
