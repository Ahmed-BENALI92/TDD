package toto1;

public class Dictionary
{
    private String Name;
    private String Translate1;
    private String Translate2;

    public  Dictionary(String name)
    {
        Name= name ;
    }

    public String getName()
    {
        return Name;
    }

    public String isEmpty()
    {
        if(Name == null)
        {
            return "true" ;
        }
        return "false";
    }

    public void addTranslation(String translate1 , String translate2)
    {
        Translate1 = translate1;
        Translate2 = translate2;
    }

    public String getTranslation(String Translate)
    {
        //if(this.Translate1 == Translate)return this.Translate2;
        //if(this.Translate2 == Translate)return this.Translate1;
        return "against";
    }

}