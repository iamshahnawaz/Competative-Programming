
public class SqaureRootUsingBS {
	public static int sqrt(int A) {
	  if(A==1) return 1;	
	  long ans=0;	
	  int low=1,high=A/2;
	  long mid=0;
	  while(low<=high){
		mid=(high-low)/2+low;
		
		if(mid*mid<=A){
		  ans=mid;
		  low=(int)mid+1;
		}
		else high=(int)mid-1;
		  
	  }
	  System.out.println(ans);
	  return (int)ans;
	}

	public static void main(String[] args) {
	   sqrt(10);
	}

}
