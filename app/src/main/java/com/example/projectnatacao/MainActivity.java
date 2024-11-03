/*
 *@author:<Wallace Moura Machado de Oliveira;1110482413004>
 */
package com.example.projectnatacao;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    Fragment fragmentAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        carregarFragmento(new FragmentAtletaJuvenil());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_juvenil) {
            carregarFragmento(new FragmentAtletaJuvenil());
            return true;
        } else if (id == R.id.menu_senior) {
            carregarFragmento(new FragmentAtletaSenior());
            return true;
        } else if (id == R.id.menu_outro) {
            carregarFragmento(new FragmentAtletaOutro());
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void carregarFragmento(Fragment fragment) {
        fragmentAtual = fragment;
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}
