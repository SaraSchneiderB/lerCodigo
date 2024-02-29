/*
 Com base na tabela abaixo, escreva um programa que leia o código de um ítem
e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

1 | Cachorro Quente | R$4.00
2 | X-Salada        | R$4.50
3 | X-Bacon         | R$5.00
4 | Torrada simples | R$2.00
5 | Refrigerante    | R$3.00

Dica:
if (codigo == 1) {
        total = quantidade * 4.0;
}

 */
package com.mycompany.lercodigo;

import java.util.Scanner;

public class LerCodigo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.println("Cardápio\n1 | Cachorro Quente | R$4.00\n"
                + "2 | X-Salada        | R$4.50\n"
                + "3 | X-Bacon         | R$5.00\n"
                + "4 | Torrada simples | R$2.00\n"
                + "5 | Refrigerante    | R$3.00");

        System.out.printf("\n Digite seu pedido: ");
        codigo = teclado.nextInt();

        System.out.printf(" Digite a quantidade: ");
        quantidade = teclado.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("\n O total ficou em: R$ %.2f \n", total);
            System.out.printf("\nAgradecemos seu pedido!");
        }
        else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("\n O total ficou em: R$ %.2f \n", total);
            System.out.printf("\nAgradecemos seu pedido!");
        }
        else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("\n O total ficou em: R$ %.2f \n", total);
            System.out.printf("\nAgradecemos seu pedido!");
        }
        else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("\n O total ficou em: R$ %.2f \n", total);
            System.out.printf("\nAgradecemos seu pedido!");
        }
        else if (codigo == 5) {
            total = quantidade * 3.00;
            System.out.printf("\n O total ficou em: R$ %.2f \n", total);
            System.out.printf("\nAgradecemos seu pedido!");
        }

    }
}
