package bank;

import java.util.Vector;

/**
 * @file : BankServiecImpl.java
 * @author eunji
 * @date 2016. 3. 10.
 * @story 뱅크 서비스 비즈니스 로직
 */
public class AdminServiceImpl implements AdminService{
	private AccountBean account;
	Vector<AccountBean> accountList;
	
	public AdminServiceImpl() {
		accountList = new Vector<>();
	}
	
	@Override
	public Vector<AccountBean> openAccount(AccountBean account) {
		// 계좌 개설
		accountList.add(account);
		return accountList;
	}

	@Override
	public Vector<AccountBean> getList() {
		// 전체 계좌 목록 출력
		return accountList;
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo() == accountNo) {
				return accountList.get(i);
			}
		}
		return null;
	}

	@Override
	public Vector<AccountBean> findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		Vector<AccountBean> tempList = new Vector<AccountBean>();
		
		for (int i = 0; i < accountList.size(); i++) {
			if(name.equals(accountList.get(i).getName())) {
				tempList.add(accountList.get(i));
			}
		}
		return tempList;
	}

	@Override
	public AccountBean closeAccount(int accountNo) {
		// 계좌 해지
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo() == accountNo) {
				return accountList.remove(i);
			}
		}
		return null;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return accountList.size();
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getName() == name) {
				return accountList.size();
			}
		}
		return 0;
	}
	
}
