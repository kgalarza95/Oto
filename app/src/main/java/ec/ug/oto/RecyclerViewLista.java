package ec.ug.oto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ec.ug.oto.entidad.ItemUsuario;
import ec.ug.oto.util.ListAdapter;

public class RecyclerViewLista extends AppCompatActivity {

    List<ItemUsuario> litUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_lista);

        init();
    }

    public void init(){
        litUsuarios = new ArrayList<>();
        litUsuarios.add(new ItemUsuario("KEVIN","GALARZA"));
        litUsuarios.add(new ItemUsuario("KEVIN","GALARZA"));
        litUsuarios.add(new ItemUsuario("KEVIN","GALARZA"));
        litUsuarios.add(new ItemUsuario("KEVIN","GALARZA"));
        litUsuarios.add(new ItemUsuario("KEVIN","GALARZA"));
        litUsuarios.add(new ItemUsuario("KEVIN","GALARZA"));
        litUsuarios.add(new ItemUsuario("KEVIN","GALARZA"));

        ListAdapter listAdapter = new ListAdapter(litUsuarios, this);
        RecyclerView recyclerView = findViewById(R.id.mySegmentoRecyVi);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}