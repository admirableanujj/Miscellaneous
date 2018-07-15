
public class InputData {

	String id;
	String prescriberLastName;
	String prescriberFirstName;
	String drugName;
	double drugCost;
	
	
	public InputData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InputData(String id, String prescriberLastName, String prescriberFirstName, String drugName,
			double drugCost) {
		super();
		this.id = id;
		this.prescriberLastName = prescriberLastName;
		this.prescriberFirstName = prescriberFirstName;
		this.drugName = drugName;
		this.drugCost = drugCost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrescriberLastName() {
		return prescriberLastName;
	}
	public void setPrescriberLastName(String prescriberLastName) {
		this.prescriberLastName = prescriberLastName;
	}
	public String getPrescriberFirstName() {
		return prescriberFirstName;
	}
	public void setPrescriberFirstName(String prescriberFirstName) {
		this.prescriberFirstName = prescriberFirstName;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public double getDrugCost() {
		return drugCost;
	}
	public void setDrugCost(double drugCost) {
		this.drugCost = drugCost;
	}
	
	
	
	
	
}
