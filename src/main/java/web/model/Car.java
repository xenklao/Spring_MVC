package web.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String model;
    @Column
    private String color;
    @Column
    private int year;
    @Column
    private double price;

    public Car(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
