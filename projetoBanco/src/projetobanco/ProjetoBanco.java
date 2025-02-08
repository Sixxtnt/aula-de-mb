package projetobanco;

import javax.swing.JOptionPane;


public class ProjetoBanco {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
     Conta  conta = new Conta();
    conta.nome = JOptionPane.showInputDialog("Digite seu nome: ");
     
     //conta.nome = "Calerri";
    conta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Saldo inicial: "));
     
    conta.exibirSaldo();
     
     conta.depositar(50);
    
    conta.exibirSaldo();
    
    
    conta.sacar (200);
    
    conta.exibirSaldo();
    
    
    
    
    
    }
    
}
