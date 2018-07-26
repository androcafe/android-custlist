package androcafe.com.customlistviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String item[]={"Mango","Banana","Apple","Strawberry","Papaya","Orange","Kiwi","Bluberry"};
    int price[]={10,20,30,40,50,60,70,80};

    MyListAdapter myListAdapter;
    Model model;

    ArrayList<Model> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        arrayList=new ArrayList<>();

        for(int i=0;i<item.length;i++)
        {
            model=new Model(item[i],price[i],false);
            arrayList.add(model);
        }
        myListAdapter=new MyListAdapter(MainActivity.this,arrayList);
        listView.setAdapter(myListAdapter);

    }
}
