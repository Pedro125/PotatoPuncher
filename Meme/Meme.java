package meme;
/*
 * @author kohl
 * @version 1.0.2
 * @date January 27, 2014
*/
/**
 * A <code>Meme</code> represents an  instance of a Meme
 */

public class Meme implements Comparable{
        private String memeName;
        private String knowYourMemeLink;
        private double popularity;
        private String font;
        private String type;
        
        /**
     * Constructs an instance of <code>Meme</code>.
     * 
     * @param name The formal name of the meme
     * @param link The link to an explanation of the meme.  Either the video or the website
     * @param pop The popularity in the form of a double from 0 to 10
     * @param f The font type used for text in the caption
     * @param t The medium of the meme Ex: video, picture, song
     * <br><b>Precondition:</b> <code>pop</code> is a double between 0 and 10
     */
        public Meme(String name, String link, double pop, String f, String t){
            memeName = name;
            knowYourMemeLink = link;
            popularity = pop;
            font = f;
            type = t;
        }
        
    @Override
    /**
     * @return Returns a String representation of the meme
     */
        public String toString(){
            String returnString = "Hello, I am a " + type + " containing a " + memeName + " meme.";
            returnString+= "I have a popularity of " + popularity + " on the universal meme popularity scale. ";
            returnString+= "I use a font of " + font + ". To find out more information, go here: " +knowYourMemeLink;
            return returnString;
        }
     /**
     * Sets the name of the meme
     * 
     * @param memeName the name of this meme
    */
        public void setMemeName(String memeName){
            this.memeName = memeName;
        }
        
        /**
     * @return Returns the meme name of the meme
     */
        public String getMemeName(){
            return memeName;
        }
     /**
     * Sets the link for the know your meme page or video
     * 
     * @param knowYourMemeLink the link to the know your meme page
    */
        public void setKnowYourMemeLink(String knowYourMemeLink){
            this.knowYourMemeLink = knowYourMemeLink;
        }
        /**
     * @return Returns the link for understanding the meme
     */
        public String getKnowYourMemeLink(){
            return knowYourMemeLink;
        }
     /**
     * Sets the popularity of the meme
     * 
     * @param populariyt the popularity of this meme
    */  
        public void setPopularity(double popularity){
            this.popularity = popularity;
        }
        /**
     * @return Returns the popularity in the form of a double
     */
        public double getPopularity(){
            return popularity;
        }
      /**
     * Sets the font type of the meme
     * 
     * @param font the font type of the meme
    */ 
        public void setFont(String font){
            this.font = font;
        }
        /**
     * @return Returns the font used in the caption
     */
        public String getFont(){
            return font;
        }
        
     /**
     * Sets the type of the meme
     * 
     * @param type the medium of the meme
    */
        public void setType(String type){
            this.type = type;
        }
        /**
     * @return Returns the medium used in the meme
     */
        public String getType(){
            return type;
        }
        
    @Override
    /**
     * Compares the names of the parameter with the name of the instance of the meme
     * 
     * @param obj the meme that is being compared
     * 
     * <br><b>Precondition:</b> <code>obj</code> is a meme
    */
        public int compareTo(Object obj){
            return memeName.compareTo(((Meme)obj).getMemeName());
        }
    
}
