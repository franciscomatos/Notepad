package pt.ulisboa.tecnico.cmov.notepad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NoteTitleAdapter extends ArrayAdapter<Note> {
    private List<Note> notes = new ArrayList<>();
    private Context nContext;

    public NoteTitleAdapter(Context context ,List<Note> list) {
        super(context,0, list);
        nContext = context;
        notes = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(nContext).inflate(R.layout.note_title,parent,false);

        Note currentNote = notes.get(position);

/*
        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentMovie.getmImageDrawable());
*/

        TextView title = (TextView) listItem.findViewById(R.id.list_item_title);
        title.setText(currentNote.getTitle());

/*        TextView content = (TextView) listItem.findViewById(R.id.content);
        content.setText(currentNote.getContent());*/

        return listItem;
    }
}
