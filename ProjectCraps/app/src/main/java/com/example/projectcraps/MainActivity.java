package com.example.projectcraps;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean PrimeiroTurno = true;
    int score = 0;

    public void jogarDados(View view){
        ImageView imagem1 = findViewById(R.id.d1);
        ImageView imagem2 = findViewById(R.id.d2);

        TextView txtResultado = findViewById(R.id.textoResultado);

        int d1= new Random().nextInt(6)+1;
        int d2= new Random().nextInt(6)+1;

        int soma = d1+d2;

        switch (d1){
            case 1: imagem1.setImageResource(R.drawable.face1);
                    break;
            case 2: imagem1.setImageResource(R.drawable.face2);
                    break;
            case 3: imagem1.setImageResource(R.drawable.face3);
                    break;
            case 4: imagem1.setImageResource(R.drawable.face4);
                    break;
            case 5: imagem1.setImageResource(R.drawable.face5);
                    break;
            case 6: imagem1.setImageResource(R.drawable.face6);
                    break;
        }
        switch (d2){
            case 1: imagem2.setImageResource(R.drawable.face1);
                break;
            case 2: imagem2.setImageResource(R.drawable.face2);
                break;
            case 3: imagem2.setImageResource(R.drawable.face3);
                break;
            case 4: imagem2.setImageResource(R.drawable.face4);
                break;
            case 5: imagem2.setImageResource(R.drawable.face5);
                break;
            case 6: imagem2.setImageResource(R.drawable.face6);
                break;
        }

        if (PrimeiroTurno){

            switch (soma){
                case 7:
                case 11:
                    txtResultado.setText("Voce ganhou\nVolte "+
                    "para a primeira jogada");
                    break;
                case 2:
                case 3:
                case 12:
                    txtResultado.setText("Voce perdeu\nVolte "+
                            "para a primeira jogada");
                    break;
                 default:
                     score=soma;
                     PrimeiroTurno=false;
                     txtResultado.setText("Pontos: "+ score );
            }//fim switch
        }//fimprimeiroT
        else {
            if (soma==score){
                txtResultado.setText("Voce ganhou\nVolte "+
                        "para o inicio");
                PrimeiroTurno=true;
            }
            else if (soma==7){
                txtResultado.setText("Voce perdeu\nVolte "+
                        "para o inicio");
                PrimeiroTurno=true;
            }
        }

    }
}
