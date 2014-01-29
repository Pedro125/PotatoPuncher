/**
 *
 * @author Kohl
 * @version 1.0.0
 * @date January 27, 2014
 */
package meme;

/**
 * A <code>AllYourBase</code> represents an image or instance of the All Your Base meme.
 */

public class AllYourBase extends Meme implements Comparable{
    
    private String version;
    private String caption;
    
    
    /**
     * Constructs an instance of <code>AllYourBase</code>.
     * 
     * @param type The medium of the All you base meme
     * @param ver The version of the meme based on how it is different from the original Ex: Redo caption, redo cats' face
     * @param caption The caption displayed at the bottom of the image
     * 
     * 
     */
    public AllYourBase(String type, String ver, String caption){
        super("All You Base", "http://knowyourmeme.com/memes/all-your-base-are-belong-to-us", 3.421,"Arcade",type);
        version = ver;
        this.caption = "All your " + caption + " are belong to us.";
    
    }
    
    /**
     * @return Returns the version of the code as a String
     */
    public String getVersion(){
        return version;
    }
    
    /**
     * @return Returns the caption of this All Your Base meme
     */
    public String getCaption(){
        return caption;
    }
    
    @Override
    /**
     * @return Returns a String representation of this instance of the Doge meme
     */
    public String toString(){
        return super.toString() + "The caption is : \"" + caption + "\" and it is a " + version + " version";
    }
}
