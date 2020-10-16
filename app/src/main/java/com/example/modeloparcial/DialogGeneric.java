package com.example.modeloparcial;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.List;

public class DialogGeneric extends DialogFragment {

     private List<Producto> list;
     private Integer pos;
     public MainActivity activity;

    public DialogGeneric(List<Producto> list, Integer pos, MainActivity activity) {
        this.list = list;
        this.pos = pos;
        this.activity = activity;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Edit Product");
        builder.setMessage("Ingrese el nuevo nombre del producto");

        final EditText input = new EditText(getContext());
        input.setInputType(InputType.TYPE_CLASS_TEXT );
        builder.setView(input);
        ClickDialog click = new ClickDialog(input, list , pos, activity);
        builder.setNegativeButton("Cancelar",click);
        builder.setPositiveButton("Aceptar",click);
        return builder.create();
    }

    /*
    * public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(this.titulo);
        View dialogPersonalizado = LayoutInflater.from(getActivity()).inflate(R.layout.dialog,null);
        builder.setView(dialogPersonalizado);
        return builder.create();
    }*/
}
