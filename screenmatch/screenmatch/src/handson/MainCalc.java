package handson;

public class MainCalc {
    public static void main(String[] args) {

        CalcDouble calculadora = new CalcDouble();
        int resultado = calculadora.dobrarNumero(25);
        System.out.println(resultado);
    }
}
