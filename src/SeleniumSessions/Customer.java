package SeleniumSessions;

public class Customer {
	//WAF
	//getEmployeeDevices(empName -- string)
	//return device list
	public String[] getEmployeeDevices(String empName) {
		System.out.println("getting devices information for employee: " + empName);
		
		if(empName.equals("Ravi")) {
			String devices[]= {"macbook pro","ipad","iphone13"};
			return devices;
		}
		else if(empName.equals("Om")) {
			String devices[] = {"Windows 10","samsung s10"};
			return devices;
		}
		else if(empName.equals("Jay")) {
			String devices[]= {"Windows 10","samsung s10","iphone13","Airtel SIM"};
			return devices;
		}
		else {
			System.out.println("employee name is not found");
			return null;
		}
		
			
	}
	
	
	public static void main(String[] args) {
		Customer obj = new Customer();
		String d[] = obj.getEmployeeDevices("Ravi");
		System.out.println(d.toString());
		System.out.println(d.length);

	}

}
