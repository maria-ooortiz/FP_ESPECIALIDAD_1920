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
	    
		System.out.println ("Escribe la altura del primer tri�ngulo");
	    a = sc.nextInt();
	    System.out.println ("Escribe la base del primer tri�ngulo");
	    b = sc.nextInt();
	    System.out.println ("Escribe la altura del segundo tri�ngulo");
	    a2 = sc.nextInt();
	    System.out.println ("Escribe la base del segundo tri�ngulo");
	    b2 = sc.nextInt();
	    
	    if ((a*b)/x > (a2*b2)/x)
			System.out.println("El �rea del primero es mayor");
		else
			System.out.println("El �rea del segundo es mayor");
	    sc.close();
	}
	
	public void ejercicio2 ()
	{
		int horas;
		int dinero;
		
		Scanner di= new Scanner(System.in);
		System.out.println("�Cu�ntas horas has trabajado?");
		horas = di.nextInt();
		dinero = 5;
		
		if (horas<=40)
			System.out.println("Tu salario seg�n las horas trabajadas es:"+(horas*dinero));
		else
			System.out.println("Tu salario seg�n las horas trabajadas es:"+(horas*7.5));
			
		di.close();
	}
	
	public void ejercicio3 ()
	{
		int a;
		int b; 
		int c; 
		int d;
		
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println ("Escribe el primer n�mero (A) ");
	    a = sc.nextInt();
	System.out.println ("Escribe el segundo n�mero (B) ");
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
		
		System.out.println ("Escriba el primer n�mero ");
	    a = sc.nextInt();
	    System.out.println ("Escriba el segundo n�mero ");
	    b = sc.nextInt();
	    System.out.println ("Escriba el tercer n�mero ");
	    c = sc.nextInt();
	    
	    if (a>b && a>c)
	    	System.out.println("El primer n�mero es el mayor");
	    else
	    {
		    if (b>a && b>c)
		    	System.out.println("El segundo n�mero es el mayor");
		    else if  (c>a && c>b)
		    {

		    	System.out.println("El tecer n�mero es el mayor");
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
		
		System.out.println ("Escriba el primer n�mero ");
	    a5 = se.nextInt();
	    System.out.println ("Escriba el segundo n�mero ");
	    b5 = se.nextInt();
	    System.out.println ("Escriba el tercer n�mero ");
	    c5 = se.nextInt();
		
	    if (a5<0) 
			System.out.println(a5*b5*c5);
		else 
			System.out.println(a5+b5+c5);
		
	    se.close();
	}
    
    public void ejercicio7()
    {
    	int ni�ost;
		int ni�as;
		int ni�os;
		
		Scanner se= new Scanner(System.in);
		
		System.out.println ("�Cu�ntos ni�@s hay en el colegio?");
		ni�ost = se.nextInt();
		System.out.println ("�Cu�ntos ni�as hay?");
		ni�as = se.nextInt();
		System.out.println ("�Cu�ntos ni�os hay?");
		ni�os = se.nextInt();
		System.out.println ("Son ni�as:"+((ni�as*100)/ni�ost)+"porciento");
		System.out.println ("Son ni�os:"+((ni�os*100)/ni�ost)+"porciento");
		
		se.close();
    }	
    
    public void ejercicio8()
    {
    	String mes;
    	int precio;
    	String x;
    	
    	mes = "octubre";
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("�Que mes es?");
		x = se.nextLine();
		System.out.println ("�Cual es el precio del producto?");
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
    	
    	System.out.println ("�Que mes es?");
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
    	System.out.println("�Cu�nto dinero quieres cambiar?");
    	e= cm.nextInt();
    	System.out.println("�A qu� moneda quieres pasar?");
    	cm.nextLine();
    	
    	t = cm.nextLine();
    	
    	if (t.contentEquals(l))
    		System.out.println("El cambio a libras es:"+ e*a);
    	else 
    	{
    		if(t.contentEquals(d))
    			System.out.println("El cambio a d�lares es:"+ e*b);
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
    	
    	System.out.println ("Elige un n�mero:");
		a = se.nextInt();
		
		b=a+10;
		
		while (a<b)
		{
			System.out.println("El cuadrado de los siguientes 9 n�meros :"+((a+1)*(a+1)));
			++a;
		}
		se.close();
    }
    
    public void ejercicio20()
    {
    	int a;
    	int b;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("Elige un n�mero para saber su tabla de multiplicar: ");
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
    		System.out.println ("Primer n�mero:");
    		s1 = se.nextInt();
    		System.out.println ("Segundo n�mero: ");
    		s2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (s1+s2));
    		
    		se.close();
    	break;
    	
    	case "Resta":
    		int r1;
    		int r2;
    		
    		System.out.println ("Primer n�mero:");
    		r1 = se.nextInt();
    		System.out.println ("Segundo n�mero: ");
    		r2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (r1-r2));
    		
    		se.close();
    	break;
    	
    	case "Division":
    		int d1;
    		int d2;
    		
    		System.out.println ("Primer n�mero:");
    		d1 = se.nextInt();
    		System.out.println ("Segundo n�mero: ");
    		d2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (d1/d2));
    		
    		se.close();
    	break;
    	
    	case "Multiplicacion":
    		int m1;
    		int m2;
    		
    		System.out.println ("Primer n�mero:");
    		m1 = se.nextInt();
    		System.out.println ("Segundo n�mero: ");
    		m2 = se.nextInt();
    		
    		System.out.println ("El resultado es:" + (m1*m2));
    		
    		se.close();
    	break;
    	
    	default:
    		System.out.println ("La calculadora no puede hacer esta operaci�n.");
    	break;
    	}
    	se.close();
    }
    
    public void ejercicioromano() 
    {
    	String r;
    	
    	Scanner se= new Scanner(System.in);
    	
    	System.out.println ("Escribe el n�mero romano que quieras:");
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
    		System.out.println ("No es un n�mero romano v�lido.");
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
    	
    	System.out.println ("�De que figura quieres saber el �rea?");
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
        	System.out.println ("Su �rea es:"+ altura*((basema+baseme)/2));
        	
    	break;
    	
    	case "triangulo":
    		System.out.println ("Escribe su altura:");
        	altura = seg.nextInt();
        	System.out.println ("Escribe su base:");
        	basema = seg.nextInt();
        	System.out.println ("Su �rea es:"+ (altura*basema)/2);
        	
    	break;
    	
    	case "cuadrado":
    		System.out.println ("Escribe su altura:");
        	altura = seg.nextInt();
        	System.out.println ("Su �rea es:"+ altura*altura);
        break;
        
    	case "rectangulo":
    		System.out.println ("Escribe su altura:");
        	altura = seg.nextInt();
        	System.out.println ("Escribe su base:");
        	basema = seg.nextInt();
        	System.out.println ("Su �rea es:"+ altura*basema);
        	
    	break;
    	
    	case "circulo":
    		System.out.println ("Escribe su radio:");
        	altura = seg.nextInt();
        	System.out.println ("Su �rea es:"+ 3.1416*(altura*altura));
        break;
        
        default: 
        	System.out.println ("No es una figura geom�trica v�lida.");
    	}
    }
    
    
}
