package com.innovagenesis.aplicaciones.android.recyclerviewcardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Alexis on 29/10/2016.
 * Adaptador encargado de llenar el RecycleView
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewHolder> {

    private String[] arreglo = {"Layaout", "Fragment", "Items", "Java", "Android"};
    Context context;
    LayoutInflater inflater;

    public RecycleViewAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        RecycleViewHolder recycleViewHolder = new RecycleViewHolder(view);

        return recycleViewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        /** Encargado de realizar el llenado de los elementos*/
        holder.titulo.setText(arreglo[position]);
        holder.contenedor.setOnClickListener(onClickListener);
        holder.contenedor.setTag(holder);

        /*holder.imagenLista.setOnClickListener(onClickListener);
        holder.imagenLista.setTag(holder);*/

    }

    View.OnClickListener onClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            RecycleViewHolder recycleViewHolder = (RecycleViewHolder)v.getTag();
            int position = recycleViewHolder.getAdapterPosition();
            Toast.makeText(context,"La posicion es : " + position,Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public int getItemCount() {
        return arreglo.length;
    }
}
