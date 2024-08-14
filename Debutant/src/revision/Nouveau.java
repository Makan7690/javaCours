
package revision;

public class Nouveau {
    public static void main(String[] args) {
        //s1= est un object, son type retour est String , sa valeur de retour est Bonjour.
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
        int de = 67;
        String we = String.valueOf(de);
        System.out.println(we+67);
        String xc = "345";
        int as = Integer.parseInt(xc);
        System.out.println(as+34);
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
        char[] tab = {'w','g','y'}; 
        int n = tab.length;
        int index = (int)(n*Math.random());
        System.out.println(tab[index]);//n*0<= n*random <n*1= 
    }
    
    static int pu(int n, int p){
        if (p == 0){
            return 1;
        }else {
            return n*pu(n,(p-1));
        }
    }
}
