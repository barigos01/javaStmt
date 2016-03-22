package ifelse;

public class BigNumber {
	// public BigNumber() {}
	
		public int getBigNumber(int a, int b, int c){
			int big = 0;
			
			if(a>b || a>c){
				big = a;
			} else if(b>c){
				big = b;
			} else{
				big = c;
			}
			
	/*		if (a>b) {
				if (a>c) {
					big = a;
				} else{
					big = c;
				}
			} else {
				if(b>c){
					big = b;
				} else{
					big = c;
				}
				
			}*/
			
			return big;
		}
}
