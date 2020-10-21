class Main {
  public static void main(String[] args) {

    // extended assignment examples
    // i+=5 i=i+5
    // i-=2 i=i-2
    // i*=10 i=i*10
    // i++ i=i+1
    // i-- i=i-1

    // while loop good for when we don't know how many times it needs to run
    // int num1 = -1;
    // while(num1<0){
    // keep asking for another number
    // ask for the new numbe input
    // }

    // for loop we know start/stop/increment or decrement
    for (int i = 1; i < 100000; i *= 10) {
      System.out.print(i + "\t");
    }
    System.out.println();
    System.out.println("===================");
    for (int i = 0; i != 10; i += 2) {
      System.out.print(i + "\t");
    }
    System.out.println();
    System.out.println("========Nested======");
    // nested for loop
    for (int row = 0; row <= 10; row++) {
      for (int col = 0; col <= 10; col++) {
        System.out.print(row + "," + col + "\t");
      }
      System.out.println();
    }
  }
}