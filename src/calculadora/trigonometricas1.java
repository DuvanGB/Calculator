
package calculadora;

public class trigonometricas1 extends trigonometricas {
    
    public int n4;
    public double rad=Math.toRadians(n4);

    public double seno(){
        
        setResultadosen(Math.sin(rad));
        return getResultadosen();
    }
    
    public double coseno(){
        
        setResultadocos(Math.cos(rad));
        return getResultadocos();
    }
     
    public double tangente(){
        
        setResultadotan(Math.tan(rad));
        return getResultadotan();
    }
}
