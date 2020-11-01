package com.company.abstractizare.interfata;

public class Piramida implements Corp{

    private double latura;
    private double inaltime;
    private double apotema;

    public Piramida(double latura, double inaltime, double apotema){
        this.latura = latura;
        this.inaltime = inaltime;
        this.apotema = apotema;
    }

    @Override
    public double ariaBazei(){
        return latura * latura;
    }

    @Override
    public double ariaLaterala(){
        return (4 * latura * apotema)/2;
    }

    @Override
    public double ariaTotala(){
        return ariaLaterala() + ariaBazei();
    }

    @Override
    public double volum(){
        return (ariaBazei() * inaltime)/3;
    }

    @Override
    public String toString(){
        return "Aria bazei: " + this.ariaBazei() + "\n" +
                "Aria laterala: " + this.ariaLaterala() + "\n" +
                "Aria totala: " + this.ariaTotala() + "\n" +
                "Volum: " + this.volum() + "\n";
    }
}
