package com.example.rechatv2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    private final Person[] localDataset;
    private Context context;

    public ChatAdapter(Context c, Person[] dataset) {
        context = c;
        localDataset = dataset;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_view_item,
                parent, false);
        return new ChatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        holder.getChatAvatar().setImageDrawable(localDataset[0].getAvatar());
        holder.getChatName().setText(localDataset[0].getName());
        holder.getLastChatTime().setText(localDataset[0].getLastChatTime());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ItemAcitivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return localDataset.length;
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        private final ImageView mChatAvatar;
        private final TextView mChatName;
        private final TextView mLastChatTime;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            mChatAvatar = itemView.findViewById(R.id.ChatAvatar);
            mChatName = itemView.findViewById(R.id.ChatName);
            mLastChatTime = itemView.findViewById(R.id.LastChatTime);
        }

        public ImageView getChatAvatar() {
            return mChatAvatar;
        }

        public TextView getChatName() {
            return mChatName;
        }

        public TextView getLastChatTime() {
            return mLastChatTime;
        }
    }

}

