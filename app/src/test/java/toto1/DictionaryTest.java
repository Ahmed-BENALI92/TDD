package toto1;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class  DictionaryTest {

    @Test  public void testDictionaryName() 
        {
        Dictionary dict = new Dictionary("Ex");
        assertThat(dict.getName(), equalTo("Example"));
        }
    
}
