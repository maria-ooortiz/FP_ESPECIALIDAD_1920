package ejerciciosPsnt;

import java.util.Scanner;

public class ejerciciosPseint 
{
	public void ejercicio1 ()
	{
		int a;
		int b;
		int a2;
		int b2;
		int x;
		
		x = 2;
	    
		Scanner sc= new Scanner(System.in);
	    
		System.out.println ("Escribe la altura del primer triángulo");
	    a = sc.nextInt();
	    System.out.println ("Escribe la base del primer triángulo");
	    b = sc.nextInt();
	    System.out.println ("Escribe la altura del segundo triángulo");
	    a2 = sc.nextInt();
	    System.out.println ("Escribe la base del segundo triángulo");
	    b2 = sc.nextInt();
	    
	    if ((a*b)/x > (a2*b2)/x)
			System.out.println("El área del primero es mayor");
		else
			System.out.println("El área del segundo es mayor");
	    sc.close();
	}
	
	public void ejercicio2 ()
	{
		int horas;
		int dinero;
		
		Scanner di= new Scanner(System.in);
		System.out.println("¿Cuántas horas has trabajado?");
		horas = di.nextInt();
		dinero = 5;
		
		if (horas<=40)
			System.out.println("Tu salario según las horas trabajadas es:"+(horas*dinero));
		else
			System.out.println("Tu salario según las horas trabajadas es:"+(horas*7.5));
			
		di.close();
	}
	
	public void ejercicio3 ()
	{
		int a;
		int b; 
		int c; 
		int d;
		
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println ("Escribe el primer número (A) ");
	    a = sc.nextInt();
	System.out.println ("Escribe el segundo número (B) ");
	    b = sc.nextInt();
	    
	    c = a;
	    d = b;
	    a = d;
	    b = c;
	    System.out.println("El valor de A es " +a);
	    System.out.println("El valor de B es " +b);
	    sc.close();
	}
	
	public void ejercicio4 ()
	{
		int a;
		int b;
		int c;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println ("Escriba el primer número ");
	    a = sc.nextInt();
	    System.out.println ("Escriba el segundo número ");
	    b = sc.nextInt();
	    System.out.println ("Escriba el tercer número ");
	    c = sc.nextInt();
	    
	    if (a>b && a>c)
	    	System.out.println("El primer número es el mayor");
	    else
	    {
		    if (b>a && b>c)
		    	System.out.println("El segundo número es el mayor");
		    else if  (c>a && c>b)
		    {

		    	System.out.println("El tecer número es el mayor");
		    }
	    }
	    sc.close();
	}
		
    public void ejercicio5() 
    {
		int a5;
		int b5;
		int c5;
		
		Scanner se= new Scanner(System.in);
		
		System.out.println ("Escriba el primer número ");
	    a5 = se.nextInt();
	    System.out.println ("Escriba el segundo número ");
	    b5 = se.nextInt();
	    System.out.println ("Escriba el tercer número ");
	    c5 = se.nextInt();
		
	    if (a5<0) 
			System.out.println(a5*b5*c5);
		else 
			System.out.println(a5+b5+c5);
		
	    se.close();
	}
    
    public void ejercicio7()
    {
    	int niñost;
		int niñas;
		int niños;
		
		Scanner se= new Scanner(System.in);
		
		System.out.println ("¿Cuántos niñ@s hay en el colegio?");
		niñost = se.nextInt();
		System.out.println ("¿Cuántos niñas hay?");
		niñas = se.nextInt();
		System.out.println ("¿Cuántos niños hay?");
		niños = se.nextInt();
		System.out.println ("Son niñas:"+((niñas*100)/niñost)+"porciento");
		System.out.println ("Son niños:"+((niños*100)/niñost)+"porciento");
		
		se.close();
    }	
    
