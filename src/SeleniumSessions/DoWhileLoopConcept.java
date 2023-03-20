package SeleniumSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {
		int p=1;
		do {
			System.out.println(p);
			p++;
		} while (p<=10);

		int q=1;
		do {
			System.out.println(q);
			if(q%5==0)
				System.out.println("fully divisible by 5");
		} while (q<=50);
	}

	//use cases
	//launch a page: element present:0,5,10...n
	/*
	 * do { //if elemenmt is present click on it }while(condition)
	 */
}
