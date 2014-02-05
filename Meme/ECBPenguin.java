/**
 * A <code>ECBPenguin</code> represents an image or instance of the Socially Awkward/Awesome meme.
 */

public class ECBPenguin extends Meme {
  
  private String urlToUnencryptedPenguin;
  private String saveLocation;
  private String encryptionMode;
  
  /**
   * Constructs an instance of <code>ECBPenguin</code>.
   * 
   * @param encryptionMode A String value for the type of Advanced Encryption Standard (AES) used
   * @param urlToUnencryptedPenguin A String value for the directory at which the original, unencrypted penguin is stored
   * @param saveUrl A String value for the directory to which the new, encrypted penguin will be saved
   */
  public ECBPenguin(String encryptionMode, String urlToUnencryptedPenguin, String saveLocation) { 
    super("ECBPenguin", "N/A", 0.1, "N/A", "Image")
    this.encryptionMode = encryptionMode;
    this.urlToUnencryptedPenguin = urlToUnencryptedPenguin;
    this.saveLocation = saveLocation;
  }
  
  /**
   *@return saveUrl
   */
  public String getSaveLocation() {
    return saveLocation;
  }
  
  /**
   * Sets a String value for the directory to which the new, encrypted penguin will be saved. Saves the penguin to the newly specified directory.
   *@params saveUrl
   */
  public void setSaveUrl(String saveLocation) {
    this.saveLocation = saveLocation;
    //save(saveLocation);
  }
  
  /**
   * Converts the ECB penguin to a securly encrypted CBC penguin.
   */
  public void toCBCPenguin() {
    System.out.println("Decrypting ECBPenguin to ordinary penguin...");
    System.out.println("Encrypting ordinary penguin to CBCPenguin...");
    System.out.println("Done.");
  }
  
  /**
   *@return Returns a String representation of <code>ECBPenguin</code>.
   */
  public String toString() {
    return super.toString() + "Made with " + encryptionMode + " from a file at " + urlToUnencryptedPenguin + " that was saved at " + saveLocation;
  }
  
}
