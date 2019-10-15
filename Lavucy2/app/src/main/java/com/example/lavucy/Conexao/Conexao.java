package com.example.lavucy.Conexao;


import android.support.annotation.NonNull;
import com.example.lavucy.model.Cliente;
import com.firebase.ui.auth.AuthUI;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conexao {

    List <AuthUI.IdpConfig> providers;
    List<Cliente> clientes = new ArrayList<Cliente>();
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();


    public List<AuthUI.IdpConfig> login(){
        providers = Arrays.asList(
                new AuthUI.IdpConfig.EmailBuilder().build(),//Email Builder
                new AuthUI.IdpConfig.PhoneBuilder().build(),//Phone Builder
                // new AuthUI.IdpConfig.FacebookBuilder().build(),//Facebook Builder
                new AuthUI.IdpConfig.GoogleBuilder().build()//Google Builder
        );
        return providers;
    }

    public List<Cliente> getClientes(){
        database.child("Cliente").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dp : dataSnapshot.getChildren()){
                    Cliente cliente = dp.getValue(Cliente.class);
                    clientes.add(cliente);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        return clientes;
    }



}
