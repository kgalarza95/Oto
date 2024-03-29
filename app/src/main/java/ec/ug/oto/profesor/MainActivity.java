package ec.ug.oto.profesor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ec.ug.oto.R;
import ec.ug.oto.estudiante.LoginEstudiante;
import ec.ug.oto.profesor.LoginProfesor;

public class MainActivity extends AppCompatActivity {

    Button btnProfesor;
    Button btnEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfesor = findViewById(R.id.btn_profesor);
        btnEstudiante = findViewById(R.id.btn_estudiane);


        btnProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), LoginProfesor.class));
            }
        });

        btnEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), LoginEstudiante.class));
            }
        });
    }

    @Override
    public void onBackPressed(){//bloquear retroceder
    }
}