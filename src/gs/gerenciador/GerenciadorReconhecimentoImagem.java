package gs.gerenciador;

import gs.model.EspecieMarinha;
import gs.model.ReconhecimentoImagem;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorReconhecimentoImagem {

    private ArrayList<ReconhecimentoImagem> reconhecimentos;

    public GerenciadorReconhecimentoImagem() {
        this.reconhecimentos = new ArrayList<ReconhecimentoImagem>();
    }

    public void adicionarReconhecimento(ReconhecimentoImagem ri) {
        reconhecimentos.add(ri);
    }

}