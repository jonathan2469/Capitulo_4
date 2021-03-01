/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;
import java.util.GregorianCalendar;

/**
 *
 * @author jonat
 */
public class CertificateOfDeposit {
    private int certficate_number;
    private String lastName;
    private double balance;
    private GregorianCalendar issue_date;
    private GregorianCalendar maturity_date;
    
    public CertificateOfDeposit(int c, String l, double b, int d, int m, int y){
        this.certficate_number = c;
        this.lastName = l;
        this.balance = b;
        this.issue_date = new GregorianCalendar(y,m-1,d);
        this.maturity_date = new GregorianCalendar(y+1, m-1, d+1);
        
    }

    public int getCertficate_number() {
        return certficate_number;
    }

    public void setCertficate_number(int certficate_number) {
        this.certficate_number = certficate_number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public GregorianCalendar getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(GregorianCalendar issue_date) {
        this.issue_date = issue_date;
    }

    public GregorianCalendar getMaturity_date() {
        return maturity_date;
    }

    public void setMaturity_date(GregorianCalendar maturity_date) {
        this.maturity_date = maturity_date;
    }

    @Override
    public String toString() {
        return "CertificateOfDeposit{" + "certficate_number=" + certficate_number + ", lastName=" + lastName + ", balance=" + balance + ", issue_date=" + issue_date.get(GregorianCalendar.DAY_OF_MONTH) +"/" + (issue_date.get(GregorianCalendar.MONTH)+1) + "/" + issue_date.get(GregorianCalendar.YEAR) + ", maturity_date=" + maturity_date.get(GregorianCalendar.DAY_OF_MONTH) +"/" + (maturity_date.get(GregorianCalendar.MONTH)+1) + "/" + maturity_date.get(GregorianCalendar.YEAR) + '}';
    }
}
