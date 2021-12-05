package com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3.databinding.FragmentDeviceSongsBinding;


public class DeviceSongsFragment extends Fragment {

    FragmentDeviceSongsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDeviceSongsBinding.inflate(getLayoutInflater(),container, false);
        /**
         * All programs will be inside these two lines*/

        String[] allMP3SONGS = FIND_SONGS_from_DIRECTORY.DISPLAY_MP3_FILES_as_String
                (FIND_SONGS_from_DIRECTORY.FIND_MP3_FILES(getContext()));


        binding.myRCLView.setLayoutManager(new LinearLayoutManager(getContext()));
        SongAdapter adapter = new SongAdapter(allMP3SONGS);
        binding.myRCLView.setAdapter(adapter);

        return binding.getRoot();
    }
}