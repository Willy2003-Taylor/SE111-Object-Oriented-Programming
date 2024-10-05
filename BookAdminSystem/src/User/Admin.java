package User;

import Operation.*;
import java.util.Scanner;

public class Admin extends User{
    public Admin(String name){
        super(name);
        this.operations=new operation[5];
        operations[0]=new Exit();
        operations[1]=new Find();
        operations[2]=new Add();
        operations[3]=new Delete();
        operations[4]=new Show();
    }
    public int menu(){
        System.out.println("******************************");
        System.out.println("Welcome to the Library Administration System.");
        System.out.println("1: Find the book");
        System.out.println("2: Add the book");
        System.out.println("3: Delete the book");
        System.out.println("4: Show the book");
        System.out.println("0: Exit the system");
        System.out.println("******************************");
        System.out.println("Enter your option.");
        Scanner input=new Scanner(System.in);
        int option=input.nextInt();
        return option;
    }
}
