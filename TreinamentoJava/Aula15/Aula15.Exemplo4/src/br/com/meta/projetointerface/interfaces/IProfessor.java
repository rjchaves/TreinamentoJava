package br.com.meta.projetointerface.interfaces;

public interface IProfessor extends IFuncionario {
    void darAula();
    void lancarNotas();
    String dadosPessoais();
    public void setNome(String nome);
    public void setIdade(int idade);
    public void setDoutorado(boolean b);
}