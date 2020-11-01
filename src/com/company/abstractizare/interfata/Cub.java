package com.company.abstractizare.interfata;

public class Cub implements Corp{

    private double latura;

    public Cub(double latura){
        this.latura = latura;
    }

    @Override
    public double ariaBazei(){
        return latura * latura;
    }

    @Override
    public double ariaLaterala(){
        return 4 * latura * latura;
    }

    @Override
    public double ariaTotala(){
        return 6 * latura * latura;
    }

    @Override
    public double volum(){
        return latura * latura * latura;
    }

    @Override
    public String toString(){
        return "Aria bazei: " + this.ariaBazei() + "\n" +
                "Aria laterala: " + this.ariaLaterala() + "\n" +
                "Aria totala: " + this.ariaTotala() + "\n" +
                "Volum: " + this.volum() + "\n";
    }
}
