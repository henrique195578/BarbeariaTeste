/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Barba {

    int op;
    String Barba = "";
    double valorBarba;
    int validador = 0;
    Kit kit = new Kit();

    public int validarBarba(int op) {
        switch (op) {
            case 1:
                selectBarba();
                validador = 1;
                break;
            case 2:

                break;
        }
        return 0;
    }

    public String selectBarba() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("SELECIONE UM TIPO DE BARBA");
        System.out.println("[1] - degradê");
        System.out.println("[2] - Lenhador ");
        System.out.println("[3] - bigode ");
        System.out.println("[4] - palheta ");
        System.out.println("[5] - cheia e modelada ");
        System.out.println("Insira aqui qual tipo de corte de barba desejada: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                Barba = "degradê";
                break;

            case 2:
                Barba = "Lenhador";
                break;

            case 3:
                Barba = "Bigode";
                valorBarba = 3;
                break;

            case 4:
                Barba = "Palheta";
                valorBarba = 2;
                break;
                
                case 5:
                Barba = "cheia e modelada";
                valorBarba = 2;
                break;
        }
        return Barba;
    }

        }