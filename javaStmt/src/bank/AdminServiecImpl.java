package bank;

import java.util.Vector;

/**
 * @file : BankServiecImpl.java
 * @author eunji
 * @date 2016. 3. 10.
 * @story 뱅크 서비스 비즈니스 로직
 */
public class AdminServiecImpl implements AdminService{
	private AccountBean account;
	Vector<AccountBean> accountList;
	
	public AdminServiecImpl() {
		accountList = new Vector<>();
	}
	
	@Override
	public void openAccount(AccountBean account) {
		// 계좌 개설
		accountList.add(account);
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
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getName() == name) {
				return accountList;
			}
		}
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		return null;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return 0;
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		return 0;
	}
	
}
