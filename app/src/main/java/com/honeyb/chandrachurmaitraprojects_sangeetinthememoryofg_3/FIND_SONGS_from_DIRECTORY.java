package com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class FIND_SONGS_from_DIRECTORY
{
    public static ArrayList<File> FIND_MP3_FILES(Context context)
    {
        ArrayList<File> allMp3Songs= new ArrayList<>();

        File[] allFILES = Environment.getExternalStorageDirectory().listFiles();


       try {
           assert allFILES != null;
           for (File singleFiles : allFILES)
           {
               if (singleFiles.isDirectory()
                       && !singleFiles.isHidden())
               {
                   File[] filteredMp3Files = singleFiles.listFiles(new FileFilter() {
                       @Override
                       public boolean accept(File pathname) {
                           return pathname.getName().endsWith(".mp3");
                       }
                   });

                   assert filteredMp3Files != null;
                   allMp3Songs.addAll(Arrays.asList(filteredMp3Files));

               }else {
                   if (singleFiles.getName().endsWith(".mp3"))
                   {
                       allMp3Songs.add(singleFiles);
                   }
               }
           }
       }catch (Exception exception)
       {
           Toast.makeText(context, "Exception: " + exception, Toast.LENGTH_LONG).show();
       }

        return allMp3Songs;
    }


    //Todo: Display song method
    public static String[] DISPLAY_MP3_FILES_as_String(ArrayList<File> files)
    {
        String[] allSongsName= new String[files.size()];

        for (int i=0; i< files.size(); i++)
        {
            allSongsName[i] = files.get(i).getName();
        }

        return allSongsName;
    }
}
