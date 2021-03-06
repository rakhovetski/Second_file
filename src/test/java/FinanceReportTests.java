import org.junit.Test;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;

public class FinanceReportTests {
    @Test
    public void financeRepTest1(){
        Payment payment1 = new Payment("Романовский Иван", 2021, 10,20,10000);
        Payment payment2 = new Payment("Асаевич Никита", 2020, 5,10,1231);
        FinanceReport financeReport = new FinanceReport("Раховецкий Андрей Олегович", 2021, 11, 27, payment1,payment2);
        assertEquals(2,financeReport.getReports().length);
    }

    @Test
    public void financeReportToStringTest(){
        Payment payment1 = new Payment("Романовский Иван", 2021, 10,20,10000);
        Payment payment2 = new Payment("Асаевич Никита", 2020, 5,10,1201);
        FinanceReport financeReport = new FinanceReport("Раховецкий Андрей Олегович", 2021, 11, 27, payment1,payment2);
        assertEquals(financeReport.toString(),"[Автор: Раховецкий Андрей Олегович, дата :27.11.2021, Платежи: [Плательщик: Романовский Иван, дата: 2021.10.20 сумма: 100 руб. 00 коп.\n" +
                ",Плательщик: Асаевич Никита, дата: 2020.5.10 сумма: 12 руб. 01 коп.\n" +
                ",]]");
    }

    @Test
    public void constructorCopyTest(){
        Payment payment1 = new Payment("Романовский Иван", 2021, 10,20,10000);
        Payment payment2 = new Payment("Асаевич Никита", 2020, 5,10,1231);
        FinanceReport financeReport = new FinanceReport("Раховецкий Андрей Олегович", 2021, 11, 27, payment1,payment2);
        FinanceReport financeReport1 = new FinanceReport(financeReport);
        assertEquals(financeReport.toString(),financeReport1.toString());
        financeReport.getPayment(0).setSumInPenny(55555);
        assertNotEquals(55555, financeReport1.getPayment(0).getSumInPenny());
    }

    @Test
    public void financeReportProcessorTest1(){
        Payment payment1 = new Payment("Романовский Иван", 20, 10,2021,10000);
        Payment payment2 = new Payment("Асаевич Никита", 20, 5,2010,1231);
        FinanceReport financeReport = new FinanceReport("Раховецкий Андрей Олегович", 2021, 11, 27, payment1, payment2);
        FinanceReport res = FinanceReportProcessor.getNameStartOnChar(financeReport, 'Р');
        String s = res.toString();
        assertEquals("[Автор: Раховецкий Андрей Олегович, дата :27.11.2021, Платежи: [Плательщик: Романовский Иван, дата: 20.10.2021 сумма: 100 руб. 00 коп.\n" +
                ",]]",s);
        /*
        * Выходит ошибка java.lang.NullPointerException: Cannot invoke "Payment.getFullName()" because "this.payments[i]" is null
        * не понимаю как её решить
        * */
    }

    @Test
    public void lowSizeTest1(){
        Payment payment1 = new Payment("Романовский Иван", 20, 10,2021,10000);
        Payment payment2 = new Payment("Асаевич Никита", 20, 5,2010,1231);
        FinanceReport financeReport = new FinanceReport("Раховецкий Андрей Олегович", 2021, 11, 27, payment1,payment2);
        FinanceReport res = FinanceReportProcessor.lowSize(financeReport,7000);
        String s = res.toString();
        assertEquals("[Автор: Раховецкий Андрей Олегович, дата :27.11.2021, Платежи: [Плательщик: Асаевич Никита, дата: 20.5.2010 сумма: 12 руб. 31 коп.\n" +
                ",]]",s);
        /*
         * Выходит ошибка java.lang.NullPointerException: Cannot invoke "Payment.getFullName()" because "this.payments[i]" is null
         * не понимаю как её решить
         * */
    }

}
