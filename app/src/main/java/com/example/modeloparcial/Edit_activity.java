package com.example.modeloparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Edit_activity extends AppCompatActivity {

    Producto producto;
    ProductoView productView;
    ProductoControler productoControler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_activity);
        // Lo ideal seria armar un Singleton en vez de la lista estatica
        this.producto =  MainActivity.products.get((Integer) getIntent().getExtras().get("Posicion"));
        this.productView = new ProductoView(this, this.producto);
        this.productoControler = new ProductoControler(this.productView);

        ActionBar ab = getSupportActionBar();
        ab.setTitle(R.string.edit_name);
        ab.setDisplayHomeAsUpEnabled(true);

        this.productoControler.setValoresIniciales();
        this.productoControler.setListenerEdit(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}