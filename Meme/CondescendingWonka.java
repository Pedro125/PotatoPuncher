/*
 * @author: Pedro Rivera
 * @date: January 27 2014
 */

package meme;

public class CondescendingWonka extends Meme
{
    private String topCaption;
    private String bottomCaption;
    
    public CondescendingWonka(String topCaption, String bottomCaption)
    {
        super("Condescending Wonka","http://knowyourmeme.com/memes/condescending-wonka-creepy-wonka", 7.634, "Impact", "Image");
        this.topCaption = topCaption;
        this.bottomCaption = bottomCaption;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ". " + topCaption + " " + bottomCaption;
    }
    
    public String getTopCaption()
    {
        return topCaption;
    }
    
    public String getBottomCaption()
    {
        return bottomCaption;
    }
    
    public void setTopCaption(String topCaption)
    {
        this.topCaption = topCaption;
    }
    
    public void setBottomCaption(String bottomCaption)
    {
        this.bottomCaption = bottomCaption;
    }
}
