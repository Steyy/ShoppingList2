package info.pauek.shoppinglist;

/**
 * Created by Javi on 23/10/2017.
 */

public class ShoppingItem {
    private String text;
    private boolean checked;

    public ShoppingItem(String text) {
        this.text = text;
    }

    public ShoppingItem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }
}
