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
public class faturamentoDistribuidora {

    public static void main(String[] args) {

        double valores[] = {31490.7866, 37277.9400, 37708.4303, 0.0000, 0.0000, 17934.2269, 0.0000, 6965.1262, 24390.9374, 14279.6481,
            0.0000, 0.0000, 39807.6622, 27261.6304, 39775.6434, 29797.6232, 17216.5017, 0.0000, 0.0000, 12974.2000,
            28490.9861, 8748.0937, 8889.0023, 17767.5583, 0.0000, 0.0000, 3071.3283, 48275.2994, 10299.6761, 39874.1073};
        double menor = 9999, maior = 0, media = 0, soma = 0;
        int count = 0,dias = 0;

        for (int x = 0; x < valores.length; x++) {

            if (valores[x] > maior) {

                maior = valores[x];

            } else if (valores[x] > 0 && valores[x] < menor) {

                menor = valores[x];

            }

            if (valores[x] > 0) {

                soma = soma + valores[x];
                count++;

            }

            media = soma / count;

            if (valores[x] > media) {

                dias++;

            }
        }

        JOptionPane.showMessageDialog(null, "Menor Valor Encontrado = " + menor + "\n"
                + " Maior Valor Encontrado = " + maior + "\n"
                + " Quantidade de Dias Que o Faturamento Diário Foi Maior Que A Media Mensal = " + dias + "\n");

    }
}