package com.java.telefono;

public class IPhone extends Phone implements Ringable{

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}
	
	@Override
	public String ring() {
			String tono = getRingTone();
			return tono;
	        
	    }
	 @Override
	 public String unlock() {
			return "telefomo desbloqueado";
	        
	    }

	@Override
	public void displayInfo() {
		String version = getVersionNumber();
		String compania = getCarrier();
		int bateria = getBatteryPercentage();
		
		System.out.println("IPhone "+version+" compañia "+compania+" bateria "+bateria+"%");
		
	}

}
