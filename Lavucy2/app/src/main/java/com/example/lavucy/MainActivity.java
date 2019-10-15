package com.example.lavucy;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.lavucy.Conexao.Conexao;
import com.firebase.ui.auth.AuthUI;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;


    private static final int MY_REQUEST_CODE = 7117;
    private Conexao con = new Conexao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                                    R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new home()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }


      //  showSignInOptions();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new home()).commit();
                break;
            case R.id.nav_client:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new client()).commit();
                break;
            case R.id.nav_product:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new product()).commit();
                break;
            case R.id.nav_stock:
                Toast.makeText(this,"Estoque",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_sales:
                Toast.makeText(this,"Vendas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_cashier:
                Toast.makeText(this,"Caixa",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_report:
                Toast.makeText(this,"Relatórios",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_request:
                Toast.makeText(this,"Pedidos",Toast.LENGTH_SHORT).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    private void showSignInOptions() {
        startActivityForResult(
                AuthUI.getInstance().createSignInIntentBuilder()
                        .setAvailableProviders(con.login()).setTheme(R.style.AppTheme)
                        .build(), MY_REQUEST_CODE
        );
    }

}
