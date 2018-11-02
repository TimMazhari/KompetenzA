package garage;

import java.util.ArrayList;

public class main {

    /**
     * Creating arraylist and array.
     * ArrayList "carList" is where the whole cars will be saved.
     * Array "carAttributes" is where the individual attributes will be saved (name, color etc.)
     */
    private static ArrayList<Car> carList = new ArrayList<>();
    private static String[] carAttributes = new String[4];

    public static void main(String [ ] args){
        /**
         * Creating the objects which will be needed throughout the program.
          */
        ClearScreen screen = new ClearScreen();
        InputOutput menuInput = new InputOutput();
        InputOutput inputOutput = new InputOutput();
        CarListOutput listOutput = new CarListOutput();
        Money bankAccountOne = new Money();
        ChangeCarAttribute changeCar = new ChangeCarAttribute();

        /**
         * clearing the screen once for a normal output.
         * getting user input which will be needed to determine the following action.
         * boolean "close" is needed to shut down the program if wanted.
         */
        screen.clearScreen();
        System.out.println("What you want to do? (type 'help' for a menu list):");
        String menuInputString = menuInput.inputManager();
        boolean close = false;


        do {
            if (menuInputString.toLowerCase().equals("new car")) {

                /**
                 * asking for the car attributes and saving the user input
                 * creating "value" and "sold". These are attributes needed to create the car
                 */
                int value;
                boolean sold;
                System.out.println("Name:");
                carAttributes[0] = inputOutput.inputManager(); //TEST111k kjbj

                System.out.println("Model:");
                carAttributes[1] = inputOutput.inputManager();

                System.out.println("Color:");
                carAttributes[2] = inputOutput.inputManager();

                System.out.println("Status:");
                carAttributes[3] = inputOutput.inputManagerBroken(0);

                System.out.println("Value (in $):");
                value = inputOutput.inputManagerNumber(0);

                System.out.println("Sold (Yes or No):");
                sold = inputOutput.inputManagerBool(0);
                /**
                 * Adding new slot to the arraylist "carList". Filling the slot with a newly created object "Car".
                 * "Car" contains the attributes saved in the array "carAttributes" in addition to the variables "value"
                 * and "sold"
                 */
                carList.add(new Car(carAttributes[0], carAttributes[1], carAttributes[2], carAttributes[3], value, sold));
                System.out.println("New Car added  to garage.");
            }

            else if (menuInputString.toLowerCase().equals("display cars")) {
                /**
                 * using method "regularCarListOutput" which creates a normal output of the cars in the arrayList "carList"
                 * with all their attributes.
                 */
                if(carList.size() > 0){
                    listOutput.regularCarListOutput(carList);
                }
                else{
                    System.out.println("No cars to display.");
                }
            }

            else if (menuInputString.toLowerCase().equals("repair car")) {
                /**
                 * create a output of the cars which have set the attribute "Status" to "broken".
                 * integer "choice" is needed by the method "repair". "choice" will determine which car, if wanted, will be repaired.
                 */
                if(carList.size() > 0) {
                    int choice;
                    listOutput.brokenCarListOutput(carList);
                    choice = inputOutput.inputManagerNumber(0);
                    changeCar.repair(carList, choice);
                }
                else{
                    System.out.println("No cars are broken.");
                }
            }
             else if(menuInputString.toLowerCase().equals("sell car")){
                /**
                 * First, check if the carList even contains any cars which could be sold. If not, print out that there
                 * are no cars available.
                 * Output a list of the cars with the attribute "Sold" will be printed.
                 * Attribute "Sold" will be changed from no to yes in the chosen car.
                 */
                if(carList.size() > 0) {
                        listOutput.unsoldCarListOutput(carList);
                        int choice = inputOutput.inputManagerNumber(0);
                        changeCar.sell(carList, bankAccountOne, choice);
                }
                else{
                    System.out.println("No cars available to sell");
                }
             }
             else if(menuInputString.toLowerCase().equals("help")){
                /**
                 * Help list outpout
                 */
                System.out.println("Here is a list of the possible commands with a short description:");
                System.out.println("New car (creates a new car)");
                System.out.println("Display cars (displays a list of all the cars)");
                System.out.println("Repair car (displays a list of the broken cars and lets you repair one)");
                System.out.println("Sell car (displays a list of the unsold cars and lets you sell one)");
                System.out.println("Delete car (delete a car out of the list)");
                System.out.println("Get money (display your money)");
                System.out.println("Close (exits the program)");
            }
             else if(menuInputString.toLowerCase().equals("get money")){
                /**
                 * getBankAccount prints out the current money available
                 */
                 System.out.println("You have " + bankAccountOne.getBankAccount() + "$");
            }
            else if(menuInputString.toLowerCase().equals("delete car")){
                /**
                 * Check if there are any cars in arraylist carlist. if so, print out a list of all the cars in the program.
                 * choice is the input which determines the car that will be deleted.
                 */
                if(carList.size() > 0) {
                    listOutput.regularCarListOutput(carList);
                    System.out.println("Which car do you want to delete?");
                    int choice = inputOutput.inputManagerNumber(0);
                    changeCar.delete(carList, choice);
                }
                else{
                    System.out.println("No cars available to delete");
                }
            }
            else{
                System.out.println("Unknown command. Type 'help' for a list of the available commands");
            }
            System.out.println("What you want to do? (type 'help' for a menu list):");
            menuInputString = inputOutput.inputManager();
            screen.clearScreen();
            if(menuInputString.toLowerCase().equals("close")){
                close = true;
            }

        }while (close == false);
    }
}