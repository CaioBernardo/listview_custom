package com.example.listview_custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LinguagemAdapter extends ArrayAdapter<Linguagem> {

    private final Context context;
    private final ArrayList<Linguagem> elementos;
    public LinguagemAdapter(Context context, ArrayList<Linguagem> elementos) {
        super(context, R.layout.lista_customizada, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.lista_customizada, parent, false);
        TextView linguagem = (TextView) rowView.findViewById(R.id.nome);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);
        linguagem.setText(elementos.get(position).getLinguagem());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }


}
