package mathematics;

import java.util.ArrayList;

import static java.lang.Math.floor;

public class RootsOfEquation {

    public static void main(String[] args) {
        RootsOfEquation roots = new RootsOfEquation();
        roots.quadraticRoots(-264, -750, 504);
    }

    public void quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = (b * b) - 4 * a * c;
        if(i < 0) {
            System.out.println("Imaginary");
        } else {
            double root1 = floor(((-b) + Math.sqrt(i))/(2*a));
            double root2 = floor(((-b) - Math.sqrt(i))/(2*a));
            list.add((int)root1);
            list.add((int)root2);
            System.out.println(list);
        }
    }
}
