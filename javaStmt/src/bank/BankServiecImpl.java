package bank;
/**
 * @file : BankServiecImpl.java
 * @author eunji
 * @date 2016. 3. 10.
 * @story 뱅크 서비스 비즈니스 로직
 */
public class BankServiecImpl implements BankService{
	private AccountBean account;
	
	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		AccountBean bean = new AccountBean(name, password);
		return bean.toString();
	}

	@Override
	public String deposit(int money) {
		// 입금
		return null;
	}

	@Override
	public String withdraw(int money) {
		// 출금
		return null;
	}

	@Override
	public String findMoney() {
		// 잔액조회
		return null;
	}
	

	
}
