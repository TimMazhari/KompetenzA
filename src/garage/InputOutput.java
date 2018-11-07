package garage;

import java.util.Scanner;

/**
 * Input for normal Strings. This is used for reading the car attributes.
 */
public class InputOutput {
    private String input;
        public String inputManager() {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        sc.close();
        return input;
    }

    /**
     * Input for number.
     * checking if the first read input string contains chars other than numbers. if so, ask the user to enter a number.
     */
    private int inputNumber;
    private String inputNumberString;
    public int inputManagerNumber(int tempNumber) {
        Scanner scNumber = new Scanner(System.in);
        while (tempNumber == 0){
            inputNumberString = scNumber.nextLine();
            if(inputNumberString.matches("[a-zA-Z]+")){
                System.out.println("Please enter a number:");
            }
            else{
                inputNumber = Integer.parseInt(inputNumberString);
                tempNumber = 1;
            }
        }
        scNumber.close();
        return inputNumber;
    }

    /**
     * Special Scanner for the car attribute "Status" this is needed because the Status needs to be
     * "broken" or "repaired".
     */
    private String inputBroken;
    public String inputManagerBroken(int tempBroken) {
        Scanner scBroken = new Scanner(System.in);
        while (tempBroken == 0){
            inputBroken = scBroken.nextLine();
            if(inputBroken.toLowerCase().equals("broken")){
                tempBroken = 1;
            }
            else if(inputBroken.toLowerCase().equals("repaired")){
                tempBroken = 1;
            }
            else{
                System.out.println("Please enter valid input: 'broken' or 'repaired'");
                tempBroken = 0;
            }
        }
        scBroken.close();
        return inputBroken;
    }


    /**
     * Separate scanner for the car attribute "sold". Because the user writes "yes" or "no", this is needed to even set
     * the boolean value.
     */
    private boolean inputBool;
    private String inputBoolString;
    public boolean inputManagerBool(int tempBool) {
        Scanner scBool = new Scanner(System.in);
       while(tempBool == 0) {
           inputBoolString = scBool.nextLine();
           if (inputBoolString.toLowerCase().equals("yes")) {
               inputBool = true;
               tempBool = 1;
           } else if (inputBoolString.toLowerCase().equals("no")) {
               inputBool = false;
               tempBool = 1;
           } else {
               System.out.println("Please enter 'yes' or 'no'");
           }
       }
       scBool.close();
        return inputBool;
    }


    public String getInput() {
        return input;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public String getInputBroken() {
        return inputBroken;
    }

    public boolean isInputBool() {
        return inputBool;
    }
}
