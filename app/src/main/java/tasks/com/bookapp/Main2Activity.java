package tasks.com.bookapp;

import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list = (ListView) findViewById(R.id.list);
        Resources res=getResources();
        String[] items=res.getStringArray(R.array.personNames);
       ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.Ibrahim);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                        break;
                    case 1:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.albert);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 2:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.sokrat);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 3:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.aflaton);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 4:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.Shekspeer);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 5:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.lokman);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 6:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.mahfouz);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 7:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.mostafa);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 8:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.arsto);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 9:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.Bayern);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 10:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.khandy);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;
                    case 11:
                    {
                        Resources res = getResources();
                        String[] says = res.getStringArray(R.array.shoky);
                        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                        i.putExtra("key", says);
                        startActivity(i);
                    }
                    break;


                }

            }
        });
    }
}
