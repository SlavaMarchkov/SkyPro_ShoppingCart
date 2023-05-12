package pro.sky.shoppingcart.models;

public class Item {
    private final int id;
    private final String name;

    public Item(final int id) {
        this.id = id;
        this.name = "name" + id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item: id=" + id + ", name=" + name;
    }

}
