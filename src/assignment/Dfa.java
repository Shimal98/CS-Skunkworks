package assignment;

import java.util.*;

public class Dfa {
	
	
    public static final int SIGMA_LOWER = 32;
    public static final int SIGMA_UPPER = 127;
    public static final int MAX_STATES  = 256;
    public static final int ACCEPT      = -1;
    public static final int START       = 1;
    public static final int TRAP        = 0;
    
    protected int[][]                        transTable;
    protected ArrayList<HashSet<NfaState>>   states;	
    protected int                            size;
    
    public Dfa() {
    }
     
    public Dfa(int[][]                      transTable,
               ArrayList<HashSet<NfaState>> states,
               int                          size) {
               	
       this.transTable = transTable;
       this.states     = states;
       this.size       = size;        	
   }
    
   int[][] getTransTable() {
	   
	   return transTable;
   }
   
   int getSize()  {
	   
	   return size;
   }
   
   ArrayList<HashSet<NfaState>> getStates() {
   
      return states;
   }
}