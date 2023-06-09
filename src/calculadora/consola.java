
package calculadora;

import java.util.Scanner;

public class consola {
   
    public static void main(String[] args){
    Scanner objetoCa=new Scanner (System.in);
    operacionesbasicas1 os1=new operacionesbasicas1();
    trigonometricas1 ts1=new trigonometricas1();
    potencia1 pa1=new potencia1();
    raiz1 rz1=new raiz1();
    iva1 ia1=new iva1();
    
    System.out.println("Buen Dia\n" + "Elige Una Opcion\n");
    System.out.println("1. Operaciones Basicas.\n2. Operaciones Trigonometricas.\n3. Potencia Enecima.\n4. Raiz Enecima.\n5. Iva.\n");
        
    int in = objetoCa.nextInt();
    
    switch(in){
            case 1:
                Scanner objetoSa=new Scanner (System.in);
                System.out.println("Elige La Operacion Que Deseas Realizar\n");
                System.out.println("1. Suma.\n2. Resta.\n3. Multiplicacion.\n4. Division.\n");             
                
                int sa=objetoSa.nextInt();
                switch(sa){
                    case 1:
                        System.out.println("Ingresa Un Numero\n");
                        os1.n1=objetoSa.nextInt();
                        System.out.println("Ingresa Un Segundo Numero\n");
                        os1.n2=objetoSa.nextInt();
                        System.out.println("La Suma Es:" +os1.suma()+ "\n");
                        break;
                    case 2:
                        System.out.println("Ingresa Un Numero\n");
                        os1.n1=objetoSa.nextInt();
                        System.out.println("Ingresa Un Segundo Numero\n");
                        os1.n2=objetoSa.nextInt();
                        System.out.println("La Resta Es:" +os1.resta()+ "\n");
                        break;
                    case 3:
                        System.out.println("Ingresa Un Numero\n");
                        os1.n1=objetoSa.nextInt();
                        System.out.println("Ingresa Un Segundo Numero\n");
                        os1.n2=objetoSa.nextInt();
                        System.out.println("La Multiplicacion Es:" +os1.multiplicacion()+ "\n");
                        break;
                    case 4:
                        System.out.println("Ingresa Un Numero\n");
                        os1.n1=objetoSa.nextInt();
                        System.out.println("Ingresa Un Segundo Numero\n");
                        os1.n2=objetoSa.nextInt();
                        System.out.println("La Division Es:" +os1.division()+ "\n");
                        break;
                                       
                }
               
                break;
            case 2:
                
                Scanner objetoSb=new Scanner (System.in);
                System.out.println("Elige La Oeracion Que Deseas Realizar\n");
                System.out.println("1. Seno.\n2. Coseno.\n3. Tangente.\n");
                
                int sb=objetoSb.nextInt();
                switch(sb){
                    case 1:
                        System.out.println("Ingresa Un Numero\n");
                        ts1.n4=objetoSb.nextInt();
                        System.out.println("El Seno Del Numero Es:" +ts1.seno()+ "\n");
                        break;
                    case 2:
                        System.out.println("Ingresa Un Numero\n");
                        ts1.n4=objetoSb.nextInt();
                        System.out.println("El Coseno Del Numero Es:" +ts1.coseno()+ "\n");
                        break;
                    case 3:
                        System.out.println("Ingresa Un Numero\n");
                        ts1.n4=objetoSb.nextInt();
                        System.out.println("La Tangente Del Numero Es:" +ts1.tangente()+ "\n");
                        break;
                  
                }
                
                break;
            case 3:
                Scanner objetoSc=new Scanner (System.in);
                System.out.println("Ingresa La Base\n");
                pa1.n5=objetoSc.nextInt();
                System.out.println("Ingresa El Exponente\n");
                pa1.n6=objetoSc.nextInt();
                System.out.println("La Potencia Es:" +pa1.potencia()+ "\n");
                break;
            case 4:
                Scanner objetoSd=new Scanner (System.in);
                System.out.println("Ingresa El Radicando\n");
                rz1.n7=objetoSd.nextInt();
                System.out.println("Ingresa El Indice\n");
                rz1.n8=objetoSd.nextInt();
                System.out.println("La Raiz Es:" +rz1.raiz()+ "\n");
                break;
            case 5:
                Scanner objetoSe=new Scanner (System.in);
                System.out.println("Ingresa Un Numero\n");
                ia1.n9=objetoSe.nextInt();
                System.out.println("El Iva Es:" +ia1.iva()+ "\n");
                break;
            default:
                System.out.println("Digita Una Opcion Valida\n" );
                break;
        }
          
    }
    
}
