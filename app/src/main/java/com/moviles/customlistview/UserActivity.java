package com.moviles.customlistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserActivity  extends AppCompatActivity {
    String nombre, telefono;
    int imagen;
    CircleImageView foto;
    TextView textoNombre, textoTelefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);
        textoNombre = findViewById(R.id.nombre);
        textoTelefono = findViewById(R.id.telefono);
        foto = findViewById(R.id.fotoperfil);

        Intent recibir = this.getIntent();
        if(recibir != null){
            nombre = recibir.getStringExtra("nombre");
            telefono = recibir.getStringExtra("telefono");
            imagen = recibir.getIntExtra("imagen", R.drawable.persona);
            // Falta asignar el nombre y telefono al Textview correspondiente
            // la imagen al circleimagen
            textoNombre.setText(nombre);
            textoTelefono.setText(telefono);

            // Assigning image resource to CircleImageView
            foto.setImageResource(imagen);

        }

    }
}
