package meme;

/*
    @author: Pedro Rivera
    @date: 1/28/2014
*/

public class Location
{
    private int xPos;
    private int yPos;
    
    public Location(int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public int getX()
    {
        return xPos;
    }
    
    public int getY()
    {
        return yPos;
    }
    
    public void setX(int xPos)
    {
        this.xPos = xPos;
    }
    
    public void setY(int yPos)
    {
        this.yPos = yPos;
    }
}
