import java.util.Scanner;
public class Payroll {

		static int count;	
	
	public static void main(String [] args) {
		
		int uid; 
		String uname;
		String uposition;
	
		Scanner xd = new Scanner(System.in);
		Pay roll = new Pay();
		
	do {	
		System.out.println("****************************");
		System.out.println(" ");
		System.out.println("Payroll System");
		System.out.println("1 - New Employee");
		System.out.println("2 - Payroll");
		System.out.println("3 - List of Employee");
		System.out.println("4 - Exit");
		
		System.out.println(" ");
		System.out.print("CHOOSE YOUR OPTION: ");
		int i = xd.nextInt();
		System.out.println("****************************");
		
	if (i == 1) {
		System.out.println(" ");
		System.out.println("New Emloyee Module");
		System.out.println("==================");
		System.out.print("Employee id: ");
			uid = xd.nextInt();
		System.out.print("Name: ");
			uname = xd.next();
		System.out.print("Position: ");
			uposition = xd.next();
				
		roll.setNewEmployee(uid, uname, uposition);
		count++;
		}

	else if (i == 2){
		System.out.println(" ");
		System.out.println("PAYROLL MODULE");
		System.out.println("==============");
		System.out.print("Employee ID: ");
			int eid = xd.nextInt();

		roll.PayrollModule(eid);
		}

	else if (i == 3){
		System.out.println(" ");
		System.out.println("List of Employee Module");
		System.out.println("=======================");
		
		roll.ListEmployee();
		}
	
	else if (i == 4){
		System.out.println(" ");
		System.out.print("Thank you! Bye!");
		break;
		}

	else{
		System.out.println("Invalid input!");
		}
		
}while(true);

}

}
