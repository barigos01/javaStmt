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
	public String deposit(AccountBean account) {
		// 입금
		String result = "입금 실패";
		AccountBean searchAccount = findMoney(account.getAccountNo());
		
		if (accountList.contains(searchAccount)) {
			searchAccount.setMoney(account.getMoney());
			
			result = "입금 성공";
		}
		
		return result;
	}

	@Override
	public String withdraw(AccountBean account) {
		// 출금
		String result = "출금 실패";
		AccountBean searchAccount = findMoney(account.getAccountNo());
		AccountBean searchPassword = findMoney(account.getPassword());
		AccountBean searchMoney = findMoney(account.getMoney());
		
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.contains(searchAccount) && accountList.contains(searchPassword)) {
				if (searchMoney != null) {
					searchAccount.setMoney(accountList.get(i).getMoney() - account.getMoney());
					
					result = "출금 완료";
				} else {
					result = "잔액 없음";
				}
				
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
