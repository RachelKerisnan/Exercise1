package sg.edu.rp.c346.id21013643.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    TextView tv3;
    String[] fruits;
    ArrayList<String> fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";


        fruit = new ArrayList<String> ();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("cherry");




        tv= findViewById(R.id.tv1);
        tv2 = findViewById(R.id.textView);
        tv3 = findViewById(R.id.textView2);

        for(int i= 0; i < fruits.length ;i++){
            tv.setText("Fruits \n ======");
            tv.append("\n" + fruits[i]);

        }


        for(int i= 0; i < fruit.size() ;i++){
            tv2.setText("Fruits \n ======");
            tv2.append("\n" + fruit.get(i));

        }
        fruit.add(3,"durian");

        fruit.get(1);

        fruit.remove(0);
        fruit.set(3,"dragon fruit");


        for(int i= 0; i < fruit.size() ;i++){
            tv3.setText("Fruits \n ======");
            tv3.append("\n" + fruit.get(i));

        }

    }
}
