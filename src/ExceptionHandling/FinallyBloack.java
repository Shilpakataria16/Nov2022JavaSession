package ExceptionHandling;

public class FinallyBloack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		try {
			int i=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is comimg");
			e.printStackTrace();
		}
		//Exeption is coming or not finally block will  be executed
		//we can write try block without catch but with finally
		finally {
			System.out.println("finally block");
		}
		System.out.println("bye");
		
		
		//Practical example of finally block
		//connect with DB - Oracle -- PASS
		//username,pwd,server ip:port
		//hit the SQL -- PASS
		//try{
		//get the result from DB --FAIL -- execption
		//}
		//catch(){log  }
		//finally{
		//disconnect with DB
		//}
		
		//logout
		
	}

}
