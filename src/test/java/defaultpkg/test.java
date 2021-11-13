package defaultpkg;

public class test {
	public static void main (String[] args){
		System.out.println("largest number in array is " +largest());
	}
	static int numbers[] = {9,8,2,3};
	static int largest (){
		int i;
		int max =numbers[0]; 
		for(i=1;i<numbers.length;i++){
			if(numbers[i]>max)  {
				max =numbers[i];    
			return max;
		}
		}
		return max;
	}
	}

