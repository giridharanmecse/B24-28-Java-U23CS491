import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer noOfRoles;
        System.out.println("Enter the no of Roles");
        noOfRoles = sc.nextInt();
        sc.nextLine();
        EmployeeRole [] rolearr = employeeRoleArr(noOfRoles,sc);
        System.out.println("Enter No of Employees");
        Integer noOfEmployee = sc.nextInt();
        sc.nextLine();
        Employee [] empArr = new Employee[noOfEmployee];
        Integer id;
        String name;
        EmployeeRole erole = null;
        Double salary;
        Employee e;
        for(int i=0;i<noOfEmployee;i++){
            System.out.println("Employee Id:");
            id = Integer.parseInt(sc.nextLine());
            System.out.println("Employee Name");
            name = sc.nextLine();
            displayEmployeeRole(rolearr);            
            System.out.println("Enter your choice");
            Integer choice = Integer.parseInt(sc.nextLine());
            for(EmployeeRole er:rolearr){
                if(choice.equals(er.getId())){
                    erole = er;
                    break;
                }
            }
            System.out.println("Employee Salary");
            salary = Double.parseDouble(sc.nextLine());
            e = new Employee(id, name, erole, salary);
            empArr[i] = e;
        }
        System.out.println("Select the Employee role To disply the Employee List");
        displayEmployeeRole(rolearr);
        Integer choice = Integer.parseInt(sc.nextLine());
        for(EmployeeRole er:rolearr){
            if(choice.equals(er.getId())){
                erole = er;
                break;
            }
        }
        System.out.println("Employee List based on the Role "+erole.getRole());
        for(Employee e1:empArr){
            if(e1.getRole().getId().equals(erole.getId())){
                System.out.println(e1);
            }
        }
        System.out.println("Thanks");
        sc.close();
    }

    public static EmployeeRole[] employeeRoleArr(Integer noOfRoles,Scanner sc){
        EmployeeRole [] rolearr = new EmployeeRole[noOfRoles];
        Integer id;
        String role;
        EmployeeRole er;
        for(int i=0;i<noOfRoles;i++){
            System.out.println("Enter the Role ID");
            id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Role Name");
            role = sc.nextLine();
            er = new EmployeeRole(id, role);
            rolearr[i] = er;
        }
        return rolearr;
    }

    public static void displayEmployeeRole(EmployeeRole [] rolearr){
        for(EmployeeRole er:rolearr){
                System.out.println(er);
        }
    }
    
}
