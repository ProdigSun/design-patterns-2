package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import com.sun.imageio.plugins.common.BogusColorSpace;

public abstract class Imposto {
    private Imposto outro;

    public Imposto(Imposto outro) {
        super();
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImpostro = BigDecimal.ZERO;
        if (outro != null) {
            valorDoOutroImpostro = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImpostro);
    }

}
