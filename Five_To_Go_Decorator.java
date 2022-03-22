package ProiectPIP;



//am creat o clasa decorator Five_to_go_Decorator abstracta ce implementeaza  interfata Five_to_go
//am declarat clasa ca fiind  abstracta pentru ca nu ne dorim crearea de obiecte a acestei clase
//aceasta clasa o folosim pentru a extinde functionalitatea obiectului selectat, fiind independent de alte instante din aceeasi clasa 
public abstract class Five_To_Go_Decorator implements Five_To_Go_ORDER
{
	
	
	//obiect  Five_To_Go_ORDER  ca variabila de instanta
     protected Five_To_Go_ORDER decoratorcafea;
     
     public Five_To_Go_Decorator(Five_To_Go_ORDER decoratorcafea)
     
     {
    	 this.decoratorcafea=decoratorcafea;
     }
     
     public void descriere()
     {
    	 decoratorcafea.descriere();
     }
	
     public void pret()
     {
    	 decoratorcafea.pret();
     }

}
