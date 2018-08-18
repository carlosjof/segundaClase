package com.example.carlosjof.cursosavnz2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyRecycleItemViewHolder> {

    private ArrayList<MarcaCarros> carros;
    private Context context;

    public MyRecycleAdapter(ArrayList<MarcaCarros> carros, Context context) {
        this.carros = carros;
        this.context = context;
    }

    public int getItemViewType(int position) {
        if (position == 0)
            return R.layout.header;

        else if (position % 2 == 0)
            return R.layout.middle;

        else
            return R.layout.normal;

    }

    @NonNull
    @Override
    public MyRecycleItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(viewType, parent, false);
        MyRecycleItemViewHolder holder = new MyRecycleItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleItemViewHolder holder, int position) {

        final MarcaCarros marcaCarros = this.carros.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, marcaCarros.getMarca(), Toast.LENGTH_SHORT).show();
            }
        });
        TextView txtMarca = holder.itemView.findViewById(R.id.txtMarca);
        TextView txtPais = holder.itemView.findViewById(R.id.txtPais);
        holder.txtMarca.setText(carros.get(position).getMarca());
        /*txtMarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, marcaCarros.getMarca(), Toast.LENGTH_SHORT).show();
            }
        });*/
        holder.txtPais.setText(carros.get(position).getPais());
    }

    @Override
    public int getItemCount() {
        return carros.size();
    }

    public static class MyRecycleItemViewHolder extends RecyclerView.ViewHolder {
        public TextView txtMarca;
        public TextView txtPais;

        public MyRecycleItemViewHolder(View itemView) {
            super(itemView);
            txtMarca = itemView.findViewById(R.id.txtMarca);
            txtPais = itemView.findViewById(R.id.txtPais);

        }
    }
}
