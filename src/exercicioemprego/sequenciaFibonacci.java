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
public class sequenciaFibonacci {

    public static void main(String[] args) {

        int num1 = 1, num2 = 0;
        int valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor"));

        String[] fibonacci = new String[valorDigitado + 1];

        if (valorDigitado == 0) {

            JOptionPane.showMessageDialog(null, "O Numero 0 Pertence A Sequência Fibonacci ");

        } else {

            for (int i = 0; i < valorDigitado; i++) {

                num1 = num1 + num2;
                num2 = num1 - num2;

                fibonacci[i] = String.valueOf(num1);

                if (fibonacci[i].equals(String.valueOf(valorDigitado))) {

                    JOptionPane.showMessageDialog(null, "Numero " + valorDigitado + " Pertence A Sequência Fibonacci ");

                } else {

                    JOptionPane.showMessageDialog(null, "Numero " + valorDigitado + " Não Pertence A Sequência Fibonacci ");

                }
            }
        }
    }
}