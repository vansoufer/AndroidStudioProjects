package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void memeApp(View view){

        ImageView imageMeme = findViewById(R.id.imagem);

        int memeApp = new Random().nextInt(6)+1;

        switch (memeApp) {
            case 1: imageMeme.setImageResource(R.drawable.i1);
                break;
            case 2: imageMeme.setImageResource(R.drawable.i2);
                break;
            case 3: imageMeme.setImageResource(R.drawable.i3);
                break;
            case 4: imageMeme.setImageResource(R.drawable.i4);
                break;
            case 5: imageMeme.setImageResource(R.drawable.i5);
                break;
            case 6: imageMeme.setImageResource(R.drawable.i6);
                break;
        }
    }//fim do método memeApp

}
