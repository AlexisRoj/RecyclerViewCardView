package com.innovagenesis.aplicaciones.android.recyclerviewcardview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Alexis on 29/10/2016.
 * Clase encargada de traer los datos del templa
 * e intercambiarlos
 */

public class RecycleViewHolder extends RecyclerView.ViewHolder {

    TextView texto,titulo;
    ImageView imagenLista;
    RelativeLayout contenedor;


    public RecycleViewHolder(View itemView) {
        super(itemView);


        titulo = (TextView) itemView.findViewById(R.id.titulo);
        texto = (TextView)itemView.findViewById(R.id.texto);
        contenedor = (RelativeLayout)itemView.findViewById(R.id.contendorCardView);
        //imagenLista = (ImageView)itemView.findViewById(R.id.imagenlista);

        /*titulo.findViewById(R.id.titulo);
        texto.findViewById(R.id.texto);
        imagenLista.findViewById(R.id.imagenlista);
*/
    }
}
