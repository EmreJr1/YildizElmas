import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayısı giriniz = ");
        var n = input.nextInt();

        //elmasın üst kısmı
        for (var i=3 ; i<=n ; i++){
            for (var k=0 ; k<=n-i;k++){
                System.out.print(" ");
            }
            for (var j=1 ; j<=(i*2-1);j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }


        //elmasın alt kısmı
        for (int i=n+1;i>=0;i--){
            for (var k=1; k<=n-i+1;k++ ){
                System.out.print(" ");
            }
            for (var j=1 ; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}


