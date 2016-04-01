package Variable;

public class Session2assig2 {
	public static void main(String[] args)
	{    
	    int x, y;
	    boolean prime=true;
	    for(x=1; x<=100; x++)
	    {
	    prime=true;
	    for(y=2; y<x && prime==true; y++)
	    {
	    	if(x%y==0)
	    	{
	    	prime=false;
	    	}
	    }
	    if (prime==true)
	    {
	    	System.out.print(x+"\t");
	    }
	    }
	}
}
