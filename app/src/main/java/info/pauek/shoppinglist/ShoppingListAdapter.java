package info.pauek.shoppinglist;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Javi on 23/10/2017.
 */

public class ShoppingListAdapter extends ArrayAdapter <String> {
//Constructor que llama a constructor de la clase base (ArrayAdpater)
    public ShoppingListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //getView es la función que llama el listView (la lista) cuando le quiere pedir al adaptador una de las pastillitas
        View result = convertView; //pastillitareciclada
        if (result == null){
            LayoutInflater inflater = LayoutInflater.from(getContext()); //coge fichero del layout y te crea todos los obhetos en pantalla.
            result = inflater.inflate(R.layout.shopping_item, null);
        }
        CheckBox shopping_item = (CheckBox) result.findViewById(R.id.shopping_item); //Busco el CheckBox dentro del item de la lista que he encontrado
        String item_text = getItem(position);
        shopping_item.setText(item_text);
        return result;
    }
}