    public void ejercicio8()
    {
    	String mes;
    	int precio;
    	String x;
    	
    	mes = "octubre";
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("¿Que mes es?");
		x = se.nextLine();
		System.out.println ("¿Cual es el precio del producto?");
		precio = se.nextInt();
		
		if (x.contentEquals(mes))
			System.out.println ("El precio final del producto es:"+((85*precio)/100));
		else
			System.out.println ("El precio final es:"+precio);
		
		se.close();
    }
    
    public void ejercicio10()
    {
    	int nota;
    	int matri;
    	
    	matri = 400;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("¿Que mes es?");
		nota = se.nextInt();
		
		if (nota>=4)
			System.out.println("Tienes que pagar:"+(matri*0.70));
		else 
			System.out.println("Tienes que pagar:"+(matri*1.1));
   
		se.close();
    }
    
    public void ejercicio11()
    {
    	double a;
    	a=1.22;
    	
    	double b;
    	b=0.75;
    	
    	double c;
    	c=0.009;
    	
    	int e;
    	String t;
    	
    	String l;
    	l = "libras";
    	
    	String d;
    	d = "dolares";
    	
    	String y;
    	y = "yenes";
    	
    	Scanner cm = new Scanner(System.in);
    	System.out.println("¿Cuánto dinero quieres cambiar?");
    	e= cm.nextInt();
    	System.out.println("¿A qué moneda quieres pasar?");
    	cm.nextLine();
    	
    	t = cm.nextLine();
    	
    	if (t.contentEquals(l))
    		System.out.println("El cambio a libras es:"+ e*a);
    	else 
    	{
    		if(t.contentEquals(d))
    			System.out.println("El cambio a dólares es:"+ e*b);
    		else
    		{
    			if (t.contentEquals(y))
    				System.out.println("El cambio a yenes es:"+ e*c);
    				
    		}
    	}
    	
    	cm.close();
    
    }
    
    public void ejercicio18()
    {
    	int a;
    	int b;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("Elige un número:");
		a = se.nextInt();
		
		b=a+10;
		
		while (a<b)
		{
			System.out.println("El cuadrado de los siguientes 9 números :"+((a+1)*(a+1)));
			++a;
		}
		se.close();
    }
    
    public void ejercicio20()
    {
    	int a;
    	int b;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("Elige un número para saber su tabla de multiplicar: ");
		a = se.nextInt();
		
		b=0;
		
		do 
		{
			System.out.println(a*b);
			b = b+1;
		}
		while (b < 11);
		
		se.close();
    }
    
    public void ejercicio22()
    {
    	String a;
    	String b;
    	Scanner re= new Scanner(System.in);
    	b = "eureka";
    	int c= 0;
    	
    	while (c<3)
    	{
    		System.out.println("Adivina la palabra clave");
    		a = re.nextLine();
    		
    		if (a.contentEquals(b))
    		{
    			System.out.println("Has acertado");
    			c=3;
    		}
    		else 
    		{
    			System.out.println("Has fallado");
    			++c;
    		}
    		
    	}
    	re.close();
    }
    
    public void ejerciciocalcu()
    {
    	String a;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("Caso 1: Suma");
    	System.out.println ("Caso 2: Resta");
    	System.out.println ("Caso 3: Division");
    	System.out.println ("Caso 4: Multiplicacion");
    	
		a = se.nextLine();
    	
    	switch (a)
    	{
    	case "Suma":
    		int s1;
    		int s2;
    		System.out.println ("Primer número:");
    		s1 = se.nextInt();
    		System.out.println ("Segundo número: ");
    		s2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (s1+s2));
    		
    		se.close();
    	break;
    	
    	case "Resta":
    		int r1;
    		int r2;
    		
    		System.out.println ("Primer número:");
    		r1 = se.nextInt();
    		System.out.println ("Segundo número: ");
    		r2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (r1-r2));
    		
    		se.close();
    	break;
    	
    	case "Division":
    		int d1;
    		int d2;
    		
