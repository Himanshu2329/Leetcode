import java.util.HashSet;
import java.util.Set;

public class Leet1832 {
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpoverthelazydog" ;
        Set <Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));            
        }
        if (set.size()==26) 
            System.out.println(true);

        else
            System.out.println(false);
    }
}
