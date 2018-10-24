package Inheritance;

public class Organization  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empObj = new Employee();
		empObj.setEmpName("John");
		empObj.setSex('M');
		empObj.setJobTitle("Search Software Developer ");
		empObj.setBirthday("12/12/2000");
		empObj.setOrganizationName("Google");
		empObj.setNoOfEmp(50550);
		
		System.out.println("Employee name is : " + empObj.getEmpName());
		System.out.println("Employee Gender is : " + empObj.getSex());
		System.out.println("Employee Job Title is : " + empObj.getJobTitle());
		System.out.println("Employee Birthday is : " + empObj.getBirthday());
		System.out.println("Employee Organization is : " + empObj.getOrganizationName());
		System.out.println("Total No of employee is : " + empObj.getNoOfEmp());
		System.out.println("----------END LINE------------");
		
		GoogleOrg GoogleObj = new GoogleOrg();
		GoogleObj.setEmpName("Smith");
		GoogleObj.setSex('M');
		GoogleObj.setJobTitle("Tech Developer");
		GoogleObj.setBirthday("01-21-90");
		GoogleObj.setOrganizationName("Google");
		GoogleObj.setNoOfEmp(50550);
		GoogleObj.setNoOfIssuesFixed(20);
		

		System.out.println("Employee Name is : " + GoogleObj.getEmpName());
		System.out.println("Google emp gender is : " + GoogleObj.getSex());
		System.out.println("Job Title is : " + GoogleObj.getJobTitle());
		System.out.println("Date of birth is : " + GoogleObj.getBirthday());
		System.out.println("Organization name is : " + GoogleObj.getOrganizationName());
		System.out.println(" Total no of employee : " + GoogleObj.getNoOfEmp());
		System.out.println("-------END LINE--------- ");
		
		MicrosoftOrg MicrosoftObj = new MicrosoftOrg();
		MicrosoftObj.setEmpName("Anna");
		MicrosoftObj.setSex('F');
		MicrosoftObj.setJobTitle("IT Developer");
		MicrosoftObj.setBirthday("12-12-1993");
		MicrosoftObj.setOrganizationName("Microsoft");
		MicrosoftObj.setNoOfEmp(20500);
		MicrosoftObj.setNoOfIssuesRaised(20);
		
		System.out.println("Employee name is : " + MicrosoftObj.getEmpName());
		System.out.println("Google emp gender is : " + MicrosoftObj.getSex());
		System.out.println("Job Title is : " + MicrosoftObj.getJobTitle());
		System.out.println("Date of birth is : " + MicrosoftObj.getBirthday());
		System.out.println("Organization name is : " + MicrosoftObj.getOrganizationName());
		System.out.println(" Total no of employee : " + MicrosoftObj.getNoOfEmp());
		System.out.println("---------END LINE--------");
	
		
	}

}
		