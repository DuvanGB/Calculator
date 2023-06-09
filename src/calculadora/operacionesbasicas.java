
package calculadora;

public abstract class operacionesbasicas {

    //atrivutos
    public double resultadosuma;
    public double resultadoresta;
    public double resultadomulti;
    public double resultadodivi;
    
    //metodos
    public abstract double suma();
    public abstract double resta();
    public abstract double multiplicacion();
    public abstract double division();
    
    public double getResultadosuma(){return resultadosuma;}
    public void setResultadosuma(double s){resultadosuma=s;}
    
    public double getResultadoresta(){return resultadoresta;}
    public void setResultadoresta(double r){resultadoresta=r;}
    
    public double getResultadomulti(){return resultadomulti;}
    public void setResultadomulti(double m){resultadomulti=m;}
    
    public double getResultadodivi(){return resultadodivi;}
    public void setResultadodivi(double d){resultadodivi=d;}
    
}
