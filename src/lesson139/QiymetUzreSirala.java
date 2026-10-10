package lesson139;

import java.util.Comparator;

public class QiymetUzreSirala implements Comparator<Kitab> {
    @Override
    public int compare(Kitab k1, Kitab k2) {
        return Double.compare(k1.getQiymet(), k2.getQiymet());
    }
}