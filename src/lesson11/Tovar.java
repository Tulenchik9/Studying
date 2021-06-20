package lesson11;

import java.util.Objects;

public class Tovar implements Comparable<Tovar> {
    private int price;
    private String name;
    private double rate;

    public Tovar() {
    }

    public Tovar(int price, String name, double rate) {
        this.price = price;
        this.name = name;
        this.rate = rate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return price == tovar.price && Double.compare(tovar.rate, rate) == 0 && Objects.equals(name, tovar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, rate);
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        if (this.getRate() != o.getRate()) {
            return Double.compare(this.getRate(), o.getRate());
        }

        if (this.getPrice() != o.getPrice()) {
            return this.getPrice() - o.getPrice();
        }

        if (this.getName() != o.getName()) {
            return this.getName().compareTo(o.getName());
        }
        return 0;
    }
}
