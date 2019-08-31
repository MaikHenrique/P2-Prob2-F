
public class OperacaoTranferencia extends Operacao {

    private ContaCorrente contraPartida;

    public OperacaoTranferencia(ContaCorrente conta, TipoOperacao tipo, double valor, ContaCorrente contraPartida) {
        super(conta, tipo, valor);
        this.contraPartida = contraPartida;
    }

    @Override
    public double retorno() {

        switch (getTipo()) {
            case ENTRADA:
                //getConta().receberTransferenciaPublico(getValor(), contraPartida);
                return getSaldoAnterior() + getValor();

            case SAIDA:
                return getSaldoAnterior() - getValor();

            default:
                return -1;
        }

    }

    public void setContraPartida(ContaCorrente contraPartida) {
        this.contraPartida = contraPartida;
    }

}
