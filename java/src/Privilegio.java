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

    public void Astuzia_Gnomesca() {
        this.nome = "astuzia gnomesca";
        this.descrizione = "descrizione";
    }
}
