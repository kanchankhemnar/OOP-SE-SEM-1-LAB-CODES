import javax.xml.crypto.Data;

class Employee {
    int emp_id;
    long  mobile_no;
    String emp_name, address, mail_id;
    double basicPay;
    void Employee (String emp_name,int emp_id,long  mobile_no,String mail_id,String address,double basicPay){
       this.emp_name=emp_name;
        this.emp_id=emp_id;
        this.mobile_no=mobile_no;
        this.mail_id=mail_id;
        this.address=address;
        this.basicPay=basicPay;
   }
    void display(){
        System.out.println("NAME-"+emp_name+"\t\t\t\t"+"ID-"+emp_id+"\n"+"mobile-"+mobile_no+"\t\t\t"+"mail-"+mail_id+"\n"+"address-"+address+"\n");
        System.out.println("*****************       SALARY SLIP     *****************\n");
        // System.out.println("your salary is "+basicPay+"/-");
        System.out.println("Sr.no\t\t"+"Salary head\t\t\t\t\t"+"Amount");
        // System.out.println("---------------------------------------------------------------------");
    }
    double DA,HRA,PF,StaffClubFund,net_salary,gross_salary;
    void calculate(double basicPay){
    DA = 0.97*basicPay;
    HRA = 0.10*basicPay;
    PF = 0.12*basicPay;
    StaffClubFund =0.01*basicPay;
    gross_salary=basicPay+DA+HRA;
    net_salary=gross_salary-PF-StaffClubFund;
   
} 
 void show(){
        System.out.println(1+"\t\t"+"Basic pay\t\t\t\t\t"+basicPay);
        System.out.println(2+"\t\t"+"DA\t\t\t\t\t\t"+DA);
        System.out.println(3+"\t\t"+"HRA\t\t\t\t\t\t"+HRA);
        System.out.println(4+"\t\t"+"PF\t\t\t\t\t\t"+PF);
        System.out.println(5+"\t\t"+"ClubFund\t\t\t\t\t"+StaffClubFund);
        System.out.println(6+"\t\t"+"GROSS SALARY\t\t\t\t\t"+gross_salary);
        System.out.println(7+"\t\t"+"NET SALARY\t\t\t\t\t"+net_salary);
    }
}
class Programmer extends Employee{
}
class TeamLead extends Employee{
}
class AssistantProfessorManager extends Employee{
}
class ProjectManager extends Employee{
}
class Assignment3{
    public static void main(String[] args) {
        Programmer e1=new Programmer();
        TeamLead e2=new TeamLead();
        AssistantProfessorManager e3=new AssistantProfessorManager();
        ProjectManager e4=new ProjectManager();
  
       System.out.println("EMPLOYEE 1\n");
       e1.Employee("Programmer",11,888888888,"p1@gmial.com","pune",40000);
       e1.display();
       e1.calculate(40000);
       e1.show();
       System.out.println();
       System.out.println("---------------------------------------------------------------------"); 
       System.out.println("EMPLOYEE 2\n");
       e2.Employee("TeamLead", 12, 999999999, "t1@gmail.com", "kolhpur", 45000);
       e2.display();
       e2.calculate(45000);
       e2.show();
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("EMPLOYEE 3\n");
        e3.Employee("Assistant project manager", 13, 1234567890, "a1@gmail.com", "mumbai", 50000);
        e3.display();
       e3.calculate(50000);
       e3.show();
       System.out.println();
       System.out.println("---------------------------------------------------------------------"); 
       System.out.println("EMPLOYEE 4\n");
       e4.Employee("Project manager", 14, 1234567890, "p2@gmail.com", "nashik", 55000);
        e4.display();
       e4.calculate(55000);
       e4.show();
    }
}

