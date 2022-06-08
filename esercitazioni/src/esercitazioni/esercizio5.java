package esercitazioni;

public class esercizio5 {
	public static void main(String[] str) {
		String stringa = "ciao";
		stringa = invertWord(stringa);
		System.out.println(stringa);
	}
	public static String invertWord(String stringa) {
		String stafsf = null;
		char[] caratteri = stringa.toCharArray();
		for(int i:caratteri) {
			stafsf = stafsf + caratteri[2];
		}
		
	return stafsf;}
}
