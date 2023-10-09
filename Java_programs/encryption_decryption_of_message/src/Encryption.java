import java.util.Scanner;
import java.util.*;

public class Encryption {
     Scanner sc=new Scanner(System.in);
      String message=sc.nextLine();
     public  void EncryptionOfMessage() {

         for (int count = 0; count < message.length(); count++) {
             char ch = message.charAt(count);
             // System.out.println("ASCII value of " + ch + " is - " + (int)ch);
             int remainder = ch % 10;
             //System.out.println(remainder);
             System.out.print(((int) ch + remainder) +" ");
         }
     }

        public  void DecryptionOfMessage(){
for(int counter=0;counter<message.length();counter++)
{
    char ch = message.charAt(counter);

    int remainder = ch % 10;
    int r=(int) ch;
    char decryption=(char)r;
    System.out.print(decryption);
}


        }





    }

