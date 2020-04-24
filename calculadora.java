import java.util.Scanner;

public class calculadora 
{
    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) 
    {
        inicio();
    }
    public static void inicio()
	{
        
		int op;
        do {
 
            menu();
            op=leer.nextInt();
            switch (op) 
            {
                case 1:	suma();
                break;
                case 2: resta();
                break;
                case 3: multiplicacion();
                break;
                case 4: division();
                break;
                default: 
                break;
            }
        }while (op!=4);
    }

    public static void menu()
	{
		System.out.println("menu ");
		System.out.println("1.-sumar ");
		System.out.println("2.-restar ");
		System.out.println("3.-multiplicar ");
		System.out.println("4.-division ");
		System.out.println("5.-Volver");
		System.out.println("seleciones opcion");
    }
    
    public static void suma()
	{
        double x,y; 
         System.out.println("ingrese el primer dato:");
         x=leer.nextDouble();
         System.out.println("ingrese el segundo dato:");
         y=leer.nextDouble();
        System.out.println("el resultado es:" +(x+y));
    }
    public static void resta()
	{
        double x,y; 
         System.out.println("ingrese el primer dato:");
         x=leer.nextDouble();
         System.out.println("ingrese el segundo dato:");
         y=leer.nextDouble();
        System.out.println("el resultado es:" +(x-y));
    }
    public static void multiplicacion()
	{
        double x,y; 
         System.out.println("ingrese el primer dato:");
         x=leer.nextDouble();
         System.out.println("ingrese el segundo dato:");
         y=leer.nextDouble();
        System.out.println("el resultado es:" +(x*y));
    }
    public static void division()
	{
        double x,y; 
         System.out.println("ingrese el primer dato:");
         x=leer.nextDouble();
         System.out.println("ingrese el segundo dato:");
         y=leer.nextDouble();
        System.out.println("el resultado es:" +(x/y));
    }


}