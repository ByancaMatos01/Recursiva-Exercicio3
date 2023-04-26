package Controller;

public class ControllerFat {
 public static int fatorial(int n) {
	 // codição de parada 
	 if(n<0) {
		 return 0;
	 }
	 
	 else if (n==0) {
		 return 1; 
	 } else {
		 
	 }
	return n*fatorial(n-1); // codição de chamada 

 }
}
