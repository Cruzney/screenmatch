package handson;

public class AgePeople {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public String isAdult(){
       if(age >= 18){
           return "Adulto";
       } else {
           return "Criança";
       }
   }
}
