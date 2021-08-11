/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabelereiro;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Kit {

    int x = 0;
    double valorTotal;

    public void Kit() {
        Cabelo Cabelo = new Cabelo();
        Sobrancelha sobrancelha = new Sobrancelha();
        Barba barba = new Barba();
        Drink drink = new Drink();

        Scanner entrada = new Scanner(System.in);

        System.out.println("QUAL TIPO DE CORTE DESEJADO?");
        System.out.println("[1] - CARECA");
        System.out.println("[2] - DEGRADê ");
        System.out.println("[3] - MOECANO ");
        System.out.println("[4] - DREADLOKS");
        System.out.println("[5] - SOCIAL");
        System.out.println("digite numero correspondendo ao corte: ");
        Cabelo.selectcabelo(entrada.nextInt());

        while (x < Cabelo.amountcabelo) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println("DESEJA ALGUM TIPO DE KIT?");
            System.out.println("[1] - CABELO + BARBA");
            System.out.println("[2] - LAVAGEM + SHAMOPOO + CONDICINADOR ");
            System.out.println("[3] - CABELO + BARBA + SOBRANCELHA");
            System.out.println("[4] - UNHAS DO PÉ + UNHA DA MÃO + SOBRANCELHA");
            System.out.println("[5] - Não desejo um tipo de kit");
            System.out.println("digite numero correspondendo kit: ");
            sobrancelha.selectSobrancelha(entrada2.nextInt());
            x++;
        }
        //Adicinar Barba
        if (Cabelo.Validador == 0){
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("DESEJA UM TIPO DE BARBA ?");
        System.out.println("[1] - Sim");
        System.out.println("[2] - Nao");
        barba.validarBarba(entrada3.nextInt());
        }else{
            
        }

        double valor;
        if (barba.validador == 1) {
            valor = Cabelo.Valuewithborder;
        } else {
            valor = Cabelo.preco;
        }

        while (drink.validador == 1) {
            Scanner entrada4 = new Scanner(System.in);
            System.out.println("Deseja adicionar alguma bebida?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");

            drink.validarDrink(entrada4.nextInt());
        }

        valorTotal = valor + sobrancelha.valorSobrancelha + barba.valorBarba + drink.valorDrink;

        System.out.println("Corte escolhido : " + Cabelo.corte);
        System.out.println("Tipo de sobrancelha escolhido: " + sobrancelha.listaSobrancelha);
        System.out.println("O tipo de barba escolhida: " + barba.Barba);
        System.out.println("A(s) Bebida(s): " + drink.listaBebidas);
        System.out.println("O Valor total foi de: " + valorTotal);

    }
}