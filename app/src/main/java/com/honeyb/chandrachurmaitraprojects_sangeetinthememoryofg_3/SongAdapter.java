package com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.myViewHolder>
{
    String[] data;

    public SongAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.default_song_layout,
                parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position)
    {
        holder.songTitle.setText(data[position]);
    }

    @Override
    public int getItemCount()
    {
        return data.length;
    }

    public static class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView songTitle;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            songTitle = itemView.findViewById(R.id.TVSongTitle);
        }
    }
}
