package ProiectPIP;


//clasa concreta (subclasa) Cappuccino ce implementeaza interfata Five_to_go  

public class Cappuccino implements Five_To_Go_ORDER
{
	//prin procesul de mostenire  putem aduce modificari metodelor
	
	public void descriere() 
	{
		System.out.println("Tip Cafea: Cappuccino ");
		
	}

	public void pret() 
	{
       System.out.println("Pret: 5 lei");
	}  
}
