package com.example.nombralo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btncambiar = (Button) findViewById(R.id.btnIr);
//Obteniendo la intancia del textview
        info = (TextView) findViewById(R.id.tvMensaje2);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                info.setText("Se presionó boton flotante");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.add:
//metodoAdd()
                info.setText("Se presionó Añadir");
                return true;
            case R.id.search:
//metodoSearch()
                info.setText("Se presionó Buscar");
                return true;
            case R.id.edit:
//metodoEdit()
                info.setText("Se presionó Editar");
                return true;
            case R.id.delete:
//metodoDelete()
                info.setText("Se presionó Eliminar");
                return true;
            case R.id.banear:
//metodoEdit()
                info.setText("Se presionó Bloquear");
                return true;
            case R.id.allow:
//metodoDelete()
                info.setText("Se presionó Permitir  ");
                return true;
            default:
                return super.onOptionsItemSelected(item);



        }
    }
}