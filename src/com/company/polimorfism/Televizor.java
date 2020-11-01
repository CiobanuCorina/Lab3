package com.company.polimorfism;

public class Televizor {

    private String producator;
    private int dimensiune;
    private String iluminare;
    private int frecventa;

    public Televizor(String producator, int dimensiune, String iluminare, int frecventa) {
        this.producator = producator;
        this.dimensiune = dimensiune;
        this.iluminare = iluminare;
        this.frecventa = frecventa;
    }

    public String getProducator(){
        return this.producator;
    }
    public int getDimensiune(){
        return this.dimensiune;
    }
    public String getIluminare(){
        return this.iluminare;
    }
    public int getFrecventa(){
        return this.frecventa;
    }

    @Override
    public String toString(){
        return "Producator: " + this.producator + "\n" +
                "Dimensiune: " + this.dimensiune + "\n" +
                "Iluminare: " + this.iluminare + "\n" +
                "Frecventa: " + this.frecventa + "\n";
    }

    public void setProducator(String producator){
        this.producator = producator;
    }
    public void setDimensiune(int dimensiune){
        this.dimensiune = dimensiune;
    }
    public void setIluminare(String iluminare){
        this.iluminare = iluminare;
    }
    public void setFrecventa(int frecventa){
        this.frecventa = frecventa;
    }

    public String functioneaza(){
        return "Televizorul afiseaza imagini colorate.";
    }
}
