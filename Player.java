package DoomLand;

public class Player extends Character
{
    //===================|Character properties|======================//

        private int energy = 100;
        
    //======================|Access Functions|=======================//

        //Set the player's name.
        public void setEnergy( int iEnergy )
        {
            energy = iEnergy;
        }

        //Return the player's name.
        public int getEnergy()
        {
            return energy;
        }

        //Increase player's energy
        public void incEnergy( int iEnergyInc )
        {
            energy += iEnergyInc;
        }

        //Decrease player's energy
        public void DecEnergy( int iEnergyDec )
        {
            energy -= iEnergyDec;
        }

    //===============================================================//
}
