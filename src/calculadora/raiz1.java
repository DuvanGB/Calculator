
package calculadora;

public class raiz1 extends raiz{
    
    public int n7;
    public int n8;
    
    public double raiz(){
        setResultadoraz(Math.pow(n7, ((1/n8))));
        return getResultadoraz();
    }
}
