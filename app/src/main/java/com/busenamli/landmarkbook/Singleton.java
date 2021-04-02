package com.busenamli.landmarkbook;

import android.graphics.Bitmap;

public class Singleton {

    private Bitmap chosenImage;
    private static Singleton singleton;

    private Singleton(){

    }

    public Bitmap getChosenImage() {
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }

    public static Singleton getInstance() //Sınıfın singleton objesini döndürür
    {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }


}
