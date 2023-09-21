public class Conta {


    double saldo;
    int agencia;
    int numero;
    CLiente titular;

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado no valor de " +valor);

    }

    public boolean sacar(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado no valor de " + valor);
            return true;

        } else
            System.out.println("Sem saldo " +"seu saldo é "+ saldo+ " seu saque seria de " + valor);
            return false;
    }
    public boolean transferir (double valor , Conta destino, Conta origem){
        if (this.saldo >= valor){
            origem.sacar(valor);
            destino.deposita(valor);
            System.out.println("transferencia realizada");
            return true;

        }return false;



    }

}
