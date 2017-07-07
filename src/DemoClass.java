import java.util.Stack;
public class DemoClass {
	public static void main(String args[]) {
		// Creating stack
		Stack<String> st = new Stack<String>();
        /*
         * performing the push operation it follows LIFO
         */
		st.push("NEHA");  // Here we are inserting element in the stack at the bottom then at second and third position
		st.push("Bhawani"); 
		st.push("Shalu"); //
		st.push("Priya");  // As it is following the LIFO It goes to the top
		System.out.println("Stack we got after the push operation: " + st);
		
		// checking the top element and prints it
        System.out.println("\nElement at the top is: " + st.peek()); //St.peek will returns us the top value
        //Performing the pop operation
		st.pop(); // The top element is deleted and then deleting the second ,third and at bottom
		st.pop(); 
		st.pop(); 
		st.pop(); 
		System.out.println("\nStack is empty" + st); //Here we will get the empty stack
		                                                
		                                            
		

	}

}

