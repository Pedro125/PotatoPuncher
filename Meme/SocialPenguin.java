public class SocialPenguin extends Meme {
  
  private boolean isAwkward;
  private String topText;
  private String bottomText;
  
  public SocialPenguin(boolean isAwkward, String topText, String bottomText) { 
    super("Awkward Penguin", "http://knowyourmeme.com/memes/socially-awkward-penguin", 0.1, "Impact", "Image");
    if (!isAwkward) {
      super("Awesome Penguin", "http://knowyourmeme.com/memes/socially-awesome-penguin", 10.0, "Impact", "Image");
    }
    this.isAwkward = isAwkward;
    this.topText = topText;
    this.bottomText = bottomText;
  }
  
  
  public boolean getIsAwkward() {
    return isAwkward;
  }
  
  public void setIsAwkward(boolean isAwkward) {
    this.isAwkward = isAwkward;
  }
  
  public String getTopText() {
    return topText;
  }
  
  public void setTopText(String topText) {
    this.topText = topText;
  }
  
  public String getBottomText() {
    return topText;
  }
  
  public void setBottomText(String bottomText) {
    this.bottomText = bottomText;
  }
  
  public String toString() {
    return super.toString() + "because I " + topText + " " + bottomText;
  }
  
}