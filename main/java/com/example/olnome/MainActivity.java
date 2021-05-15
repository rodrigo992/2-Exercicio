package com.example.olnome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bt;
    EditText et_nome, et_sobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv_olanome);
        bt = findViewById(R.id.bt_ok);
        et_nome = findViewById(R.id.et_nome);
        et_sobrenome = findViewById(R.id.et_sobrenome);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = et_nome.getText().toString();
                String sobrenome = et_sobrenome.getText().toString();
                if(nome.isEmpty() || sobrenome.isEmpty())
                {
                    tv.setText("Nome não inserido");
                } else
                tv.setText("Olá " + nome + " " + sobrenome );
            }
        });

    }
}