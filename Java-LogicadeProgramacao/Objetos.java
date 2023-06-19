package objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Objetos {

     public static void main(String[] args) {
         cadastraAluno();
     }
        
public static void cadastraAluno(){
    
        int qnt = Integer.parseInt(JOptionPane.showInputDialog
        ("Quantas pessoas deseja cadastrar?"));
        ArrayList<Aluno> lista = new ArrayList<>();
        for(int i = 0; i < qnt; i++){
            String nome = JOptionPane.showInputDialog
            ("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog
            ("Digite a idade de: "+nome));
            String cpf = JOptionPane.showInputDialog
            ("Digite o CPF de: "+nome);
            String matricula = JOptionPane.showInputDialog
            ("Digite a matricula de: "+nome);
            Aluno p = new Aluno(nome, idade, cpf, matricula);
            lista.add(p);
        }
        for(Aluno p:lista){
            JOptionPane.showMessageDialog(null,"Nome: "+p.getNome()+
             "\nIdade: "+p.getIdade()+"\nCPF: "+p.getCpf()+"\nMatricula: "+p.getMatricula());
        }
}
}
