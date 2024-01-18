package com.example.a20240118;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.security.PrivateKey;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mainListView; /**區域宣告 **/

    private ArrayList<String> dataSource;
    private ArrayAdapter<String> arrayAdapter;
    private TextView viewtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainListView = (ListView) findViewById(R.id.listview);
        viewtext = (TextView) findViewById(R.id.viewtext);

        dataSource = new ArrayList<String>();
        dataSource.add("Monday");
        dataSource.add("Tuesday");
        dataSource.add("Wednesday");
        dataSource.add("Thursday");
        dataSource.add("Friday");
        dataSource.add("Saturday");
        dataSource.add("Sunday");

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item_xml, dataSource);/**item檔名 **/
        mainListView.setAdapter(arrayAdapter);

        OnItemClickHandler itemClickListener = new OnItemClickHandler();
        mainListView.setOnItemClickListener(itemClickListener);
    }
        public class OnItemClickHandler implements AdapterView.OnItemClickListener{
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String Click_item = dataSource.get((int)id);
            viewtext.setText(Click_item);

        }


    }
}