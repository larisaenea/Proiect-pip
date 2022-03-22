package ProiectPIP;

public class DecoratorPattern 
{
	public static void main(String[] args) {
		Five_To_Go_ORDER coffee1 =new Zahar(new Expresso());
		Five_To_Go_ORDER coffee2=new ToppingCafea(new Latte());
		Five_To_Go_ORDER coffee3=new ToppingCafea (new Cappuccino());
		
		
		System.out.println("\nExpresso cu zahar alb");
		coffee1.descriere();
		coffee1.pret();
		
		
		System.out.println("\nLatte cu topping cu alune");
		coffee2.descriere();
		coffee2.pret();
		
		System.out.println("\nCappuccino cu topping cu alune");
		coffee3.descriere();
		coffee3.pret();
	   }

}
