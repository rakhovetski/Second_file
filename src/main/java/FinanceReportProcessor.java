
public class FinanceReportProcessor
{
    public static FinanceReport getNameStartOnChar(FinanceReport report, char a){
        FinanceReport financeReport = new FinanceReport(report.getReports().length);
        financeReport.setFullName(report.getFullName());
        financeReport.setPaymentYear(report.getPaymentYear());
        financeReport.setPaymentMonth(report.getPaymentMonth());
        financeReport.setPaymentDay(report.getPaymentDay());
        int count = 0;
        for(int i = 0; i < report.getReports().length; i++){
            if(report.getPayment(i).getFullName().charAt(0) == a){
                financeReport.setPayment(report.getPayment(i),count);
                count++;
            }
        }
        return financeReport;

    }

    public static FinanceReport lowSize(FinanceReport report, int a){
        FinanceReport financeReport = new FinanceReport(report.getReports().length);
        financeReport.setFullName(report.getFullName());
        financeReport.setPaymentYear(report.getPaymentYear());
        financeReport.setPaymentMonth(report.getPaymentMonth());
        financeReport.setPaymentDay(report.getPaymentDay());
        for(int i = 0; i < report.getReports().length; i++){
            int count = 0;
            if(report.getPayment(i).getSumInPenny() < a){
                financeReport.setPayment(report.getPayment(i), count);
                count++;
            }
        }
        return financeReport;
    }


}