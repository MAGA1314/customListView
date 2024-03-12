package com.moviles.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView ListarPersonas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] nombres={
                "Luis",
                "Juan",
                "Pedro"
        };
        String[] telefonos={
                "123",
                "345",
                "678"
        };
        int[] fotoperfil={
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4
        };
        ListAdapter personas = new ListAdapter(MainActivity.this, nombres, telefonos, fotoperfil);
        ListarPersonas=(ListView) findViewById(R.id.listausuarios);
        ListarPersonas.setAdapter(personas);

        ListarPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View vista, int posicion, long id) {
                Intent enviarInfo = new Intent(MainActivity.this,UserActivity.class)
                        .putExtra("nombre", nombres[posicion])
                        .putExtra("telefono", telefonos[posicion])
                        .putExtra("imagen", fotoperfil[posicion]);

                startActivity(enviarInfo);
            }
        });
    }
}