package learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOClasses {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("String : ");
        System.out.println("Integer : ");
        String str = br.readLine();
        Integer val1 = Integer.parseInt(br.readLine());
        System.out.println(str);
        System.out.println(val1);
        while(br.ready()){
            System.out.println("Numbers : "+(char) br.read());
        }

        //
    }

}
