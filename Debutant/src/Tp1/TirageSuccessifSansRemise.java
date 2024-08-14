/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp1;

/**
 *
 * @author Makan
 */
public class TirageSuccessifSansRemise {
    // On definit le factoriel 
    public static int fac(int n){
        if(n==0){
            return 1;
        }else {
            return n*fac(n-1);
        }
    }
    // TirageSuccessifSansRemise
    public static int tisr(int n ,int m){
        int rep = fac(n)/fac(n-m);
        return rep;
    }
    // Tirage Simultane
    public static int tsm(int n, int m){  
      int rep = (fac(n))/(fac(m)*fac(n-m));
      return rep;
    }
    public TirageSuccessifSansRemise() {
    }
    // On teste ici
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int res = tisr(n,m);
        int ret = tsm(n,m);
        System.out.println(res);
        System.out.println(ret);
    }
}
