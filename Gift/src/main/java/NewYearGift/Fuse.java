package NewYearGift;
public class Fuse extends Chocolates
{
   private float fuse_cost;
   private int no_of_fuse;
   Fuse(String name_of_candy,int no_of_fuse,float fuse_cost)
     {
        super(name_of_candy);
        this.no_of_fuse=no_of_fuse;
        this.fuse_cost=fuse_cost;
     }
 public float cost()
  {
     float c=(float)(no_of_fuse)*(fuse_cost);
     return c;
  }
}
   
