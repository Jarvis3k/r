package com.example.rain.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rain.Model_Contact;
import com.example.rain.R;

import java.util.List;

public class Contact_chat_adapter extends RecyclerView.Adapter<Contact_chat_adapter.ViewHolder> {
    Context context;
    List<Model_Contact> uData;

    public Contact_chat_adapter(Context context, List<Model_Contact> uData) {
        this.context = context;
        this.uData = uData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_contact_list,parent,false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model_Contact model_contact = uData.get(position);
        holder.imageViewDP.setImageResource(model_contact.getImg());
        holder.textViewFN.setText(model_contact.getFirstName());
        holder.textViewLN.setText(model_contact.getLastName());
        holder.textViewCN.setText(model_contact.getCompanyName());
        holder.textViewGP.setText(model_contact.getGroup());
    }

    @Override
    public int getItemCount() {
        return uData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewDP;
        public TextView textViewFN;
        public TextView textViewLN;
        public TextView textViewCN;
        public TextView textViewGP;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewDP = itemView.findViewById(R.id.userImage);
            textViewFN = itemView.findViewById(R.id.firstName);
            textViewLN = itemView.findViewById(R.id.lastName);
            textViewCN = itemView.findViewById(R.id.companyName);
            textViewGP = itemView.findViewById(R.id.group);
        }
    }
}
