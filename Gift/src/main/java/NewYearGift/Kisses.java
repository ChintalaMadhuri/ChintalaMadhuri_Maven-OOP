package NewYearGift;
public class Kisses extends Chocolates
{
   private float kisses_cost;
   private int no_of_kisses;
   Kisses(String name_of_candy,int no_of_kisses,float kisses_cost)
     {
        super(name_of_candy);
        this.no_of_kisses=no_of_kisses;
        this.kisses_cost=kisses_cost;
     }
 public float cost()
  {
     float c=(float)(no_of_kisses)*(kisses_cost);
     return c;
  }
}
   
