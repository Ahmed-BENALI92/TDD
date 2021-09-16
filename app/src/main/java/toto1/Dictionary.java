package toto1;
import java.util.HashMap;
public class Dictionary
{
    private String Name;
    HashMap <String,String> Translations;

    public  Dictionary(String name)
    {
        Name= name ;
        Translations = new HashMap<String, String>();
    }

    public String getName()
    {
        return Name;
    }

    public String isEmpty()
    {
        if(Name == null && Translations.size()==0)
        {
            return "true";
        }
        return "false";
    }

    public void addTranslation(String translate1 , String translate2)
    {
        Translations.put(translate1,translate2);
        Translations.put(translate2,translate1);
    }

    public String getTranslation(String Translate)
    {
        if(Translations.get(Translate)==null)return "Erreur";
        return Translations.get(Translate);
    }

}