package com.example.rain.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rain.Model_App;
import com.example.rain.R;

import java.util.List;

public class Contact_appchat_adapter extends RecyclerView.Adapter<Contact_appchat_adapter.ViewHolder> {
    Context context;
    List<Model_App> uData;

    public Contact_appchat_adapter(Context context, List<Model_App> uData) {
        this.context = context;
        this.uData = uData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_app_list,parent,false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model_App model_app = uData.get(position);
        holder.imageViewAI.setImageResource(model_app.getImg());
        holder.textViewAN.setText(model_app.getAppName());
        holder.textViewAC.setText(model_app.getAppCategory());

    }

    @Override
    public int getItemCount() {
        return uData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewAI;
        public TextView textViewAN;
        public TextView textViewAC;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewAI = itemView.findViewById(R.id.appIcon);
            textViewAN = itemView.findViewById(R.id.appName);
            textViewAC = itemView.findViewById(R.id.appCategory);

        }
    }
}
