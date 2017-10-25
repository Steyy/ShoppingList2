package info.pauek.shoppinglist;

/**
 * Created by Javi on 23/10/2017.
 */

public class ShoppingItem {
    //Simplemente son una pareja de datos
    private String text;
    private boolean checked;

    public ShoppingItem(String text) {
        this.text = text;
        this.checked = false;
    }

    public ShoppingItem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void toggleChecked() {
        //Con esto hago el inverso de lo que hace si estaba true lo paso false y viceversa.
        this.checked = !this.checked;
    }
}
