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
public class Menu extends Producto{
String platoPrincipal;
String numeroOrden;//lleva el control de las ordenes
String valorVenta; //es diferente al valor del producto
String bebida;
String aperitivo;
ListaProducto listaImplementos;

    public Menu(String platoPrincipal, String numeroOrden, String valorVenta, String bebida, String aperitivo, String codigo, String nombre, String fechaCaducidad, String cantidad, String valor, String tipo) {
        super(codigo, nombre, fechaCaducidad, cantidad, valor, tipo);
        this.platoPrincipal = platoPrincipal;
        this.numeroOrden = numeroOrden;
        this.valorVenta = valorVenta;
        this.bebida = bebida;
        this.aperitivo = aperitivo;
        this.listaImplementos=listaImplementos;
        
    }

    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public void setPlatoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(String valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getAperitivo() {
        return aperitivo;
    }

    public void setAperitivo(String aperitivo) {
        this.aperitivo = aperitivo;
    }

        

}
