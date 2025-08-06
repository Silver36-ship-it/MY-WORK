import java.util.Scanner;
 public class SwitchCases {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);

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
       
       """ ;
      System.out.println(reading);
      
      System.out.println("Go for an option: ");
 int option = input.nextInt();
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
              int viewMemory = input.nextInt();
              switch(viewMemory){
        case 1: System.out.println("Search"); break;
        case 2: System.out.println("Service Nos"); break;
       case 3: System.out.println("Add name"); break;
       case 4: System.out.println("Erase"); break;
       case 5: System.out.println("Edit"); break;
      case 6: System.out.println("Assign tone"); break;
       case 7: System.out.println("Send business card"); break;
       case 9: System.out.println("Speed dials"); break;
      case 10: System.out.println("Voice tags"); break;
       case 11: System.out.println(reading); break;                   
       case 8 : System.out.println("Options");
              System.out.println("""
              1-> Type of view
              2-> Memory status
              3-> Previous
              """) ;
              
                int viewMemory1 = input.nextInt();
            switch(viewMemory1) {
             case 1 : System.out.println("Type of view"); break;
             case 2 : System.out.println("Memory status"); break;
             case 3 : System.out.println(phoneBook); break;
                                                                 
            default : 
                  System.out.println("Invalid input");
                  
                  
                  } 
                     break;
            default : 
                  System.out.println("Invalid input");
                  }

                     
                 
                 
                    
                 
          
             
              
              
                            
       
              
             
                    
                     
                 switch (option) {
    case 2 :    System.out.println("""
                1-> Write messages
                2-> Inbox
                3-> Outbox
                4-> Picture messages
                5-> Templates
                6-> Smileys
                7-> Messages settings
                8-> Info service
                9-> Voice mailbox number
                10-> Service command editor
                  """) ;
             System.out.println("Choose an option");
              int setCommon = input.nextInt();
            switch(setCommon){
          case 1: System.out.println("Write messages");
               break;
           case 2: System.out.println("Inbox");
               break;
           case 3: System.out.println("Outbox");
               break;
           case 4: System.out.println("Picture messages");
               break;
           case 5: System.out.println("Templates");
               break;
           case 6: System.out.println("Smileys");
               break;
           case 8: System.out.println("Info service");
               break;
          case 9: System.out.println("Voice mailbox number");
               break;
          case 10: System.out.println("Service command editor");
               break;
                              }
                
                   switch(setCommon) {
           case 7 : System.out.println("Messages settings");
                  System.out.println("""
                  1-> Set
                  2-> Common
                  """) ;
                 
                 System.out.println("Enter option");
                    int setCommon1 = input.nextInt();
                   switch(setCommon1){
          case 1 : System.out.println("Set");
                   System.out.println("""
                 1-> Message centre number
                 2-> Messages sent as
                 3-> Message validity
                 """) ;
                 
                     int setCommon2 = input.nextInt();
                    switch(setCommon2){
             case 1 : System.out.println("Message centre number");
             break;
             
             case 2 : System.out.println("Messages sent as");
             break;
             
             case 3 : System.out.println("Message validity");
             break;
             default : System.out.println("Invalid input");
                break;
                }
                

          case 2 : System.out.println("Common");
                   System.out.println("""
                     1-> Delivery reports
                     2-> Reply via same centre
                     3-> Character support
                     """);
                 setCommon2 = input.nextInt();
                 switch(setCommon2){
                   case 1 : System.out.println("Delivery reports");
                   break;
                   case 2 : System.out.println("Reply via same centre");
                   break;
                   case 3 : System.out.println("Character support");
                   break;
                  default : System.out.println("Invalid input");
                break;
                }


                    
                     }
                 } 
                                 

              }   
                                          
                 switch (option) {   
     case 3 : System.out.println("Chat");
                                break;      
              }
               switch (option) {  
     case 4 : System.out.println("Call register");
              System.out.println("""
                  1-> Missed calls
                  2-> Received calls
                  3-> Dialled numbers
                  4-> Erase recent call lists
                  5-> Show call duration
                  6-> Show call costs
                  7-> Call cost settings
                  8-> Prepaid credit
                    """);
               System.out.println("Enter an option : ");
               int showCallCost = input.nextInt();
               switch(showCallCost) {
             case 1: System.out.println("Missed calls");
               break;
           case 2: System.out.println("Received calls");
               break;
           case 3: System.out.println("Dialled numbers");
               break;
           case 4: System.out.println("Erase recent call lists");
               break;
           case 8: System.out.println("Prepaid credit");
               break;
               }
                       switch(showCallCost) {
             case 5 : System.out.println("""
                    1-> Last call duration
                    2-> All calls' duration
                    3-> Received calls' duration
                    4-> Dialled calls' duration
                    5-> Clear counters
                     """);
                     
                     int lastCall = input.nextInt();
                    switch(lastCall){
             case 1 : System.out.println("Last call duration");
             break;
             case 2 : System.out.println("All calls' duration");
             break;
             case 3 : System.out.println("Received calls' duration");
             break;
             case 4 : System.out.println("Dialled calls' duration");
             break;
             case 5 : System.out.println("Clear counters");
             break;}
              break;
                     }
                       switch(showCallCost) {
              case 6 : System.out.println("""
                   1-> Last call cost
                   2-> All calls' cost
                   3-> Clear counters
                     """);
                       int lastCall1 = input.nextInt();
                    switch(lastCall1){
             case 1 : System.out.println("Last call cost");
             break;
             case 2 : System.out.println("All calls' cost");
             break;
             case 3 : System.out.println("Clear counters");
             break; }  
                 break;
                     }
                     switch(showCallCost) {
                case 7 : System.out.println("""
                    1-> Call cost limit
                    2-> Show costs in
                    """);
                      int lastCall2 = input.nextInt();
                    switch(lastCall2){
             case 1 : System.out.println("Call cost limit");
             break;
             case 2 : System.out.println("Show costs in");
             break;}
                    break;
                    }
                    }
                     
                    
                 switch(option) {
        case 5 : System.out.println("Tones");
                 System.out.println("""
                    1-> Ringing tone
                    2-> Ringing volume
                    3-> Incoming call alert
                    4-> Composer
                    5-> Message alert tone
                    6-> Keypad tones
                    7-> Warning and game tones
                    8-> Vibrating alert
                    9-> Screen saver
                      """);                  
                  System.out.println("Choose an option");
                  int tones = input.nextInt();
                  switch(tones){
                case 1: System.out.println("Ringing tone");
                      break;
                case 2: System.out.println("Ringing volume");
                      break;
                case 3: System.out.println("Incoming call alert");
                      break;
                 case 4: System.out.println("Composer");
                       break;
                 case 5: System.out.println("Message alert tone");
                      break;
                 case 6: System.out.println("Keypad tones");
                      break;
                 case 7: System.out.println("Warning and game tones");
                     break;
                 case 8: System.out.println("Vibrating alert");
                     break;
                 case 9: System.out.println("Screen saver");
                     break;}

                      break;
                 }
                 
                 
                 switch(option) {
         case 6 : System.out.println("Settings");
                  System.out.println("""
                    1-> Call settings
                    2-> Phone settings
                    3-> Security settings
                    4-> Restore factory settings
                    """);
                   System.out.println("Enter an option: ");
                   int callPhoneSec = input.nextInt();
                    switch(callPhoneSec) {
                        case 4: System.out.println("Restore factory settings");
                      break;}
                      
                       switch(callPhoneSec) {
                     case 1 : System.out.println("""
                             1-> Automatic redial
                             2-> Speed dialling
                             3-> Call waiting options
                             4-> Own number sending
                             5-> Phone line in use
                             6-> Automatic answer
                               """);
                               int autoSpeed = input.nextInt();
                           switch(autoSpeed){
                           case 1 : System.out.println("Automatic redial");
                               break;
                           case 2 : System.out.println("Speed dialling");
                               break;
                            case 3 : System.out.println("Call waiting options");
                                break;
                            case 4 : System.out.println("Own number sending");
                                break;
                           case 5 : System.out.println("Phone line in use");
                                break;
                           case 6 : System.out.println("Automatic answer"); 
                                break;}
                                 break;
                                 }
                       
                    switch(callPhoneSec) {
                       case 2 : System.out.println("""
                             1-> Language
                             2-> Cell info display
                             3-> Welcome note
                             4-> Network selection
                             5-> Lights
                             6-> Confirm SIM service actions
                              """); 
                               int autoSpeed1 = input.nextInt();
                           switch(autoSpeed1){
                           case 1 : System.out.println("Language");
                               break;
                           case 2 : System.out.println("Cell info display");
                               break;
                            case 3 : System.out.println("Welcome note");
                                break;
                            case 4 : System.out.println("Network selection");
                                break;
                           case 5 : System.out.println("Lights");
                                break;
                           case 6 : System.out.println("Confirm SIM service actions"); 
                                break;}

                              break;}
                              
                    switch(callPhoneSec) {
                        case 3 : System.out.println("""
                               1-> PIN code request
                               2-> Call barring service
                               3-> Fixed dialling
                               4-> Closed user group
                               5-> Phone security
                               6-> Change access codes
                                 """);
                               int autoSpeed2 = input.nextInt();
                           switch(autoSpeed2){
                           case 1 : System.out.println("PIN code request");
                               break;
                           case 2 : System.out.println("Call barring service");
                               break;
                            case 3 : System.out.println("Fixed dialling");
                                break;
                            case 4 : System.out.println("Closed user group");
                                break;
                           case 5 : System.out.println("Phone security");
                                break;
                           case 6 : System.out.println("Change access codes"); 
                                break;}

                               break;
                                }
                                }
                                switch(option) {
             case 7 :    System.out.println("""
                               Call divert
                               """);  
                                 break;      
                                   }
                             switch(option) {
              case 8 :     System.out.println("Games");
                             break;
                             }
                             switch(option) {
                case 9 :   System.out.println("Calculator");
                               break;
                               }
                               switch(option) {
                case 10 : System.out.println("Reminders");
                              break;
                              }
                              switch(option) {
                case 11 :   System.out.println("Clock");
                             System.out.println("""
                           1-> Alarm clock
                           2-> Clock settings
                           3-> Date setting
                           4-> Stopwatch
                           5-> Countdown timer
                           6-> Auto update of date and time
                             """);
                       System.out.println("Choose an option");
                          int clock = input.nextInt();
                          switch(clock){
                           case 1: System.out.println("Alarm clock");
                                 break;
                           case 2: System.out.println("Clock settings");
                                 break;
                           case 3: System.out.println("Date setting");
                                  break;
                           case 4: System.out.println("Stopwatch");
                                  break;
                          case 5: System.out.println("Countdown timer");
                                 break;
                           case 6: System.out.println("Auto update of date and time");
                                  break;}
                                  break;
                              }
                              
                              switch(option) {
                 case 12 : System.out.println("Profiles");
                             break;
                             }
                             switch(option) {
                 case 13 :  System.out.println("SIM services");
                            break;
                                       
                                }   
                                 }
                              }            
                             
                         }
  