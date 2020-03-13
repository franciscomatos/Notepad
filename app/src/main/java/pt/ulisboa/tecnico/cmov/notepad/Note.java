package pt.ulisboa.tecnico.cmov.notepad;

public class Note {
    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /* getters */
    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    /* setters */

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
