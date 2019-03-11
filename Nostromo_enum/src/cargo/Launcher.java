package cargo;

public enum Launcher {
	Ariane64_LEO("Ariane 64","LEO",21650,20,5.4,11.3),
	Ariane64_GTO("Ariane 64","GTO",11500,20,5.4,11.3),
	Ariane64_Escape("Ariane 64","Escape",6400,20,5.4,11.3),
	FalconHeavy_LEO("Falcon Heavy","LEO",63800,13.1,5.2,11.25),
	FalconHeavy_GTO("Falcon Heavy","GTO",26700,13.1,5.2,11.25),
	FalconHeavy_Escape("Falcon Heavy","Escape",16800,13.1,5.2,11.25);
	
	
	String launcher;
	String orbit;
	private double max_weight; //kg
	private double cargo_max_length; //m
	private double cargo_max_diameter; //m
	private double cost_per_kg; //k$/kg
	/**
	 * @param typeOf
	 * @param orbit
	 * @param max_weight
	 * @param cargo_max_length
	 * @param cargo_max_diameter  
	 */
	
	/**** Constructors ****/
	Launcher(String launcher, String orbit, double max_weight, double cargo_length, double cargo_diameter, double cost_per_kg){
		this.launcher = launcher;
		this.orbit = orbit;
		this.max_weight = max_weight;
		this.cargo_max_length = cargo_length;
		this.cargo_max_diameter = cargo_diameter;
		this.cost_per_kg = cost_per_kg;
	}
	
	
	/**** "get" functions ****/
	public double getMaxWeight() {
		return this.max_weight;
	}
	public double getCargoMaxLenght() {
		return this.cargo_max_length;
	}
	public double getCargoMaxDiameter() {
		return this.cargo_max_diameter;
	}
	public String getLauncher() {
		return this.launcher;
	}
	public String getOrbit() {
		return this.orbit;
	}
	public double getCost() {
		return this.cost_per_kg;
	}
	public void showDetails(){
		System.out.println("Launcher details:");
		System.out.println("	-type: "+this.launcher);
		System.out.println("	-targeted orbit: "+this.orbit);
		System.out.println("	-total mass: "+this.max_weight+" kg");
		System.out.println("	-max transported length possible: "+this.cargo_max_length+" m");
		System.out.println("	-max transported diameter possible: "+this.cargo_max_diameter+" m\n");	
		System.out.println("	-cost per kg: "+this.cost_per_kg+" k$/kg");	
	}	
}
