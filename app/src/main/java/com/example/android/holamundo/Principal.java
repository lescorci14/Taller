package com.example.android.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private EditText cajaNombre;
    private EditText cajaApellido;
    private EditText cajaSegundoNombre;
    private EditText cajaSegundoApellido;
    private EditText cajaEdad;
    private EditText cajaSexo;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaNombre = (EditText)findViewById(R.id.txtNombre);
        cajaApellido = (EditText)findViewById(R.id.txtApellido);
        cajaSegundoNombre = (EditText)findViewById(R.id.txtSegundoNombre);
        cajaSegundoApellido = (EditText)findViewById(R.id.txtSegundoApellido);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);
        i = new Intent(this,Saludo.class);
        b = new Bundle();

    }

    public void saludar(View v){
        String nomb, apell, nomb2, apell2, eda, sex;
       if(validar()) {
           nomb = cajaNombre.getText().toString();
           apell = cajaApellido.getText().toString();
           nomb2 = cajaSegundoNombre.getText().toString();
           apell2 = cajaSegundoApellido.getText().toString();
           eda = cajaEdad.getText().toString();
           sex = cajaSexo.getText().toString();

           b.putString("Nombre", nomb);
           b.putString("Apellido", apell);
           b.putString("Segundo Nombre", nomb2);
           b.putString("Segundo Apellido", apell2);
           b.putString("Edad", eda);
           b.putString("Sexo", sex);

           i.putExtras(b);

           startActivity(i);
       }
    }

    public void borrar(View v){
        cajaNombre.setText("");
        cajaApellido.setText("");
        cajaSegundoNombre.setText("");
        cajaSegundoApellido.setText("");
        cajaEdad.setText("");
        cajaSexo.setText("");
    }

    public boolean validar(){
        if(cajaNombre.getText().toString().isEmpty()){
            cajaNombre.setError(getResources().getString(R.string.error_1));
            return false;
        }
        if(cajaSegundoNombre.getText().toString().isEmpty()){
            cajaSegundoNombre.setError(getResources().getString(R.string.error_3));
            return false;
        }
        if(cajaApellido.getText().toString().isEmpty()){
            cajaApellido.setError(getResources().getString(R.string.error_2));
            return false;
        }
        if(cajaSegundoApellido.getText().toString().isEmpty()){
            cajaSegundoApellido.setError(getResources().getString(R.string.error_4));
            return false;
        }
        if(cajaEdad.getText().toString().isEmpty()){
            cajaEdad.setError(getResources().getString(R.string.error_5));
            return false;
        }
        if(cajaSexo.getText().toString().isEmpty()){
            cajaSexo.setError(getResources().getString(R.string.error_6));
            return false;
        }
        return true;
    }
}
