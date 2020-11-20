package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //Classes
        com.company.UserAccount ua = new com.company.UserAccount();
        //Scanner kbInput = new Scanner(System.in);

        //Variables
        String input1;
        String input2;
        int userInput;
        int userChoice;
        double amount;
        String username;
        String password;
        boolean isDone = false;

        while(isDone != true){
            JOptionPane.showMessageDialog(null, "welcome to our banking system! Click ok to see our menu");
            input1=JOptionPane.showInputDialog("Select:\n 1 to create a new account.\n 2 for returning users.\n 3 to exit.");
            userInput = Integer.parseInt(input1);
            if(userInput == 1){
                JOptionPane.showMessageDialog(null, "Thank you for choosing us today. Please click OK to get Started.\n");
                username=JOptionPane.showInputDialog("Please enter an username that is not taken");
                password=JOptionPane.showInputDialog("\n" + "Please enter a password that is not taken");
                ua.getUsers(username, password);
                ua.setUserAccount();
                if(ua.checkDuplicateUserAccount()){
                    ua.deleteDuplicates();
                    JOptionPane.showMessageDialog(null, "Sorry that username or password was taken. Try again.");
                }
                    
                      do {

                         input2=JOptionPane.showInputDialog("What operation you would like to do?\n"+
                                                               "1. Deposit money \n"+"2. Withdraw money \n"+
                                                               "3. Check balance \n" +"0 to quit: \n");

                          userChoice = Integer.parseInt(input2);

                  switch (userChoice) {
                   case 1:
                        ua.deposit();
                         break;
                 case 2:
                      ua.withdraw();                        
                        break;

                  case 3:
                      // checkBalance();
                        break;

                  case 0:
                        isDone = true;
                        break;

                  default:
                        JOptionPane.showMessageDialog(null,"Wrong choice.");
                        break;
                  }}
                  while (!isDone);
}
                  
                   /* else if(userInput==2){

                        System.out.println("withdraw method goes here");

                    }else if(userInput==3){
                        ua.eee();
                         System.out.println("checkBalance method goes here");

                       
                    }
                }*/
            else if(userInput==2){
                username=JOptionPane.showInputDialog("Please enter your username. \n");
               password= JOptionPane.showInputDialog("Please enter your password");
                ua.getUsers(username, password);
                if(ua.checkUserAccount()){
                    JOptionPane.showMessageDialog(null, "Welcome " + username.substring(0,1).toUpperCase() + username.substring(1));
                    //Structure this block of code similar above in the new account block of code
                }else{
                    JOptionPane.showMessageDialog(null, "One of the information above was entered incorrectly. Please try again");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Thank you for banking with us today.");
                isDone = true;

}
}
}
}