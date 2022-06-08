package esercizio7;
public class Stagista implements IConfronta{
    private String nome;
    private String cognome;
    private int eta;

    public Stagista(String n,String c,int e){
        this.nome=n;
        this.cognome=c;
        this.eta=e;
    }

    //getter e setter

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    //metodi
    @Override
    public boolean minoreDi(int comparatore) {
        boolean c = false;
        if(comparatore>this.eta){
            c = true;
        }else{
            c = false;
        };
        return c;}

    @Override
    public String toString() {
        return "Stagista{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }
}


