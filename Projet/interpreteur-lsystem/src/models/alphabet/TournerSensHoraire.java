package models.alphabet;

import tortue.Tortue;

import java.util.LinkedList;

public class TournerSensHoraire extends Mouvement {
    private static final Character REPRESENTATION_BASE = '-';
    private static final double VALEUR_BASE = 90;

    public TournerSensHoraire(Character representation, LinkedList<Symbole> evolution, double valeur) {
        super(representation, evolution, valeur);
        this.tourne = true;
    }

    public TournerSensHoraire(Character representation, double valeur) {
        super(representation, valeur);
        //this.tourne=true;
    }

    public TournerSensHoraire() {
        this(REPRESENTATION_BASE, VALEUR_BASE);
    }

    public TournerSensHoraire(double valeur) {
        this(REPRESENTATION_BASE, valeur);
    }

    public TournerSensHoraire(TournerSensHoraire membre) {
        this(membre.representation, membre.evolution, membre.valeur);
    }

    @Override
    public void seDessiner(Tortue tortue) {
        tortue.tourner(valeur);
    }

    @Override
    public double getValeur() {
        return super.getValeur();
    }
    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}