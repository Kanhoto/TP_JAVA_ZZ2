package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Min = 1;
        int Max = 26;
        Voiture voiture1 = new Voiture("AD-256-PC",2,4);
        Camion camion1 = new Camion("LM-458-WE",100);

        camion1.afficher();
        voiture1.afficher();
        voiture1.avancer();

        Voiture voiture2 = new Voiture(2, 4);

        voiture2.afficher();
    }
}
