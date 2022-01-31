package my.edu;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        File file = new File("Level_Up.wav");
        if(file.exists())
        {
            System.out.println("File exists: " + file.getAbsolutePath());
        }

        try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//                AU
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }catch (UnsupportedAudioFileException exception)
        {
            exception.printStackTrace();
        }
        catch (IOException exception){
            exception.printStackTrace();

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


    }

}
