package com.company.polimorfism;

public class Samsung extends Televizor{

    private String display;

    public Samsung(int dimensiune, String iluminare, int frecventa, String display){
        super("Samsung",dimensiune,iluminare,frecventa);
        this.display = display;
    }

    public String getDisplay(){
        return this.display;
    }

    @Override
    public String toString(){
        return super.toString() + "Display: " + this.display + "\n";
    }

    public void setDisplay(String display){
        this.display = display;
    }

    @Override
    public String functioneaza(){
        return "Samsung afiseaza imagini colorate";
    }
}
