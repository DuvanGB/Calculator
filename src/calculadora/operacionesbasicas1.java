
package calculadora;


public class operacionesbasicas1 extends operacionesbasicas {
    
    public int n1;
    public int n2;
    
    public double suma(){
        setResultadosuma(n1+n2);
        return getResultadosuma();
    }
    public double resta(){
        setResultadoresta(n1-n2);
        return getResultadoresta();
    }
    public double multiplicacion(){
        setResultadomulti(n1*n2);
        return getResultadomulti();
    }
    public double division(){
        setResultadodivi(n1/n2);
        return getResultadodivi();
    }
    
}
