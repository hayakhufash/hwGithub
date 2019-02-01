package haya;
public class haya {
	  public static void main(String[] args) 
	    { 
		  
	       hw x;
	       x=new hw();
	       System.out.println("x="+x);
	       System.out.println("hayakhufash");
	    } 
	}
class hw {
	private int h ;
	public hw()
	{
		h=10;
		}
  @Override
  public String toString(){
  	String p = "Class hw:H=" + h;
  	return p;
  }
}
