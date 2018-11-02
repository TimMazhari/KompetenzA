package garage;

import java.util.ArrayList;

public class ChangeCarAttribute {

    /**
     * Check for every slot in carlist if the control variable matches the choice from the user, and if the slot of the
     * arraylist at the index of the control variable is not null, set status to repaired.
     * @param carList
     * @param choice
     */
    public void repair(ArrayList<Car> carList, int choice){
        for(int i = 0; i < carList.size(); i++) {
            if(i == choice && carList.get(i) != null) {
                carList.get(i).setStatus("repaired");
                try {
                    System.out.println("Repairing car " + carList.get(i).carName + " " + carList.get(i).carModel);
                    Thread.sleep(1000);
                    System.out.println("The car is now repaired.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("Invalid car number.");
            }
        }
    }

    /**
     * method used to change the attribute "sold" from yes to no.
     * @param carList
     * @param bankAccount
     * @param choice
     */
    public void sell(ArrayList<Car> carList, Money bankAccount, int choice){
        for(int i = 0; i < carList.size(); i++){
           if(i == choice && carList.get(i) != null) {
               carList.get(i).setSold(true);
               try {
                   System.out.println("Selling car " + carList.get(i).carName + " " + carList.get(i).carModel);
                   Thread.sleep(2000);
                   bankAccount.setBankAccount(carList.get(i).getValue());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           else{
               System.out.println("Invalid car number.");
           }
        }
    }

    /**
     * method delete is used to actually delete the car from the list.
     * @param carList
     * @param choice
     */
    public void delete(ArrayList<Car> carList, int choice){
        for(int i = 0; i < carList.size(); i++){
            if(i == choice && carList.get(i) != null){
                try{
                    System.out.println("Deleting car " + carList.get(i).carName + " " + carList.get(i).carModel);
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                carList.remove(i);
            }
            else{
                System.out.println("Invalid car number.");
            }
        }
    }

}
