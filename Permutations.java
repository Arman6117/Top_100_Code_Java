// Permutations in which n people can occupy r seats in a classroom in java


public class Permutations {

    public static void main(String[] args) {
        Sol obj = new Sol();
        obj.canOccupy(5, 9);
    }
    
}

class Sol
{
    public void canOccupy (int n,int r)
    {
        int factn = 1,factno = 1,per = 0;
        
        for(int i = 1; i <=n;i++)
        {
            factn = factn * i;
        }
        int no = n -r;
        for(int i = 1; i <=no;i++)
        {
            factno = factno * i;
        }
        
        per = factn / factno;

        System.out.println(per);
    }
}