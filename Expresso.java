package ProiectPIP;

//clasa concreta (subclasa) Expresso ce implementeaza interfata Five_to_go 

public class Expresso implements Five_To_Go_ORDER
{
	//fiind procesul de mostenire  putem aduce modificari metodelor
	
	public void descriere() 
	{
		
		System.out.println("Tip Cafea: Expresso");
	}

	
	public void pret()
	{
		System.out.println("Pret: 6 Lei");
		
	}

}
