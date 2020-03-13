package pt.ulisboa.tecnico.cmov.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class NoteReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_read);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String content = intent.getStringExtra("content");

        TextView titleView = (TextView) findViewById(R.id.read_title);
        titleView.setText(title);

        TextView contentView = (TextView) findViewById(R.id.read_content);
        contentView.setText(content);
    }
}
