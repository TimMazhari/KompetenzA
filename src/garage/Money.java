package garage;

public class Money {
    /**
     * getters and setters for the bank account. bank account is used to display the money.
     * @return
     */
    public int getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(int bankAccount) {
        this.bankAccount = getBankAccount() + bankAccount;
    }
    int bankAccount;
}
