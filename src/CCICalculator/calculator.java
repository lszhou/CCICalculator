/**
 * the following the functionalities should be added:
 * - command line error checking;
 * - manually terminate the program, namely multiple use;
 * - some other info from the provided link should be considered; 
 * - Comments should be completed;
 * - OO style should be well applied.
 */

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
		six[0] = "- Metastatic solid tumor";
		six[1] = "- AIDS (not just HIV positive)";

		int[] ansArray = new int[11];
		for (int i = 0; i < ansArray.length; i++) {
			ansArray[i] = i;
		}

		System.out.println("-----------One Point Conditions-----------");
		for (int i = 0; i < one.length; i++) {
			System.out.println(one[i]);
		}

		Scanner in = new Scanner(System.in);
		System.out
				.println("[Question 1: How many conditions are you satisfied? (0 ~ 10)]");

		int flag = 0;
		String ans = in.nextLine();

		MARK: while (flag == 0) {
			for (int i = 0; i < one.length + 1; i++) {

				if ((Integer.toString(ansArray[i])).equals(ans)) {
					flag = 1;
					break MARK;
				}
			}

			System.out.println("Please answer with number from 0 to 10.");
			ans = in.nextLine();
		}

		int oneNumber = Integer.parseInt(ans);

		System.out.println();
		System.out.println("-----------Two Points Conditions-----------");
		for (int i = 0; i < two.length; i++) {
			System.out.println(two[i]);
		}

		System.out
				.println("[Question 2: How many conditions are you satisfied? (0 ~ 6)]");

		flag = 0; // reset flag;
		ans = in.nextLine();

		MARK: while (flag == 0) {
			for (int i = 0; i < two.length + 1; i++) {

				if ((Integer.toString(ansArray[i])).equals(ans)) {
					flag = 1;
					break MARK;
				}
			}

			System.out.println("Please answer with number 0 ~ 6.");
			ans = in.nextLine();
		}

		int twoNumber = Integer.parseInt(ans);

		System.out.println();
		System.out.println("-----------Three Points Conditions-----------");
		System.out.println(three);

		System.out
				.println("[Question 3: How many condition are you satisfied?  (0 ~ 1).]");

		flag = 0;
		ans = in.nextLine();

		MARK: while (flag == 0) {
			for (int i = 0; i < 2; i++) {

				if ((Integer.toString(ansArray[i])).equals(ans)) {
					flag = 1;
					break MARK;
				}
			}

			System.out.println("Please answer with number 0 ~ 1.");
			ans = in.nextLine();
		}

		int threeNumber = Integer.parseInt(ans);

		System.out.println();
		System.out.println("-----------Six Points Conditions-----------");
		for (int i = 0; i < six.length; i++) {
			System.out.println(six[i]);
		}

		System.out
				.println("Question 4: How many conditions are you satisfied? (0 ~ 2)");

		flag = 0;
		ans = in.nextLine();

		MARK: while (flag == 0) {
			for (int i = 0; i < six.length + 1; i++) {

				if ((Integer.toString(ansArray[i])).equals(ans)) {
					flag = 1;
					break MARK;
				}
			}

			System.out.println("Please answer with number 0 ~ 2.");
			ans = in.nextLine();
		}

		int sixNumber = Integer.parseInt(ans);

		in.close();

		int cci = 1 * oneNumber + 2 * twoNumber + 3 * threeNumber + 6
				* sixNumber;
		System.out.println("Charlson Comorbidity Index (CCI) Score: " + cci);

	}

}
