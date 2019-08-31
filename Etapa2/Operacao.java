
import java.time.LocalDate;

public class Operacao {

    private double valor;
    private double saldoAnterior;
    private TipoOperacao tipo;
    private ContaCorrente conta;
    private LocalDate data;

    public Operacao(ContaCorrente conta, TipoOperacao tipo, double valor) {

        this.conta = conta;
        this.tipo = tipo;
        this.valor = valor;
        this.saldoAnterior = conta.getSaldo();
        this.data = LocalDate.now();

    }

    public double retorno() {

        switch (this.tipo) {
            case ENTRADA:
                return this.saldoAnterior + this.valor;

            case SAIDA:
                return this.saldoAnterior - this.valor;

            default:
                return -1;
        }

    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo) {
        this.tipo = tipo;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
