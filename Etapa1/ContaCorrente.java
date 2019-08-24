package notobserver;

public class ContaCorrente {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;

    public ContaCorrente(int numero, int agencia, Cliente cliente) {

        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = 0;

    }

    //Cliente João, Conta 1-12345, Saque de 500.0 -Serviço de Análise de Fluxo de Caixa
    //System.out.println("Cliente " + cliente.getNome() + ", Conta " + numero + ", Saque de " + valor + "-Serviço de Análise de Fluxo de Caixa")
    public void sacar(double valor) {

        Operacao operacao = new Operacao(this, TipoOperacao.SAIDA, valor);
        System.out.println("O cliente sacou " + valor + "/nConta Corrente atual: " + operacao.retorno());
    }

    public void depositar(double valor) {

        Operacao operacao = new Operacao(this, TipoOperacao.ENTRADA, valor);
        System.out.println("O cliente depositou " + valor + "/nConta Corrente atual: " + operacao.retorno());
    }

    public void transferir(double valor, ContaCorrente contaDestino) {

        Operacao operacao = new Operacao(this, TipoOperacao.SAIDA, valor);
        System.out.println("O cliente transferiu " + valor + " para " + contaDestino + "/nConta Corrente atual: " + operacao.retorno());
    }

    private void receberTransferencia(double valor, ContaCorrente origem) {

        Operacao operacao = new Operacao(this, TipoOperacao.ENTRADA, valor);
        System.out.println("notobserver.ContaCorrente.receberTransferencia()");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
