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

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /** Method to test mirrorVerticalRightToLeft */
    public static void testMirrorVerticalRightToLeft()
    {
        Picture kali = new Picture("kali.jpg");
        kali.mirrorVerticalRightToLeft();
        kali.explore();
    }

    /** Method to test mirrorHorizontal */
    public static void testMirrorHorizontal()
    {
        Picture kali = new Picture("kali.jpg");
        kali.mirrorHorizontal();
        kali.explore();
    }

    /** Method to test testMirrorHorizontalBottomToTop */
    public static void testMirrorHorizontalBottomToTop()
    {
        Picture kali = new Picture("kali.jpg");
        kali.mirrorHorizontalBottomToTop();
        kali.explore();
    }

    /** Method to test testMirrorDiagonal */
    public static void testMirrorDiagonal()
    {
        Picture kali = new Picture("beach.jpg");
        kali.mirrorDiagonal();
        kali.explore();
    }
    
    /** Method to test testMirrorArms */
    public static void testMirrorArms()
    {
        Picture kali = new Picture("snowman.jpg");
        kali.explore();
        kali.mirrorArms();
        kali.explore();
    }
    
    /** Method to test testMirrorGull */
    public static void testMirrorGull()
    {
        Picture kali = new Picture("seagull.jpg");
        kali.explore();
        kali.mirrorGull();
        kali.explore();
    }
    
    /** Method to test testKeepOnlyBlue */
    public static void testKeepOnlyBlue()
    {
        Picture kali = new Picture("seagull.jpg");
        kali.explore();
        kali.keepOnlyBlue();
        kali.explore();
    }
    
    /** Method to test testNegate */
    public static void testNegate()
    {
        Picture kali = new Picture("kali.jpg");
        kali.explore();
        kali.negate();
        kali.explore();
    }
    
    /** Method to test testGrayscale */
    public static void testGrayscale()
    {
        Picture kali = new Picture("kali.jpg");
        kali.explore();
        kali.grayscale();
        kali.explore();
    }
    
    /** Method to test testFixUnderwater */
    public static void testFixUnderwater()
    {
        Picture kali = new Picture("water.jpg");
        kali.explore();
        kali.fixUnderwater();
        kali.explore();
    }
    
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        testMirrorVerticalRightToLeft();
        testMirrorHorizontal();
        testMirrorHorizontalBottomToTop();
        testMirrorDiagonal();
        testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testNegate();
        testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        testMirrorTemple();
        testMirrorArms();
        testMirrorGull();;
        //testCollage();
        //testCopy();
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