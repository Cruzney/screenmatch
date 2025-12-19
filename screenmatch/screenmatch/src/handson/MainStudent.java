package handson;

public class MainStudent {
    public static void main(String[] args){
        double[] notasDoJoao = {8.5, 7.0, 9.5};
        double media = 0.0;

        Student student = new Student("Cruz",notasDoJoao);

        student.setName("Cruz");
        student.setAge(39);

        student.showInfo();
        media = student.calcMedia();
        System.out.println("Media das Notas: " + media);
    }
}
