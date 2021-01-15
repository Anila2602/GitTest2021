import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class TestGit {
   @Test
    public void add(){
       int x=10;
       int y=20;
       int a=x+y;
       Assert.assertEquals(30,a);

   }

}
