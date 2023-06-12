public class Teste {
        public static void main(String[] args) {

            ContaCorrente cc = new ContaCorrente(0, 0);
            cc.deposita(100);

            ContaPoupança cp = new ContaPoupança(0, 0);
            cp.deposita(300);
            cp.rendimentoPoupança();

            ContaInvestimento ci = new ContaInvestimento(0, 0);
            ci.deposita(200);
            ci.rendimentoInvestimento();

        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());
        System.out.println("Conta Investimento: " + ci.getSaldo());


    }

}
