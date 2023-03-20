package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical{
	
	int min_fee=30;
	//US
	@Override
	public void cardioServices() {
		System.out.println("FH- cardioServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH- neuroServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH- physioServices");
	}

	//UK
	@Override
	public void entServices() {
		System.out.println("FH- entServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH- dentalServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH- oncologyServices");
	}

	@Override
	public void gynServices() {
		System.out.println("FH- gynServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("FH- orthoServices");
	}
	//common method
	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");
	}
	
	
	//individual
	public void medicalTraining() {
		System.out.println("FH-medical training");
	}
	
	public void medicalInsurance() {
		System.out.println("FH-medical Insurance");
	}

	//WHO
	@Override
	public void covidVaccination() {
		// TODO Auto-generated method stub
		System.out.println("FH-covidVaccination");
	}

	//USHG
	@Override
	public void childCare() {
		// TODO Auto-generated method stub
		
	}

	//method hiding
	public static void taxCalculation() {
		System.out.println("FH - taxCalculation");
	}

	//override default interface method
	@Override
	public void getMedicalServices() {
		System.out.println("FH - getMedicalServices");
	}
	
	
}
