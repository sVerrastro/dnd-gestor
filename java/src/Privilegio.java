public class Privilegio {
    
    String nome;
    String descrizione;

    public Privilegio (String nome) {
        switch (nome) {
            case "scurovisione": Scurovisione(); break;
        }
    }

    public void Scurovisione() {
        this.nome = "scurovisione";
        this.descrizione = "descrizione";
    }

    public void Sensi_Acuti() {
        this.nome = "Sensi Acuti";
        this.descrizione = "descrizione";
        Personaggio.addCompetence(new Competence("percezione"));
    }
}
