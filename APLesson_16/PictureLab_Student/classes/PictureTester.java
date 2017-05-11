/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRighttoLeft()
  {
	   Picture caterpillar = new Picture("caterpillar.jpg");
	   caterpillar.explore();
	   caterpillar.mirrorVerticalRighttoLeft();
	   caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture bike = new Picture("redMotorcycle.jpg");
	  bike.explore();
	  bike.mirrorHorizontal();
	  bike.explore();
  }
  
  public static void testmirrorHorizontalBotToTop()
  {
	  Picture bike = new Picture("redMotorcycle.jpg");
	  bike.explore();
	  bike.mirrorHorizontalBotToTop();
	  bike.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture sm = new Picture("snowman.jpg");
	  sm.explore();
	  sm.mirrorArms();
	  sm.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture sg = new Picture("seagull.jpg");
	  sg.explore();
	  sg.mirrorGull();
	  sg.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  Picture b = new Picture("beach.jpg");
	  b.createCollage();
	  b.explore();
  }
  
  public static void testmyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture pic = new Picture("beach.jpg");
	  pic.keepOnlyBlue();
	  pic.explore();
  }
  
  public static void testNegate()
  {
	  Picture pic = new Picture("beach.jpg");
	  pic.negate();
	  pic.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture pic = new Picture("beach.jpg");
	  pic.grayscale();
	  pic.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture pic = new Picture("water.jpg");
	  pic.fixUnderwater();
	  pic.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRighttoLeft();
    //testMirrorHorizontal();
	//testmirrorHorizontalBotToTop();
	//testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    testCopy();
	//testmyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}