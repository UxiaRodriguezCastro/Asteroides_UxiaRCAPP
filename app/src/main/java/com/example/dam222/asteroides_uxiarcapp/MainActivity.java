package com.example.dam222.asteroides_uxiarcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSalir = findViewById(R.id.Salirbt);
        bSalir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();

            }
        });
    }//fin on create

    //Metodos


    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, acercadeActivity.class);
        startActivity(i);
    }

    public void salir(View view){
        finish();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true; /** true -> el menú ya está visible */
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.acercaDe:
                lanzarAcercaDe(null);
                break;
            default:
                Toast mensa = Toast.makeText(this, "Uxia Rodriguez: Opción en construccion",
                Toast.LENGTH_SHORT);
                mensa.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}//fin actividad main
