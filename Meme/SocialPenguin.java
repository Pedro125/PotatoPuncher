/**
 * A <code>SocialPenguin</code> represents an image or instance of the Socially Awkward/Awesome meme.
 */

public class SocialPenguin extends Meme {
  
  private boolean isAwkward;
  private String topText;
  private String bottomText;
  
  /**
   * Constructs an instance of <code>SocialPenguin</code>.
   * 
   * @param isAwkward A boolean value indicating whether a particular instance is awkward or awesome.
   * @param topText The String value to be rendered at the top of the meme.
   * @param bottomText The String value to be rendered at the bottom of the meme.
   */
  public SocialPenguin(boolean isAwkward, String topText, String bottomText) { 
    super("Awkward Penguin", "http://knowyourmeme.com/memes/socially-awkward-penguin", 0.1, "Impact", "Image");
    if (!isAwkward) {
      super("Awesome Penguin", "http://knowyourmeme.com/memes/socially-awesome-penguin", 10.0, "Impact", "Image");
    }
    this.isAwkward = isAwkward;
    this.topText = topText;
    this.bottomText = bottomText;
  }
  
  /**
   *@return isAwkward
   */
  public boolean getIsAwkward() {
    return isAwkward;
  }
  
  /**
   *@return Returns a boolean indicating whether a particular instance is awkward or awesome.
   */
  public void setIsAwkward(boolean isAwkward) {
    this.isAwkward = isAwkward;
  }
  
  /**
   *@return Returns a boolean indicating whether a particular instance is awkward or awesome.
   */
  public String getTopText() {
    return topText;
  }
  
  /**
   * Sets a String value to be rendered at the top of the meme.
   *@params topText
   */
  public void setTopText(String topText) {
    this.topText = topText;
  }
  
  /**
   *@return Returns a String value to be rendered at the bottom of the meme.
   */
  public String getBottomText() {
    return topText;
  }
  
  /**
   * Sets a String value to be rendered at the bottom of the meme.
   *@params bottomText
   */
  public void setBottomText(String bottomText) {
    this.bottomText = bottomText;
  }
  
  /**
   *@return Returns a String representation of <code>SocialPenguin</code>.
   */
  public String toString() {
    return super.toString() + "because I " + topText + " " + bottomText;
  }
  
}