package br.com.meta.projetointerface.funcionario.administrativo;

import br.com.meta.projetointerface.interfaces.IEpi;
import br.com.meta.projetointerface.interfaces.IJardineiro;

public class Jardineiro implements IJardineiro, IEpi {

    @Override
    public Boolean temAutorizacao() {
        return true;
    }

    @Override
    public Boolean possuiEquipamento() {
        return true;
    }
    
    public void cortarGrama() {
        System.out.println("Jardineiro - cortarGrama");
    }
    
}