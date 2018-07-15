import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<InputData> inputDataGiven = new ArrayList<InputData>();
		try {

			inputDataGiven = Test.csvFileRead("src/itcont.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<OutPut> sortedData = new ArrayList<OutPut>();
		sortedData = Test.sortAndRemoveDuplicate(inputDataGiven);
		Collections.sort(sortedData);
		for (OutPut outPut : sortedData) {
			System.out.println(outPut.getDrug_name() + "," + outPut.getNum_prescriber() + "," + outPut.getTotalCost());
		}
	try {
		boolean success =	Test.csvFileWrite(sortedData);
		if(success) {System.out.println("Success");}else {System.out.println("Not Success");}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	public static ArrayList<InputData> csvFileRead(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = null;
		ArrayList<InputData> dataGiven = new ArrayList<InputData>();
		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			InputData inputObject = new InputData(values[0], values[1], values[2], values[3],
					Double.parseDouble(values[4]));
			dataGiven.add(inputObject);
			// for (String str : values) {
			// System.out.println(str);
			// }
		}
		br.close();
		return dataGiven;

	}
	public static boolean csvFileWrite(ArrayList<OutPut> outPutData) throws IOException {
        try {
            FileWriter writer = new FileWriter("src/top_cost_drug.txt", true);
    		for (OutPut outPut : outPutData) {
    			writer.write(outPut.getDrug_name() + "," + outPut.getNum_prescriber() + "," + outPut.getTotalCost());
    			writer.write("\r\n");   // write new line
    		}
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
          return false;
        }
 
    		return true;
	}
	public static ArrayList<OutPut> sortAndRemoveDuplicate(ArrayList<InputData> inputDataGiven) {
		ArrayList<OutPut> sortedData = new ArrayList<OutPut>();
		ArrayList<String> drugName = new ArrayList<String>();
		for (InputData inputData : inputDataGiven) {
			if (drugName.isEmpty()) {
				drugName.add(inputData.drugName);
			} else {
				if (drugName.contains(inputData.drugName)) {
					continue;
				} else {
					drugName.add(inputData.drugName);
				}
			}

		}
		Collections.sort(drugName);

		for (String name : drugName) {
			ArrayList<InputData> tempData = new ArrayList<InputData>();
			for (InputData inputData : inputDataGiven) {

				if (inputData.getDrugName().equalsIgnoreCase(name)) {
					tempData.add(inputData);

				}

			}
			OutPut dataOut = new OutPut();
			dataOut.setDrug_name(name);
			dataOut.setNum_prescriber(tempData.size());
			double totalCost = 0;
			for (InputData inputData2 : tempData) {
				totalCost = totalCost + inputData2.getDrugCost();
			}
			dataOut.setTotalCost(totalCost);
			sortedData.add(dataOut);
		}
		return sortedData;
	}

}
