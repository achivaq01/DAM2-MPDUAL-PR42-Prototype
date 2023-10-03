import jdk.jfr.Percentage;

import java.awt.*;

public class Forn extends Electrodomestic implements Cloneable{
    private final int temperatura;
    private final boolean autoneteja;

    public Forn(String nom, String marca, Color color, float preu, int eficiencia, int temperatura, boolean autoneteja) {
        super(nom, marca, color, preu, eficiencia);

        this.temperatura = temperatura;
        this.autoneteja = autoneteja;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isAutoneteja() {
        return autoneteja;
    }


    @Override
    public Forn clone() {
        Forn clone = (Forn) super.clone();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        return clone;
    }
}
