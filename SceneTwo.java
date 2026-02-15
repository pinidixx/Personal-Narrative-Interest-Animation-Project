import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  /** Instance Variables */
private String[][] foodImages = {
{"kothu.JPG", "Kothu"},
{"rings.JPG", "Honey Rings"},
{"eggHoppers.JPG", "Egg Hoppers"},
{"coconuts.JPG", "King Coconut (Thambili)"},
{"diwul.JPG", "Wood apple-juice (Diwul)"},
{"necto.JPG", "Necto Soda"},
{"falooda.JPG", "Falooda"}
  
};

  private static final int SAMPLE_RATE = 44100; // for audioClip

  /** Constructor */
  public SceneTwo() {
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
/**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene() {
      playBackgroundTrack(21); //plays audio for 21 seconds
      clear("pink"); //clears the screen to pink
      setTextHeight(25);  //sets text height to 25
      applyDefaultTextStyle(); //Default TextStyle
      drawText("Favorite Traditional Food", 65, 215);  //draws text "Favorite Traditional Food" 
      pause(2); //pauses for 2 seconds

/**
   * Kothu picture with pixelate filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 35 and draws it 
   * Applies default text style using the helper method
   */   
    ImageFilter kothu = new ImageFilter("kothu.JPG"); //puts the image with the filter on the screen
    kothu.pixelate(10);  //pixelates the image
    applyDefaultSize(kothu, 0, 0); //applies default size using helper method
    setTextHeight(35); 
    setTextColor("white"); 
    applyDefaultTextStyle();  //applies default text style using helper method
    pause(1.2); //pauses for 2 seconds
    
    kothu = new ImageFilter("kothu.JPG");  //redraws the image WITHOUT the filter applied
    applyDefaultSize(kothu, 0, 0); //applies default size of image using helper method
    drawText("Kothu", 95, 37);  
    pause(1); //pauses for 2 seconds
 
/**
   * Rings picture with pixelate filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 35 and draws it 
   * Applies default text style using the helper method
   */  
    ImageFilter rings = new ImageFilter("rings.JPG"); //puts the image with the filter on the screen
    rings.pixelate(10);  //pixelates the image
    applyDefaultSize(rings, 0, 0); //applies default size of image using helper method
    setTextHeight(35); 
    setTextColor("black"); 
    applyDefaultTextStyle(); //applies default text style using helper method
    pause(1); //pauses for 2 seconds
    
    rings = new ImageFilter("rings.JPG"); //re-draws image WITHOUT the filter applied
    applyDefaultSize(rings, 0, 0); //applies default size of image
    drawText("Honey Rings", 100, 37);  
    pause(1); //pauses for 2 seconds

/**
   * Hoppers picture with pixelate filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 35 and draws it 
   * Applies default text style using the helper method
   */  
    ImageFilter hoppers = new ImageFilter("eggHoppers.JPG"); //puts the image with the filter on the screen
    hoppers.pixelate(10);  //pixelates the image
    applyDefaultSize(hoppers, 0, 0); //applies default size using helper method
    setTextHeight(35); 
    setTextColor("black"); 
    applyDefaultTextStyle(); //applies default text style using helper method
    pause(1); //pauses for 2 seconds
    
    hoppers = new ImageFilter("eggHoppers.JPG"); //re-draws image WITHOUT the filter applied
    applyDefaultSize(hoppers, 0, 0);  //applies default size using helper method
    drawText("Egg Hoppers", 100, 37);  
    pause(1); //pauses for 2 seconds
 
    
    clear("pink"); //clears the screen
    setTextHeight(25);
    applyDefaultTextStyle();
    drawText("Favorite Traditional Drinks", 60, 215);  
    pause(1); //pauses for 2 seconds

/**
   * King coconut picture with applyBlur, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 25 and draws it 
   * Applies default text style using the helper method
   */  
    ImageFilter coconut = new ImageFilter("coconuts.JPG"); //puts the image with the filter on the screen
    coconut.applyBlur();  //pixelates the image
    applyDefaultSize(coconut, 0, 0); //applies default image size
    setTextHeight(25);
    setTextColor("black");
    applyDefaultTextStyle(); //applies default text color
    pause(1); //pauses for 2 seconds
    
    coconut = new ImageFilter("coconuts.JPG"); //re-draws image WITHOUT the filter applied
    applyDefaultSize(coconut, 0, 0);   //applies default image size
    drawText("King Coconut (Thambili)", 70, 37); 
    pause(1);

   /**
   * woodApple picture with applyBlur, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 25 and draws it 
   * Applies default text style using the helper method
   */  
    ImageFilter woodApple = new ImageFilter("diwul.JPG"); //puts the image with the filter on the screen
    woodApple.applyBlur();  //pixelates the image
    applyDefaultSize(woodApple, 0, 0); //applies default image size 
    setTextHeight(25);
    setTextColor("black");
    applyDefaultTextStyle(); //applies default text style
    pause(1); //pauses for 2 seconds
    
    woodApple = new ImageFilter("diwul.JPG"); //re-draws image WITHOUT the filter applied
    applyDefaultSize(woodApple, 0, 0);   //applies default iamge size
    drawText("Wood apple-juice (Diwul)", 70, 37);  
    pause(1);

   /**
   * Necto picture with gray Filter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 30 and draws it 
   * Applies default text style using the helper method
   */  
    ImageFilter necto = new ImageFilter("necto.JPG"); //puts the image with the filter on the screen
    necto.grayFilter();  //pixelates the image
    applyDefaultSize(necto, 0, 0);
    setTextHeight(30);
    setTextColor("white");
    applyDefaultTextStyle();
    pause(1); //pauses for 2 seconds
    
    necto = new ImageFilter("necto.JPG"); //re-draws image WITHOUT the filter applied
    applyDefaultSize(necto, 0, 0); 
    drawText("Necto Soda", 150, 37);  
    pause(1);
    
 /**
   * Falooda picture with grayFilter, using data from 2D array 
   * Applies default size using the helper method
   * Sets Text Height to 30 and draws it 
   * Applies default text style using the helper method
   */ 
    ImageFilter falooda = new ImageFilter("falooda.JPG"); //puts the image with the filter on the screen
    falooda.grayFilter();  //pixelates the image
    applyDefaultSize(falooda, 0, 0);
    setTextHeight(30);
    setTextColor("white");
    applyDefaultTextStyle();
    pause(1); //pauses for 2 seconds
    
    falooda = new ImageFilter("falooda.JPG");//re-draws image WITHOUT the filter applied
    applyDefaultSize(falooda, 0, 0);   
    drawText("Falooda", 150, 40);  
    pause(1);


    //Loop through 2D array and show all images again like a recap
    clear("pink");
    setTextHeight(25);
    applyDefaultTextStyle();

    for (int row = 0; row < foodImages.length; row++) {
    ImageFilter img = new ImageFilter(foodImages[row][0]);
    drawImage(img, 50, 50, 300, 300, 0);
    pause (0.3); 
    }

  clear("pink");
  setTextHeight(50);
  setTextColor("black");
  applyDefaultTextStyle();

  drawText("The End", 95, 215);
  pause(3);
  }
  
  //Loads an audio file and using createClip, plays a section of it
 public void playBackgroundTrack(int numSeconds) {
    double[] audio = SoundLoader.read("audio-(mp3cut.net)-(25).wav");
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