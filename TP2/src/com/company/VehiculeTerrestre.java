package com.company;

public abstract class VehiculeTerrestre {
    protected String immat;

    public VehiculeTerrestre()
    {
        int Min = 0;
        int Max = 999;
        int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
        this.immat = "ZZ" + nombreAleatoire + "ZZ";
    }

    public VehiculeTerrestre(String immat)
    {
        this.immat = immat;
    }

    public String getImmat()
    {
        return this.immat;
    }

    public abstract String toString();

    public void afficher()
    {
        System.out.println(this.toString());
    }

    public void avancer()
    {
        System.out.println("J'avance super vite");
    }
}
