import java.util.*;
import java.lang.*;
import java.io.*;
class GoodSet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sin=new Scanner(System.in);
		int n,i;
		int t=sin.nextInt();
		int arr[]={1,2,4,7,10,13,16,19,22,25,28,31,34,37,40,43,46,49,52,55,58,61,64,67,70,73,76,79,82,85,88,91,94,97,100,103,106,109,112,115,118,121,124,127,130,133,136,139,142,145,148,151,154,157,160,163,166,169,172,175,178,181,184,187,190,193,196,199,202,205,208,211,214,217,220,223,226,229,232,235,238,241,244,247,250,253,256,259,262,265,268,271,274,277,280,283,286,289,292,295};
		while(t>0){
			
			n=sin.nextInt();
		
			for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
}
