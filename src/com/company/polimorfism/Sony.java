package com.company.polimorfism;

public class Sony extends Televizor{

    private String audio;

    public Sony(int dimensiune, String iluminare, int frecventa, String audio){
        super("Sony", dimensiune, iluminare, frecventa);
        this.audio = audio;
    }

    public String getAudio(){
        return this.audio;
    }

    @Override
    public String toString(){
        return super.toString() + "Sistemul audio: " + this.audio + "\n";
    }

    public void setAudio(String audio){
        this.audio = audio;
    }

    @Override
    public String functioneaza(){
        return "Sony afiseaza imagini colorate";
    }
}
