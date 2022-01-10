package com.example.relativelayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositorioPersonas {
    private static RepositorioPersonas repository = new RepositorioPersonas();
    private HashMap<Integer, Persona> personas = new HashMap<>();
    public static RepositorioPersonas getInstance() {
        return repository;
    }
    private RepositorioPersonas()
    {
        int x=1;
        savePersona(new Persona(x,"Alexander Pierrot", "CEO", "Seguros.", R.drawable.persona_foto_1));
        x++;
        savePersona(new Persona(x,"Carlos Lopez", "Asistente", "Hospital ", R.drawable.persona_foto_2));
        x++;
        savePersona(new Persona(x,"Sara Bonz", "Directora", "Electrical", R.drawable.persona_foto_3));
        x++;
        savePersona(new Persona(x,"Liliana Clarence", "Diseñadora ", "Creativa",
                R.drawable.persona_foto_4));
        x++;
        savePersona(new Persona(x,"Benito Peralta", "Supervisor", "Neumáticos", R.drawable.persona_foto_5));
        x++;
        savePersona(new Persona(x,"Juan Jaramillo", "CEO", "Banco", R.drawable.persona_foto_6));
        x++;
        savePersona(new Persona(x,"Christian Steps", "CTO", "Cooperativa", R.drawable.persona_foto_7));
        x++;
        savePersona(new Persona(x,"Alexa Giraldo", "Programador", "SiGest", R.drawable.persona_foto_8));
        x++;
        savePersona(new Persona(x,"Linda", "Directora", "Seguros Boliver", R.drawable.persona_foto_9));
        x++;
        savePersona(new Persona(x,"Lizeth", "CEO", "Concesionario", R.drawable.persona_foto_10));
        x++;
    }
    private void savePersona(Persona laPersona) {
        personas.put(laPersona.getmId(), laPersona);
    }
    public List<Persona> getPersonas() {
        return new ArrayList<>(personas.values());
    }
}
