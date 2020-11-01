package com.company.abstractizare.interfata;

public class Cilindru implements Corp{

    private double raza;
    private double inaltime;

    public Cilindru(double raza, double inaltime){
        this.raza = raza;
        this.inaltime = inaltime;
    }

    @Override
    public double ariaBazei(){
        return 3.14 * raza * raza;
    }

    @Override
    public double volum(){
        return ariaBazei() * inaltime;
    }

    @Override
    public double ariaLaterala(){
        return 2 * 3.14 * raza * inaltime;
    }

    @Override
    public double ariaTotala(){
        return ariaLaterala() + 2 * ariaBazei();
    }

    @Override
    public String toString(){
        return "Aria bazei: " + this.ariaBazei() + "\n" +
                "Aria laterala: " + this.ariaLaterala() + "\n" +
                "Aria totala: " + this.ariaTotala() + "\n" +
                "Volum: " + this.volum() + "\n";
    }
}
