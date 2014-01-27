package meme;
/*
 * @author kohl
 * @date January 27, 2014
*/

public class Meme {
        private String memeName;
        private String knowYourMemeLink;
        private double popularity;
        private String font;
        private String type;
        
        public Meme(String name, String link, double pop, String f, String t){
            memeName = name;
            knowYourMemeLink = link;
            popularity = pop;
            font = f;
            type = t;
        }
        
    @Override
        public String toString(){
            String returnString = "Hello, I am a " + type + " containing a " + memeName + " meme.";
            returnString+= "I have a popularity of " + popularity + " on the universal meme popularity scale. ";
            returnString+= "I use a font of " + font + ". To find out more information, go here: " +knowYourMemeLink;
            return returnString;
        }
        
        public void setMemeName(String memeName){
            this.memeName = memeName;
        }
        public String getMemeName(){
            return memeName;
        }
        
        public void setKnowYourMemeLink(String knowYourMemeLink){
            this.knowYourMemeLink = knowYourMemeLink;
        }
        public String getKnowYourMemeLink(){
            return knowYourMemeLink;
        }
        
        public void setPopularity(double popularity){
            this.popularity = popularity;
        }
        public double getPopularity(){
            return popularity;
        }
        
        public void setFont(String font){
            this.font = font;
        }
        public String getFont(){
            return font;
        }
        
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return type;
        }
        
        public int compareTo(Meme other){
            return memeName.compareTo(other.getMemeName());
        }
    
}
