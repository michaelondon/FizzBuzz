
public class FizzBuzz {

	int count = 0;

	public String say() {
		return say(1);
	}
		
	
	public String say(int times) {
		count += times;
		
		if (isFizz()==0 && isBuzz()){
			return "FizzBuzz";
		}
		
		if (isFizz()==0) {
			return "Fizz";
		}
		if (count %5==0){
			return "Buzz";
					
	}
		return "" + count;
 }


	private int isFizz() {
		return count %3;
	}
	
	private boolean isBuzz(){
		return count %5==0;
	}
}	
