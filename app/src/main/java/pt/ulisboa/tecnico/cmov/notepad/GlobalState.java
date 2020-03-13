package pt.ulisboa.tecnico.cmov.notepad;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class GlobalState extends Application {
    private List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public Note getNote(int index) {
        return notes.get(index);
    }
}
