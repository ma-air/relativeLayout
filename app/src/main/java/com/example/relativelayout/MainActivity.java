package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lalista;
    ArrayAdapter<Persona> miAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lalista = (ListView) this.findViewById(R.id.lista_personas);
        miAdapter = new PersonaAdapter(this, RepositorioPersonas.getInstance().getPersonas());
        lalista.setAdapter(miAdapter);
    }
}