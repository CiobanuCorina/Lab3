package com.company.polimorfism;

public class LG extends Televizor{

    private String rezolutie;

    public LG(int dimensiune, String iluminare, int frecventa, String rezolutie){
        super("LG",dimensiune,iluminare,frecventa);
        this.rezolutie = rezolutie;
    }

    public String getRezolutie(){
        return this.rezolutie;
    }

    @Override
    public String toString(){
        return super.toString() + "Rezolutie: " + this.rezolutie + "\n";
    }

    public void setRezolutie(String rezolutie){
        this.rezolutie = rezolutie;
    }

    @Override
    public String functioneaza(){
        return "LG afiseaza imagini colorate";
    }
}
