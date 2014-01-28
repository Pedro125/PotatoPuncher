package meme;

/**
 *
 * @author Kohl
 * @date January 27, 2014
 */
public class AllYourBase extends Meme implements Comparable{
    
    private String version;
    private String caption;
    
    public AllYourBase(String type, String ver, String caption){
        super("All You Base", "http://knowyourmeme.com/memes/all-your-base-are-belong-to-us", 3.421,"Arcade",type);
        version = ver;
        this.caption = "All your " + caption + " are belong to us.";
    
    }
    
    public String getVersion(){
        return version;
    }
    public String getCaption(){
        return caption;
    }
    
    @Override
    public String toString(){
        return super.toString() + "The caption is : \"" + caption + "\" and it is a " + version + " version";
    }
}
