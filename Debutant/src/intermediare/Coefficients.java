package intermediare;

public class Coefficients {

  public static void main(String[] args) {
  
   int n= 4;
   
   System.out.println("Les coefficients de (a+b) puissance "+n+" :");
    for (int i=0;i<=n;i++){
    int z= (findRecursion(n))/(findRecursion(i)*findRecursion(n-i));
    System.out.print(" "+z);
    }
      System.out.println();
  }
  private  static int findRecursion(int num) {
		if (num == 0)
			return 1;
		return (num * findRecursion(num - 1));
	}
	
 
 
 
}
