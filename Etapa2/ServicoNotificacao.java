
import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ServicoNotificacao implements Observer {

    private Observable contaCorrente;
    
    
    public ServicoNotificacao (Observable contaCorrente){
        this.contaCorrente = contaCorrente;
        contaCorrente.addObserver(this);
        
    }
    
    @Override
    public void update(Observable o, Object o1) {
        
        if (o instanceof ContaCorrente){
            ContaCorrente contaCorrente = (ContaCorrente) o;
            //final Cliente cliente = contaCorrente.ge;
            System.out.println("Notifica serviço!!!");
            
        }
    }
    
    
    
    
}
