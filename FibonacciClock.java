
public class FibonacciClock{
	void setHColors(int[] hArr, char[] clockColorArr);
	void setMColors(int[] mArr, char[] clockColorArr);
	void setVoidColors(char[] clockColorArr);
	void setHMArrays(int hour, int min, int[] hArr, int[] mArr);
	void resetHMArrays(int[] hArr, int[] mArr, char[] clockColorArr);
	void displayClockColorArr(char[] clockColorArr);
	void waitFor(unsigned int secs);
	int i;
	
	public char[] getTileColors(){
		int hour, min;
		int hArr[5], mArr[5];
		char clockColorArr[5];
		Calendar calendar = Calendar.getInstance();
		//calendar.setTime(yourdate);
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour == 0)
			hour = 12;
		if(hour > 12)
			hour = hour-12;
		min  = calendar.get(Calendar.MINUTE);
		resetHMArrays( hArr, mArr, clockColorArr);
		setHMArrays( hour, min, hArr, mArr);
		setHColors(hArr, clockColorArr);
		setMColors(mArr, clockColorArr);
		setVoidColors(clockColorArr);
		
		displayClockColorArr(clockColorArr);
		return clockColorArr;
	}
	
	void resetHMArrays(int[] hArr, int[] mArr, char[] clockColorArr){
		for(int i =0 ; i < 5 ; i++){
			hArr[i] = 0;
			mArr[i] = 0;
			clockColorArr[i] = '/0';
		}
	}
	
	void setHColors(int[] hArr, char[] clockColorArr){
		for(int i=0; i<5; i++){
			if(hArr[i]==1){
				clockColorArr[i] = 'R';
			}
		}
	}
	
	void setMColors(int[] mArr, char[] clockColorArr){
		for(int i=0; i<5; i++){
			if(mArr[i]==1 && clockColorArr[i]=='R'){
				clockColorArr[i] = 'B';
			}
			else if(mArr[i]==1 && clockColorArr[i]!='R'){
				clockColorArr[i] = 'G';
			}
		}
	}
	
	void setVoidColors(char[] clockColorArr){
		for(int i=0; i<5; i++){
			if(clockColorArr[i]!='R' && clockColorArr[i]!='B' && clockColorArr[i]!='G'){
				clockColorArr[i] = 'W';
			}
		}
	}
	
	void setHMArrays(int hour, int min, int[] hArr, int[] mArr){
		int fibMins;
		switch(hour){
			case(1):
				hArr[0] = 1;
				break;
			case(2):
				hArr[2] = 1;
				break;
			case(3):
				hArr[3] = 1;
				break;
			case(4):
				hArr[0] = 1;
				hArr[3] = 1;
				break;
			case(5):
				hArr[4] = 1;
				break;
			case(6):
				hArr[0]=1;
				hArr[4]=1;
				break;
			case(7):
				hArr[2]=1;
				hArr[4]=1;
				break;
			case(8):
				hArr[3]=1;
				hArr[4]=1;
				break;
			case(9):
				hArr[0]=1;
				hArr[3]=1;
				hArr[4]=1;
				break;
			case(10):
				hArr[2]=1;
				hArr[3]=1;
				hArr[4]=1;
				break;
			case(11):
				hArr[0]=1;
				hArr[2]=1;
				hArr[3]=1;
				hArr[4]=1;
				break;
			case(12):

				hArr[0]=1;
				hArr[1] = 1;
				hArr[2]=1;
				hArr[3]=1;
				hArr[4]=1;
				break;
		}

		fibMins = min/5;

		switch(fib_mins){
			case(1):
				mArr[0] = 1;
				break;
			case(2):
				mArr[2] = 1;
				break;
			case(3):
				mArr[3] = 1;
				break;
			case(4):
				mArr[0] = 1;
				mArr[3] = 1;
				break;
			case(5):
				mArr[4] = 1;
				break;
			case(6):
				mArr[0]=1;
				mArr[2]=1;
				mArr[3]=1;
				break;
			case(7):
				mArr[2]=1;
				mArr[4]=1;
				break;
			case(8):
				mArr[3]=1;
				mArr[4]=1;
				break;
			case(9):
				mArr[0]=1;
				mArr[3]=1;
				mArr[4]=1;
				break;
			case(10):
				mArr[2]=1;
				mArr[3]=1;
				mArr[4]=1;
				break;
			case(11):
				mArr[0]=1;
				mArr[2]=1;
				mArr[3]=1;
				mArr[4]=1;
				break;
			case(12):
				mArr[0]=1;
				mArr[1]=1;
				mArr[2]=1;
				mArr[3]=1;
				mArr[4]=1;
				break;	
		}
	}
	
	void displayClockColorArr(char[] clockColorArr){
		for(int i = 0; i < 5; i++){
			printf("%c",clockColorArr[i]);
		}
	}
}
