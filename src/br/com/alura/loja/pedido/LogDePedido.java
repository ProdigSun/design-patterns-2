package br.com.alura.loja.pedido;

import br.com.alura.loja.pedido.acoes.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado " + pedido);
    }
}
