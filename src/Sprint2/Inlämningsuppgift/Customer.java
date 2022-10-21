package Sprint2.Inlämningsuppgift;

import java.time.LocalDate;

public  class  Customer {
    protected String birthNumber;
    protected String fullName;
    protected LocalDate paymentDate;
    public Customer(String birthNumber, String fullName, LocalDate paymentDate){
        this.birthNumber = birthNumber;
        this.fullName = fullName;
        this.paymentDate = paymentDate;
    }
}
