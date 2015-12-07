/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import javax.swing.JTextField;

/**
 * @author Juan
 */
public class VistaUsuario {
    
     public boolean usuarioKeyPressed(char letra, JTextField usuario, JTextField contraseña,String contra) {                                   
        if (validarCaracteres(letra)){return true;}
        else{
            validarBorrado(usuario, "Usuario", letra, 2);
            if (validarTextoFondo(usuario,"Usuario",letra,false,contra))
            { return true;}
            if (letra==10)
            { contraseña.requestFocus();  return true;}
            else{return false;}
        }
        
     }
    
    //metodo que valida que no se introduzcan caracteres especiales
    public boolean validarCaracteres(char letra){
        if((letra>00 && letra<8)||(letra>8 && letra<10)||(letra>10 && letra<48) || (letra>57 && letra<65) || (letra > 90 && letra < 97)||(letra>122 && letra<127)||(letra>127 && letra<255)){
            return true;
        }else{return false;}
    }
    //metodo que valida que hay que volver a poner el texto de fondo deljtextfield
    public void validarBorrado(JTextField campo,String palabra,char letra,int num){
        if ((letra == 8)|| (letra==127)){
            if(campo.getText().length()<num){
                campo.setText(palabra);
                campo.setCaretPosition(0);
                campo.setForeground(Color.LIGHT_GRAY);
            }
        }
    }
    //metodo que validasi hay que quitar el texto del fondo del jtextfield
    public boolean validarTextoFondo(JTextField campo,String palabra,char letra,boolean hacer,String contra){            
        if (campo.getText().equals(palabra)){            
            if ((letra>260)||letra==8 || letra==127||letra==10){
                return true;
            }else{
                campo.setText("");
                campo.setForeground(Color.black);
                if(hacer){ contra=String.valueOf(letra);  return true;}
            }
        }return false;
    }    
    
    
}