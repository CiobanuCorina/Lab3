package com.company.abstractizare.clasa;

public class Caisa extends Fructe{

    private double marime;

    public Caisa(double greutate, double marime){
        super("Caisa", greutate);
        this.marime = marime;
    }

    public double getMarime(){
        return this.marime;
    }

    @Override
    public String toString(){
        return super.toString() + "Marime: " + this.marime + "\n";
    }

    public void setMarime(double marime){
        this.marime = marime;
    }

    @Override
    public String ambalare(){
        return "Caisele se ambaleaza";
    }
}
