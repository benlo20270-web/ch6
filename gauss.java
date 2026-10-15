public class gauss {

public static void main(String[] args) {
	
	System.out.println(gauess(10.0,1));
	}
	


public static double gauess(double x , int n){
	double sum = 0.0;
	double term = 1.0;
	for (double i = 1.0; i <= n; i=i+1) {
		sum +=term;
		term = term * (-x*x/i);
}
	return sum;
	
}

}
	
