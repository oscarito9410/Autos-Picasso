package com.oscar.autos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by oemy9 on 26/11/2017.
 */

public class AdapterAuto extends BaseAdapter {
    private Context  ctx;
    private ArrayList<Auto>listAuto;
    private LayoutInflater layoutInflater;

    public AdapterAuto(Context ctx, ArrayList<Auto> listAuto) {
        this.ctx = ctx;
        this.listAuto = listAuto;
        this.layoutInflater=LayoutInflater.from(this.ctx);
    }

    @Override
    public int getCount() {
      return    listAuto.size();
    }

    @Override
    public Auto getItem(int position) {
        return listAuto.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view=layoutInflater.inflate(R.layout.item_auto,parent,false);
        ImageView imgAuto=(ImageView)view.findViewById(R.id.imgAuto);
        TextView tvTitulo=(TextView)view.findViewById(R.id.tvTitulo);
        Auto auto=getItem(position);
        Picasso.with(ctx).load(auto.getUrlImagen()
                .replace("https","http"))
                .resize(350,350)
                .placeholder(R.drawable.placeholder)
                .centerCrop().into(imgAuto);
        tvTitulo.setText(auto.getTitulo());
        return  view;
    }
}
