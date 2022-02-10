

class Main {
  public static void main(String[] args) {
    System.out.println("Hello Shadow");
    double[] szam=leinblic(100);
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
  static void printArray(double[] szam)
  {
    for(int i=0; i<szam.length; i++){
      System.out.println(szam[i]);
    }
    
  }
}