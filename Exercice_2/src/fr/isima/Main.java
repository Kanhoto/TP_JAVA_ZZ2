package fr.isima;

public class Main {

    public static void main(String[] args) throws AutorisationException {
        CompteBancaire Carte1 = new CompteBancaire(0,-700);

        System.out.println(Carte1.toString());

        Carte1.retrait(50);

        System.out.println(Carte1.toString());
    }
}
