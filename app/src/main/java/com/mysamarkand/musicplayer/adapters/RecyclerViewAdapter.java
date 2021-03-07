package com.mysamarkand.musicplayer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mysamarkand.musicplayer.R;
import com.mysamarkand.musicplayer.models.SongModel;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<SongModel> songModelList;

    public RecyclerViewAdapter(Context context, List<SongModel> contactList) {
        this.context = context;
        this.songModelList = contactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.song_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SongModel songModel = songModelList.get(position);

        holder.songTitle.setText(songModel.getTitle());
        holder.songArtist.setText(songModel.getArtist());
    }

    @Override
    public int getItemCount() {
        return songModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView songTitle;
        public TextView songArtist;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            songTitle = itemView.findViewById(R.id.song_title);
            songArtist = itemView.findViewById(R.id.song_artist);
        }
    }
}
