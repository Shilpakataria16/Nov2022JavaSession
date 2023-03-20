package BuilderPattern;

public class EcommApplication {
	public EcommApplication login() {
		System.out.println("login to app");
		return this;
	}
	public EcommApplication login(String un,String pwd) {
		System.out.println("login to app: "+un + ":"+pwd);
		return this;
	}
	public EcommApplication doSearch(String productName) {
		System.out.println("search prod: "+productName);
		return this;
	}
	public EcommApplication doSearch(String productName,int price) {
		System.out.println("search prod: "+productName+"price: "+price);
		return this;
	}
	public EcommApplication doSearch(String productName,int price,String brand) {
		System.out.println();
		return this;
	}
	public EcommApplication addToCart(String productName) {
		System.out.println("adding to cart: "+productName);
		return this;
	}
	public EcommApplication doPayment(String cc,int cvv) {
		System.out.println("making payment using "+cc+":"+cvv);
		return this;
	}
	public EcommApplication doPayment(String upi) {
		System.out.println("making payment using "+upi);
		return this;
	}
	public EcommApplication doPayment(String paypalId,String password) {
		System.out.println("making payment using "+paypalId+":"+password);
		return this;
	}
	public EcommApplication generateOrder() {
		System.out.println("Order id:"+12457);
		return this;
	}
	public EcommApplication logOut() {
		System.out.println("logOut");
		return this;
	}
	
}
