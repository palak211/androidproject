package com.example.leranskills;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class GridViewImageTextActivity extends AppCompatActivity {
    GridView androidGridView;

    String[] gridViewString = {"C++" ,"Java" ,"Html","PHP"};
    int[] gridViewImage= {R.drawable.clang ,R.drawable.java,R.drawable.html,R.drawable.php};



    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        androidGridView = (GridView) findViewById(R.id.grid1);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        for (int i = 1; i < gridViewString.length; i++) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name", gridViewString[i]);
            hashMap.put("image", gridViewImage[i] + "");
            arrayList.add(hashMap);
        }
        String[] from = {"name", "image"};
        int[] to = {R.id.tv1, R.id.imageView};
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, arrayList, R.layout.fragment_course, from, to);
        androidGridView.setAdapter(simpleAdapter);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(),gridViewString[i], Toast.LENGTH_LONG).show();
            }
        });


    }
}

        




