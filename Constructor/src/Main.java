public class Main {

    public static void main(String[] args) {

//        bankAccount accountLinda = new bankAccount(); //1234567, 54513.78, "Linda", "linda_hasmoney@gmail.com","0318745896" );
//
//        System.out.println(accountLinda.getAccountNumber());
//        System.out.println(accountLinda.getBalance());
//        System.out.println(accountLinda.getCustomerName());
//        System.out.println(accountLinda.getEmail());
//        System.out.println(accountLinda.getPhoneNumber());
//
//        accountLinda.withdraw(20000);
//        accountLinda.deposit(40000);
//
//        bankAccount accountEelco = new bankAccount("Eelco", "eelco@gmail.com", "1234567890");
//        System.out.println(accountLinda.getAccountNumber() + " name " + accountEelco.getCustomerName());

        VipCustomer Linda = new VipCustomer();
        System.out.println(Linda.getName());
        VipCustomer John = new VipCustomer(50000);
        System.out.println(John.getName()+ " has a credit limit of " + John.getCreditLimit() + ". Email him on: " + John.getEmail());


        VipCustomer Eelco = new VipCustomer("Eelco", 40000, "eelcothbest@besties.com");
        System.out.println(Eelco.getName());
    }

}
