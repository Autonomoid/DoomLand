package DoomLand;
import java.util.Scanner;

public class Character
{
    //===================|Character properties|======================//

        private String name = "Traveller";

    //===================|Default constructor|=======================//

        Character()
        {
           setName( askName() );
        }

    //======================|Access Functions|=======================//

        //Set the character's name.
        public void setName( String iName )
        {
            name =  iName;
        }

        //Return the character's name.
        public String getName()
        {
            return name;
        }

        //Ask for a name.
        public String askName()
        {
            Scanner nameScanner = new Scanner(System.in);
            System.out.println("I've not seen you around these parts before. What's your name, traveller?\n");
            return nameScanner.nextLine();
        }

    //===============================================================//
}
