package app;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ban hay nhap noi dung cho chuoi : ");
            s = sc.nextLine();
            System.out.println("Ban hay nhap ky tu");
            char c;
            c = sc.next().charAt(0);
            int count = 0;
            for( int i = 0 ; i < s.length(); i ++){
                if(s.charAt(i) == c){
                    count++;
                }
            }
            System.out.println("So lan xuan hien cua " + c+ " la : "+ count);
        }
}
