/////////////         APPROACH 1

import java.util.*;
public class  Str_Token{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
}



////////////         APPROACH 2


//import java.util.*;
//public class Str_Token {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        if(!scan.hasNext()){
//            System.out.println("0");
//            return;
//        }
//        String s = scan.nextLine();
//        scan.close();
//
//        // Write your code here.
//        String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
//        int size = tokens.length;
//        System.out.println(size);
//        for(int i=0; i<size; i++){
//            System.out.println(tokens[i]);
//        }
//    }
//}