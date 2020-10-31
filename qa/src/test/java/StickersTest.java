import org.testng.Assert;
import org.testng.annotations.Test;

public class StickersTest {

  @Test
  public void totalTest() {
  //  throw new RuntimeException("Test not implemented");
    
    System.out.println("SUM is");
	  int a = 10;
	  int b=20;
	  Assert.assertEquals(30,a+b);
  }
}
