package com.ahmedsobhy.facebookv2.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmedsobhy.facebookv2.R;
import com.ahmedsobhy.facebookv2.pojo.PostModel;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    // el data gaya mnen
    private List<PostModel> postList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        /*
        holder.el text eli gay mn ta7t .settext(numberList.get(position).getName)
         */
        holder.titleTV.setText(postList.get(position).getTitle());
        holder.userTV.setText(postList.get(position).getUserId()+"");
        holder.bodyTV.setText(postList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public void setPostList(List<PostModel> postList) {
        this.postList=postList;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        // baktb eli mawgod fil list number

        TextView titleTV,userTV,bodyTV;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            /*
             esm eli 3rfto w b3den a3ml pass ll id bas abl findviewbyid ha3ml itemView
             */
            titleTV = itemView.findViewById(R.id.titleTV);
            userTV = itemView.findViewById(R.id.userIDTV);
            bodyTV = itemView.findViewById(R.id.bodyTV);

        }
    }
}
/*
titleTV
userIDTV
bodyTV

 */