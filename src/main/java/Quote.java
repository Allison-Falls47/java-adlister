import java.io.Serializable;

public class Quote implements Serializable {
    private int id;
    private String content;
    private Author author;

    public Quote(){
    }

    public Quote(int id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }



}

