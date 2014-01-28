package meme;

/*
    @author: Pedro Rivera
    @date: 1/27/2014
*/

public class Doge extends Meme
{
    private String[] captions;
    private Location[] locations;
    
    private int imageWidth;
    private int imageHeight;
    
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
    
    public int getWidth()
    {
        return imageWidth;
    }
    
    public int getHeight()
    {
        return imageHeight;
    }
    
    public String[] getCaptions()
    {
        return captions;
    }
    
    public Location[] getLocations()
    {
        return locations;
    }
    
    public void setWidth(int imageWidth)
    {
        this.imageWidth = imageWidth;
    }
    
    public void setHeight(int imageHeight)
    {
        this.imageHeight = imageHeight;
    }
    
    public void setCaptions(String[] captions)
    {
        this.captions = captions;
    }
    
    public void setLocations(Location[] locations)
    {
        this.locations = locations;
    }
}
