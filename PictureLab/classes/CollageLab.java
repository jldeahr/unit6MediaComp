

/**
 * Write a description of class Collage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollageLab
{
    public static void main(String[] args)
    {
        int width = 0;
        int height = 0;        
        
        Picture original = new Picture("gorge.jpg");
        Picture change1 = new Picture("gorge.jpg");
        Picture change2 = new Picture("gorge.jpg");
        Picture change3 = new Picture("gorge.jpg");
        Picture change4 = new Picture("gorge.jpg");
        Picture change5 = new Picture("gorge.jpg");
        
        width = original.getWidth();
        height = original.getHeight();
        
        Picture canvas = new Picture(height*2,width*3);
        
        change1.mirrorVertical();
        change1.grayscale();
        change2.mirrorDiagonal();
        change2.keepOnlyBlue();
        change3.mirrorHorizontal();
        change3.zeroBlue();
        change4.mirrorVertical();
        change4.keepOnlyGreen();
        change5.mirrorHorizontal();
        change5.keepOnlyRed();
        
        canvas.copy(original,0,0);        
        canvas.copy(change1,0,width);
        canvas.copy(change2,height,0);
        canvas.copy(change3,height,width);
        canvas.copy(change4,0,width*2);
        canvas.copy(change5,height,width*2);
                
        canvas.explore();
        
        canvas.write("H:\\GitHub\\unit6MediaComp\\PictureLab\\classes\\collage.jpg");
    }
}
