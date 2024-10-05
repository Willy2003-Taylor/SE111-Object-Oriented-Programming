import Book.BookList;
import User.Admin;
import User.Normal;
import User.User;
import frame.frame;

import java.util.Scanner;

import static Operation.operation.input;

public class App {
    public static User Login(){
        System.out.println("Please enter your name: ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("Please ensure your identity(1-> admin 2-> normaluser");
        int option=input.nextInt();
        if(option==1){
            return new Admin(name);
        }
        else{
            return new Normal(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList=new BookList();
        frame a=new frame();
        System.out.println("Do you want to use frame? 1>Yes 2>No");
        String ans = input.nextLine();
        if(ans.equals("1")){
            a.frame1();
        }else{
            while(true){
                User user=Login();
                int option=user.menu();
                user.choose(option, bookList);
            }
        }

    }
}