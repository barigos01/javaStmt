package bank;
/**
 * @file : BankServiecImpl.java
 * @author eunji
 * @date 2016. 3. 10.
 * @story 뱅크 서비스 비즈니스 로직
 */
public class BankServiecImpl implements BankService{

	@Override
	public String openAccount(AccountBean acc) {
		// 계좌 개설
		return null;
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		return null;
	}

	@Override
	public AccountBean[] findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
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
	
}
