import java.io.*;
import java.util.Scanner;

/**
 *  The class creates an image in form of a greyscale image which is
 *  read in from a file. It contains a method to crop the left upper
 *  half of the picture and write it out again.
 *
 *  @version 2015-10-19
 *  @author Manfred Kerber
 */
public class PGMImage{
    private int width;
    private int height;
    private int maxShade;
    private String typeOfFile;
    private short[][] pixels;

    /**
     *  @param filename The name of a file that contains an image in
     *  pgm format of type P2.
     *
     */
    public PGMImage(String filename) {
        // try since the file may not exist.
        try {
            // we read from the scanner s which is linked to the file filename.
            Scanner s = new Scanner(new File(filename));

            /* The field variables are assigned by reading in from a
               file. The file should start with something like
               P2
               150 176
               255

               where P2 is the file type, 150 the width of the image, 176
               the height, and 255 the maximal grey value. Then follow
               150*176 grey values between 0 and 255.
            */
    
            // We read the initial element that is in our case "P2"
            typeOfFile = s.next();
            // Next we read the width, the height, and the maxShade.
            width = s.nextInt();
            height = s.nextInt();
            maxShade = s.nextInt();
            //We initialize and read in the different pixels.
            pixels = new short[height][width];
            System.out.println("File not f.");
            for (int i=0; i<height; i++){
                for (int j=0; j<width; j++) {
                    pixels[i][j] = s.nextShort();
                }
            }
            // We finished reading and close the scanner s.
            s.close();
        }
        catch (IOException e){
            //If the file is not found, an error message is printed,
            //and an empty image is created.
            System.out.println("File not found.");

            typeOfFile = "P2";
            width = 0;
            height = 0;
            maxShade = 0;
            pixels = new short[width][height];
        }
        
    }

    /**
     *  @return The width of the image.
     */
    public int getWidth(){
        return width;
    }

    /**
     *  @return The height of the image.
     */
    public int getHeight(){
        return height;
    }
    
    /**
     *  @return The maximal grey value of the image.
     */
    public int getMaxShade(){
        return maxShade;
    }

    /**
     *  @return The file type of the image.
     */
    public String getTypeOfFile(){
        return typeOfFile;
    }

    /**
     *  @return The matrix representing the pixels of the image.
     */
    public short[][] getPixels(){
        return pixels;
    }

    
    /**
     *  The method crops the left upper half of an image.
     *  @param filename The filename of the file in which the cropped
     *  image should be saved.
     */
    public void crop (String filename){
	try {
	    BufferedWriter out = 
		new BufferedWriter(new FileWriter(filename));
	    // We write the file type to out.
	    out.write(getTypeOfFile() + "\n");

	    // We write the dimensions to out.
	    out.write((getWidth()/2) + " " + (getHeight()/2) +"\n");
	    
	    // We write maximal number.
	    out.write(getMaxShade() + "\n");
	    
	    byte counter = 0;
	    for (int i=0; i<getHeight()/2; i++){
		for (int j=0; j<getWidth()/2; j++){
		    out.write(getPixels()[i][j] + " ");
		    counter++;
		    if (counter == 15){		 
                        out.write("\n");
                        counter = 0;
                    }
		}
	    }
	    out.write("\n");
	    // We close the file.
	    out.close();
	}
	catch (IOException e){
            //Errors are caught.
            System.out.println("File not found.");
        }
    }
    public int[][] quarter(String filename){
		
		
		
		int a = 0;
		int b ;
		for(int i = 1; i < quarter.length ; i++ ) {
			for(int j = 1; j<quarter[i].length ;j++) {
				for(int i2 = i - 1; i < 3; i++ ) {
					for(int j2 = j - 1; j<3 ;j++) {
						a = a + quarter[i2][j2];
					}
				}
				b = a/9;
				quarter[i][j] = b;
			}
		}

    /*
     * An example.
     */
    public static void main(String[] args) {
        PGMImage cs = new PGMImage("ComputerScience.pgm");
        cs.crop("ComputerScienceCrop.pgm");
    }
    
    
}
