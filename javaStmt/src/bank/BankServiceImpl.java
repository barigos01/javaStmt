package bank;

import java.util.Vector;

/**
 * @file : BankServiecImpl.java
 * @author eunji
 * @date 2016. 3. 10.
 * @story 뱅크 서비스 비즈니스 로직
 */
public class BankServiceImpl implements BankService{
	private AccountBean account;
	Vector<AccountBean> accountList;
	
	public BankServiceImpl() {
		accountList = new Vector<>();
	}
	
	@Override
	public Vector<AccountBean> openAccount(AccountBean account) {
		// 계좌 개설
		accountList.add(account);
		return accountList;
	}

	@Override
	public String deposit(int accountNo, int money) {
		// 입금
		String result = "입금 실패";
		
		account = findMoney(accountNo);

		if (accountList.contains(account)) {
			account.setMoney(account.getMoney()+money);
			
			result = "입금 성공";
		}
		
		return result;
	}

	@Override
	public String withdraw(int accountNo, int password, int money) {
		// 출금
		String result = "출금 실패";

		account = findMoney(accountNo);
		
		if (accountList.contains(account)) {
			if (account.getPassword() == password) {
				account.setMoney(account.getMoney() - money);
				
				result = "출금 성공";
			}
		}
		
		return result;
	}

	@Override
	public AccountBean findMoney(int accountNo) {
		// 잔액조회
		AccountBean tempAccount = new AccountBean();
		
		for (int i = 0; i < accountList.size(); i++) {
			int searchAccount = accountList.get(i).getAccountNo();	// 벡터
			
			if (searchAccount == accountNo) {
				tempAccount = accountList.get(i);
				break;
			}
		}		
		
		return tempAccount;
	}
	
}
