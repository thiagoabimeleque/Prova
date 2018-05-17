package com.example.tabimeleque.prova;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    public Button btSomar;
    public EditText edCalcular;
    public EditText edResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edCalcular = (EditText) findViewById(R.id.txtQtd);
        edResultado = (EditText) findViewById(R.id.editText4);
        Button btnCalcular1 = (Button) findViewById(R.id.btnCalcular);
        btnCalcular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble((edCalcular.getText().toString()));
                double resultado = (36000 * num1) / 290;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado");
                dialogo.setMessage("Soma: " + resultado);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();

                //String res = String.valueOf(resultado);

                edResultado.setText(String.valueOf(resultado));
            }
        });
    }

}
