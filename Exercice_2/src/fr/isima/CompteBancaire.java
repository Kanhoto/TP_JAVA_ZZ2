package fr.isima;

public class CompteBancaire{
    private double solde = 0.0;       // solde du compte
    private double decouvert = -700.; // découvert autorisé

    public CompteBancaire(double solde, double decouvert){
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public void AutorisationException(){

    }

    public void retrait(double montant)
            throws IllegalArgumentException, AutorisationException {
        double nouveau = solde - montant;
        if (montant<0.0)
            throw new IllegalArgumentException("Mauvais montant");
        if (nouveau<decouvert)
            throw new AutorisationException();
        solde = nouveau;
    }

    @Override
    public String toString() {
        return "CompteBancaire{solde= " + solde + ", decouvert= " + decouvert + '}';
    }
}
