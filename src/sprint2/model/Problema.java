package sprint2.model;

import java.util.ArrayList;
import java.util.List;

public class Problema {

    private List<Problema> problemas;

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }


    public Problema() {
        this.problemas = new ArrayList<>();
    }

    public void adicionarProblema(Problema problema) {
        this.problemas.add(problema);
    }

    public void removerProblema(Problema problema) {
        this.problemas.remove(problema);
    }

}
