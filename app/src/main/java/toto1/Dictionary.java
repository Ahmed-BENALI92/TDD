package toto1;

public class Dictionary
{
    private String Name;
    
    public  Dictionary(String name)
    {
        Name= name ;
    }

    public String getName()
    {
        return Name;
    }

    public boolean isEmpty()
    {
        if(Name != null)
        {
            return false ;
        }
        return true;
    }

}