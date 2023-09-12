import java.util.Scanner;

public class IT_Calculator {

	public static void main(String[] args) {

		float TaxableIncome;
		float TaxPaidPerYear;
		float TaxPayablePerMonth;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Taxable Income: ");

		
		String name = input.nextLine();

		TaxableIncome = Float.valueOf(name);

		int taxRate = 0;

		if(TaxableIncome<=25000){
			taxRate = 0;
		}
		else if(TaxableIncome<=50000){
			taxRate = 10;
		}
		else if(TaxableIncome<=75000){
			taxRate = 20;
		}
		else{
			taxRate = 30;
		}

		TaxPaidPerYear = TaxableIncome*taxRate/100;

		TaxPayablePerMonth = TaxPaidPerYear/12;
		System.out.println("\n");
		System.out.println("Annual Tax Payment : "+TaxPaidPerYear);

		System.out.println("Monthly Tax Payment : "+TaxPayablePerMonth);
		System.out.println("\n");
		
		input.close();







	}

}
