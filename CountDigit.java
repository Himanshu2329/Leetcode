/**
 * CountDigit
 */
public class CountDigit {

    public static void main(String[] args) {
        int n = 12345; 
        int cnt=0; 
        while (n>0) {
            int temp=n%10; 
            cnt++; 
            n/=10;
        }
        System.out.println(cnt);
    }
}
