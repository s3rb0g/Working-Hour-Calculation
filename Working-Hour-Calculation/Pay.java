import java.util.ArrayList;
import java.util.Scanner;
class Pay extends Payroll {

		
	static ArrayList<String> NAME = new ArrayList<>();
	static ArrayList <String> POSITION = new ArrayList <>();
	static ArrayList <Integer> ID = new ArrayList <>();
	
	static double daywork;
	static double total;
	static double ans;
	static double totalans;
	static int loop = 0;
	
	static double tax = 0.05;

	public static void setNewEmployee(int id, String name, String position){	

	ID.add(id);	
	NAME.add(name);
	POSITION.add(position);
	
	}

	public static void PayrollModule(int newid){
			
	if (ID.contains(newid)){
		System.out.println("Record found!");
		System.out.println(" ");
		RecordFound(newid);
		loop -= loop;
		
	}
	else{
		System.out.println("Record not Found!");
	}
	}
	
	public static void RecordFound(int Id){
		
	Scanner input1 = new Scanner(System.in);
	
do{
	if (Id == ID.get(loop)){
		System.out.println("Id: " + ID.get(loop));
		System.out.println("Name: " + NAME.get(loop));
		System.out.println("Position: " + POSITION.get(loop));
		System.out.println(" ");
	
		System.out.print("Enter days works: ");
		daywork = input1.nextInt();
		System.out.println(" ");
		VerifyPosition();
	break;
	
	}
	else{
		loop++;
	}
	
}while(true);
	
	}
	
	public static void VerifyPosition(){
	
	if ("manager".equalsIgnoreCase(POSITION.get(loop))){	
		System.out.println("RESULT:");
		System.out.println("Gross Pay: " + getTotalManager());
		System.out.println("Tax: " + getTax());
		System.out.println("Net Pay: " + netPay());	
	}
	
	else if("supervisor".equalsIgnoreCase(POSITION.get(loop))){
		System.out.println("RESULT:");
		System.out.println("Gross Pay: " + getTotalSupervisor());
		System.out.println("Tax: " + getTax());
		System.out.println("Net Pay: " + netPay());
	}
	
	else if("staff".equalsIgnoreCase(POSITION.get(loop))){
		System.out.println("RESULT:");
		System.out.println("Gross Pay: " + getTotalStaff());
		System.out.println("Tax: " + getTax());
		System.out.println("Net Pay: " + netPay());
	}

	else{
		System.out.println("Invalid! Make sure you enter valid position!");
	}
	}

	public static void ListEmployee(){
		
	int no = 1;
		for (int i = 0; i < count; i++){
		System.out.println(no +". "+ ID.get(i) +" "+ NAME.get(i) +" "+ POSITION.get(i));		
	no++;
	}
	}

	public static double getTotalManager(){
	total = daywork * 1500;
	return total;
	}

	public static double getTotalSupervisor(){
	total = daywork * 1000;
	return total;
	}

	public static double getTotalStaff(){
	total = daywork * 600;
	return total;
	}

	public static double getTax(){
	ans = total * tax;
	return ans;
	}
	
	public static double netPay(){
	totalans = total - ans;
	return totalans;
	}

}