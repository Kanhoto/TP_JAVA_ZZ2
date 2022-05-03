package com.company;

public class Voiture extends VehiculeTerrestre{
    private int couleur;
    private int places;

    public Voiture(String immat, int couleur, int places)
    {
        super(immat);
        this.couleur = couleur;
        this.places = places;
    }

    public Voiture(int couleur, int places)
    {
        super();
        this.couleur = couleur;
        this.places = places;
    }

    public void setCouleur(int couleur)
    {
        this.couleur = couleur;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getCouleur()
    {
        return this.couleur;
    }

    public int getPlaces()
    {
        return this.places;
    }

    public String toString()
    {
        return "la voiture est de couleur " + this.couleur + " avec l'immatriculation " + this.immat + " et possède " + this.places + " places";
    }
}
