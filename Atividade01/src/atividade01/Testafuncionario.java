
package atividade01;


public class Testafuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario (12345,"Joao", Funcionario.sexo_masculino, 1000);
        System.out.println(funcionario.getMatricula()+ "-" + funcionario.getNome() + "-" + funcionario.getSexo() + "-"+ funcionario.getSalario());
    }
}
