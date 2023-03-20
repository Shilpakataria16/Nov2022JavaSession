package SeleniumSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//print 1 to 10
		//1. while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			//++i;
			//i=i+1;
		}
		
		//Above example can not use byte because calculation is performed
		
		//infinite loop
		while(true) {
			System.out.println("welcome");
			break;
		}
		
		//odd numbers between 1-100
		int p=1;
		while(p<=100) {
			System.out.println(p);
			p=p+2;
		}
		
		//even numbers between 1-100
		int q=0;
		while(q<=100) {
			System.out.println(q);
			q=q+2;
		}
		
				
		//number divisible by 5
		int num=1;
		while(num<=100) {
			System.out.println(num);
			if(num%5==0) {
				System.out.println("hi");
			}
			num++;
		}
		
		//print name 5 times
		int n=1;
		while(n<=5) {
			System.out.println(n+" = "+" Anjali");
			n++;
			
		}
		
		//infinite loop
		int counter=100;
		while(counter>=100) {
			System.out.println(counter);
			if(counter==200) {
				System.out.println("bye");
				break;
			}
			counter++;
		}
		
		
		//cricket score
		int score=0;
		while(score<=100) {
			//System.out.println(score);
			/*
			 * if(score==25) System.out.println("score is 25..yay"); if(score==50)
			 * System.out.println("half century"); if(score==100)
			 * System.out.println("century");
			 */
			
			switch (score) {
			case 25:
				System.out.println(score);
				System.out.println("score is 25..yay");
				break;
			case 50:
				System.out.println(score);
				System.out.println("half century");
				break;
				
			case 100:
				System.out.println(score);
				System.out.println("century");
				break;

			default:
				System.out.println(score);
				break;
			}
			score++;
		}
		
		//while loop use cases
		//1. When number of iterations are not fixed (pagination:click on links in footer/header)
		//2. infinite loading:linkedin,swiggy,facebook
		//3. waiting for element on the page:0,5,10,15
		//4. waiting for page load
		//5. calendar handling
		//6.pagination
		
		
	}

}
