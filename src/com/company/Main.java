package com.company;

import com.company.abstractizare.clasa.Caisa;
import com.company.abstractizare.clasa.Fructe;
import com.company.abstractizare.clasa.Mar;
import com.company.abstractizare.clasa.Para;
import com.company.abstractizare.interfata.Cilindru;
import com.company.abstractizare.interfata.Corp;
import com.company.abstractizare.interfata.Cub;
import com.company.abstractizare.interfata.Piramida;
import com.company.polimorfism.LG;
import com.company.polimorfism.Samsung;
import com.company.polimorfism.Sony;
import com.company.polimorfism.Televizor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Televizor tv = new Televizor("Ozon", 40, "LED", 60);
        Samsung samsung1 = new Samsung(60,"LED", 40, "IPS");
        LG lg = new LG(50,"LCD", 70, "UHD");
        Sony sony = new Sony(80, "LED", 80, "Dolby audio");
        Samsung samsung2 = new Samsung(120,"LCD",100, "IPS");

        List<Televizor> Televizoare = new ArrayList<>();
        Televizoare.add(tv);
        Televizoare.add(samsung1);
        Televizoare.add(lg);
        Televizoare.add(sony);
        Televizoare.add(samsung2);

        for (Televizor t : Televizoare) {
            System.out.println(t);
        }

        for (Televizor t : Televizoare) {
            System.out.println(t.functioneaza());
        }

        System.out.println("-----------------------------------------------");

        Cilindru cilindru = new Cilindru(6,12);
        Piramida piramida1 = new Piramida(3,5,2);
        Piramida piramida2 = new Piramida(5,6,9);
        Cub cub = new Cub(4);

        List<Corp> corpuri = new ArrayList<>();
        corpuri.add(cilindru);
        corpuri.add(piramida1);
        corpuri.add(piramida2);
        corpuri.add(cub);

        for (Corp c : corpuri) {
            System.out.println(c);
        }

        System.out.println("----------------------------------------------");

        Mar mar1 = new Mar(2.15, "Golden");
        Mar mar2 = new Mar(3.2, "Richard");
        Para para = new Para(1.5, "Spania");
        Caisa caisa = new Caisa(3.4, 1.5);

        List<Fructe> fructe = new ArrayList<>();
        fructe.add(mar1);
        fructe.add(mar2);
        fructe.add(para);
        fructe.add(caisa);

        for(Fructe f : fructe){
            System.out.println(f);
        }

        for(Fructe f : fructe){
            System.out.println(f.ambalare());
        }
    }
}
