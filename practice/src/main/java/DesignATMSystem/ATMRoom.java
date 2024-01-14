package DesignATMSystem;


import DesignATMSystem.ATMState.IdleState;

public class ATMRoom {
    User user;
    ATM atm;

    public void initialize() {
        this.user = new User(1, new Card(791, 1234, 1234, new BankAccount(500)));
        this.atm = new ATM(new IdleState(), 1000, 1, 1, 14);
    }

    public static void main(String[] args) throws Exception {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        atmRoom.atm.displayAtm();
//        //drive 1
//        atmRoom.atm.atmState.insertCard(atmRoom.atm, atmRoom.user.card);
//        atmRoom.atm.atmState.authenticatePin(atmRoom.atm, atmRoom.user.card, 1234);
//        atmRoom.atm.atmState.selectOperation(atmRoom.atm, ATMOperation.CHECK_BALANCE);
//        atmRoom.atm.atmState.checkBalance(atmRoom.atm, atmRoom.user.card);

        //drive 2
        atmRoom.atm.atmState.insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.atmState.authenticatePin(atmRoom.atm, atmRoom.user.card, 1234);
        atmRoom.atm.atmState.selectOperation(atmRoom.atm, ATMOperation.CASH_WITHDRAWL);
        atmRoom.atm.atmState.cashWithdrawl(atmRoom.atm, atmRoom.user.card, 50);

        atmRoom.atm.displayAtm();

    }
}
