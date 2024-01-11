import java.util.Random;
import java.util.Scanner;

public class EmployeeWage
{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int employee_wage =20;
        int full_day_hour=8;
        int emp_attend=(int) Math.floor(Math.random() * 2);
        Scanner s=new Scanner(System.in);
        System.out.println("1.Daily Wage"+"\n"+"2.Part-Time"+"\n"+"3.Monthly Wage");
        if(emp_attend == 0)
        {
            System.err.println("the employee is absent");

        }
        else
        {

            int option=s.nextInt();
            System.out.println("1");
            
            switch (option) {
                case 1:
                    System.out.println("the daily wage"+" "+employee_wage*full_day_hour);
                    break;
                case 2:
                     System.out.println("the part time wage"+" "+employee_wage*full_day_hour);
                    break;
                case 3:
                       System.out.println("the monthly wage"+" "+employee_wage*full_day_hour*20+100*20);
                    break;
                default:
                    break;
            }

        }
    }
}