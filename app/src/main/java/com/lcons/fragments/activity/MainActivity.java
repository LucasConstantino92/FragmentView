package com.lcons.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lcons.fragments.R;
import com.lcons.fragments.fragment.ContatosFragment;
import com.lcons.fragments.fragment.ConversaFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnConversa, btnContato;
    private ConversaFragment conversaFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConversa = findViewById(R.id.btn_conversas);
        btnContato = findViewById(R.id.btn_contatos);

        //Remover Sombra ActionBar
        getSupportActionBar().setElevation(0);

        conversaFragment = new ConversaFragment();


        //Configurar objeto para o Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, conversaFragment);
        transaction.commit();

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatosFragment = new ContatosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, contatosFragment);
                transaction.commit();
            }
        });

        btnConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversaFragment = new ConversaFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, conversaFragment);
                transaction.commit();
            }
        });
    }
}