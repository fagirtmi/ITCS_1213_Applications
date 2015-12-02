
public class VehicleInformation {
	private String engineSize;
	private String literSize;
	private String bodyFrameMaterial;
	private String tireSize;
	private String driveTrain;
	
	// Constructs the Object
	public VehicleInformation(String enSi, String lT, String bFM, String tS, String dT ){
		engineSize = enSi;
		literSize = lT;
		bodyFrameMaterial = bFM;
		tireSize = tS;
		driveTrain = dT;
		
	}
	/**
	 * @return the engineSize
	 */
	public String getEngineSize() {
		return engineSize;
	}

	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	/**
	 * @return the literSize
	 */
	public String getLiterSize() {
		return literSize;
	}

	/**
	 * @param literSize the literSize to set
	 */
	public void setLiterSize(String literSize) {
		this.literSize = literSize;
	}

	/**
	 * @return the bodyFrameMaterial
	 */
	public String getBodyFrameMaterial() {
		return bodyFrameMaterial;
	}

	/**
	 * @param bodyFrameMaterial the bodyFrameMaterial to set
	 */
	public void setBodyFrameMaterial(String bodyFrameMaterial) {
		this.bodyFrameMaterial = bodyFrameMaterial;
	}

	/**
	 * @return the tireSize
	 */
	public String getTireSize() {
		return tireSize;
	}

	/**
	 * @param tireSize the tireSize to set
	 */
	public void setTireSize(String tireSize) {
		this.tireSize = tireSize;
	}

	/**
	 * @return the driveTrain
	 */
	public String getDriveTrain() {
		return driveTrain;
	}

	/**
	 * @param driveTrain the driveTrain to set
	 */
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}

	// calcualtes horsepower
	public int horepowerFormula(int inputTorque, int inputRPM){
		int torque = inputTorque;
		int RPM = inputRPM;
		int horsepower;
		
		return horsepower = (RPM * torque) / 5252;
	}
	
	public String toString(){
		return "Engine Size: " + engineSize + "\nLiter Size: " + literSize + "\nBody Frame Material: " + bodyFrameMaterial
				+ "\nTire Size: " + tireSize + "\nDrive Train: " + driveTrain;
	}
}
