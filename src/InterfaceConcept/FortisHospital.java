package InterfaceConcept;

public class FortisHospital implements USMedical,UKMedical,IndianMedical{
	
//USMedical	
@Override	
public void orthopedicServices(){
	System.out.println("FortisHospital--orthopedicServices");
}
@Override	
	public void dentalServices(){
		System.out.println("FortisHospital---dentalServices");
	}
@Override		
	public void neuroServices(){
		System.out.println("FortisHospital--neuroServices");
	}
@Override		
	public void ambulanceServices(){
		System.out.println("FortisHospital--ambulanceServices");
	}
//UKMedical
@Override
public void physioServices(){
	System.out.println("FortisHospital--physioServices");
}

@Override
public void  ENTServices(){
	System.out.println("FortisHospital--ENTServices");
}

@Override
public void pediatricServices(){
	System.out.println("FortisHospital--pediatricServices");
}
//IndianMedical
@Override
public void emergencyServices(){
	System.out.println("FortisHospital--emergencyServices");
}
@Override
public void cardioServices(){
	System.out.println("FortisHospital--cardioServices");
}

@Override
public void  OPTServices(){
	System.out.println("FortisHospital--OPTServices");
}

	//non overridden methods---which is used by fortis only

public void medicalInsurance(){
	System.out.println("FortisHospital--MedicalInsurance");
}

public void pathologyServices(){
System.out.println("FortisHospital--pathologyServices");
}
@Override
public void polioServices() {
	
	
}


}