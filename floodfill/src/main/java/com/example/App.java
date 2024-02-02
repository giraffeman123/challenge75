package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}}; 
        int sr = 1; int sc = 1; int color = 2;
        int[][] res = floodFill(image, sr, sc, color);
        System.out.println(res);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] != color)
            return performFill(image, sr, sc, color, image[sr][sc]);                
        else 
            return image;
    }    

    public static int[][] performFill(int[][] img, int sr, int sc, int color, int cellValue){
        if(img[sr][sc] == cellValue)
            img[sr][sc] = color;
            
        if((sr-1) >= 0 && img[sr-1][sc] == cellValue){
            img[sr-1][sc] = color;
            performFill(img, sr-1, sc, color, cellValue);
        }
        if((sr+1) < img.length && img[sr+1][sc] == cellValue){
            img[sr+1][sc] = color;
            performFill(img, sr+1, sc, color, cellValue);
        }
        if((sc-1) >= 0 && img[sr][sc-1] == cellValue){
            img[sr][sc-1] = color;
            performFill(img, sr, sc-1, color, cellValue);
        }
        if((sc+1) < img[sr].length && img[sr][sc+1] == cellValue){
            img[sr][sc+1] = color;
            performFill(img, sr, sc+1, color, cellValue);
        }
        
        return img;
    }
}
