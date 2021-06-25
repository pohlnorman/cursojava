package com.java.telefono;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
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
			
			System.out.println("Galaxy "+version+" compañia "+compania+" bateria "+bateria+"%");
	    }

}
