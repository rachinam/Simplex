
package r.o;
public class RO {

    public static void main(String[] args) {
        
        Simplex<Integer> a = new Simplex<Integer>();
        a.addZ(15, 10);
        a.addCont(1, 2);
        a.addCont(3, 4);
        a.addCont(5, 6);
        a.affiche();
        
    }
    
}
