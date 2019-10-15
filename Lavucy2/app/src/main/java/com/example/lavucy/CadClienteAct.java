package com.example.lavucy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.lavucy.Conexao.Conexao;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.lavucy.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CadClienteAct extends AppCompatActivity {
    EditText nome,telefone,endereco, observacao;
    ListView listCliente;
    Button cadastrar;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Conexao con = new Conexao();
    private List<Cliente> listcli = new ArrayList<Cliente>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_cliente);
        nome = (EditText)findViewById(R.id.txtNome);
        telefone = (EditText)findViewById(R.id.txtTelefone);
        endereco = (EditText)findViewById(R.id.txtEndereco);
        observacao = (EditText)findViewById(R.id.txtObs);
        cadastrar = (Button)findViewById(R.id.btnCadastrar);

        inicializarFirebase();

    }


    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("Cliente");

        final Cliente cliente = new Cliente();
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cliente.setId(UUID.randomUUID().toString());
                cliente.setNome(nome.getText().toString());
                cliente.setEndereco(endereco.getText().toString());
                cliente.setTelefone(telefone.getText().toString());
                cliente.setObs(observacao.getText().toString());
                databaseReference.child(cliente.getId()).setValue(cliente);

            }
        });

    }



}
