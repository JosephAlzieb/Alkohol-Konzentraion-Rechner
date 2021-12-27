package de.hhu.alkohoomat;

public record Form (double gewicht, double bier, double wein , double vodka, double whiskey /*,String geschlecht*/){

    public String getBlutalkohol() {
        if (gewicht == 0) return "0.00";
        double mr = gewicht * 0.7;
        double alkohol = alkoholBerechnen() / mr;
        return String.format("%.2f", alkohol);
    }

//    public boolean male() {
//        return "m".equals(geschlecht);
//    }
//
//    private double faktor() {
//        return male() ? 0.7 : 0.6;
//    }

    private double alkoholBerechnen() {
        return bier * 0.8 * 0.05 +
               wein * 0.8 * 0.12 +
               vodka * 0.8 * 0.40 +
               whiskey * 0.8 * 0.43;
    }
}
