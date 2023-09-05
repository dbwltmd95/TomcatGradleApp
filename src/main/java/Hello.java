public class Hello {
  
  public static String GREETING = "Hello world!";
  
  public static void main(String []args) {
    System.out.println(GREETING); 

    while (true) {
      try {
        Thread.sleep(1000); // 1초 대기
      } catch (InterruptedException e) {
          e.printStackTrace();
        }
    }    
  }  
}

