public class SearchDriver {

  public static long avgTimeBin(Comparable[] iArrX) {
    long start;
    long end;
    long timeElapsed;
    int sum = 0;
    for (int x = 0; x < 100; x++) {
	BinSearch.binSearch(iArrX, 0); 
       int random = (int) Math.random() * iArrX.length * 2;
              start = System.currentTimeMillis();
        for (int y = 0; y < 100; y++) {
          BinSearch.binSearch(iArrX, random);
        }

	      end = System.currentTimeMillis();
	      timeElapsed = end - start;
	      sum += timeElapsed;
     }
     long avgTimeBin = sum/100;
     return avgTimeBin;
  }

  public static long avgTimeLin(Comparable[] iArrX) {
    long start;
    long end;
    long timeElapsed;
    int sum = 0;
    for (int x = 0; x < 100; x++) {
        int random = (int)(Math.random() * iArrX.length * 2);
              start = System.currentTimeMillis();
        for (int y = 0; y < 100; y++) {
          LinSearch.linSearch(iArrX, random);
        }
	      end = System.currentTimeMillis();
	      timeElapsed = end - start;
	      sum += timeElapsed;
     }
     long avgTimeLin = sum/100;
     return avgTimeLin;
  }

  public static void main(String[] args) {
    //Making 4 different arrays w/ diff lengths
    Comparable[] iArr0 = new Integer[1_000_000];
    for (int i = 0; i < iArr0.length; i++) {
	     iArr0[i] = i*2;
    }
    Comparable[] iArr1 = new Integer[5_000_000];
    for (int i = 0; i < iArr1.length; i++) {
       iArr1[i] = i*2;
    }
    Comparable[] iArr2 = new Integer[10_000_000];
    for (int i = 0; i < iArr2.length; i++) {
	     iArr2[i] = i*2;
    }
    Comparable[] iArr3 = new Integer[50_000_000];
    for (int i = 0; i < iArr3.length; i++) {
	     iArr3[i] = i*2;
    }

    long bin;
    long lin;

    //Finding time diff for arr.length = 100000
    bin = avgTimeBin(iArr0);
    lin = avgTimeLin(iArr0);
    System.out.println("Average Time for 100 calls of BinSearch w/ length 1,000,000: " + bin + " milliseconds");
    System.out.println("Average Time for 100 calls of LinSearch w/ length 1,000,000: " + lin + " milliseconds");
    System.out.println("Diff btwn Bin and Lin w/ length 1,000,000: " + (lin - bin + " milliseconds"));

    System.out.println("-------------------------------------------------");

    //Finding time diff for arr.length = 500000
    bin = avgTimeBin(iArr1);
    lin = avgTimeLin(iArr1);
    System.out.println("Average Time for 100 calls of BinSearch w/ length 5,000,000: " + bin + " milliseconds");
    System.out.println("Average Time for 100 calls of LinSearch w/ length 5,000,000: " + lin + " milliseconds");
    System.out.println("Diff btwn Bin and Lin w/ length 5,000,000: " + (lin - bin + " milliseconds"));

    System.out.println("-------------------------------------------------");

    //Finding time diff for arr.length = 100000
    bin = avgTimeBin(iArr2);
    lin = avgTimeLin(iArr2);
    System.out.println("Average Time for 100 calls of BinSearch w/ length 10,000,000: " + bin + " milliseconds");
    System.out.println("Average Time for 100 calls of LinSearch w/ length 10,000,000: " + lin + " milliseconds");
    System.out.println("Diff btwn Bin and Lin w/ length 10,000,000: " + (lin - bin + " milliseconds"));

    System.out.println("-------------------------------------------------");

    //Finding time diff for arr.length = 500000
    bin = avgTimeBin(iArr3);
    lin = avgTimeLin(iArr3);
    System.out.println("Average Time for 100 calls of BinSearch w/ length 50,000,000: " + bin + " milliseconds");
    System.out.println("Average Time for 100 calls of LinSearch w/ length 50,000,000: " + lin + " milliseconds");
    System.out.println("Diff btwn Bin and Lin w/ length 50,000,000: " + (lin - bin + " milliseconds"));

  }

}
