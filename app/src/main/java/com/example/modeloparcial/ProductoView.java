package com.example.modeloparcial;

import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProductoView {

    Edit_activity activity;
    Producto prod;
    EditText precio;
    EditText nombre;
    EditText cantidad;
    Button editButton;


    public ProductoView(Edit_activity activity, Producto prod){

        this.activity=activity;
        this.prod = prod;
        this.precio = this.activity.findViewById(R.id.precio);
        this.nombre = this.activity.findViewById(R.id.edit_name_product);
        this.cantidad = this.activity.findViewById(R.id.cantidad);
       /* this.editButton = this.activity.findViewById(R.id.buttonEdit);
        this.editButton.setOnClickListener(new OnClickEdit(this.activity.productoControler,this.activity));*/
    }

    public void ObtenerValores(){
        this.prod.setNameProduct(this.nombre.getText().toString());
        this.prod.setCount(Integer.parseInt(this.cantidad.getText().toString()));
        this.prod.setPrice(Double.parseDouble(this.precio.getText().toString()));
    }

    public void CompletarValores(){
        Log.d("sad", this.prod.toString());
        this.precio.setText(prod.getPrice() + "");
        this.nombre.setText(prod.getNameProduct()+ "");
        this.cantidad.setText(prod.getCount() + "");
    }

}