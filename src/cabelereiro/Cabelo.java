/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabelereiro;

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
                corte = "CARECA";
                preco = 5;
                Valuewithborder = 10;
                break;

            case 2:
                amountcabelo = 4;
                corte = "DEGRADê";
                preco = 10;
                Valuewithborder = 10;
                break;

            case 3:
                amountcabelo = 3;
                corte = "MOECANO";
                preco = 15;
                Valuewithborder = 10;
                break;

            case 4:
                amountcabelo = 3;
                corte = "DREADLOKS";
                preco = 20;
                Valuewithborder = 10;
                break;

            case 5:
                amountcabelo = 2;
                corte = "SOCIAL";
                preco = 8;
                Validador = 1;
                break;
        }
        return amountcabelo;
    }
}