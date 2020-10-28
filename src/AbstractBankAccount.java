public abstract class AbstractBankAccount {

  // class variables
  String accountName;
  int accountNum;
  int balance;

  public final String BANK = "JavaBank";

  AbstractBankAccount(String name, int num, int amt) {
    accountName = name;
    accountNum = num;
    balance = amt;
  }


  public abstract void deposit(int amt);

  //make a withdrawal from the balance
  public void withdraw(int amt) {
    balance = balance - amt;
  }

  public int getBalance() {
    return balance;
  }

  public String getBankName() {
    return InterfaceBankAccount.BANK;
  }

  //modifier to set the accountname
  public void setAccountName(String name) {
    accountName = name;
  }

  //modifier to set the accountnumber
  public void setAccountNum(int num) {
    accountNum = num;
  }

  //modifier to set the balance
  public void setBalance(int num) {
    balance = num;
  }

  //accessor to get the accountname
  public String getAccountName() {

    return accountName;
  }

  //accessor to get the accountnumber
  public int getAccountNum() {

    return accountNum;
  }

  @Override
  public String toString() {
    return "\n\nBank Name : " + getBankName() +
        "\nAccount Holder : " + accountName +
        "\nAccount Number : " + accountNum +
        "\nAccount balance: " + balance;

  }//end method toString

  //accessor to get the account balance
  public int getbalance() {

    return balance;
  }

}//end class AbstractBankAccount