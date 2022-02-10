package com.lukssds.pedrapapeloutesoura;

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

    public void selecionarPedra(View view) {
        this.opcaoSelecionada("pedra");

    }

    public void selecionarPapel(View view) {
        this.opcaoSelecionada("papel");

    }

    public void selecionarTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada) {

        int numero = new Random().nextInt(3);
        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];


        switch (opcaoApp) {
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
                        (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                        (opcaoApp == "pedra" && opcaoSelecionada == "tesoura")
        ) {
            textResultado.setText("Você Perdeu ! :( ");
        } else if (
                (opcaoApp == "tesoura" && opcaoSelecionada == "pedra") ||
                        (opcaoApp == "papel" && opcaoSelecionada == "tesoura") ||
                        (opcaoApp == "pedra" && opcaoSelecionada == "papel")
        ) {
            textResultado.setText("Você Ganhou !");
        } else {
            textResultado.setText("Empatamos!!!");
        }
        System.out.println("item selecionado:" + opcaoApp);
    }

}