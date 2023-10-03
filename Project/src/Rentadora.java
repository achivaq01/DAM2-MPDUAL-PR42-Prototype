import jdk.jfr.Percentage;

import java.awt.*;

public class Rentadora extends Electrodomestic implements Cloneable{
    private final int revolucions;
    private final int soroll;

    public Rentadora(String nom, String marca, Color color, float preu, int eficiencia, int revolucions, int soroll) {
        super(nom, marca, color, preu, eficiencia);

        this.revolucions = revolucions;
        this.soroll = soroll;

    }

    public int getRevolucions() {
        return revolucions;
    }

    public int getSoroll() {
        return soroll;
    }


    @Override
    public Rentadora clone() {
        Rentadora clone = (Rentadora) super.clone();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        return clone;
    }
}
