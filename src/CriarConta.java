import java.net.StandardSocketOptions;

public class CriarConta {
    public static void main(String[] args) {


        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();
        CLiente scarlos = new CLiente();
      scarlos.cpf = "122212121";
        segundaConta.titular= scarlos;

        primeiraConta.saldo = 200;
        primeiraConta.saldo += 1000;
        primeiraConta.deposita(300);
        System.out.println(primeiraConta.saldo);
        primeiraConta.sacar(100);
        primeiraConta.sacar(200);
         segundaConta.deposita(1000);

        System.out.println(primeiraConta.saldo);
        segundaConta.numero = 1234234;

        primeiraConta.transferir(1000,segundaConta,primeiraConta);

       System.out.println("Saldo segunda conta"+segundaConta.saldo);
        System.out.println("Saldo primeira Conta"+primeiraConta.saldo);

        primeiraConta.titular = new CLiente();
        primeiraConta.titular.proficao = "programador";
        primeiraConta.titular.nome ="salomao santos";
        primeiraConta.titular.cpf = "333.333.444.5";



        System.out.println(primeiraConta.titular.nome +" "+ primeiraConta.titular.cpf +" "+ primeiraConta.titular.proficao);

        System.out.println(segundaConta.titular.cpf);


        





    }

}
