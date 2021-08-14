package com.example.listview_custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.idList);
        ArrayAdapter arrayAdapter = new LinguagemAdapter(this, adicionarLinguagem());
        lista.setAdapter(arrayAdapter);

    }

    private ArrayList<Linguagem> adicionarLinguagem() {
        ArrayList<Linguagem> linguamens = new ArrayList<Linguagem>();

        Linguagem l = new Linguagem("Angular", R.drawable.angular);
        linguamens.add(l);

        l = new Linguagem("React", R.drawable.react);
        linguamens.add(l);

        l = new Linguagem("My SQL", R.drawable.my_sql);
        linguamens.add(l);

        l = new Linguagem("Delphi", R.drawable.delphi);
        linguamens.add(l);

        l = new Linguagem("VS Code", R.drawable.vs_code);
        linguamens.add(l);

        l = new Linguagem("Eclipse", R.drawable.eclipse);
        linguamens.add(l);

        l = new Linguagem("CSS", R.drawable.css);
        linguamens.add(l);

        l = new Linguagem("HTML", R.drawable.html);
        linguamens.add(l);

        l = new Linguagem("Java Script", R.drawable.java_script);
        linguamens.add(l);

        return linguamens;
    }




}