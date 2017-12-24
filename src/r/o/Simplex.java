
package r.o;

public class Simplex<T> {
    
    private int colm,rows;
    private double [][]table;
    
    public Simplex(){
        this.colm = 2;
        this.rows = 2;
        this.table = new double[2][2];
    }
    
    public Simplex(int colm ,int rows){
        this.colm = colm;
        this.rows = rows;
        this.table = new double[colm][rows];
    }
    
    
    
    
}
