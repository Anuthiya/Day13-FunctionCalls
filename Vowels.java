package trainingday13FUNCTIONCALLS;

public class Vowels {
	public String vow( ) {
		String a="abcd";
		if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			return a;
		}
		else {
			return "not contain vow";
		}
		
	}
	public static void main(String args[]) {
		Vowels v=new Vowels();
		System.out.println(v.vow());
	}

}
