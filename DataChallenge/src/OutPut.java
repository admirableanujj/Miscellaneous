
public class OutPut implements Comparable<OutPut>{

	String drug_name;
	int num_prescriber;
	double totalCost;
	
		
	public OutPut() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OutPut(String drug_name, int num_prescriber, double totalCost) {
		super();
		this.drug_name = drug_name;
		this.num_prescriber = num_prescriber;
		this.totalCost = totalCost;
	}
	
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}
	public int getNum_prescriber() {
		return num_prescriber;
	}
	public void setNum_prescriber(int num_prescriber) {
		this.num_prescriber = num_prescriber;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	public int compareTo(OutPut opt){  
		if(totalCost==opt.totalCost)  
		return 0;  
		else if(totalCost<opt.totalCost)  
		return 1;  
		else  
		return -1;  
		}  
}
