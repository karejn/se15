package at.aau.se15.bsp3;

public class Item {

    public Item(Long id, Double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    private Long id;
    private Double price;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
