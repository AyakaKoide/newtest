package com.example.memo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {

    private List<Note> noteList;

    public static class NoteViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewNote;

        public NoteViewHolder(View view) {
            super(view);
            textViewNote = view.findViewById(R.id.textViewNote);
        }
    }

    public NoteAdapter(List<Note> noteList) {
        this.noteList = noteList;
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_note, parent, false);
        return new NoteViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        Note note = noteList.get(position);
        holder.textViewNote.setText(note.getText());
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }
}
