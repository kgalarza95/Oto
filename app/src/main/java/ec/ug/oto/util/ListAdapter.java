package ec.ug.oto.util;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ec.ug.oto.R;
import ec.ug.oto.entidad.ItemUsuario;

//importante que se llame "ListAdapter" para que funcione el adpatador
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    public List<ItemUsuario> listUsuarios;
    public LayoutInflater layoutInflater;
    public Context context;

    public ListAdapter() {

    }

    public ListAdapter(List<ItemUsuario> listUsuarios, Context context) {
        this.listUsuarios = listUsuarios;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_rv_card_view, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, int position) {
        holder.bindData(listUsuarios.get(position));
    }

    @Override
    public int getItemCount() {
        return listUsuarios.size();
    }

    public void setItem(List<ItemUsuario> listUsuarios){
        this.listUsuarios = listUsuarios;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.imageView3);
        }

        void bindData(final  ItemUsuario itemCv){
            //iv
            //aqui van los valores a modificar el card view,
            //los texttos y demas.
        }
    }
}
