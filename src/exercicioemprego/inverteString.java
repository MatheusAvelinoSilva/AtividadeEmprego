/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioemprego;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class inverteString {
    
    public static void main(String[] args) {

        String valorInvertido = "";
        String valorTeclado = JOptionPane.showInputDialog("Digite Uma Palavra");
        
        int tamanhoPalavra = valorTeclado.length(), count = 0;
        
        String[] valorNormal = new String[tamanhoPalavra];

        for (int x = tamanhoPalavra; x > 0; x--) {

            valorNormal[count] = valorTeclado.substring(x - 1, x);
            valorInvertido = valorInvertido.concat(valorNormal[count]);
            count++;

        }

        JOptionPane.showMessageDialog(null, valorInvertido);

    }    
}