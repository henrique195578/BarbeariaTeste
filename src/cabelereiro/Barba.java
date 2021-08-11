/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabelereiro;

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
        System.out.println("[1] - DEGRADÊ");
        System.out.println("[2] - LENHADOR ");
        System.out.println("[3] - BIGODE ");
        System.out.println("[4] - PALHETA ");
        System.out.println("[5] - CHEIA E MODELADA ");
        System.out.println("Digite o numero tipo de corte de barba desejada: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                Barba = "DEGRADÊ";
                break;

            case 2:
                Barba = "LENHADOR";
                break;

            case 3:
                Barba = "BIGODE";
                valorBarba = 3;
                break;

            case 4:
                Barba = "PALHETA";
                valorBarba = 2;
                break;
                
                case 5:
                Barba = "CHEIA E MODELADA";
                valorBarba = 2;
                break;
        }
        return Barba;
    }

        }