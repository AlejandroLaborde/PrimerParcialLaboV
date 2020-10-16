package com.example.modeloparcial;

import android.app.Dialog;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.EditText;

import java.util.List;

public class ClickDialog implements DialogInterface.OnClickListener {

    private EditText et;
    private List<Producto> p;
    private Integer pos;
    public MainActivity activity;


    public ClickDialog(EditText et , List<Producto> p , Integer pos, MainActivity activity) {
        this.et=et;
        this.p=p;
        this.pos = pos;
        this.activity = activity;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        this.p.get(this.pos).setNameProduct(et.getText()+"");
        this.activity.actualizaAdapter(pos);
    }
}
