package br.edu.infnet.appBookstore.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.infnet.appBookstore.model.domain.CarrinhoDeCompras;

@Service
public class CarrinhoDeComprasService {
    
    private List<CarrinhoDeCompras> listaCarrinhos = new ArrayList<>();

    public void incluir(CarrinhoDeCompras carrinho){
        listaCarrinhos.add(carrinho);
    }
    
    public Collection<CarrinhoDeCompras> obterLista(){
        return listaCarrinhos;
    }
}
