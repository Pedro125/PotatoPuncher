/**
 * @author Pedro Rivera
 * @version 1.0.0
 * @date 1/28/2014
*/

package meme;

/**
 * A <code>Doge</code> represents an image or instance of the Doge meme.
 */

public class Doge extends Meme
{
    private String[] captions;
    private Location[] locations;
    
    private int imageWidth;
    private int imageHeight;
    
    /**
     * Constructs an instance of <code>Doge</code>.
     * 
     * @param captions An array of String messages to be randomly placed on the image
     * @param imageHeight The pixel height of this instance of the Doge meme image
     * @param imageWidth The pixel width of this instance of the Doge meme image
     * 
     * <br><b>Precondition:</b> <code>captions</code> is an array filled with various Doge quotes
     */
    public Doge(String[] captions, int imageHeight, int imageWidth)
    {
        super("Doge","http://knowyourmeme.com/memes/doge",9.23,"Comic Sans","Image");
        this.captions = captions;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        
        locations = new Location[captions.length];
        
        for(int i=0; i<captions.length; i++)
        {
            int randX = (int)(Math.random()*imageWidth);
            int randY = (int)(Math.random()*imageHeight);
            locations[i] = new Location(randX,randY);
        }
    }
    
    @Override
    /**
     * @return Returns a String representation of this instance of the Doge meme
     */
    public String toString()
    {
        String output = super.toString();
        output += ". Doge says \"";
        for(int i=0;i<captions.length;i++)
        {
            output+=(captions[i])+".";
        }
        output += "\"";
        return output;
    }
    
    /**
     * @return Returns the width of this instance of the Doge meme in pixels
     */
    public int getWidth()
    {
        return imageWidth;
    }
    
    /**
     * @return Returns the height of this instance of the Doge meme in pixels
     */
    public int getHeight()
    {
        return imageHeight;
    }
    
    /**
     * @return Returns an array of the String messages held in this instance of the Doge meme
     */
    public String[] getCaptions()
    {
        return captions;
    }
    
    /**
     * @return Returns an array of the Locations that the captions are held within the image
    */
    public Location[] getLocations()
    {
        return locations;
    }
    
    /**
     * Sets the pixel width of this Doge image
     * 
     * @param imageWidth the pixel width of this instance of the Doge meme image
    */
    public void setWidth(int imageWidth)
    {
        this.imageWidth = imageWidth;
    }
    
    /**
     * Sets the pixel height of this Doge image
     * 
     * @param imageHeight the pixel height of this instance of the Doge meme image
     */
    public void setHeight(int imageHeight)
    {
        this.imageHeight = imageHeight;
    }
    
    /**
     * Sets the array of Captions used by this instance of the Doge meme
     * 
     * @param captions An array of String messages to be randomly placed on the screen
     * 
     * <br>
     * <i>When <code>setCaptions(String[] captions)</code> is called, <code>locations</code> is also redefined randomly</i>
     */
    public void setCaptions(String[] captions)
    {
        this.captions = captions;
        
        locations = new Location[captions.length];
        
        for(int i=0; i<captions.length; i++)
        {
            int randX = (int)(Math.random()*imageWidth);
            int randY = (int)(Math.random()*imageHeight);
            locations[i] = new Location(randX,randY);
        }
    }
}
