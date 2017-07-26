package wu.shao.qiong.have.a.Dog;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BeautifulQiong {
  @Test
  public void f() {
	  DogOfQiong dog = new DogOfQiong();
	  String email = dog.generate();
	  Assert.assertNotNull(email);
      Assert.assertEquals(email, "dog@qiong.com");
	  
	  
  }
}
