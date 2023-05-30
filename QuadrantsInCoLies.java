//Java program to find out the quadrant in which the given co-ordinate lie

//! X  is positive integer as well as Y is also positive a integer it signifies first quadrant.
//! X  is negative integer but Y is positive integer it signifies second quadrant.
//! X  is negative integer as well as Y is also negative integer it signifies third quadrant.
//! X  is positive integer but Y is negative integer it signifies fourth quadrant.

public class QuadrantsInCoLies {

    public static void main(String[] args) {
        Sol obj = new Sol();
        obj.checkQuad(-2, -22);
    }

}

class Sol {
    public void checkQuad(int x, int y) {
        if ((x > 0) && (y > 0)) {
            System.out.println("Points  " + (x + "," + y) + " lies in First Quadrant");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("Points  " + (x + "," + y) + " lies in Second Quadrant");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("Points  " + (x + "," + y) + " lies in Third Quadrant");
        } else if ((x > 0) && (y < 0)) {
            System.out.println("Points  " + (x + "," + y) + " lies in Fourth Quadrant");
        }
    }
}