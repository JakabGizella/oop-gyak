

class Main {
  static final double PI = 3.1415956535;
  public static void main(String[] args) {
    System.out.println("Hello Shadow");
    double[] szam=leinblic(100);
    double[] wallis=wallis(100);
    printArray(szam);
  }
  static double[] leinblic(int max){
      double[] szam = new double[max];
      double current =1;
        for(int i=0; i<max; i++){
            double addendum = 1/(double)(3+i*2);
            if (i%2 ==0){
              addendum *=-1;

            }
            current +=addendum;
            szam[i]=current*4;
          
        }

      return szam;

  }
  static double[] wallis(int max)
  {
    double[] nums =new double[max];
    double current =1
;
    double divisor =1, multiplier=2;
    for(int i=0; i<max;i++)
      {
        current*= multiplier/divisor;
        if(i%2==0)
        {
          divisor+=2;
        }else{
          multiplier+=2;
        }
        nums[i]=current*2;
      }
    return nums;
    }

  static void piszam(double [] leib, double[]wal)
  {
    for (int i=0; i<leib.length;i++)
      {
        double leibD=Math.abs(PI - leib[i]);
        double walD=Math.abs(PI - wal[i]);
        String closer=leibD>walD? "wallis":"leibnitz";
        System.out.print(leibD+" ");
      }
  }
  
  static void printArray(double[] szam)
  {
    for(int i=0; i<szam.length; i++){
      System.out.println(szam[i]);
    }
    
  }
}