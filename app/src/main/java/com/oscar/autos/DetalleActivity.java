package com.oscar.autos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetalleActivity extends AppCompatActivity {

    public static final String AUTO_SELECTED="autoSelected";
    private ImageView imgAuto;
    private TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        imgAuto=(ImageView)findViewById(R.id.imgAuto);
        tvTitulo=(TextView)findViewById(R.id.tvTitulo);
        obtenerAuto();
    }
    private void obtenerAuto(){
        if(getIntent().hasExtra(AUTO_SELECTED)){
            Auto auto=(Auto)getIntent().getSerializableExtra(AUTO_SELECTED);

            Picasso.with(this).load(auto.getUrlImagen())
                    .placeholder(R.drawable.placeholder)
                    .resize(300,300)
                    .centerCrop().into(imgAuto);

            tvTitulo.setText(auto.getTitulo());

        }
    }
}
