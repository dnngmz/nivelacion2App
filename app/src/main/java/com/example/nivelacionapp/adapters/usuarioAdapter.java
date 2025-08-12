package com.example.nivelacionapp.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nivelacionapp.models.Usuario;

import java.util.List;

public class usuarioAdapter extends ArrayAdapter<Usuario> {
    private Context context;
    private List<Usuario> listaUsuarios;


    public usuarioAdapter(@NonNull Context context, List<Usuario> listaUsuarios) {
        super(context, 0, listaUsuarios);
        this.context = context;
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}