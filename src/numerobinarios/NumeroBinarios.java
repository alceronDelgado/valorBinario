/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerobinarios;

/**
 *
 * @author lalej
 * 
 * construya un algoritmo que permita visualizar el valor binario de un número digitado
 */
import javax.swing.*;
public class NumeroBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorNuevo = 0;
        int valor=0;
        String valorBinario = "";
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));
        
        
        while(valor > 0){
            valorNuevo = valor % 2;
            valor = valor / 2;
            
            valorBinario = valorNuevo + valorBinario ;
            
        }
        JOptionPane.showMessageDialog(null, valorBinario);

        
    }
    
}
