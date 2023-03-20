package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {
		//diff workflows
		//chaining of methods
		//manipulate methods/workflow is Builder pattern
		//1 object is getting created
		//every method will return this
		EcommApplication app = new EcommApplication();
		app.login("shilpa@gmail.com", "test123")
		.doSearch("macbook pro")
		.addToCart("macbook pro").doPayment("1212 1212 3122 1444", 899)
		.logOut();
		
		//
		app.login("shilpa@gmail.com", "test123")
		.doSearch("tshirt",5000,"Nike")
		.addToCart("tshirt")
		.logOut();
		//
		app.login("shilpa@gmail.com", "test123")
		.addToCart("tshirt")
		.doPayment("shilpa@hdfc")
		.logOut();
		//
		app.login("test@gmail.com", "test123")
		.logOut();
		
		//System obj = new System();
		//Private constructor
		//All methods are static.so we don't need to create object.

	}

}
