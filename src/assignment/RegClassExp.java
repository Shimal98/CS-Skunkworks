package assignment;

/*
 *  Class representing a character class tree in a RegExp expression tree.
 */
public class RegClassExp extends RegExp {
	
	protected char lower,  // lower limit of class
	               upper;  // upper limit of class
	
	/*
	 * Construct a new character node with specified lower
	 * and upper limits for the class
	 */
	public RegClassExp(char lower,
	                   char upper) {
		
		this.lower = lower;
		this.upper = upper;				
	}
	
	/*
	 * Make and return a Nfa for this character class expression tree
	 */
	public Nfa makeNfa() {
		
         return null;          // Dummy return to keep Java happy
	}
	
	/*
	 *  Decompile this character class expression tree back to its original
	 *  form as a string
	 */
	public String decompile() {
		
		return "[" + lower + "-" + upper + "]";
	}
}