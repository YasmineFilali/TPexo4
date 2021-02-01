package com.examples.tpexo4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.examples.tpexo4.R;

public class Activity1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText nom;
        EditText prenom;
        EditText age;
        EditText domaine;
        EditText num;
        Button valider;

        setContentView(R.layout.activity_1);

        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        age = (EditText) findViewById(R.id.age);
        domaine = (EditText) findViewById(R.id.domaine);
        num = (EditText) findViewById(R.id.num);
        valider = (Button) findViewById(R.id.button);


    }}
