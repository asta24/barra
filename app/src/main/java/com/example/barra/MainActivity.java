package com.example.barra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Método para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;

    }
    //Método para asignar las funciones a las Opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Toast.makeText(this, "Opción1", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item2){
            Toast.makeText(this, "Opción2", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item3){
            Toast.makeText(this, "Opción3", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }
}