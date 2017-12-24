
package r.o;
public class RO {

    public static void main(String[] args) {
        
        Simplex<Integer> a = new Simplex<Integer>();
        a.setContrains(5,4,0);
        a.setContrains(2,3,10);
        a.setContrains(4,10,12);

        //------------------------
        
       int tab1 [] =  new  int [] {0,  1,  2,  3,  4,  5} ;  
        int tab2 [] = null ; 

       System.arraycopy(tab1,  1, tab2,  1,  0) ;
       
        System.out.println("u1 :"+tab2[0]+" u4 "+tab2[1] );
         System.out.println("u3 :"+tab2[2]+" u5 "+tab2[3] );
          System.out.println("u3 :"+tab2[4]+" u5 "+tab2[5] );
    }
    
}
