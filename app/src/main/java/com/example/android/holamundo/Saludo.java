package com.example.android.holamundo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    private TextView saludo;
    private Bundle b;
    private String aux, nomb, apell, nomb2, apell2, eda, sex;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        saludo = (TextView)findViewById(R.id.txtSaludo);
        b = getIntent().getExtras();
        nomb = b.getString("Nombre");
        apell = b.getString("Apellido");
        nomb2 = b.getString("Segundo Nombre");
        apell2 = b.getString("Segundo Apellido");
        eda = b.getString("Edad");
        sex = b.getString("Sexo");
        res = this.getResources();

        aux = res.getString(R.string.parte_saludo)+" "+nomb+" "+nomb2+" "+apell+" "+apell2+" "+res.getString(R.string.parte_saludo2)+"\n"+res.getString(R.string.parte_saludo3)+" "+eda+" "+res.getString(R.string.parte_saludo4)+" "+res.getString(R.string.parte_saludo5)+" "+sex;
        saludo.setText(aux);
    }
}
