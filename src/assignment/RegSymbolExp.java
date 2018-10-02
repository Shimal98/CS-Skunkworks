package assignment;

/*
 *  Class representing a single character tree in a RegExp expression tree.
 */
public class RegSymbolExp extends RegExp {
	
	protected char symbol;    // character represented
	
	
	public RegSymbolExp(char symbol) {
		
		this.symbol = symbol;				
	}

     /*
	 * Make and return a Nfa for this character expression tree
	 */	
	public Nfa makeNfa() {
		NfaState acceptState = new NfaState(null, null, NfaState.EPSILON, 2);
		NfaState startState = new NfaState(acceptState, null, symbol, 1);
				
		Nfa symbolNFA = new Nfa(startState, acceptState, 2);
		return symbolNFA;
	}

	/*
	 *  Decompile this character expression tree back to its original
	 *  form as a string
	 */	
	public String decompile() {
		
		return "\"" + symbol + "\"";
	}
}