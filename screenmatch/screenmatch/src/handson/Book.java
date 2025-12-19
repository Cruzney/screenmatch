package handson;

public class Book {
    private String title;
    private String autor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void show(){
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + autor);
    }
}
