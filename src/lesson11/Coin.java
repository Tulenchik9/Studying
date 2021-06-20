package lesson11;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private double diametr;
    private double ves;
    private String metall;
    private int nominal;

    public Coin() {
    }

    public Coin(double diametr, double ves, String metall, int nominal) {
        this.diametr = diametr;
        this.ves = ves;
        this.metall = metall;
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diametr=" + diametr +
                ", ves=" + ves +
                ", metall='" + metall + '\'' +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Double.compare(coin.diametr, diametr) == 0 && Double.compare(coin.ves, ves) == 0 && nominal == coin.nominal && Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr, ves, metall, nominal);
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getMetall() != o.getMetall()) {
            return - this.getMetall().compareTo(o.getMetall());
        }

        if (this.getNominal() != o.getNominal()) {
            return - this.getNominal() - o.getNominal();
        }

        if (this.getDiametr() != o.getDiametr()) {
            return - Double.compare(this.getDiametr(), o.getDiametr());
        }

        if (this.getVes() != o.getVes()) {
            return - Double.compare(this.getVes(), o.getVes());
        }

        return 0;
    }
}
