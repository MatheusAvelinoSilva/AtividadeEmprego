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

        int num1 = 1, num2 = 0, x = 1;
        int valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor"));
        boolean pertence = false;

        if (valorDigitado == 0) {

            JOptionPane.showMessageDialog(null, "O Numero 0 Pertence A Sequência Fibonacci ");

        } else {

            while (x <= valorDigitado) {

                num1 = num1 + num2;
                num2 = num1 - num2;

                if (valorDigitado == num1) {

                    pertence = true;
                    break;

                }

                x++;

            }

            JOptionPane.showMessageDialog(null, pertence == true ? "Numero " + valorDigitado + " Pertence A Sequência Fibonacci "
                    : "Numero " + valorDigitado + " Não Pertence A Sequência Fibonacci ");

        }
    }
}
