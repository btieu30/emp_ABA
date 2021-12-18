public class SearchDriver {

  public static long avgTimeBin(Comparable[] iArrX) {
    long start;
    long end;
    long timeElapsed;
    int sum = 0;
    for (int x = 0; x < 100; x++) {
	      start = System.currentTimeMillis();
	      BinSearch.binSearch(iArrX, (int)(Math.random() * iArrX.length * 2));
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
	      start = System.currentTimeMillis();
	      LinSearch.linSearch(iArrX, (int)(Math.random() * iArrX.length * 2));
	      end = System.currentTimeMillis();
	      timeElapsed = end - start;
	      sum += timeElapsed;
     }
     long avgTimeLin = sum/100;
     return avgTimeLin;
  }

  public static void main(String[] args) {
    //Making 4 different arrays w/ diff lengths
    Comparable[] iArr0 = new Integer[500000];
    for (int i = 0; i < iArr0.length; i++) {
	     iArr0[i] = i*2;
    }
    Comparable[] iArr1 = new Integer[1000000];
    for (int i = 0; i < iArr1.length; i++) {
       iArr1[i] = i*2;
    }
    Comparable[] iArr2 = new Integer[5000000];
    for (int i = 0; i < iArr2.length; i++) {
	     iArr2[i] = i*2;
    }
    Comparable[] iArr3 = new Integer[10000000];
    for (int i = 0; i < iArr3.length; i++) {
	     iArr3[i] = i*2;
    }

    //Finding time diff for arr.length = 100000
    System.out.println("Average Time for BinSearch w/ length 500000: " + avgTimeBin(iArr0));
    System.out.println("Average Time for LinSearch w/ length 500000: " + avgTimeLin(iArr0));
    System.out.println("Diff btwn Bin and Lin w/ length 500000: " + (avgTimeLin(iArr0)-avgTimeBin(iArr0)));

    System.out.println("-------------------------------------------------");

    //Finding time diff for arr.length = 500000
    System.out.println("Average Time for BinSearch w/ length 1000000: " + avgTimeBin(iArr1));
    System.out.println("Average Time for LinSearch w/ length 1000000: " + avgTimeLin(iArr1));
    System.out.println("Diff btwn Bin and Lin w/ length 1000000: " + (avgTimeLin(iArr1)-avgTimeBin(iArr1)));

    System.out.println("-------------------------------------------------");

    //Finding time diff for arr.length = 100000
    System.out.println("Average Time for BinSearch w/ length 5000000: " + avgTimeBin(iArr2));
    System.out.println("Average Time for LinSearch w/ length 5000000: " + avgTimeLin(iArr2));
    System.out.println("Diff btwn Bin and Lin w/ length 5000000: " + (avgTimeLin(iArr2)-avgTimeBin(iArr2)));

    System.out.println("-------------------------------------------------");

    //Finding time diff for arr.length = 500000
    System.out.println("Average Time for BinSearch w/ length 10000000: " + avgTimeBin(iArr3));
    System.out.println("Average Time for LinSearch w/ length 10000000: " + avgTimeLin(iArr3));
    System.out.println("Diff btwn Bin and Lin w/ length 10000000: " + (avgTimeLin(iArr3)-avgTimeBin(iArr3)));

  }

}
