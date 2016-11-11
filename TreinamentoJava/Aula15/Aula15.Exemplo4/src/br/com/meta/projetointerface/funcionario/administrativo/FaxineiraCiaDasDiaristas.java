package br.com.meta.projetointerface.funcionario.administrativo;

import br.com.meta.projetointerface.interfaces.IFaxineira;

public class FaxineiraCiaDasDiaristas implements IFaxineira {

    @Override
    public void varrer() {
        System.out.println("FaxineiraCiaDasDiaristas - Varrer");
    }

    @Override
    public void lavar() {
        System.out.println("FaxineiraCiaDasDiaristas - lavar");
    }

    @Override
    public void tirarLixo() {
        System.out.println("FaxineiraCiaDasDiaristas - tirarLixo");
    }

    @Override
    public Boolean temAutorizacao() {
        return true;
    }    
}