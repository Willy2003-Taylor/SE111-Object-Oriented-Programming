package User;

import Operation.*;
import java.util.Scanner;

public class Normal extends User{
    public Normal(String name){
        super(name);
        this.operations=new operation[4];
        operations[0]=new Exit();
        operations[1]=new Find();
        operations[2]=new Borrow();
        operations[3]=new Return();
    }
    public int menu(){
        System.out.println("******************************");
        System.out.println("Welcome to the Library Administration System.");
        System.out.println("1: Find the book");
        System.out.println("2: Borrow the book");
        System.out.println("3: Return the book");
        System.out.println("0: Exit the system");
        System.out.println("******************************");
        System.out.println("Enter your option.");
        Scanner input=new Scanner(System.in);
        int option=input.nextInt();
        return option;
    }
}