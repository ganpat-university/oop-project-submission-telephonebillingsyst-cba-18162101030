import java.util.*;
class base
{
	int a,n,amount=0;
	String c_name;
	int c_code;
	long u_p_num;
	String u_state;
	String u_pd_name;
	String sim_type;
	String s1="Airtel";
	String s2="Bsnl";
	String s3="Jio";
	String s4="Vodafone";

	void putdata()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------------------");
		System.out.println("					                      ");
		System.out.println("        Telephone Billing System          ");
		System.out.println("	        			                  ");
		System.out.println("------------------------------------------");

		System.out.println("\n Enter the Country Name :- ");
		c_name = sc.next();

		System.out.println("\n Enter the Country Code :- ");
		System.out.print("+");
		c_code = sc.nextInt();

		System.out.println("\n Enter the Customer Mobile Number :- ");
		System.out.print("+"+c_code );
		u_p_num = sc.nextLong();

		System.out.println("\n Enter the State Name :- ");
		u_state = sc.next();

		System.out.print("Your state "+u_state); 
		System.out.print(" has following service providers. Choose any one of these: ");
		System.out.println("1.Airtel");
		System.out.println("2.Bsnl");
		System.out.println("3.Jio");
		System.out.println("4.Vodafone");
		System.out.println("\n Enter the Service Provider Name :- ");
		u_pd_name = sc.next();

	if(u_pd_name == s1 || u_pd_name == s2 || u_pd_name == s3 || u_pd_name == s4 );
	{
		System.out.println("\n Enter the Choice  : ");

		System.out.println("Press 1 for Post Paid.");

		System.out.println("Press 2 for Pre Paid.");

		System.out.println("Press 3 to become our Premium Customer.");

		System.out.println("Press 4 for the Feedback.");

		System.out.println("Press 5 to exit.");
		a = sc.nextInt();
		
		switch(a)
		{
			case 1:
					
				sim_type = "Post Paid";
				System.out.println("\nThe code for your Post-Paid plan was PP01.");
				System.out.println("The plan included of 75GB with rollover + Free UNLIMITED calling + No roaming charges + upto 100 SMS per day.");
				System.out.println("You have used 61.76GB of which the remaining 13.24GB will get rollover to the next month.\n You also had talktime of 3000 minutes and an average of 20 messages per day. ");
				System.out.println("The monthly rent for the same is stated at Rs.499 for the month of September.");
				System.out.println("The due date of the bill is on 20/10/2019.");
				System.out.println("*If not paid before the due date additional charges may apply as per the terms and conditions of it.");
				amount = amount + 499;
				break;
					

			case 2 :
					
				sim_type = "Pre Paid";
				/*switch(select1)
				{
					case 1: 	
				}		
				break;
				*/	

			case 3 :
					
				sim_type = "Post-Paid (Exclusively)";
				break;
					
			case 4 :           	
				System.out.println("Welcome to the FEEDBACK Section");

			case 5 :
					
				System.out.println("\n  Exit ");
			default:
				System.out.println("Wrong input");
			
		}

	}
	

}

	void showdata()
	{
		System.out.println("\n  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _* TELEPHONE BILL *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.print("\n |Country Name :-                "+ c_name );
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.print("\n |Country Code :-               +"+ c_code); 
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.print("\n |Customer Mobile Number :       " + c_code);
		System.out.print(" "+ u_p_num);
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t  |"); 
		System.out.println("\n |                                                                                                                                              |");
		System.out.print("\n |State Name :-                  " + u_state); 
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.print("\n |Service Provider Name :-       " + u_pd_name); 	
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.print("\n |Customer Service Plan Type :-  " + sim_type);
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");	
		System.out.println("\n |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");

	}


}

class project
{
	public static void main(String[] args) 
	{
		base b = new base();
		
		b.putdata();

		b.showdata();				
	}
}
