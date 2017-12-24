
package r.o;

public class Simplex<T> {
    private int cont,var;
    private T c1,c2,c3,c4,c5;
    private T a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
    
    public Simplex(){
        this.cont = 2;
        this.var = 2;
    }
    public Simplex(int cont ,int var){
        if((cont > 4 )&&(var > 4)){
            System.out.println("max est 5");
            this.cont = 4;
            this.var = 4;
        }else{
            this.cont = var;
            this.var = cont;
        }
    }
    
    public void addZ(T c1,T c2){
        this.c1 = c1;this.c2 = c2;
    }
    
    public void addCont(T a1,T a2){
        if((this.a1 == null)&&(this.a2 == null)){
            this.a1 =a1;this.a2 = a2;
        }else{
            if((this.a3 == null)&&(this.a4 == null)){
                this.a3 =a1;this.a4 = a2;
            }else{
                if((this.a5 == null)&&(this.a6 == null)){
                    this.a5 =a1;this.a6 = a2;
                }else{
                    if((this.a8 == null)&&(this.a8 == null)){
                        this.a7 =a1;this.a8 = a2;
                    }else{
                        if((this.a9 == null)&&(this.a10 == null)){
                            this.a9 =a1;this.a10 = a2;
                        }
                    }
                }
            }
        }
    }
    
    public void affiche(){
        System.out.println(""+
                "max z = "+this.c1+"x1 +  "+this.c2+"x2 "+"\n"+
                "        "+this.a1+"x1 + "+this.a2+"x2 "+"<= 15"+"\n"+
                "        "+this.a3+"x1 + "+this.a4+"x2 "+"<= 10"+"\n"+
                "        "+this.a5+"x1 + "+this.a6+"x2 "+"<= 10"
                + "");
    }
    
    
}
