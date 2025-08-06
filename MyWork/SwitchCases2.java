import java.util.Scanner;
 public class SwitchCases2 {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
 int option = 0;
 while(option != 14){
 
 String reading = """
 WELCOME 
     TO
       YOUR 
          NOKIA
              MENU 
                 MAP
   List of menu functions
   1->> Phone book
   2->> Messages
   3->> Chat
   4->> Call register
   5->> Tones
   6->> Settings
   7->> Call divert
   8->> Games
   9->> Calculator
   10->> Reminder
   11->> Clock
   12->> Profiles
   13->> SIM services
   14->> Exit
       
       """ ;
      System.out.println(reading);
         
      System.out.println("Go for an option: ");
    option = input.nextInt();
  
      int viewMemory = 0;
 while(viewMemory != 11){
   switch (option) {
   case 1 : System.out.println("Phone book");
             String phoneBook = """
              1-> Search
              2-> Service Nos.
              3-> Add name
              4-> Erase
              5-> Edit
              6-> Assign tone
              7-> Send business card
              8-> Options
              9-> Speed dials
              10-> Voice tags
              11-> Go back to Previous Menu
              """ ;  
              
                  System.out.println(phoneBook);
           System.out.println("Go for an option: ");
               viewMemory = input.nextInt();
              switch(viewMemory){
        case 1: System.out.println("Search");
               break;
        case 2: System.out.println("Service Nos");
               break;
       case 3: System.out.println("Add name");
               break;
       case 4: System.out.println("Erase");
               break;
       case 5: System.out.println("Edit");
               break;
      case 6: System.out.println("Assign tone");
               break;
       case 7: System.out.println("Send business card");
               break;
       case 9: System.out.println("Speed dials");
               break;
      case 10: System.out.println("Voice tags");
               break;
       case 11: System.out.println(reading);
               break;
                  
       case 8 : System.out.println("Options");
              System.out.println("""
              1-> Type of view
              2-> Memory status
              3-> Previous
              """) ; 
             
              
             int viewMemory1 = 0;
               while(viewMemory1 != 3){
              
                 viewMemory1 = input.nextInt();
            switch(viewMemory1) {
             case 1 : System.out.println("Type of view");
             break;
             case 2 : System.out.println("Memory status");
             break;
             case 3 : System.out.println(phoneBook);
                       viewMemory = input.nextInt(); break;
            default : 
                  System.out.println("Invalid input");
                  }
                  }
        
                           
              
        case 14 :   System.out.println("Thanks for using nokia");
                     }
             }
                       }       
                   }
                   }
                    }
                   
                   
                   
                   
   