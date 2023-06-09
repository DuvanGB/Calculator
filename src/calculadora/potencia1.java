
package calculadora;

public class potencia1 extends potencia {
    
    public int n5;
    public int n6;
    
    public double potencia(){
        setResultadopot(Math.pow(n5, n6));
        return getResultadopot();
    }
}
