package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alcoolougasolina.R;

public class MainActivity extends AppCompatActivity {

    EditText edAlcool, edGasolina;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edAlcool = findViewById(R.id.edAlcool);
        edGasolina = findViewById(R.id.edGasolina);
        textResult = findViewById(R.id.textResult );
    }

    public void Calculo (View view) {

        double Alcool = Double.parseDouble(edAlcool.getText().toString());
        double Gasolina = Double.parseDouble(edGasolina.getText().toString());
        double Resultado;

        Resultado = Alcool / Gasolina;

        if (Resultado < 0.7) {
            textResult.setText("Álcool é a melhor opção para abastecer !");
        } else {
            textResult.setText("Gasolina é a melhor opção para abastecer !");
        }

    }
}
