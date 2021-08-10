/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

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

        System.out.println("Qual tipo de corte desejado?");
        System.out.println("[1] - careca");
        System.out.println("[2] - degradê ");
        System.out.println("[3] - moicano ");
        System.out.println("[4] - dreadloks");
        System.out.println("[5] - social");
        System.out.println("Digitalize qual o tipo de corte de cabelo desejado: ");
        Cabelo.selectcabelo(entrada.nextInt());

        while (x < Cabelo.amountcabelo) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println("Deseja compara algum tipo de kit?");
            System.out.println("[1] - cabelo + barba");
            System.out.println("[2] - Condicionador + Shampoo ");
            System.out.println("[3] - Cabelo + barba + sobrancelha");
            System.out.println("[4] - Unha pé + mão + sobrancelha");
            System.out.println("[5] - Não desejo contratar kit");
            System.out.println("Digitalize se deseja comprar algum kit: ");
            sobrancelha.selectSobrancelha(entrada2.nextInt());
            x++;
        }
        //Adicinar Barba
        if (Cabelo.Validador == 0){
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Deseja adicionar Barba?");
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
            System.out.println("Deseja adicionar alguma Barba?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");

            drink.validarDrink(entrada4.nextInt());
        }

        valorTotal = valor + sobrancelha.valorSobrancelha + barba.valorBarba + drink.valorDrink;

        System.out.println("O tamanho da pizza escolhido foi : " + Cabelo.corte);
        System.out.println("Os sabores Selecionados foram: " + sobrancelha.listaSobrancelha);
        System.out.println("A borda Selecionada foi: " + barba.Barba);
        System.out.println("A ou as Bebidas escolhidas foi: " + drink.listaBebidas);
        System.out.println("O Valor total do pedido foi: " + valorTotal);

    }
}