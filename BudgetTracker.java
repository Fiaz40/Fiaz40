import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBudget = 0;
        double totalExpense = 0;
        
        System.out.println("Welcome to the Budget Tracker!");
        System.out.print("Enter your total budget: $");
        totalBudget = scanner.nextDouble();
        
        while(true) {
            System.out.println("\n1. Add an expense");
            System.out.println("2. View total expenses");
            System.out.println("3. View remaining budget");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter expense amount: $");
                    double expenseAmount = scanner.nextDouble();
                    totalExpense += expenseAmount;
                    System.out.println("Expense added successfully!");
                    break;
                case 2:
                    System.out.println("Total expenses: $" + totalExpense);
                    break;
                case 3:
                    double remainingBudget = totalBudget - totalExpense;
                    System.out.println("Remaining budget: $" + remainingBudget);
                    break;
                case 4:
                    System.out.println("Exiting Budget Tracker. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}