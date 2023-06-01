//Maximum number of handshakes in java

public class Maximum_HandShake {

  public static void main(String[] args) {
    
    Sol obj = new Sol();
    int hs = 0;
   hs= obj.maxHandshake(8);
   System.out.println("Maximum Handshakes: "+hs);

  }    
}

class Sol
{
    public int maxHandshake (int n)
    {
        int hs = 0;
        hs = n *(n-1)/2;
        return hs;
    }
}