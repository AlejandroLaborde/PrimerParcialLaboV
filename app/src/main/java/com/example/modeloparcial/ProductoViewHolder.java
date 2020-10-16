package com.example.modeloparcial;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView nombre;
    public TextView cantidad;
    public TextView precio;
    public Button edit;
    public Button less;
    public Button more;
    public Integer indice;
    private  MainActivity activity;

    public ProductoViewHolder(@NonNull View itemView, MainActivity activity) {
        super(itemView);
        this.activity = activity;
        this.nombre=itemView.findViewById(R.id.nameProduct);
        this.cantidad=itemView.findViewById(R.id.cantidad);
        this.precio=itemView.findViewById(R.id.precio);


    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        Log.d("INDICE", indice+"");
        this.indice = indice;
    }


    @Override
    public void onClick(View v) {
        this.activity.startEditActivity(this.indice);

    }
}
