import java.util.Objects;

class Payment{
    private String fullName;
    private int paymentDay;
    private int paymentMonth;
    private int paymentYear;
    private int sumInPenny;

    public Payment(String fullName, int paymentDay, int paymentMonth, int paymentYear, int sumInPenny){
        this.fullName = fullName;
        this.paymentDay = paymentDay;
        this.paymentMonth = paymentMonth;
        this.paymentYear = paymentYear;
        this.sumInPenny = sumInPenny;
    }

    String getFullName(){
        return fullName;
    }

    int getPaymentDay(){
        return paymentDay;
    }

    int getPaymentMonth(){
        return paymentMonth;
    }

    int getPaymentYear(){
        return paymentYear;
    }

    int getSumInPenny(){
        return sumInPenny;
    }

    void setFullName(String fullName){
        this.fullName = fullName;
    }

    void setPaymentDay(int paymentDay){
        this.paymentDay = paymentDay;
    }

    void setPaymentMonth(int paymentMonth){
        this.paymentMonth = paymentMonth;
    }

    void setPaymentYear(int paymentYear){
        this.paymentYear = paymentYear;
    }

    void setSumInPenny(int sumInPenny){
        this.sumInPenny = sumInPenny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paymentDay == payment.paymentDay && paymentMonth == payment.paymentMonth && paymentYear == payment.paymentYear && sumInPenny == payment.sumInPenny && Objects.equals(fullName, payment.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, paymentDay, paymentMonth, paymentYear, sumInPenny);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "fullName='" + fullName + '\'' +
                ", paymentDay=" + paymentDay +
                ", paymentMonth=" + paymentMonth +
                ", paymentYear=" + paymentYear +
                ", sumInPenny=" + sumInPenny +
                '}';
    }
}