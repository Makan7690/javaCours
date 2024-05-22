
package revision;

public class Nouveau {
    public static void main(String[] args) {
        //s1= estb un object, son type retour est String , sa valeur de retour est Bonjour.
        String s1 = "Bonjour";
        System.out.println(s1.contains("o"));
        System.out.println("t".contains("a"));
        //Transformons int en String.
        Integer a = 6;
        String s2 = String.valueOf(a);
        System.out.println(s2+5);
        //Transformons String en int.
        String s3 = "23";
        int b = Integer.parseInt(s3);
        System.out.println(b+2);
        //new + constructeur d'une classe = instance de cette  classe = object
        String s4 = "Bonsoire";
        StringBuilder sb = new StringBuilder(s4);
//        sb.insert(3, 333);
        //sb.append("qwerty");
        sb.deleteCharAt(5);
        s4 = sb.toString();
        System.out.println(s4);
        System.out.println(s4.length());
        System.out.println(sb.charAt(s4.length()-1));
        System.out.println(pu(2,4));
    }
    
    static int pu(int n, int p){
        if (p == 0){
            return 1;
        }else {
            return n*pu(n,(p-1));
        }
    }
}
