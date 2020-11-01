package com.company.abstractizare.clasa;

public class Mar extends Fructe{

    private String soi;

    public Mar(double greutate, String soi){
        super("Mar", greutate);
        this.soi = soi;
    }

    public String getSoi(){
        return this.soi;
    }

    @Override
    public String toString(){
        return super.toString() + "Soi: " + this.soi + "\n";
    }

    public void setSoi(String soi){
        this.soi = soi;
    }

    @Override
    public String ambalare(){
        return "Merele se ambaleaza";
    }
}
