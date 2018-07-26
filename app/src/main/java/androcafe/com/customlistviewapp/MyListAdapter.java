package androcafe.com.customlistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter{
    Context context;

    ArrayList<Model> arrayList;

    public MyListAdapter(MainActivity mainActivity, ArrayList<Model> arrayList) {
        context=mainActivity;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            LayoutInflater inflater=LayoutInflater.from(context);
            view=inflater.inflate(R.layout.listview_row,null);
        }
        TextView textView_item=view.findViewById(R.id.textView_item);
        TextView textView_price=view.findViewById(R.id.textView_price);

        CheckBox checkBox=view.findViewById(R.id.checkbox);


        textView_item.setText("Item : "+arrayList.get(i).getItem());
        textView_price.setText("Price : "+arrayList.get(i).getPrice());
        checkBox.setChecked(arrayList.get(i).checked_status);
        return view;
    }
}
