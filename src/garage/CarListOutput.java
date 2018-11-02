package garage;

import java.util.ArrayList;

public class CarListOutput {
    /**
     * Formated output for the "repair car" list output.
     * @param carList
     */
    public void brokenCarListOutput(ArrayList<Car> carList){
        System.out.println("The following cars are registered as broken:");
        System.out.format("%20s %20s %20s %20s %20s %20s %20s", "Car Number", "Car Name", "Car Model", "Car Color", "Car Status", "Car Value", "Sold");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < carList.size(); i++) {
            if(carList.get(i).getStatus().toLowerCase().equals("broken")){
                String valueString = String.valueOf(carList.get(i).getValue());
                String soldString = "";
                if(carList.get(i).isSold()){
                    soldString = "Yes";
                }
                else if(!carList.get(i).isSold()){
                    soldString = "No";
                }
                System.out.format("%20d %20s %20s %20s %20s %20s %20s",
                        i, carList.get(i).getCarName(), carList.get(i).getCarModel(), carList.get(i).getColor(), carList.get(i).getStatus(), valueString, soldString);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Which one do you want to repair? (enter car number):");
    }

    /**
     * Formated output for the "sell car" list.
     * @param carList
     */
    public void unsoldCarListOutput(ArrayList<Car> carList){
        System.out.println("The following cars are registered as unsold:");
        System.out.format("%20s %20s %20s %20s %20s %20s %20s", "Car Number", "Car Name", "Car Model", "Car Color", "Car Status", "Car Value", "Sold");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < carList.size(); i++) {
            if(!carList.get(i).isSold()){
                String valueString = String.valueOf(carList.get(i).getValue());
                String soldString = "";
                if(carList.get(i).isSold()){
                    soldString = "Yes";
                }
                else if(!carList.get(i).isSold()) {
                    soldString = "No";
                }
                System.out.format("%20d %20s %20s %20s %20s %20s %20s",
                        i, carList.get(i).getCarName(), carList.get(i).getCarModel(), carList.get(i).getColor(), carList.get(i).getStatus(), valueString, soldString);
                System.out.println();
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Which one do you want to sell? (enter car number):");
    }

    /**
     * Formated output for the "display cars" list. 
     * @param carList
     */

    public void regularCarListOutput(ArrayList<Car> carList){
        System.out.format("%20s %20s %20s %20s %20s %20s %20s", "Car Number", "Car Name", "Car Model", "Car Color", "Car Status", "Car Value", "Sold");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < carList.size(); i++) {
            String valueString = String.valueOf(carList.get(i).getValue());
            String soldString = "";
            if(carList.get(i).isSold()){
                soldString = "Yes";
            }
            else if(!carList.get(i).isSold()){
                soldString = "No";
            }
            System.out.format("%20d %20s %20s %20s %20s %20s %20s",
                    i, carList.get(i).getCarName(), carList.get(i).getCarModel(), carList.get(i).getColor(), carList.get(i).getStatus(), valueString, soldString);
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
