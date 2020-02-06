package NewYearGift;
public class MilkyBar extends Chocolates
{
   private float milkybar_cost;
   private int no_of_milkybar;
   MilkyBar(String name_of_candy,int no_of_milkybar,float milkybar_cost)
     {
        super(name_of_candy);
        this.no_of_milkybar=no_of_milkybar;
        this.milkybar_cost=milkybar_cost;
     }
 public float cost()
  {
     float c=(float)(no_of_milkybar)*(milkybar_cost);
     return c;
  }
}
   
