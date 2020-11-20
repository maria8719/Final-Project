package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Classes
        com.company.UserAccount ua = new com.company.UserAccount();
        Scanner kbInput = new Scanner(System.in);

        //Variables
        int userInput;
        int userChoice;
        double amount;
        String username;
        String password;
        boolean isDone = false;

        while(isDone != true){
            System.out.println("Select 1 to create a new account, 2 for returning users, 3 to exit");
            userInput = kbInput.nextInt();
            if(userInput == 1){
                System.out.println("Thank you for choosing us today" + "\n");
                System.out.println("Please enter an username that is not taken");
                username = kbInput.nextLine();
                System.out.println("\n" + "Please enter a password that is not taken");
                password = kbInput.nextLine();
                ua.getUsers(username, password);
                ua.setUserAccount();
                if(ua.checkDuplicateUserAccount()){
                    ua.deleteDuplicates();
                    System.out.println("Sorry that username or password was taken. Try again.");
                }
                    System.out.println("What operation you would like to do?");
                      do {

                         System.out.println("1. Deposit money");

                         System.out.println("2. Withdraw money");

                         System.out.println("3. Check balance");

                         System.out.print("0 to quit: ");

                         userChoice = kbInput.nextInt();

                  switch (userChoice) {
                   case 1:
                        ua.deposit();
                         break;
                 case 2:
                      // Withdraw();                        
                        break;

                  case 3:
                      // checkBalance();
                        break;

                  case 0:
                        isDone = true;
                        break;

                  default:
                        System.out.println("Wrong choice.");
                        break;
                  }}
                  while (!isDone);
}
                  
                   /*else if(userInput==2){

                        System.out.println("withdraw method goes here");

                    }else if(userInput==3){
                        ua.eee();
                         System.out.println("checkBalance method goes here");

                       
                    }
                }*/
            else if(userInput==2){
                System.out.println("Please enter your username");
                username = kbInput.nextLine();
                System.out.println("\n" + "Please enter your password");
                password = kbInput.nextLine();
                ua.getUsers(username, password);
                if(ua.checkUserAccount()){
                    System.out.println("\n" + "Welcome " + username.substring(0,1).toUpperCase() + username.substring(1));
                    //Structure this block of code similar above in the new account block of code
                }else{
                    System.out.println("One of the information above was entered incorrectly. Please try again");
                }
            }else{
                System.out.println("Thank you for banking with us today.");
                isDone = true;

}
}
}
}