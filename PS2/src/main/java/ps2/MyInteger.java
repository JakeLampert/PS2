package ps2;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int newValue){
		iValue = newValue;
	}

	public int getiValue(){
		return iValue;
	}
	public boolean isEven(){
		if (iValue % 2 == 0){
			return true;
		}
		return false;
	
	}
	public boolean isOdd(){
		if (iValue % 2 != 0){
			return true;
		}
		return false;
	}
	public boolean isPrime(){
		for(int i=2;i<iValue;i++){
			if(iValue % i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int x){
		if (x % 2 == 0){
			return true;
		}
		return false;
		
	}
	public static boolean isOdd(int x){
		if (x % 2 == 0){
			return true;
		}
		return false;
	}
	public static boolean isPrime(int x){
		for(int i=2;i<x;i++){
			if(x % i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger x){
		if (x.iValue % 2 == 0){
			return true;
		}
		return false;
		
	}
	public static boolean isOdd(MyInteger x){
		if (x.iValue % 2 == 0){
			return true;
		}
		return false;
	}
	public static boolean isPrime(MyInteger x){
		for(int i=2;i<x.iValue;i++){
			if(x.iValue % i==0)
				return false;
		}
		return true;
	}
	public boolean equals(int x){
		if (x == iValue){
		return true;
	}
	return false;
	}
	public boolean equals(MyInteger x){
		if (x.iValue==iValue){
			return true;
		}
		return false;
	}
}
	
