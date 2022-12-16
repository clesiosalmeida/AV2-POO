package Ex01_Banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(null, 123, 123, 1200.00, 0);

        System.out.println("Saldo "+cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca(null, 1234, 123, 2000, 5.0);
        System.out.println("Saldo: "+cp1.getSaldo());

        cp1.calcularRendimento();
        System.out.println("Saldo rendimento: "+cp1.getSaldo());
    }
}
