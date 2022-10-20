package Sprint2.Inlämningsuppgift;

import java.time.LocalDate;

public class Customer {

    protected String birtNumber;
    protected String fullName;
    protected LocalDate paymentDate;

    public Customer(String birtNumber, String fullName, LocalDate paymentDate){
        this.birtNumber = birtNumber;
        this.fullName = fullName;
        this.paymentDate = paymentDate;
    }

    public LocalDate getPaymentDate(){
        return paymentDate;
    }
}
