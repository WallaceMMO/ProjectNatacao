package com.example.projectnatacao;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.Calendar;

public class FragmentAtletaOutro extends Fragment {

    EditText txtNome, txtDataNascimento, txtBairro, txtAcademia, txtRecorde;
    Button btnCadastrar;
    Calendar calendario;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_atleta_outro, container, false);

        txtNome = view.findViewById(R.id.txtNome);
        txtDataNascimento = view.findViewById(R.id.txtDataNascimento);
        txtBairro = view.findViewById(R.id.txtBairro);
        txtAcademia = view.findViewById(R.id.txtAcademia);
        txtRecorde = view.findViewById(R.id.txtRecorde);
        btnCadastrar = view.findViewById(R.id.btnCadastrar);

        calendario = Calendar.getInstance();

        txtDataNascimento.setInputType(InputType.TYPE_NULL);
        txtDataNascimento.setOnClickListener(v -> {
                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH);
                int ano = calendario.get(Calendar.YEAR);

                DatePickerDialog datePicker = new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker view, int anoSelecionado, int mesSelecionado, int diaSelecionado) {
                        txtDataNascimento.setText(String.format("%02d/%02d/%04d", diaSelecionado, mesSelecionado + 1, anoSelecionado));
                    }
                }, ano, mes, dia);
                datePicker.show();
        });

        btnCadastrar.setOnClickListener(v -> {
                String nome = txtNome.getText().toString();
                String dataNascimento = txtDataNascimento.getText().toString();
                String bairro = txtBairro.getText().toString();
                String academia = txtAcademia.getText().toString();
                double recorde = Double.parseDouble(txtRecorde.getText().toString());

                AtletaOutro atleta = new AtletaOutro(nome, dataNascimento, bairro, academia, recorde);

                Toast.makeText(view.getContext(), atleta.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
