package br.com.frsiqueira.meusgastos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNewSpense(View view) {
        //TODO: chama a activity de criar um gasto
        Intent intent = new Intent(this, SpenceActivity.class);
        startActivity(intent);
    }
}
