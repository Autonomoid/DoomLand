package DoomLand;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Quit status.
        int quit = 0;

        // Welcome Message.
        welcomeMessage();

        // Create new player.
        Player mainPlayer = new Player();

        // Main control loop.
        while ( quit == 0)
        {
            quit = GameLogic();
        }

        //Quit message.
        quitMessage( mainPlayer );
    }

    //Quit message function definition.
    static void quitMessage( Player iMainPlayer )
    {
        System.out.println("...until next time," + iMainPlayer.getName() + ".");
    }

    //Welcome message function definition.
    static void welcomeMessage()
    {
        System.out.println("Welcome to DoomLand...");
    }

    static int GameLogic()
    {
        int quitStatus = 0;
        String userCommand = "";
        Scanner logicScanner = new Scanner( System.in );

        //Prompt user for a command.
        System.out.println("What would you like to do?");
        userCommand = logicScanner.nextLine();

        switch( CommandLookUp( userCommand ) )
        {
            case 1    : quitStatus = 1; 
                        break;
                
            case 2    : printMenu(); 
                        break;
                
            case 0    : System.out.println("I'm not sure what you mean."); 
                        break;
                
            default   : System.out.println("I'm not sure what you mean."); 
                        break;
        }

        return quitStatus;
    }
    
    public static int CommandLookUp( String iUserCommand )
    {   
        if( iUserCommand.equals( "quit" ) )
        {
            return 1;
        }
        
        if( iUserCommand.equals( "help" ) )
        {
            return 2;
        }
        
        return 0;
    }
    
    public static void printMenu()
    {
        System.out.println("====================================");
        System.out.println("\tCOMMAND LIST\n");
        System.out.println("quit - quits the game");
        System.out.println("help - displays this menu\n");
        System.out.println("====================================");
    }
}
