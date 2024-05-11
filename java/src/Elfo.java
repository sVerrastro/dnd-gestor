public class Elfo extends Razza {

    public Elfo () {
        super();
        loadPrivileges();
        loadLanguages();
    }
    
    public void loadPrivileges() {
        privilegi.add(new Privilegio("scurovisione"));
        privilegi.add(new Privilegio("Sensi Acuti"));
        privilegi.add(new Privilegio("Retaggio Fatato"));
        privilegi.add(new Privilegio("Trance"));
    }

    public void loadLanguages() {
        languages.add("Comune");
        languages.add("Elfico");
    }

    private class Subrace {
    
        String name;

        public Subrace(String name) {
            switch (name) {
                case "elfo alto":
                    
                    break;
            
                default:
                    break;
            }
        }

        public void setName(String name) {
            this.name = name;
        }

        
    }
}
