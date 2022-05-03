package com.company;

public class Camion extends VehiculeTerrestre{
    private float capacite;

    public Camion(String immat, float capacite)
    {
        super(immat);
        this.capacite = capacite;
    }

    public Camion(float capacite)
    {
        super();
        this.capacite = capacite;
    }

    public void setCapacite(float capacite) {
        this.capacite = capacite;
    }

    public float getCapacite() {
        return this.capacite;
    }

    public String toString()
    {
        return "le camion a l'immatriculation " + this.immat + " et a une capacité de " + this.capacite;
    }
}
