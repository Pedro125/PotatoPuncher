package meme;

/**
 * @author Pedro Rivera
 * @date 1/29/2014
 * @version 1.0.0
 */

public class Location
{
    private int xPos;
    private int yPos;
    
    /**
     * Constructs an instance of a <code>Location</code> for a <code>Doge</code> object
     * 
     * @param xPos The X-Coordinate for this Location
     * @param yPos The Y-Coordinate for this Location
     */
    public Location(int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    /**
     * @return Returns the X-Coordinate of this Location
     */
    public int getX()
    {
        return xPos;
    }
    
    /**
     * @return Returns the Y-Coordinate of this Location
     */
    public int getY()
    {
        return yPos;
    }
    
    /**
     * Sets the X-Coordinate for this Location
     * 
     * @param xPos The X-Coordinate for this Location
     */
    public void setX(int xPos)
    {
        this.xPos = xPos;
    }
    
    /**
     * Sets the Y-Coordinate for this Location
     * 
     * @param yPos The Y-Coordinate for this Location
     */
    public void setY(int yPos)
    {
        this.yPos = yPos;
    }
}
