package com.example.rain.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rain.Case;
import com.example.rain.R;

import java.util.List;

public class Case_view_adapter extends RecyclerView.Adapter<Case_view_adapter.MyViewHolder>{
    Context mContext ;
    private List<Case> caseList;
    private OnCaseListener onCaseListener;
    public Case_view_adapter(Context mContext, List<Case>caseList, OnCaseListener onCaseListener){
        this.mContext=mContext;
        this.caseList=caseList;
        this.onCaseListener = onCaseListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.caserow,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v,onCaseListener);



        return vHolder ;
    }




    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_tit.setText(caseList.get(position).getTit());
        holder.tv_des.setText(caseList.get(position).getDes());
        holder.tv_con.setText(caseList.get(position).getCon());
    }

    @Override
    public int getItemCount()  {
        return caseList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {
        public LinearLayout item_case;
        public TextView tv_tit;
        public TextView tv_des;
        public TextView tv_con;
        OnCaseListener onCaseListener;
        public MyViewHolder(@NonNull View itemView,OnCaseListener onCaseListener) {
            super(itemView);
            item_case = itemView.findViewById(R.id.item_case);
            tv_tit = itemView.findViewById(R.id.tit);
            tv_des = itemView.findViewById(R.id.des);
            tv_con = itemView.findViewById(R.id.con);
            this.onCaseListener = onCaseListener;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            onCaseListener.onCaseClick(getAdapterPosition());
        }
    }
    public interface OnCaseListener{
        void onCaseClick(int position);
    }
}
