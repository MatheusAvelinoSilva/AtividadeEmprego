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
public class faturamentoMensal {
    
    public static void main(String[] args) {

        double sp = 0, rj = 0, mg = 0, es = 0, ot = 0, total = 180759.98;

        sp = Math.round(67836.43 / total * 100);
        rj = Math.round(36878.66 / total * 100);
        mg = Math.round(29229.88 / total * 100);
        es = Math.round(27165.48 / total * 100);
        ot = Math.round(19849.53 / total * 100);
        
        JOptionPane.showMessageDialog(null, 
         "Total Arrecadado = "+ total + "\n"
        +" Porcentegem Sp = "+ sp + "\n"
        +" Porcentagem Rj = "+ rj + "\n"
        +" Porcentegem Mg = "+ mg + "\n"
        +" Porcentegem Es = "+ es + "\n"
        +" Porcentagem Ot = "+ ot + "\n");
        
    }    
}