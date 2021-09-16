package toto1;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class  DictionaryTest {
    public Dictionary dict;

    @Before public void initiation()
    {
        Dictionary dict = new Dictionary("Ex");
    }    
    @Test  public void testDictionaryName() 
        {
         assertThat(dict.getName(), equalTo("Example"));
        }
    
}
