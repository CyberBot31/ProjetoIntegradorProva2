class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;        
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Conta " + this.numero + " criada");
        //System.out.println("O total de contas nesta agência é " + Conta.total);
    }

    public void deposita(int i) {
        this.saldo += i;
    }

    public boolean saca(Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public Double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Não é possível valores negativos");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não é possível valores negativos");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public void saldo(double d) {
    }

}
