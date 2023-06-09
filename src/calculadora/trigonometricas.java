
package calculadora;

public abstract class trigonometricas {

    //atributos
    public double resultadosen; 
    public double resultadocos;   
    public double resultadotan;
    
    //metodos
    public abstract double seno();
    public abstract double coseno();
    public abstract double tangente();
    
    public double getResultadosen(){return resultadosen;}
    public void setResultadosen(double so){resultadosen=so;}
    
    public double getResultadocos(){return resultadocos;}
    public void setResultadocos(double co){resultadocos=co;}
    
    public double getResultadotan(){return resultadotan;}
    public void setResultadotan(double te){resultadotan=te;}

}
