/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Pelusa
 */
public class ListaMenu {
            ArrayList<Menu> lista = new ArrayList<>();
    
    public void agregarMenu( Menu menu){
        if (this.lista!=null){
        this.lista.add(menu);
       }
        if(this.lista==null){
        lista.add(menu);
        }
    }
    
    public boolean eliminarMenu(Menu menu){
        return this.lista.remove(menu);
      
    }
    
    public boolean eliminarMenu(String codigo){
        Menu temp = null;
        int codigoBarras= Integer.valueOf(codigo);
        for(Menu menu: this.lista){
            if(menu.getNumeroOrden().equals(codigo)){
                temp = menu;
            }
        }
        if(temp != null){
            return eliminarMenu(temp);
        }
        return false;
    }
    
    public Menu buscarMenu(String codigo){
        Menu temp= null;
        int codigoBarras= Integer.valueOf(codigo);
        for(Menu menu: this.lista){
            if(menu.getNumeroOrden().equals(codigoBarras)){
                temp = menu;
            }
        }
        return temp;
    }
 
    public void imprimirLista(){
        for(Menu menu: this.lista){
            System.out.println("nombre:"+menu.platoPrincipal);
            System.out.print("apellido:"+menu.valorVenta);
            System.out.print("cedula:"+menu.bebida);
            System.out.print("direccion:"+menu.aperitivo);
            System.out.print("mail:"+menu.numeroOrden);
            
        }
    }
    public ArrayList<Menu> devolverLista()
    {
        return this.lista;
    }

}
