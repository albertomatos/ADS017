
package atividade01;


public  class Pessoa {
  public static final int   sexo_masculino = 1;
  public static final  int  sexo_feminino = 2;
      
  private String nome;
  private int sexo;
   
    public Pessoa(String nome, int sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getSexo() {
        return sexo;
    }
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("maria", Pessoa.sexo_feminino);
        System.out.println(pessoa.nome + "-" + pessoa.sexo);
        
    }
}
