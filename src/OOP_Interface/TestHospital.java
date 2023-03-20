package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		//overridden methods
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		fh.entServices();
		fh.dentalServices();
		fh.oncologyServices();
		
		fh.emergencyServices();
		
		//individual methods
		fh.medicalTraining();
		fh.medicalInsurance();
		//inherited methods
		fh.medicalRnD();
		fh.medicalNews();
		fh.covidVaccination();
		
		System.out.println(fh.min_fee);
		System.out.println(USMedical.min_fee);
		
		System.out.println(fh.min_fee);
		
		USMedical.taxCalculation();
		FortisHospital.taxCalculation();
		
		fh.getMedicalServices();
		//NA
		//USMedical us = new USMedical();
		
		//top casting
		//child class object can be referred by parent interface reference variable
		USMedical us =new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
		
		UKMedical uk =new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		IndianMedical in = new FortisHospital();
		in.oncologyServices();
		in.emergencyServices();
		in.orthoServices();
		in.gynServices();
		
		//down casting at compile time
		//not allowed
		
		//USE CONSTANTS
		System.out.println(Constants.OK_MSG_200);
		System.out.println(Constants.DEFAULT_PAGE_LOAD_TIME_OUT);
	}

}
