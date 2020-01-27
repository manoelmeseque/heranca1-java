package application;
import java.util.Locale;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		BusinessAccount conta = new BusinessAccount(1111, "Jose da Silva", 1000.0, 500.0);
		System.out.println(conta);
	}

}
