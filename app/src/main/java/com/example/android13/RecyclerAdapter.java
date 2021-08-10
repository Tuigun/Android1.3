package com.example.android13;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private ArrayList<CountryModel> list = new ArrayList<>();

    public void setList(ArrayList<CountryModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item ,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView flag;
        private TextView country;
        private TextView Capital;


        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag_rv);
            country = itemView.findViewById(R.id.namecount_rv);
            Capital = itemView.findViewById(R.id.Capital_rv);
        }

        public void onBind(CountryModel countryModel) {

            flag.setImageResource(countryModel.getImg());
            country.setText(countryModel.getTxt());
            Capital.setText(countryModel.getCapital());
        }
    }
}
