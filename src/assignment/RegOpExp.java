package assignment;


/*
 *  Class representing a operator tree in a RegExp expression tree.
 */
 public class RegOpExp extends RegExp{
	
	// Codes for different operator types
	public static final int ALTERNATION      = 0,
	                        CONCATENATION    = 1,
	                        KLEENE_CLOSURE   = 2,
	                        POSITIVE_CLOSURE = 3,
	                        OPTION           = 4;
	                  
	protected RegExp left;    // Left operand
	protected int    op;      // Operator
	protected RegExp right;   // Right operand (null if Operator is unary)
	
	/*
	 * Construct a unary operator expression tree
	 */
	public RegOpExp(RegExp left,
	                int    op) {
		
		this(left,op,null);
	}
	
	/*
	 * Construct a binary operator expression tree
	 */
	public RegOpExp(RegExp left,
	                int    op,
	                RegExp right) {
	              	
	    this.left  = left;
	    this.op    = op;
	    this.right = right;      	
	}

	/*
	 * Make and return a Nfa for this operator expression tree
	 */	
	public Nfa makeNfa() {
		
		return null;          // Dummy return to keep Java happy	     
	}
	

	/*
	 *  Decompile this operator expression tree back to its original
	 *  form as a string
	 */	
	public String decompile() {
		
		String leftString  = "(" + left.decompile();
		String rightString = ")";
		if (right != null)
		  rightString = right.decompile() + rightString;
		
		switch (op)  {
			case ALTERNATION      : return leftString + "|" + rightString;
			                        
		    case CONCATENATION    : return leftString + "." + rightString;
		    
		    case OPTION			  : return leftString + rightString + "?";
		    
		    case KLEENE_CLOSURE   : return leftString + rightString + "*";
		    
		    case POSITIVE_CLOSURE : return leftString + rightString + "+";
		    
		    default               : throw new RuntimeException
		                                ("Illegal operator in RegOpExp");
		}
		  
	}

}