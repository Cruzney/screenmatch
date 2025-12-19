package handson;

public class MainConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setTitular("João Silva");
        minhaConta.setNumero(12345);
        minhaConta.setAgencia(678);
        minhaConta.deposita(1000.0);

        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.println("Número da Conta: " + minhaConta.getNumero());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Saldo Inicial: " + minhaConta.getSaldo());

        minhaConta.saca(250.0);
        System.out.println("Saldo após saque de 250.0: " + minhaConta.getSaldo());

        minhaConta.saca(800.0); // Tentativa de saque com saldo insuficiente
        System.out.println("Saldo após tentativa de saque de 800.0: " + minhaConta.getSaldo());


    }
}
