/**
 * @author: Pedro Rivera
 * @date: January 27 2014
 * @version 1.0.0
 */

package meme;

/**
 * A <code>CondescendingWonka</code> represents an image or instance of the Condescending Wonka meme
 */
public class CondescendingWonka extends Meme
{
    private String topCaption;
    private String bottomCaption;
    
    /**
     * Constructs an instance of <code>CondescendingWonka</code>
     * 
     * @param topCaption A String representing the top caption in a Condescending Wonka meme
     * @param bottomCaption A String representing the bottom caption in a Condescending Wonka meme
     * 
     */
    public CondescendingWonka(String topCaption, String bottomCaption)
    {
        super("Condescending Wonka","http://knowyourmeme.com/memes/condescending-wonka-creepy-wonka", 7.634, "Impact", "Image");
        this.topCaption = topCaption;
        this.bottomCaption = bottomCaption;
    }
    
    @Override
    /**
     * @return Returns a String representation of this instance of the Condescending Wonka meme
     */
    public String toString()
    {
        return super.toString() + ". " + topCaption + " " + bottomCaption;
    }
    
    /**
     * @return Returns the top caption of this instance of the Condescending Wonka meme
     */
    public String getTopCaption()
    {
        return topCaption;
    }
    
    /**
     * @return Returns the bottom caption of this instance of the Condescending Wonka meme
     */
    public String getBottomCaption()
    {
        return bottomCaption;
    }
    
    /**
     * Sets the top caption of this instance of the Condescending Wonka meme
     * 
     * @param topCaption A String representing the top caption of this instance of the Condescending Wonka meme
     */
    public void setTopCaption(String topCaption)
    {
        this.topCaption = topCaption;
    }
    
    /**
     * Sets the bottom pcation of this instance of the CondescendingWonka meme
     *
     * @param bottomCaption A String representing the bottom caption of this instance of the Condescending Wonka meme
     */
    public void setBottomCaption(String bottomCaption)
    {
        this.bottomCaption = bottomCaption;
    }
}
