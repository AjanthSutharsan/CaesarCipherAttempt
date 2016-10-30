import java.util.Scanner;
public class CaesarCipherAttempt
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the message you wish to encrypt");
        String Message = input.nextLine();
       
        int Shift;
        do {
            System.out.println("By how many places do you wish to shift your letters in the message, making sure the number of letters you wish to shift by is between 1 and 25 inclusive?");
            Shift = input.nextInt();
        } while(Shift<=0 || Shift >25);
        
        for(int i=0;i<Message.length();i++) {
            char j=Message.charAt(i);
            if(((int)j<=122&&(int)j>=97)||((int)j<=90&&(int)j>=65)) {
                if((Shift+(int)j)>122) {
                    System.out.print((char)(Shift+(int)j-26));
                }
                else if((Shift+(int)j)<=122) {
                    System.out.print((char)(Shift+(int)j));
                }
            }
            else {
                System.out.print(j);
            }
        }
        System.out.println();

    }

}
