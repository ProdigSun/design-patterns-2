package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HttpAdapter;

import java.util.HashMap;
import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = new HashMap<>();
        dados.put("valor", orcamento.getValor());
        dados.put("quantidadeItems", orcamento.getQuantidadeItens());
        http.post(url, dados);
    }
}
