package by.naumenka.lesson34;

public class Order {
    private String name;
    private int quantity;
    private double cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Наименование продукта = '" + name + '\'' +
                ", Количество = " + quantity +
                ", Цена = " + cost +
                '}'+ '\n';
    }
}
