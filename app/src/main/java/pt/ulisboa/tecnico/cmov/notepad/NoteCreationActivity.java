package pt.ulisboa.tecnico.cmov.notepad;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class NoteCreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_creation);

    }

    public void okButtonClick(View view) {
        EditText titleEditText = (EditText) findViewById(R.id.create_title);
        EditText contentEditText = (EditText) findViewById(R.id.create_content);

        String title = titleEditText.getText().toString();
        String content = contentEditText.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("content", content);
        startActivity(intent);
    }

    public void cancelButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
