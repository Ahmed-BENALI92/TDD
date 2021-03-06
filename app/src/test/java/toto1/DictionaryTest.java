package toto1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
import org.junit.Before;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
 DictionaryTest.class,
})
public class  DictionaryTest {
    public Dictionary dict;

    @Before public void initiation()
    {
        this.dict = new Dictionary("Example");
    }  
    @Test  public void testDictionaryName() 
        {
         assertThat(dict.getName(), equalTo("Example"));
        }
    @Test public void TestDictionaryisEmpty()
        {
            
            assertThat(dict.isEmpty(), equalTo("false"));
           
        }
    @Test public void testOneTranslation() 
        {
        dict.addTranslation("contre", "against"); 
        assertThat(dict.getTranslation("contre"), equalTo("against"));
        assertThat(dict.getTranslation("against"), equalTo("contre"));
        }
}
