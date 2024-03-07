package com.moviles.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}