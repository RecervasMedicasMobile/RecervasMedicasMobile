package com.example.reservasmedicasmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflar el menú de opciones (menudeopciones.xml)
        getMenuInflater().inflate(R.menu.menudeopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Obtener el ID del item seleccionado
        int id = item.getItemId();

        // Manejar las opciones del menú de hamburguesa con if-else
        if (id == R.id.btn_contacto) {
            startActivity(new Intent(this, contacto.class));
            return true;
        } else if (id == R.id.btn_servicios) {
            startActivity(new Intent(this, servicios.class));
            return true;
        } else if (id == R.id.btn_registro) {
            startActivity(new Intent(this, registro.class));
            return true;
        } else if (id == R.id.btn_dashboard) {
            startActivity(new Intent(this, dashboard.class));
            return true;
        } else if (id == R.id.btn_login) {
            startActivity(new Intent(this, login.class));
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
