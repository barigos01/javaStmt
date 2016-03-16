package bank;

import java.util.Vector;

public interface BankService {
	/**
	 * 계좌 개설
	 */
	public Vector<AccountBean> openAccount(AccountBean account);
	/**
	 * 입금
	 */
	public String deposit(AccountBean account);
	/**
	 * 출금
	 */
	public String withdraw(AccountBean account);
	/**
	 * 잔액조회
	 */
	public AccountBean findMoney(int accountNo);
}
