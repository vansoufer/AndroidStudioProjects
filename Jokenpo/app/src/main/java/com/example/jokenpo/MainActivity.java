package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

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
    public  void jogar(View view){


        ImageView papel =findViewById(R.id.papel);
        ImageView pedra = findViewById(R.id.pedra);
        ImageView tesoura = findViewById(R.id.tesoura);
        ImageView player1 = findViewById(R.id.player1);
        ImageView player2 = findViewById(R.id.player2);

        TextView textoResultado = findViewById(R.id.textoResultado);

        int jogador = new Random().nextInt(9)+1;

        switch (jogador){

            case 1:
                player1.setImageResource(R.drawable.papel);
                player2.setImageResource(R.drawable.pedra);
                textoResultado.setText("Você ganhou !!");
                break;
            case 2:
                player1.setImageResource(R.drawable.papel);
                player2.setImageResource(R.drawable.papel);
                textoResultado.setText("Você empatou !!");
                break;
            case 3:
                player1.setImageResource(R.drawable.papel);
                player2.setImageResource(R.drawable.tesoura);
                textoResultado.setText("Você perdeu !!");
                break;
            case 4:
                player1.setImageResource(R.drawable.tesoura);
                player2.setImageResource(R.drawable.tesoura);
                textoResultado.setText("Você empatou !!");
            case 5:
                player1.setImageResource(R.drawable.pedra);
                player2.setImageResource(R.drawable.pedra);
                textoResultado.setText("Você empatou !!");
                break;
            case 6:
                player1.setImageResource(R.drawable.pedra);
                player2.setImageResource(R.drawable.papel);
                textoResultado.setText("Você perdeu !!");
                break;
            case 7:
                player1.setImageResource(R.drawable.pedra);
                player2.setImageResource(R.drawable.tesoura);
                textoResultado.setText("Você ganhou !!");
                break;
            case 8:
                player1.setImageResource(R.drawable.tesoura);
                player2.setImageResource(R.drawable.pedra);
                textoResultado.setText("você perdeu !!");
                break;
            case 9:
                player1.setImageResource(R.drawable.tesoura);
                player2.setImageResource(R.drawable.papel);
                textoResultado.setText("Você ganhou !!");
                break;
        }
    }


}
