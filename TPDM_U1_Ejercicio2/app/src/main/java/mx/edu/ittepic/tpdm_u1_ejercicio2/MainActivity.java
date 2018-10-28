package mx.edu.ittepic.tpdm_u1_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensajeGoogle(View v){
        Toast.makeText(MainActivity.this, "La red social que nunca fue", Toast.LENGTH_LONG).show();
    }



}
