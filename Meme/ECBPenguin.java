public class ECBPenguin extends Meme {
  
  private String urlToUnencryptedPenguin;
  private String saveUrl;
  
  public ECBPenguin(String urlToUnencryptedPenguin, String saveUrl) { 
    super("ECBPenguin", "N/A", 0.1, "N/A", "Image")
    this.urlToUnencryptedPenguin = urlToUnencryptedPenguin;
    this.saveLocation = saveLocation;
  }
  
  public String toCBCPenguin() {
    System.out.println("Decrypting ECBPenguin to ordinary penguin...");
    System.out.println("Encrypting ordinary penguin to CBCPenguin...");
    System.out.println("Done.");
  }
  
  public String toString() {
    return super.toString() + "Made with " + encryptionMode + " from a file at " + urlToUnencryptedPenguin + " that was saved at " + saveLocation;
  }
  
}
