public class ContaInvestimento extends Conta {

    public ContaInvestimento(int agencia, int numero) {
        super(agencia, numero);
    
    }
        public double rendimentoInvestimento() {
            saldo =  saldo * 0.10 + saldo;
            return saldo;
        }
    
        @Override
        public boolean saca(Double valor) {
            return super.saca(valor);
        }
    }
