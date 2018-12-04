package com.example.valdemar.assistancecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loguin extends AppCompatActivity {
    private EditText CI, PSS;
    private Button LOGIN;
    private String ci, pss, cedula,contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);
        CI = (EditText)findViewById(R.id.CI);
        PSS = (EditText)findViewById(R.id.PSS);
        LOGIN = (Button)findViewById(R.id.Loguin);
    }
    public void InicioSesion(View View){
        cedula= CI.getText().toString();
        contraseña= PSS.getText().toString();
        ci="123";
        pss="lector";

        if (cedula.length()== 0) {
            Toast.makeText(this,"Ingrese Su CI", Toast.LENGTH_SHORT).show();
        }
        if (contraseña.length()== 0) {
            Toast.makeText(this,"Ingrese Su Contraseña", Toast.LENGTH_SHORT).show();
        }
        if( contraseña.compareTo(pss) == 0){
            if (cedula.compareTo(ci)==0){
                /*Intent adm = new Intent(this,Menu.class);
                startActivity(adm);
                finish();*/
                Toast.makeText(this, "Entro", Toast.LENGTH_SHORT).show();
            }else
                Toast.makeText(this, "Cedula De Identidad Incorrecta", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}
