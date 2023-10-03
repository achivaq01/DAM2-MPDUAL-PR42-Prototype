import jdk.jfr.Percentage;

import java.awt.*;

public class Nevera extends Electrodomestic implements Cloneable{
    private final int frigories;
    private final int soroll;

    public Nevera(String nom, String marca, Color color, float preu, int eficiencia, int frigories, int soroll) {
        super(nom, marca, color, preu, eficiencia);

        this.frigories = frigories;
        this.soroll = soroll;
    }

    public int getFrigories() {
        return frigories;
    }

    public int getSoroll() {
        return soroll;
    }


    @Override
    public Nevera clone() {
        Nevera clone = (Nevera) super.clone();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        return clone;
    }
}
