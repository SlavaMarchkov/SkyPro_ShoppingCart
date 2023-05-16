package pro.sky.shoppingcart.models;

public class Item {
    private int id;
    private String title;

    public Item() {

    }

    public Item(final int id, final String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item: id=" + id + ", title=" + title;
    }

}
