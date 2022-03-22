package ProiectPIP;

//clasa concretacare este extinsa din Decorator Cafea
//in decorator  suprascriem  metodele interfetei ale carora  comportament trebuie modificate
public class ToppingCafea extends Five_To_Go_Decorator
{

	public ToppingCafea(Five_To_Go_ORDER decoratorcafea)
	{
		//accesarea clasei parinte
		super(decoratorcafea);
		
		
	}
	
    public void descriere() 
	{
		decoratorcafea.descriere();
	    alegereTopping(decoratorcafea);
		
	}
    public void pret() 
   	{   
    	
   		decoratorcafea.pret();
   		pretT(decoratorcafea);
     
   		
   	}
    

	private void alegereTopping(Five_To_Go_ORDER decoratorCafea) 
	{
		System.out.println("Topping ales: Alune de padure ");
		
	}

    private void pretT(Five_To_Go_ORDER decoratorCafea )
    {
    	System.out.println("Adaos pret : +1.5");
    	 
    	
    }
	

}
