package FEN.parser;

public class Main {

	public static void main(String[] args) {
		
		Parser ps=new Parser("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR");
        for( String token : ps.Tokenize()) {
        	System.out.println(token);
        }
        System.out.println(ps.isValidFEN());
	}

}
