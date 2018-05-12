package com.example.eduardopalacios.asynctaskejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Midisplay;
    Button btnContador,btnDescargar,btnCancelar;
    ProgressBar progressBar;

    int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Midisplay=findViewById(R.id.display);

        btnContador=findViewById(R.id.contador);
        btnContador.setOnClickListener(this);

        btnDescargar=findViewById(R.id.descargar);
        btnDescargar.setOnClickListener(this);

        btnCancelar=findViewById(R.id.detener);
        btnCancelar.setOnClickListener(this);

        progressBar=findViewById(R.id.progressBar);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.contador:
                contador++;
                Midisplay.setText(String.valueOf(contador));
                break;

            case R.id.descargar:

                break;

            case R.id.detener:

                break;
                default:

                    break;
        }
    }
}
