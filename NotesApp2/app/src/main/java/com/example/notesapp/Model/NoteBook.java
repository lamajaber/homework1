package com.example.notesapp.Model;

public class NoteBook {
    private String titile;
    private int imge;

    public NoteBook() {
    }

    public NoteBook(String titile, int imge) {
        this.titile = titile;
        this.imge = imge;
    }


    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public int getImge() {
        return imge;
    }

    public void setImge(int imge) {
        this.imge = imge;
    }
}
