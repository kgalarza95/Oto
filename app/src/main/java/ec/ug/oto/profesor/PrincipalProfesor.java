package ec.ug.oto.profesor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ec.ug.oto.R;

public class PrincipalProfesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_profesor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_prof, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemIdex = item.getItemId();
        if (itemIdex == R.id.item_usuarios){
            Toast.makeText(this, "Usuarios", Toast.LENGTH_SHORT).show();
        }else if (itemIdex == R.id.item_noticias){
            Toast.makeText(this, "Noticias", Toast.LENGTH_SHORT).show();
        }else if (itemIdex == R.id.item_home){
            Toast.makeText(this, "Nosotros", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}