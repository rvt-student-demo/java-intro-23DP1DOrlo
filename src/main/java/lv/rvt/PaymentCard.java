package lv.rvt;

public class PaymentCard {
        private double balance;
        private double amount;
    
        public PaymentCard(double openingBalance) {
            this.balance = openingBalance;
        }
        
        @Override
        public String toString() {
            return "The card has a balance of "+ balance + " euros";
        }
x
        public void eatAffordably() {
            if(balance - 2.60 >= 0) {
                balance -= 2.60;
            }
        }
        
        public void eatHeartily() {
            if(balance - 4.60 >= 0) {
                balance -= 4.60;
            }        
        }

        public void addMoney(double amount) {
            if(amount < 0){
                balance = balance;
            }
            else if(balance + amount > 150){
                balance = 150;
            }
            else {
                balance += amount;
            }
        }
    }
