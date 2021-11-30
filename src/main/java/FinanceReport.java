import java.util.Objects;

class FinanceReport{
    private Payment[] payments;
    private String fullName;
    private int paymentYear;
    private int paymentMonth;
    private int paymentDay;
    public FinanceReport(String fullName, int paymentYear, int paymentMonth, int paymentDay,Payment...payments){
        this.fullName = fullName;
        this.paymentYear = paymentYear;
        this.paymentMonth = paymentMonth;
        this.paymentDay = paymentDay;
        this.payments = payments;
    }
    public FinanceReport(int n)
    {
        payments = new Payment[n];
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPaymentYear(int paymentYear) {
        this.paymentYear = paymentYear;
    }
    public void setPaymentMonth(int paymentMonth) {
        this.paymentMonth = paymentMonth;
    }
    public void setPaymentDay(int paymentDay) {
        this.paymentDay = paymentDay;
    }

    public String getFullName() {
        return fullName;
    }
    public int getPaymentYear() {
        return paymentYear;
    }
    public int getPaymentMonth() {
        return paymentMonth;
    }
    public int getPaymentDay() {
        return paymentDay;
    }

    public Payment getPayment(int i){
        return payments[i];
    }
    public void setPayment(Payment payment, int i){

        this.payments[i] = payment;
    }

    public Payment[] getReports(){

        return payments;
    }

    @Override
    public String toString() {
        StringBuilder main_string = new StringBuilder();
        String first_string = "[Автор: %s, дата :%d.%d.%d, Платежи: [";
        main_string.append(String.format(first_string, fullName, paymentDay, paymentMonth, paymentYear));
        String t = "Плательщик: %s, дата: %d.%d.%d сумма: %d коп.\n,";

        for(int i = 0; i < payments.length; i++){
            main_string.append(String.format(t, payments[i].getFullName(), payments[i].getPaymentDay(), payments[i].getPaymentMonth(), payments[i].getPaymentYear(), payments[i].getSumInPenny()));
        }
        main_string.append("]]");
        System.out.println(main_string);
        return main_string.toString();
    }

    public FinanceReport copy(){
        Payment[] paym = new Payment[this.payments.length];
        paym = this.payments;
        FinanceReport fin = new FinanceReport(this.fullName, this.paymentYear, this.paymentMonth, this.paymentDay, paym);
        return fin;
    }

    public String getPaymentFullName(int i){
        return payments[i].getFullName();
    }
}

