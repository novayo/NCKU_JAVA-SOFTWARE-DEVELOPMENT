package test;

public class Store {
	  public static void main(String[] args) {
	Payment p1 = new CreditCardPayment(); 
	p1.checkout();
	Payment p2 = new Payment();
	p2.checkout();
	 }}