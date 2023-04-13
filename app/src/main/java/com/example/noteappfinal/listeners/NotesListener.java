package com.example.noteappfinal.listeners;

import com.example.noteappfinal.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
