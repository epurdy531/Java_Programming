public class CompleteEventSite
{
   private int siteNumber; 
   private double hourlyFee;
   private String nameOfSite;
        
   public CompleteEventSite()
      {
         siteNumber = 232;
         hourlyFee = 5.50;
         nameOfSite = "Best Site Ever";
      }
   public int getSiteNumber()
   {
      return siteNumber;
   }
   public void setSiteNumber(int n)
   {
      siteNumber = n;
   }
   public double getHourlyFee()
   {
      return hourlyFee;
   }
   public String getNameOfSite()
   {
      return nameOfSite;
   }
}