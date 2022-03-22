package ProiectPIP;
//in decorator  suprascriem  metodele interfetei ale carora  comportament trebuie modificate 

//clasa concretacare este extinsa din Decorator Cafea
//in decorator  suprascriem  metodele interfetei ale carora  comportament trebuie modificate
public class Zahar extends Five_To_Go_Decorator
{

	public Zahar(Five_To_Go_ORDER decoratorcafea)
	{
		//accesarea clasei parinte
		super(decoratorcafea);
		
		
	}
	
  public void descriere() 
	{
		decoratorcafea.descriere();
		alegereZahar(decoratorcafea);
		
	}
  public void pret() 
 	{
 		decoratorcafea.pret();
 		pretZ(decoratorcafea );
   	       
 		
 	}
  private void alegereZahar(Five_To_Go_ORDER decoratorcafea )
  {
 	 System.out.println("Zahar : alb ");
 	 
 	
 }
  private void pretZ(Five_To_Go_ORDER decoratedCoffee ){
	   	 System.out.println("Adaos pret: + 0.5 ");
	   	 
	   	
	   }
  



	

}
