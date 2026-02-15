import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  /** Instance Variables */
private String[][] cultureImages = {
  {"Flag.png", "Sri Lankan Flag"},
  {"buddha.JPG", "Buddhism"},
  {"newFestivals.JPG", "Festivals"},
  {"KandyParade.JPG", "Kandy Parade"},
  {"cricket.JPG", "Cricket"},
  {"masks.JPG", "Cultural Masks"},
  {"clothes.JPG", "Traditional Clothes"}
};

private static final int SAMPLE_RATE = 44100; // for audioClip
  
//Constructor
   public SceneOne() {
   }
  
   /**
   * Helper method to apply a default of 
   * 400 by 400 to all images
   */
    private void applyDefaultSize(ImageFilter img, int x, int y) {
    drawImage(img, x, y, 400, 400, 0);
    }
  
  /**
   * Helper method to apply a default text style of 
   * Font.SANS and FontStyle.BOLD to all text
   */
  private void applyDefaultTextStyle() {
    setTextStyle(Font.SANS, FontStyle.BOLD);
    }
   
    public void drawScene() {
      playBackgroundTrack(18); //plays audio
      clear("pink"); //clears the screen to pink 
      setTextHeight(50); //sets text height to 50
      applyDefaultTextStyle();  //Default TextStyle
      drawText("My Culture", 85, 215);  
      pause(2); //pauses for 2 seconds
   
/**
   * Flag picture with color-shift filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 30 and draws it 
   * Applies default text style using the helper method
   */    
    ImageFilter flag = new ImageFilter("Flag.png"); //puts the image on the screen
    applyDefaultSize(flag, 0, 0); //applies default image size
    setTextHeight(30);
    applyDefaultTextStyle(); //applies default text style
    drawText("Sri Lankan Flag", 90, 30);  
    pause(1); //pauses for 2 seconds
    
    flag.colorShift(70);  //applies the color shift filter to the image
    
    applyDefaultSize(flag, 0, 0);
    drawText("Sri Lankan Flag", 90, 30); 
    pause(1);
      
/**
   * Buddha picture with color-shift filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 30 and draws it 
   * Applies default text style using the helper method
   */    
  ImageFilter buddha = new ImageFilter("buddha.JPG");
  applyDefaultSize(buddha, 0, 0); //applies default image size
    setTextHeight(30);
    applyDefaultTextStyle();  //applies default text style
    drawText("Buddhism", 130, 30);  
    pause(1); //pauses 1 second 
    
  buddha.colorShift(55);  //applies the color shift filter to the image
    
  applyDefaultSize(buddha, 0, 0); //applies default size
  drawText("Buddhism", 130, 30);  
  pause(1); //pauses 1.5 seconds

/**
   * Festivals picture with color-shift filter, using data from 2D array 
  *  Applies default size using the helper method
   * Sets Text Height to 30 and draws it 
   * Applies default text style using the helper method
   */        
  ImageFilter festivals = new ImageFilter("newFestivals.JPG");
  applyDefaultSize(festivals, 0, 0); //applies default image size
  setTextColor("white");
  setTextHeight(30);
  applyDefaultTextStyle(); //applies default text style
  drawText("Festivals", 60, 35);  
  pause(1); //pauses for 1 second
    
  festivals.colorShift(35);  //applies the color shift filter to the image
    
  applyDefaultSize(festivals, 0, 0);  //applies default image size
  drawText("Festivals", 60, 35);  
  pause(1); //pauses 1.5 seconds

/**
   * Kandy parade picture with color-shift filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 30 and draws it 
   * Applies default text style using the helper method
   */  
  ImageFilter parade = new ImageFilter("KandyParade.JPG");
  applyDefaultSize(parade, 0, 0); //applies default image size
  setTextColor("white"); 
  setTextHeight(30);
  applyDefaultTextStyle(); //applies default text style
  drawText("Kandy Parade", 100, 35);  
  pause(1); //pauses 1 second
    
  parade.colorShift(35);  //applies the color shift filter to the image
    
  applyDefaultSize(parade, 0, 0);  //applies default size
  drawText("Kandy Parade", 100, 35);  
  pause(1);

/**
   * Cricket picture with keep green filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 40 and draws it 
   * Applies default text style using the helper method
   */  
  ImageFilter cricket = new ImageFilter("cricket.JPG");
  applyDefaultSize(cricket, 0, 0); //applies default image size
  setTextColor("black"); 
  setTextHeight(40);
  applyDefaultTextStyle(); //applies default size
  drawText("Cricket", 100, 45);
  pause(1); //pauses 1 second
      
  cricket.keepColor("green");  //applies the color green filter to the image
    
applyDefaultSize(cricket, 0, 0); //re-draws image with the filter applied
drawText("Cricket", 100, 45);
pause(1); //pauses 1.5 seconds
    
/**
   * Masks picture with keep green filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 35 and draws it 
   * Applies default text style using the helper method
   */  
  ImageFilter masks = new ImageFilter("masks.JPG");
  applyDefaultSize(masks, 0, 0); //applies default image size
  setTextColor("white");
  setTextHeight(35);
  applyDefaultTextStyle(); //applies default text style
  drawText("Cultural Masks", 100, 40);
  pause(1); //Pause 1 second
      
  masks.keepColor("red");  //applies the color red filter to the image
    
  applyDefaultSize(masks, 0, 0);  //re-draws image with the filter applied
  drawText("Cultural Masks", 100, 40);
  pause(1);

  /**
   * Clothing picture with keep green filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 30 and draws it 
   * Applies default text style using the helper method
   */  
  ImageFilter clothing = new ImageFilter("clothes.JPG");
  applyDefaultSize(clothing, 0, 0); //applies default image size
  setTextColor("black");
  setTextHeight(30);
  applyDefaultTextStyle(); //applies default text style
  drawText("Traditional Clothes", 85, 300);
  pause(1); //pauses 1 second
      
  clothing.keepColor("green");  //applies the color green filter to the image
    
applyDefaultSize(clothing, 0, 0);  //re-draws image with the filter applied
drawText("Traditional Clothes", 85, 300);
pause(1); //pauses 1.5 seconds

//Loop through 2D array and show all images again like a recap
clear("pink");
setTextHeight(25);
applyDefaultTextStyle();

for (int row = 0; row < cultureImages.length; row++) {
ImageFilter img = new ImageFilter(cultureImages[row][0]);
  drawImage(img, 50, 50, 300, 300, 0);
  pause (0.3);
}
    }
  //Loads an audio file and using createClip, plays a section of it
  public void playBackgroundTrack(int numSeconds) {  
    double[] audio = SoundLoader.read("audio-(mp3cut.net)-(24).wav");
    // just play the first numSeconds
    double[] clip = createClip(audio, 0, numSeconds);
    playSound(clip);
  }
      
public static double[] createClip(double[] sound, int start, int end) {
    int startIndex = start * SAMPLE_RATE;
    int endIndex = end * SAMPLE_RATE;

    if (endIndex >= sound.length) {
    endIndex = sound.length - 1;
      }

  if(startIndex < 0) {
    startIndex = 0;
  }
    
  if(startIndex >= sound.length) {
    startIndex = sound.length;
  }

  double[] newSound = new double[endIndex - startIndex];

    int index = 0;
    
    while (startIndex < endIndex && index < newSound.length) {
      newSound[index] = sound[startIndex];
      startIndex++;
      index++;
    }

    return newSound;
  }
  
} 