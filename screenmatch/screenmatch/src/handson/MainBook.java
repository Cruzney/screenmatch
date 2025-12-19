package handson;

public class MainBook {
    public static void main(String[] args) {
        Book bookone = new Book();

        bookone.setAutor("Arthur Can Dolly");
        bookone.setTitle("Sherlock Holmes");

        System.out.println("Infos Book");
        bookone.show();


    }
}
