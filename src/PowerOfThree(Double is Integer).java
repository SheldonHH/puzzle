public class PowerOfThree {
	public static void main(String []args){
		System.out.println(isInteger(2.9));
		//System.out.println(trylog(3));
		//System.out.println(isPowerOfThree(27));
	}
   
    public static boolean isPowerOfThree(int n) {
        if(0 == n)
            return false;
        double res = Math.log(n)/Math.log(3);
        return Math.floor(res) == Math.ceil(res);
       
    }

	public static double trylog(int n){
		return Math.log(n);
	}

	public static boolean isInteger(double number){
    	 return Math.ceil(number) == Math.floor(number);  
	}

}