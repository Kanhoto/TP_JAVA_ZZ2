package fr.isima;

public class AutorisationException extends java.lang.Exception{
    @Override
    public String getMessage() {
        return "Non autorisé";
    }
}
