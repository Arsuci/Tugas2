/* Arsuci Fidyawati
 * 13020210297
 * B1
 * kamis 23 maret 2023
 */
package kasusswitch;

import java.util.Scanner;
public class KasusSwitch {
/**
* @param args
*/
  public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
char cc;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
cc=masukan.next().charAt(0);

 switch (cc) {
     
case 'a': { System.out.print (" Yang anda ketik adalah a\n"); break;}
case 'u': { System.out.print (" Yang anda ketik adalah u\n"); break;}
case 'e': { System.out.print (" Yang anda ketik adalah e\n"); break;}
case 'i': { System.out.print (" Yang anda ketik adalah i\n"); break;}
case 'o': { System.out.print (" Yang anda ketik adalah o\n"); break;}
default:
System.out.print (" Yang anda ketik adalah huruf mati\n");
}
}
}