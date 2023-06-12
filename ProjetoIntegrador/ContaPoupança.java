public class ContaPoupança extends Conta{
    
    public ContaPoupança(int agencia, int numero) {
        super(agencia, numero);
        //TODO Auto-generated constructor stub
    }

    public double rendimentoPoupança() {
        saldo = saldo * 0.02 + saldo;
        return saldo;
    }

    @Override
    public boolean saca(Double valor) {
        return super.saca(valor);
    }
}
