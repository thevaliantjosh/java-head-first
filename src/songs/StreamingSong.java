package songs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import static java.lang.String.valueOf;

public class StreamingSong {

    //Instance Variables
    private String title;
    private String artist;
    private double duration;

    //Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


    //Constructors

    StreamingSong(){

    }

    StreamingSong(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    StreamingSong(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }


    //Methods

    /*Formatting Numeric Print Output
    * System.out.printf is the Same as saying:
    * -public PrintStream format(String format, Object...args)
    * or otherwise using System.out.format
    * =Using format specifiers (special characters that format the arguments of Object
    * ....args)
    * -Format specifiers begin with a percent sign(%) and end with a converter.
    * -The converter is a character indicating the type of argument to be formatted
    *-In between the percent sign(%) and the converter you can have optional flags and
    * specifiers. There are many converters, flags, and specifiers, which are documented
    * in java.util.Formatter https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
    * syntax:
    * %[argument_index$][flags][width][.precision]
    * in this case: %.2f is the format for inputting the duration as  a floating number
    * and %n is a line separator
    *
    *-- I then use the BigDecimal class which provides operations for arithmetic,
    * scale manipulation, rounding, comparison, hashing, and format conversion
    *
    * UPDATE: Could not figure out BigDecimal, so I'm going to try and use
    * DecimalFormatSymbols
    * */
    public static void play(double duration){
        //I want to change the float value and input the minutes and seconds like such 04:19
        //split('\\') is escaping the dot but splitting on a literal dot
        String[] durationString = String.valueOf(duration).split("\\.");
        //creating a new integer array with two elements/indexes
        int[] durationArray = new int[2];
        //assigning the value of the first index to the first split integer. and parsing that into a string
       durationArray[0] = Integer.parseInt(durationString[0]);
       //assigning the value of the second index to the second split integer. and parsing that integer into a string
        durationArray[1] = Integer.parseInt(durationString[1]);
        System.out.printf("Playing Song for %s:%s%n", durationArray[0], durationArray[1]);
    }

    public static void printDetails(String title, String artist){
        System.out.printf("This is %s by %s", title, artist);
    }


}
