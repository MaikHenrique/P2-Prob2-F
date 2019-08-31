
import java.util.ArrayList;
import java.util.Observable;

public class ContaCorrente extends Observable{

    //lista de servicos
    
    public ArrayList<Object> servico = new ArrayList();
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

    public void addServico(Object serv){
        servico.add(serv);
        notifyObservers();
    }
    
    public void removeServico (Object serv){
        servico.remove(serv);
        notifyObservers();
    }
    
    //Cliente João, Conta 1-12345, Saque de 500.0 -Serviço de Análise de Fluxo de Caixa
    //System.out.println("Cliente " + cliente.getNome() + ", Conta " + numero + ", Saque de " + valor + "-Serviço de Análise de Fluxo de Caixa")
    public void sacar(double valor) {

        Operacao operacao = new Operacao(this, TipoOperacao.SAIDA, valor);
        this.saldo = operacao.retorno();
        System.out.println("O cliente sacou R$" + valor + "/nConta Corrente atual: R$" + this.saldo);

    }

    public void depositar(double valor) {

        Operacao operacao = new Operacao(this, TipoOperacao.ENTRADA, valor);
        this.saldo = operacao.retorno();
        System.out.println("O cliente depositou R$" + valor + "/nConta Corrente atual: R$" + this.saldo);
    }

    public void transferir(double valor, ContaCorrente contaDestino) {

        OperacaoTranferencia operacao = new OperacaoTranferencia(this, TipoOperacao.SAIDA, valor, contaDestino);
        this.saldo = operacao.retorno();
        System.out.println("O cliente transferiu R$" + valor + " para " + contaDestino + "/nConta Corrente atual: R$" + this.saldo);
    }

    private void receberTransferencia(double valor, ContaCorrente origem) {

        Operacao operacao = new Operacao(this, TipoOperacao.ENTRADA, valor);
        this.saldo = operacao.retorno();
        System.out.println("notobserver.ContaCorrente.receberTransferencia()");
    }

    
    
    public void receberTransferenciaPublico(double valor, ContaCorrente origem) {

        receberTransferencia(valor, origem);

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
