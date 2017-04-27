import java.util.*;

public class Main {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String line = in.nextLine();
	        if(line != null && !line.isEmpty()) {
	        	//System.out.println(line.trim());
	        	//System.out.println(line.length());
	            int res = resolve(line.trim());
	            System.out.println(String.valueOf(res));
	        }
	    }

	    // write your code here
	    public static int resolve(String expr) {
	       String[] input = new String[expr.split(" ").length];
	       input = expr.split(" ");
	       
	       Stack<String> stack = new Stack<String>();
	       
	       int result = 0;
	       
	       for (int i = 0; i < input.length; i++) {
	    	   if (input[i].equals("^")) {
	    		   if (stack.empty()) {
	    			   return -1;
	    		   } else {
	    			   int temp = Integer.valueOf(stack.pop());
		    		   temp += 1;
		    		   stack.push(Integer.toString(temp));  
	    		   }    
	    	   } else if (input[i].equals("+")) {
	    		   if (stack.empty() || stack.size() == 1) {
	    			   return -1;
	    		   } else {
	    			   int temp1 = Integer.valueOf(stack.pop());
	    			   int temp2 = Integer.valueOf(stack.pop());
	    			   stack.push(Integer.toString(temp1 + temp2));
	    		   }
	    	   } else if (input[i].equals("*")) {
	    		   if (stack.empty() || stack.size() == 1) {
	    			   return -1;
	    		   } else {
	    			   int temp1 = Integer.valueOf(stack.pop());
	    			   int temp2 = Integer.valueOf(stack.pop());
	    			   stack.push(Integer.toString(temp1 * temp2));
	    		   }
	    	   } else {
	    		   stack.push(input[i]);
	    		   if (stack.size() >= 17) {
	    			   return -2;
	    		   }
	    	   }
	       }
	       result = Integer.valueOf(stack.pop());
	       return result;
	       
	    }
}
