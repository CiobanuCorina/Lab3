package com.company.abstractizare.clasa;

public class Para extends Fructe{

    private String origine;

    public Para(double greutate, String origine){
        super("Para", greutate);
        this.origine = origine;
    }

    public String getOrigine(){
        return this.origine;
    }

    @Override
    public String toString(){
        return super.toString() + "Tara origine: " + this.origine + "\n";
    }

    public void setOrigine(String origine){
        this.origine = origine;
    }

    @Override
    public String ambalare(){
        return "Perele se ambaleaza.";
    }
}
