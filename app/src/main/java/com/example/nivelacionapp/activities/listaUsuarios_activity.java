package com.example.nivelacionapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.nivelacionapp.R;
import com.example.nivelacionapp.adapters.usuarioAdapter;
import com.example.nivelacionapp.models.Usuario;

import java.util.ArrayList;

public class listaUsuarios_activity extends AppCompatActivity {

    ListView lvUsuarios;
    TextView tvMenuPrincipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista_usuarios);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        boolean carlos = usuarios.add(new Usuario("Carlos", "Almanza", "carlos@gmail.com", "", "1234567"));
        usuarios.add(new Usuario("Karla", "Rodriguez", "@karla@gmail.com", "", "2345678"));
        usuarios.add(new Usuario("Juan", "Perez", "juan@gmail.com", "", "3456789"));

        // Vincular vistas
        lvUsuarios = findViewById(R.id.lvUsuarios);
        tvMenuPrincipal = findViewById(R.id.tvMenuPrincipal);

        // Configurar adaptador personalizado
        usuarioAdapter adapter = new usuarioAdapter(this, usuarios);
        lvUsuarios.setAdapter(adapter);

        // Evento para volver al menú principal
        tvMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMenuPrincipal = new Intent(listaUsuarios_activity.this, MainActivity.class);
                startActivity(intentMenuPrincipal);
                finish();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}