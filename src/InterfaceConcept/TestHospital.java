package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fs = new  FortisHospital();
		fs.ambulanceServices();
		fs.cardioServices();
		fs.dentalServices();
		fs.emergencyServices();
		fs.ENTServices();
		fs.medicalInsurance();
		fs.neuroServices();
		fs.OPTServices();
		fs.orthopedicServices();
		fs.pathologyServices();
		fs.pediatricServices();
		fs.physioServices();
		fs.Services_911();
		
	//Top casting:
		USMedical us = new FortisHospital();//child class object can be referred by parent interface ref var
		us.ambulanceServices();
		us.dentalServices();
		us.orthopedicServices();
		us.neuroServices();
		us.Services_911();
		System.out.println(USMedical.min_fee);
		System.out.println(fs.min_fee);
		USMedical.billing();
		
		
		UKMedical uk = new FortisHospital();
		uk.ENTServices();
		uk.pediatricServices();
		uk.physioServices();
		
		
		
		IndianMedical in = new FortisHospital();
		
		in.cardioServices();
		in.OPTServices();
		in.emergencyServices();
		
		
	}

}
