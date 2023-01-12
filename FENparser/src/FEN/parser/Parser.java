package FEN.parser;

import java.util.StringTokenizer;
import java.util.Vector;

public class Parser implements Tokenizable {
     private String fen;
     private final static int rowCount=8;
	public Parser(String fen) {
		this.fen = fen;
	}

	public String getFen() {
		return fen;
	}

	public void setFen(String fen) {
		this.fen = fen;
	}
    boolean isValidFEN() {
    	//Borad config logic:
    	int count =1;
    	for( String token : Tokenize()) {
    		for(int i=0; i< token.length() ;i++ )
    			if(token.charAt(i)>'8' || token.charAt(i)<'1')
    			 if(!Piece.isPiece(token.charAt(i))) {
    				 System.err.println(token.charAt(i));
    				 return false;
    				 }
    	 count++;	
    	 if(count>Parser.rowCount) break;
    	}
    	return true;
    }
	@Override
	public Vector<String> Tokenize() {
		StringTokenizer st = new StringTokenizer(getFen(),"/ ");
		Vector<String> fenTokens=new Vector<String>();
		while(st.hasMoreTokens())
			fenTokens.add(st.nextToken());
		return fenTokens;
	}
     
}
