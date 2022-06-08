package esercizio7;


public class Main {

    public static void main(String[] args) {
        Stagista s1= new Stagista("Mario", "Rossi", 23);
        Stagista s2 = new Stagista("Mauro", "Bianchi", 22);

        boolean valore = s1.minoreDi(s2.getEta());
        if(valore== true){
            System.out.println("stagista1 è più piccolo");
        }else
            System.out.println("stagista2 è più piccolo");
    }

}
