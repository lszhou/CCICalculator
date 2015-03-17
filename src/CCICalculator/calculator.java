package CCICalculator;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		
		String[] one = new String[10];
		one[0] = "- Myocardial infarction (history, not ECG changes only)";
		one[1] = "- Congestive heart failure";
		one[2] = "- Peripheral disease (includes aortic aneurysm >= 6 cm";
		one[3] = "- Cerebrovascular disease: CVA with mild or no residua or TIA";
		one[4] = "- Dementia";
		one[5] = "- Chronic pulmonary disease";
		one[6] = "- Connective tissue disease";
		one[7] = "- Peptic ulcer disease";
		one[8] = "- Mild liver disease (without portal hypertension, inlcudes chronic hepatitis)";
		one[9] = "- Diabetes without end-organ damage (excludes diet-controlled alone)";

		String[] two = new String[6];
		two[0] = "- Hemiplegia";
		two[1] = "- Moderate or severe renal disease";
		two[2] = "- Diabetes with end-organ damage (retinopathy, neuropathy,nephropathy, or brittle diabetes)";
		two[3] = "- Tumor without metastasis (exclude if > 5 y from diagnosis)";
		two[4] = "- Leukemia(acute or chronic)";
		two[5] = "- Lymphoma";

		String three = "- Moderate or severe liver disease";

		String[] six = new String[2];
		six[0] = "Metastatic solid tumor";
		six[1] = "AIDS (not just HIV positive)";

		System.out.println("-----------One Point Conditions-----------");
		for (int i = 0; i < one.length; i++) {
			System.out.println(one[i]);
		}

		Scanner in = new Scanner(System.in);
		System.out.println("Question 1: How many conditions are you satisfied? (0 ~ 10)");

		int oneNumber = in.nextInt();
		
		System.out.println();
		System.out.println("-----------Two Points Conditions-----------");
		for (int i = 0; i < two.length; i++) {
			System.out.println(two[i]);
		}
		
		System.out.println("Question 2: How many conditions are you satisfied? (0 ~ 10)");

		int twoNumber = in.nextInt();
		
		System.out.println();
		System.out.println("-----------Three Points Conditions-----------");
		System.out.println(three);
		
		System.out.println("Question 3: Do you satisfy this condition? (Y/N)");

		int threeNumber = 0;
		
		while(!in.nextLine().equals("Y") && !in.nextLine().equals("N")){
			System.out.println("Please answer 'Y' or 'N'. ");
		}
		
		if (in.nextLine().equals("Y"))
			threeNumber = 1;
		else if (in.nextLine().equals("N"))
			threeNumber = 0;
		
		
		System.out.println();
		System.out.println("-----------Six Points Conditions-----------");
		for (int i = 0; i < six.length; i++) {
			System.out.println(six[i]);
		}
		
		System.out.println("Question 4: How many conditions are you satisfied? (0 ~ 10)");

		int sixNumber = in.nextInt();	
		
		int cci = 1*oneNumber + 2*twoNumber + 3*threeNumber + 6*sixNumber;
		System.out.println("Charlson Comorbidity Index (CCI) Score: " + cci);
			
			

	}
}
