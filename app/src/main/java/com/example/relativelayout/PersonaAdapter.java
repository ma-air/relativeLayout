package com.example.relativelayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PersonaAdapter extends ArrayAdapter<Persona> {
    public PersonaAdapter(Context context, List<Persona> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
// Obtener inflater.
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
// ¿Existe el view actual?
        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.item_persona,
                    parent,
                    false);

        }
// Referencias UI.
        ImageView avatar = (ImageView) convertView.findViewById(R.id.iv_avatar);
        TextView name = (TextView) convertView.findViewById(R.id.tv_name);
        TextView title = (TextView) convertView.findViewById(R.id.tv_title);
        TextView company = (TextView) convertView.findViewById(R.id.tv_company);
// Persona actual.
        Persona persona = getItem(position);
// Setup.
        Glide.with(getContext()).load(persona.getFoto()).into(avatar);
        name.setText(persona.getNombre());
        title.setText(persona.getCargo());
        company.setText(persona.getEmpresa());
        return convertView;
    }
}
