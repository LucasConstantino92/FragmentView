package com.lcons.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lcons.fragments.R;


public class ContatosFragment extends Fragment {

    private TextView textContatos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);


        textContatos = view.findViewById(R.id.txt_contato);
        textContatos.setText("Contatos Alterados");

        return view;
    }
}