    		System.out.println ("Primer número:");
    		d1 = se.nextInt();
    		System.out.println ("Segundo número: ");
    		d2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (d1/d2));
    		
    		se.close();
    	break;
    	
    	case "Multiplicacion":
    		int m1;
    		int m2;
    		
    		System.out.println ("Primer número:");
    		m1 = se.nextInt();
    		System.out.println ("Segundo número: ");
    		m2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (m1*m2));
    		
    		se.close();
    	break;
    	
    	default:
    		System.out.println ("La calculadora no puede hacer esta operación.");
    	break;
    	}
    	se.close();
    }
    
    public void ejercicioromano() 
    {
    	String r;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("Escribe el número romano que quieras:");
    	r = se.nextLine();
    	
    	switch (r)
    	{
    	case "I":
    		System.out.println ("Equivale a 1");
    	break;
    	
    	case "V":
    		System.out.println ("Equivale a 5");
    	break;
        	
    	case "X":
    		System.out.println ("Equivale a 10");
    	break;
    	
    	case "L":
    		System.out.println ("Equivale a 50");
        break;
        	
    	case "C":
    		System.out.println ("Equivale a 100");
        break;
    	
    	case "D":
    		System.out.println ("Equivale a 500");
    	break;
    	
    	case "M":
    		System.out.println ("Equivale a 1000");
    	break;
    	
    	default:
    		System.out.println ("No es un número romano válido.");
    	break;
    	}
    }
    
    public void ejerciciosegun2()
    {
    	int pri;
    	int seg = 0;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("Escribe la edad:");
    	pri = se.nextInt();
    	
    	if (pri<=14)
    		seg=1;
    	if (pri>=14)
    		seg=2;
    	if (pri>=26)
    		seg=3;
    	if (pri>=56)
    		seg= 4;
    	
    	switch (seg)
    	{
    		case 1:
    			System.out.println("Etapa de infancia");
    		break;
    		case 2:
    			System.out.println("Etapa de juventud");
    		break;
    		case 3:
    			System.out.println("Etapa de adultez");
    		break;
    			
    		default:
    			System.out.println("Etapa de persona mayor");
    			
    	}
    	
    	se.close();
    	
    }
    
    public void ejerciciosegun5()
    {
    	String fig;
    	int altura;
    	int basema;
    	int baseme;
    	
    	Scanner seg= new Scanner(System.in);
    	
    	System.out.println ("¿De que figura quieres saber el área?");
    	fig = seg.nextLine();
    	
    	switch (fig)
    	{
    	case "trapecio":
    		System.out.println ("Escribe su altura:");
        	altura = seg.nextInt();
        	System.out.println ("Escribe su base mayor");
        	basema = seg.nextInt();
        	System.out.println ("Escribe su base menor");
        	baseme = seg.nextInt();
        	System.out.println ("Su área es:"+ altura*((basema+baseme)/2));
        	
    	break;
    	
    	case "triangulo":
    		System.out.println ("Escribe su altura:");
        	altura = seg.nextInt();
        	System.out.println ("Escribe su base:");
        	basema = seg.nextInt();
        	System.out.println ("Su área es:"+ (altura*basema)/2);
        	
    	break;
    	
    	case "cuadrado":
    		System.out.println ("Escribe su altura:");
        	altura = seg.nextInt();
        	System.out.println ("Su área es:"+ altura*altura);
        break;
        
    	case "rectangulo":
    		System.out.println ("Escribe su altura:");
        	altura = seg.nextInt();
        	System.out.println ("Escribe su base:");
        	basema = seg.nextInt();
        	System.out.println ("Su área es:"+ altura*basema);
        	
    	break;
    	
    	case "circulo":
    		System.out.println ("Escribe su radio:");
        	altura = seg.nextInt();
        	System.out.println ("Su área es:"+ 3.1416*(altura*altura));
        break;
        
        default: 
        	System.out.println ("No es una figura geométrica válida.");
    	}
    }
    
    
}
