package example.big_decimal.yixia;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MyMoney {

	public static void main(String[] args) {
		MyMoney mm = new MyMoney();
		mm.getInput();
	}
	
	public void getInput(){
		Scanner scan = new Scanner(System.in);
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Please input your money:");
		BigDecimal price = new BigDecimal(1.25);
		BigDecimal deposit = new BigDecimal(scan.nextDouble());
		BigDecimal change = deposit.multiply(price);
		change.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		System.out.println(n.format(change));
		
		
	}
	
	public BigDecimal depositMoney(){
		
		return null;
		
	}
}
