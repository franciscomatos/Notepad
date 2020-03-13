package pt.ulisboa.tecnico.cmov.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private NoteTitleAdapter noteTitleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GlobalState state = (GlobalState) getApplicationContext();

        Intent intent = getIntent();
        if(intent.getStringExtra("title") != null) {
            String title = intent.getStringExtra("title");
            String content = intent.getStringExtra("content");
            Note note = new Note(title, content);

            state.addNote(note);
        }


        this.listView = (ListView) findViewById(R.id.list_view);
        this.noteTitleAdapter = new NoteTitleAdapter(this, state.getNotes());
        this.listView.setAdapter(noteTitleAdapter);

    }

    public void goTocreateNote(View view) {
        Intent intent = new Intent(this, NoteCreationActivity.class);
        startActivity(intent);
    }

    public void goToReadNote(View view) {
        int pos = this.listView.getPositionForView(view);
        GlobalState state = (GlobalState) getApplicationContext();
        Note note = state.getNote(pos);
        Intent intent = new Intent(this, NoteReadActivity.class);
        intent.putExtra("title", note.getTitle());
        intent.putExtra("content", note.getContent());
        startActivity(intent);
    }
}
