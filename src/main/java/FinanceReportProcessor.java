
class FinanceReportProcessor
{
    /* Филиппов А.В. 05.12.2021 Комментарий не удалять.
     Не работает! Отобрали мы платежи по букве, хотим посмотреть результат.
     И получаем исключение. Вы об этом написали в комментарии )))

    Решать отладчиком.
    Ставим точку остановки на
        String s = FinanceReportProcessor.getNameStartOnChar(financeReport, 'Р').toString();
    и пошагово идем пока не поймем где ловим null.
    Потом есть не меньше двух очевидных путей исправления.

    */
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