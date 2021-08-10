/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

/**
 *
 * @author Lucas
 */
public class Cabelo {

    int amountcabelo;
    double preco;
    double Valuewithborder;
    String corte;
    int Validador = 0;
    Barba barba = new Barba();

    public int selectcabelo(int op) {

        switch (op) {
            case 1:
                amountcabelo = 5;
                corte = "careca";
                preco = 75;
                Valuewithborder = 80;
                break;

            case 2:
                amountcabelo = 4;
                corte = "degradê";
                preco = 66;
                Valuewithborder = 69.5;
                break;

            case 3:
                amountcabelo = 3;
                corte = "moicano";
                preco = 52;
                Valuewithborder = 56.5;
                break;

            case 4:
                amountcabelo = 3;
                corte = "dreadloks";
                preco = 42;
                Valuewithborder = 44.5;
                break;

            case 5:
                amountcabelo = 2;
                corte = "social";
                preco = 28;
                Validador = 1;
                break;
        }
        return amountcabelo;
    }
}