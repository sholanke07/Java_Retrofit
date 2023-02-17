package com.lateef.myjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>  {

    Context context;
    //private final ArrayList<Post> posts;
    List<Post> posts;

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_name, viewGroup, false);

        return new PostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder viewHolder, final int position) {
        Post list = posts.get(position);

        viewHolder.mTvId.setText(String.valueOf(list.getId()));
        viewHolder.mTvUserId.setText(String.valueOf(list.getUserId()));
        viewHolder.mTvTitle.setText(String.valueOf(list.getTitle()));
        viewHolder.mTvText.setText(String.valueOf(list.getText()));

    }

    public PostAdapter(Context context, List<Post> nameList) {
        this.posts = nameList;
        this.context = context;
    }


    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTvId, mTvUserId, mTvTitle, mTvText;

        public ViewHolder(View view) {
            super(view);

            mTvId = view.findViewById(R.id.tvId);
            mTvUserId = view.findViewById(R.id.tvUserId);
            mTvTitle = view.findViewById(R.id.tvTitle);
            mTvText = view.findViewById(R.id.tvText);
        }
    }

}
