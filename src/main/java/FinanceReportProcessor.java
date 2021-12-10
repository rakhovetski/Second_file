
public class FinanceReportProcessor
{
    public static FinanceReport getNameStartOnChar(FinanceReport report, char a){
        int count = 0;
        for(int i = 0; i < report.getReports().length; i++){
            if(report.getPayment(i).getFullName().charAt(0) == a){
                count++;
            }
        }
        FinanceReport financeReport = new FinanceReport(count);
        financeReport.setFullName(report.getFullName());
        financeReport.setPaymentYear(report.getPaymentYear());
        financeReport.setPaymentMonth(report.getPaymentMonth());
        financeReport.setPaymentDay(report.getPaymentDay());
        int place = 0;
        for(int i = 0; i < report.getReports().length; i++){
            if(report.getPayment(i).getFullName().charAt(0) == a){
                financeReport.setPayment(report.getPayment(i),place);
                place++;
            }
        }
        return financeReport;

    }

    public static FinanceReport lowSize(FinanceReport report, int a){
        int count = 0;
        for(int i = 0; i < report.getReports().length; i++){
            if(report.getPayment(i).getSumInPenny() < a){
                count++;
            }
        }

        FinanceReport financeReport = new FinanceReport(count);
        financeReport.setFullName(report.getFullName());
        financeReport.setPaymentYear(report.getPaymentYear());
        financeReport.setPaymentMonth(report.getPaymentMonth());
        financeReport.setPaymentDay(report.getPaymentDay());
        int place = 0;
        for(int i = 0; i < report.getReports().length; i++){
            if(report.getPayment(i).getSumInPenny() < a){
                financeReport.setPayment(report.getPayment(i), place);
                place++;
            }
        }
        return financeReport;
    }


}