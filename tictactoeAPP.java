import java.io.*;
import java.util.*;
import java.lang.String;
/**
 * The game of Tic tac toe is played through here
 * 
 * @Hanifa Hotelwala
 * @version 1.0
 */
public class tictactoeAPP
{

    public static void main(String []args) 
    {
        // preparing for input
        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);              
        String inData="";

        //declaring and initializing variables
        Board board1 = new Board(); 
        Pieces pieces = new Pieces(); 
        String player1=""; 
        String player2="";
        char p1 =pieces.getx();
        char p2 = pieces.geto(); 
        int choice = -1; 
        int choice1 = -1;

        //  String choice1; 
        int count =0; 
        do{
            //Menu
            System.out.println("------------------------------------");
            System.out.println("Let's play Tic Tac Toe!");
            System.out.println("Enter one of the following commands: ");
            System.out.println("1 - One player game");
            System.out.println("2 - Two player game");
            System.out.println("3 - Exit the program");
            System.out.println("------------------------------------");
            System.out.println();
            System.out.println("Enter \"1\", \"2\", \"3\" ");

            try{
                inData = br.readLine();                
                choice = Integer.parseInt(inData);
                if (choice <1 || choice > 3) {
                    System.out.println();
                    System.out.println("Invalid entry. Please enter 1, 2, or 3. ");
                    try{
                        inData = br.readLine();              
                        choice = Integer.parseInt(inData);
                    }
                    catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                        System.out.println("Error. You didn't enter a valid number. Try again. ");
                    }
                    catch (Exception e){  //catches the invalid user input and continues to run the program
                        System.out.println("Error. Invalid input. Try again. ");
                    }

                }
            }

            catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                System.out.println("Error. You didn't enter a valid number. Try again. ");
            }
            catch (Exception e){   //catches the invalid user input and continues to run the program
                System.out.println("Error. Invalid input. Try again. ");
            }

            if(choice ==1)
            {
                System.out.println("\nPlease enter the name of Player1"); 
                try{
                    inData = br.readLine(); 
                    player1 = inData; 
                }
                catch(Exception e){
                    System.out.println("Error. Invalid input. Try again. "); 
                }

                player2 = "Computer"; 

            }

            if(choice ==2)
            {
                System.out.println("\nPlease enter the name of Player-1"); 
                try{
                    inData = br.readLine();
                    player1 = inData; 
                }
                catch(Exception e){
                    System.out.println("Error. Invalid input. Try again. "); 
                }

                System.out.println("\nPlease enter the name of Player-2"); 
                try{
                    inData = br.readLine(); 
                    player2 = inData; 
                }
                catch(Exception e){
                    System.out.println("Error. Invalid input. Try again. "); 
                }

            }
            if (choice == 3)
            break; 
            
            System.out.println(); 
            System.out.println("\nWelcome "+player1+" and "+player2+"! Let's play a game of Tic Tac Toe.\n\nHere is the board:\n  "); 
            board1.drawboard(); 
            System.out.println("\nHow to play:\n1. To select the position on the board first enter a value for the X-Axis \nthen enter a value for the Y-Axis.\n");
            System.out.print("2. If you select a position that is already taken you get to re-select a spot.\n\n3. First one to get three in a row WINS!!\n\n"); 
            System.out.println(player1+" is assigned to: '"+p1+"' \t\t "+player2+" is assigned to '"+p2+"'.");

            System.out.println("\n ====================== Let's play ======================");
            do{
                System.out.println("\n"+player1+"'s Turn: "); 
                System.out.println("\nEnter X-Axis: 0 , 1, or 2"); 
                try{

                    inData = br.readLine();                
                    choice = Integer.parseInt(inData);
                    if (choice <0 || choice >2 ){
                        System.out.println();
                        System.out.println("Invalid entry. Please enter a value from 0-2. ");
                        try{
                            inData = br.readLine();              
                            choice = Integer.parseInt(inData);
                        }
                        catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                            System.out.println("Error. You didn't enter a valid number. Try again. ");
                        }
                        catch (Exception e){  //catches the invalid user input and continues to run the program
                            System.out.println("Error. Invalid input. Try again. ");
                        }

                    }
                }
                catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                    System.out.println("Error. You didn't enter a valid number. Try again. ");
                }
                catch (Exception e){   //catches the invalid user input and continues to run the program
                    System.out.println("Error. Invalid input. Try again. ");
                }

                System.out.println("\nEnter Y-Axis: 0 , 1, or 2"); 
                try{

                    inData = br.readLine();                
                    choice1 = Integer.parseInt(inData);
                    if (choice<0 || choice >2) {
                        System.out.println();
                        System.out.println("Invalid entry. Please enter a value from 0-2. ");
                        try{
                            inData = br.readLine();              
                            choice1 = Integer.parseInt(inData);
                        }
                        catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                            System.out.println("Error. You didn't enter a valid number. Try again. ");
                        }
                        catch (Exception e){  //catches the invalid user input and continues to run the program
                            System.out.println("Error. Invalid input. Try again. ");
                        }

                    }
                }
                catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                    System.out.println("Error. You didn't enter a valid number. Try again. ");
                }
                catch (Exception e){   //catches the invalid user input and continues to run the program
                    System.out.println("Error. Invalid input. Try again. ");
                }

                if ( board1.checkBoard(choice, choice1) == true)
                   { board1.playBoard(choice, choice1, p1);
                     if(board1.checkWin(player1,player2)== true)
                    {
                        System.out.println("\nGAME OVER! "); 
                        break; 
                }}
                else
                {
                    System.out.println("\t\t\t***** This spot is already taken! TRY AGAIN *****"); 
                    System.out.println("\nEnter X-Axis: 0 , 1, or 2"); 
                    try{

                        inData = br.readLine();                
                        choice = Integer.parseInt(inData);
                        if (choice <0 || choice >2 ){
                            System.out.println();
                            System.out.println("Invalid entry. Please enter a value from 0-2. ");
                            try{
                                inData = br.readLine();              
                                choice = Integer.parseInt(inData);
                            }
                            catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                                System.out.println("Error. You didn't enter a valid number. Try again. ");
                            }
                            catch (Exception e){  //catches the invalid user input and continues to run the program
                                System.out.println("Error. Invalid input. Try again. ");
                            }

                        }
                    }
                    catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                        System.out.println("Error. You didn't enter a valid number. Try again. ");
                    }
                    catch (Exception e){   //catches the invalid user input and continues to run the program
                        System.out.println("Error. Invalid input. Try again. ");
                    }
                    System.out.println("\nEnter Y-Axis: 0 , 1, or 2"); 
                    try{

                        inData = br.readLine();                
                        choice1 = Integer.parseInt(inData);
                        if (choice<0 || choice >2) {
                            System.out.println();
                            System.out.println("Invalid entry. Please enter a value from 0-2. ");
                            try{
                                inData = br.readLine();              
                                choice1 = Integer.parseInt(inData);
                            }
                            catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                                System.out.println("Error. You didn't enter a valid number. Try again. ");
                            }
                            catch (Exception e){  //catches the invalid user input and continues to run the program
                                System.out.println("Error. Invalid input. Try again. ");
                            }

                        }
                    }
                    catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                        System.out.println("Error. You didn't enter a valid number. Try again. ");
                    }
                    catch (Exception e){   //catches the invalid user input and continues to run the program
                        System.out.println("Error. Invalid input. Try again. ");
                    }

                    board1.playBoard(choice, choice1, p1);
                     if(board1.checkWin(player1,player2)== true)
                    {
                        System.out.println("\nGAME OVER! "); 
                        break; 
                }
                }

                System.out.println("\n"+player2+"'s Turn: "); 
                System.out.println("\nEnter X-Axis: 0 , 1, or 2"); 
                try{

                    inData = br.readLine();                
                    choice = Integer.parseInt(inData);
                    if (choice <0 || choice >2 ){
                        System.out.println();
                        System.out.println("Invalid entry. Please enter a value from 0-2. ");
                        try{
                            inData = br.readLine();              
                            choice = Integer.parseInt(inData);
                        }
                        catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                            System.out.println("Error. You didn't enter a valid number. Try again. ");
                        }
                        catch (Exception e){  //catches the invalid user input and continues to run the program
                            System.out.println("Error. Invalid input. Try again. ");
                        }

                    }
                }
                catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                    System.out.println("Error. You didn't enter a valid number. Try again. ");
                }
                catch (Exception e){   //catches the invalid user input and continues to run the program
                    System.out.println("Error. Invalid input. Try again. ");
                }
                System.out.println("\nEnter Y-Axis: 0 , 1, or 2"); 
                try{

                    inData = br.readLine();                
                    choice1 = Integer.parseInt(inData);
                    if (choice<0 || choice >2) {
                        System.out.println();
                        System.out.println("Invalid entry. Please enter a value from 0-2. ");
                        try{
                            inData = br.readLine();              
                            choice1 = Integer.parseInt(inData);
                        }
                        catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                            System.out.println("Error. You didn't enter a valid number. Try again. ");
                        }
                        catch (Exception e){  //catches the invalid user input and continues to run the program
                            System.out.println("Error. Invalid input. Try again. ");
                        }

                    }
                }
                catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                    System.out.println("Error. You didn't enter a valid number. Try again. ");
                }
                catch (Exception e){   //catches the invalid user input and continues to run the program
                    System.out.println("Error. Invalid input. Try again. ");
                }

                if ( board1.checkBoard(choice, choice1) == true)
                  {  board1.playBoard(choice, choice1, p2); 
                     if(board1.checkWin(player1,player2)== true)
                    {
                        System.out.println("\nGAME OVER! "); 
                        break; 
                } 
            }
                else
                {
                    System.out.println("\t\t\t***** This spot is already taken! TRY AGAIN *****");
                    System.out.println("\nEnter X-Axis: 0 , 1, or 2"); 
                    try{

                        inData = br.readLine();                
                        choice = Integer.parseInt(inData);
                        if (choice <0 || choice >2 ){
                            System.out.println();
                            System.out.println("Invalid entry. Please enter a value from 0-2. ");
                            try{
                                inData = br.readLine();              
                                choice = Integer.parseInt(inData);
                            }
                            catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                                System.out.println("Error. You didn't enter a valid number. Try again. ");
                            }
                            catch (Exception e){  //catches the invalid user input and continues to run the program
                                System.out.println("Error. Invalid input. Try again. ");
                            }

                        }
                    }
                    catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                        System.out.println("Error. You didn't enter a valid number. Try again. ");
                    }
                    catch (Exception e){   //catches the invalid user input and continues to run the program
                        System.out.println("Error. Invalid input. Try again. ");
                    }
                    System.out.println("\nEnter Y-Axis: 0 , 1, or 2"); 
                    try{

                        inData = br.readLine();                
                        choice1 = Integer.parseInt(inData);
                        if (choice<0 || choice >2) {
                            System.out.println();
                            System.out.println("Invalid entry. Please enter a value from 0-2. ");
                            try{
                                inData = br.readLine();              
                                choice1 = Integer.parseInt(inData);
                            }
                            catch (NumberFormatException ne){ //catches the invalid user input and continues to run the program
                                System.out.println("Error. You didn't enter a valid number. Try again. ");
                            }
                            catch (Exception e){  //catches the invalid user input and continues to run the program
                                System.out.println("Error. Invalid input. Try again. ");
                            }

                        }
                    }
                    catch (NumberFormatException ne){    //catches the invalid user input and continues to run the program
                        System.out.println("Error. You didn't enter a valid number. Try again. ");
                    }
                    catch (Exception e){   //catches the invalid user input and continues to run the program
                        System.out.println("Error. Invalid input. Try again. ");
                    }
                    board1.playBoard(choice, choice1, p2);
                    if(board1.checkWin(player1,player2)== true)
                    {
                        System.out.println("\nGAME OVER! "); 
                        break; 
                }

                if(choice == 3) {
                    //exits the program
                    System.out.print("\n");
                    System.out.print("You decided to exit the program. Bye!");

                }

        
            }
        }
            while (choice != 3);
          
        

        
    }
     while (choice != 3);
     
     if(choice == 3) 
     {
                //exits the program
                System.out.print("\n");
                System.out.print("You decided to exit the program. Bye!");

            }
}
}
