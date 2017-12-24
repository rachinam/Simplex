
package r.o;

public class Simplex<T> {
    
    private int colm,rows;
    private double [][]table;
    
    public Simplex(){
        this.colm = 3;
        this.rows = 3;
        this.table = new double[3][3];
    }
    
    public Simplex(int colm ,int rows){
        this.colm = colm+1;
        this.rows = rows+1;
        this.table = new double[this.colm][this.rows];
    }
    
    public void setContrains(int a1 ,int a2,int z){
        for (int i = 0; i < this.table.length; i++) {
            if(this.table[i][0] == 0){
                {
                    this.table[i][0] = a1;
                    this.table[i][1] = a2;
                    this.table[i][2] = z;   
                }
                break;
            }
        }
    }
    
    public double getMax(){ // get max Z 
        double max = this.table[0][0];
        int ktr;
        for (ktr = 0; ktr < this.table[0].length; ktr++) {
            if (this.table[0][ktr]> max) {
                max = this.table[0][ktr];
            }
        }
        return max;
    }
    
    public int findPosition(double max){
        for (int i = 0; i < this.table[0].length; i++) {
            if(this.table[0][i] == max){
                return i;
            }
        }
        return 0;
    }
    
    public double getVariable(){
        double v1 = this.table[1][2];
        double v2  =this.table[2][2];
  
        v1 = v1/this.table[1][findPosition(getMax())];
        v2 = v2/this.table[2][findPosition(getMax())];
        if(v1 > v2){
            return v2;
        }else{
            return v1;
        }    
    }
    
    public void calculeNewTable(){
        
    }
    
    
    public void aff(){
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table[i].length; j++) {
                System.out.print(this.table[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    
    
}
