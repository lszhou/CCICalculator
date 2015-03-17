/**
 * the following the functionalities should be added:
 * - command line error checking;
 * - manually terminate the program, namely multiple use;
 * - SURVIVAL probability should be provided; 
 * - Comments should be completed;
 * 
 */

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

		MARK: while (true) {

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
			        //in = new Scanner(System.in);
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
			        //in = new Scanner(System.in);
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
			        //in = new Scanner(System.in);
			        ans = in.nextLine();
			        if (isInteger(ans) && (Integer.parseInt(ans)) >= 0
							&& (Integer.parseInt(ans)) <= 1){
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
			        //in = new Scanner(System.in);
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

			int cci = 1 * oneNumber + 2 * twoNumber + 3 * threeNumber + 6* sixNumber;

			int Age_factored_cci = 1 * age + 1 * oneNumber + 2 * twoNumber + 3* threeNumber + 6 * sixNumber;

			System.out.println("Charlson Comorbidity Index (CCI) Score: " + cci);
			System.out.println("Age factored: " + Age_factored_cci);
			in.close();

			System.out.println();
			System.out.println("[Restart a new calculation? ('Y' to restart / 'N' to terminate)]");

			String cal = null;
			while(true){
				try {
					cal = in.nextLine();
					if (cal.equals("N")) {
						System.out.println("Calculator is Terminated!");
						break MARK;
					}
					else if(cal.equals("Y")) {
						continue MARK;
					}
			    }
			    catch(Exception ex ) {
			        System.out.println("Please press 'Y' or 'N'.");
				}

			}

		}

	}

}
