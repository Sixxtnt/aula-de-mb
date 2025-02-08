package projetobanco;


public class Conta {

    String nome;
    double saldo;
    
    public void depositar (double valor){
        saldo += valor ;
        
        System.out.println("Operação de deposito no valor de R$: " + valor);
    }
    
    public void sacar (double valor){
        
        if(saldo > valor){
            
            saldo -= valor;
            System.out.println("Operção de saque foi um sucesso R$: " + valor);
            
        }else{
            
            System.out.println("Saldo insuficiente R$: " + saldo);
            
        }
        
        
        
        //System.out.println("Operação de sacar no valor de R$: " + valor);
        
    }


    public void exibirSaldo (){
        System.out.println(nome + " seu saldo é R$: " + saldo);
        
        
        
    }
    
    
}
