import jdk.jfr.Percentage;

import java.awt.*;
import java.util.Objects;

public abstract class Electrodomestic implements Cloneable{
    private final String nom, marca;
    private final Color color;
    private final float preu;
    private final int eficiencia;

    public Electrodomestic(String nom, String marca, Color color, float preu, int eficiencia){
        super();

        this.nom = nom;
        this.marca = marca;
        this.color = color;
        this.preu = preu;
        this.eficiencia = eficiencia;

    }

    public String getNom() {
        return nom;
    }

    public String getMarca() {
        return marca;
    }

    public Color getColor() {
        return color;
    }

    public float getPreu() {
        return preu;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    @Override
    public String toString() {
        return "Electrodomestic{" +
                "nom='" + nom + '\'' +
                ", marca='" + marca + '\'' +
                ", color=" + color +
                ", preu=" + preu +
                ", eficiencia=" + eficiencia +
                '}';
    }

    @Override
    public Electrodomestic clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Electrodomestic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Electrodomestic other = (Electrodomestic) obj;

        return Objects.equals(nom, other.nom) &&
                Objects.equals(marca, other.marca) &&
                Objects.equals(color, other.color) &&
                Objects.equals(preu, other.preu) &&
                Objects.equals(eficiencia, other.eficiencia);
    }

}
