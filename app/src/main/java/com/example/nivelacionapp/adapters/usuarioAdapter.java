package com.example.nivelacionapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nivelacionapp.R;
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
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_usuario, parent, false);
        }

        // Obtener usuarios actual
        Usuario usuario = listaUsuarios.get(position);

        TextView tvNombre = convertView.findViewById(R.id.tvNombre);
        TextView tvEmail = convertView.findViewById(R.id.tvEmail);
        TextView tvApellido = convertView.findViewById(R.id.tvApellido);
        TextView tvTelefono = convertView.findViewById(R.id.tvTelefono);

        // Asignar datos
        tvNombre.setText(usuario.getNombre());
        tvEmail.setText(usuario.getEmail());
        tvApellido.setText(usuario.getApellido());
        tvTelefono.setText(usuario.getTelefono());

        return convertView;
    }
}