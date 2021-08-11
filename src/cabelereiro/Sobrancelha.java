/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabelereiro;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Sobrancelha {

    double valorSobrancelha;
    Cabelo cabelo = new Cabelo();
    ArrayList<String> listaSobrancelha = new ArrayList();

    Kit kit = new Kit();

    public ArrayList selectSobrancelha(int op) {

        switch (op) {
            case 1:
                listaSobrancelha.add("RISQUINHO");
                break;
            case 2:
                listaSobrancelha.add("SOBRANCELHA COMUM");
                break;
            case 3:
                listaSobrancelha.add("RENA");
                valorSobrancelha += 10.00;
                break;
            
        }

        return listaSobrancelha;
    }

}