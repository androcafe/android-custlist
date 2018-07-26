package androcafe.com.customlistviewapp;

public class Model {
    String Item;
    int price;
    boolean checked_status;

    public Model(String name, int price, boolean checked_status) {
        this.Item = name;
        this.price = price;
        this.checked_status = checked_status;
    }


    public String getItem() {
        return Item;
    }

    public void setName(String name) {
        this.Item = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isChecked_status() {
        return checked_status;
    }

    public void setChecked_status(boolean checked_status) {
        this.checked_status = checked_status;
    }
}
