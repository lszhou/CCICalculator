package CCICalculator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class calculator {

	/**
	 * Checking whether the given String is an integer or not;
	 * @param str given String
	 * @return true or false
	 */
	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}

	public static void main(String[] args) {

			String[] one = new String[10];
			one[0] = "* Myocardial infarction (history, not ECG changes only)";
			one[1] = "* Congestive heart failure";
			one[2] = "* Peripheral disease (includes aortic aneurysm >= 6 cm";
			one[3] = "* Cerebrovascular disease: CVA with mild or no residua or TIA";
			one[4] = "* Dementia";
			one[5] = "* Chronic pulmonary disease";
			one[6] = "* Connective tissue disease";
			one[7] = "* Peptic ulcer disease";
			one[8] = "* Mild liver disease (without portal hypertension, inlcudes chronic hepatitis)";
			one[9] = "* Diabetes without end-organ damage (excludes diet-controlled alone)";

			String[] two = new String[6];
			two[0] = "* Hemiplegia";
			two[1] = "* Moderate or severe renal disease";
			two[2] = "* Diabetes with end-organ damage (retinopathy, neuropathy,nephropathy, or brittle diabetes)";
			two[3] = "* Tumor without metastasis (exclude if > 5 y from diagnosis)";
			two[4] = "* Leukemia(acute or chronic)";
			two[5] = "* Lymphoma";

			String three = "* Moderate or severe liver disease";

			String[] six = new String[2];
			six[0] = "* Metastatic solid tumor";
			six[1] = "* AIDS (not just HIV positive)";
			
			String[] Survival_CCI = new String[4];
			Survival_CCI[0] = "ONE YEAR: 98 \u00B1 3.1, TWO YEARS: 95 \u00B1 5.3"; //Low
			Survival_CCI[1] = "ONE YEAR: 89 \u00B1 8.8, TWO YEARS: 80 \u00B1 10.4"; //media
			Survival_CCI[2] = "ONE YEAR: 79 \u00B1 9.6, TWO YEARS: 55 \u00B1 11.4";//High
			Survival_CCI[3] = "ONE YEAR: 64 \u00B1 10.8, TWO YEARS: 35 \u00B1 10.8"; //Very High
			
			String[] Survival_SA = new String[2];
			Survival_SA[0] = "ONE YEAR: 50 \u00B1 14.7, TWO YEARS: 17 \u00B1 11.4"; //Albumin(g/dL) < 3.5;
			Survival_SA[1] = "ONE YEAR: 86 \u00B1 5.9, TWO YEARS: 76 \u00B1 7.1"; // Albumin(g/dL) >= 3.5;
			
			String[] Survival_SA_CCI = new String[8];
			Survival_SA_CCI[0] = "ONE YEAR: 91 \u00B1 0, TWO YEARS: 87 \u00B1 11"; //Low, Albumin(g/dL) < 3.5
			Survival_SA_CCI[1] = "ONE YEAR: 73 \u00B1 9, TWO YEARS: 61 \u00B1 12"; //Media, Albumin(g/dL) < 3.5
			Survival_SA_CCI[2] = "ONE YEAR: 69 \u00B1 7, TWO YEARS: 49 \u00B1 8"; //High, Albumin(g/dL) < 3.5
			Survival_SA_CCI[3] = "ONE YEAR: 52 \u00B1 9, TWO YEARS: 30 \u00B1 10"; //Very High, Albumin(g/dL) < 3.5
			
			Survival_SA_CCI[4] = "ONE YEAR: 93 \u00B1 3, TWO YEARS: 89 \u00B1 5"; //Low, Albumin(g/dL) >= 3.5
			Survival_SA_CCI[5] = "ONE YEAR: 89 \u00B1 4, TWO YEARS: 75 \u00B1 6"; //Media, Albumin(g/dL) >= 3.5
			Survival_SA_CCI[6] = "ONE YEAR: 84 \u00B1 4, TWO YEARS: 67 \u00B1 5"; //High, Albumin(g/dL) >= 3.5
			Survival_SA_CCI[7] = "ONE YEAR: 75 \u00B1 5, TWO YEARS: 52 \u00B1 6"; //Very High, Albumin(g/dL) >= 3.5
	
			

			System.out.println("==========================================================");
			System.out.println("=========--Charlson Comorbidity Scoring System--==========");
			System.out.println("==========================================================");
			System.out.println();
			System.out.println("Welcome to Charlson Comorbidity Index (CCI) system, ");
			System.out.println("please follow the instructions and answer the following ");
			System.out.println("questions step by step.");
			System.out.println();
			System.out.println("[Question 1: How many following conditions do you have? (0 ~ 10)]");
			System.out.println();

			for (int i = 0; i < one.length; i++) {
				System.out.println(one[i]);
			}
			System.out.println();
			
			Scanner in = new Scanner(System.in);
			String ans;
			
			System.out.println("Please anserwer below and press 'Enter' to continue:");

			while(true) {    
			    try {
			        ans = in.nextLine();
			        if (isInteger(ans) && (Integer.parseInt(ans)) >= 0
							&& (Integer.parseInt(ans)) <= 10){
				        break;
			        }
			        System.out.println("Please answer with numbers 0 ~ 10.");
			    }
			    catch(Exception ex ) {
			        System.out.println("Please answer with numbers 0 ~ 10.");
			    }
			}
			int oneNumber = Integer.parseInt(ans);
			
			
			System.out.println("[Question 2: How many following conditions do you have? (0 ~ 6)]");
			System.out.println();
			for (int i = 0; i < two.length; i++) {
				System.out.println(two[i]);
			}
			System.out.println();
			System.out.println("Please anserwer below and press 'Enter' to continue:");

			while(true) {    
			    try {
			        ans = in.nextLine();
			        if (isInteger(ans) && (Integer.parseInt(ans)) >= 0
							&& (Integer.parseInt(ans)) <= 6){
				        break;
			        }
			        System.out.println("Please answer with numbers 0 ~ 6.");
			    }
			    catch(Exception ex ) {
			        System.out.println("Please answer with numbers 0 ~ 6.");
			    }
			}
			int twoNumber = Integer.parseInt(ans);
			
			System.out.println("[Question 3: How many following conditions do you have? (0 ~ 1).]");
			System.out.println();
			System.out.println(three);
			System.out.println();
			System.out.println("Please anserwer below and press 'Enter' to continue:");

			while(true) {    
			    try {
			        ans = in.nextLine();
			        if (isInteger(ans) && (Integer.parseInt(ans)) >= 0
							&& (Integer.parseInt(ans)) <= 1){
				        break;
			        }
			        System.out.println("Please answer with numbers 0 ~ 1.");
			    }
			    catch(Exception ex ) {
			        System.out.println("Please answer with numbers 0 ~ 1.");
			    }
			}

			int threeNumber = Integer.parseInt(ans);
			
			
			
			System.out.println("Question 4: How many following conditions do you have? (0 ~ 2)");
			System.out.println();
			for (int i = 0; i < six.length; i++) {
				System.out.println(six[i]);
			}
			System.out.println();
			System.out.println("Please anserwer below and press 'Enter' to continue:");

			while(true) {    
			    try {
			        ans = in.nextLine();
			        if (isInteger(ans) && (Integer.parseInt(ans)) >= 0
							&& (Integer.parseInt(ans)) <= 2){
				        break;
			        }
			        System.out.println("Please answer with numbers 0 ~ 2.");
			    }
			    catch(Exception ex ) {
			        System.out.println("Please answer with numbers 0 ~ 2.");
			    }
			}

			int sixNumber = Integer.parseInt(ans);

			System.out.println("Question 5: How old are you?");
			while(true) {    
			    try {
			        ans = in.nextLine();
			        if (isInteger(ans) && (Integer.parseInt(ans)) > 0){
				        break;
			        }
			        System.out.println("Please answer with a valid age.");
			    }
			    catch(Exception ex ) {
			        System.out.println("Please answer with a valid age.");
			    }
			}

			int age = Integer.parseInt(ans);

			if (age < 40) {
				age = 0;
			} else {
				age = (age - 40) / 10;
			}
			
			
			System.out.println("Question 6: What is your Serum Albumin level (g/dL)?");
			while(true) {    
			    try {
			        ans = in.nextLine();
			        if (Double.parseDouble(ans) > 0){
				        break;
			        }
			        System.out.println("Please answer with a valid value.");
			    }
			    catch(Exception ex ) {
			        System.out.println("Please answer with a valid value.");
			    }
			}
			
			double SA = Double.parseDouble(ans);
			
			int cci = 1 * oneNumber + 2 * twoNumber + 3 * threeNumber + 6* sixNumber;

			int Age_factored_cci = 1 * age + 1 * oneNumber + 2 * twoNumber + 3* threeNumber + 6 * sixNumber;

			System.out.println("+-----------------------------RESULT-------------------------+");
			System.out.println("|Charlson Comorbidity Index (CCI) Score: " + cci);
			System.out.println("|Age factored: " + Age_factored_cci);
			System.out.println("|--------------------------------------------------");
			System.out.printf("|Survival based on CCI: ");
			if(Age_factored_cci >= 2 && Age_factored_cci <= 3 ){
				System.out.println(Survival_CCI[0]);
			}else if (Age_factored_cci >= 4 && Age_factored_cci <= 5 ) {
				System.out.println(Survival_CCI[1]);
			}else if (Age_factored_cci >= 6 && Age_factored_cci <= 7 ) {
				System.out.println(Survival_CCI[2]);
			}else if (Age_factored_cci >= 8) {
				System.out.println(Survival_CCI[3]);
			}
			
			System.out.printf("|Survival based on Serum Albumin: ");
			if (SA < 3.5){
				System.out.println(Survival_SA[0]);
			}else{
				System.out.println(Survival_SA[1]);
			}
			
			System.out.printf("|Survival based on Serum Alb and CCI: ");
		    if (SA < 3.5) {
		    	if (Age_factored_cci >= 2 && Age_factored_cci <= 3) {
		    		System.out.println(Survival_SA_CCI[0]);
		    	} else if (Age_factored_cci >= 4 && Age_factored_cci <= 5) {
				System.out.println(Survival_SA_CCI[1]);
		    	} else if (Age_factored_cci >= 6 && Age_factored_cci <= 7) {
				System.out.println(Survival_SA_CCI[2]);
		    	} else if (Age_factored_cci >= 8) {
		    		System.out.println(Survival_SA_CCI[3]);
		    	}
		    }else{
		    	if (Age_factored_cci >= 2 && Age_factored_cci <= 3) {
		    		System.out.println(Survival_SA_CCI[4]);
		    	} else if (Age_factored_cci >= 4 && Age_factored_cci <= 5) {
				System.out.println(Survival_SA_CCI[5]);
		    	} else if (Age_factored_cci >= 6 && Age_factored_cci <= 7) {
				System.out.println(Survival_SA_CCI[6]);
		    	} else if (Age_factored_cci >= 8) {
		    		System.out.println(Survival_SA_CCI[7]);
		    	}
		    }
		    
		    System.out.println("+---------------------------------------------------------------+");
			System.out.println();
			System.out.println("Calculation is Done!");
			in.close();

	}
}
