package com.hernandez.mickael.moodtracker.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hernandez.mickael.moodtracker.R;

/**
 * Created by Mickael Hernandez on 22/09/2017.
 */

/** Fragment used in MainActivity's custom PagerAdapter */
public class MoodFragment extends Fragment {

    /** Returns a new custom instance of the class */
    public static MoodFragment newInstance(int num) {
        Bundle arguments = new Bundle();
        arguments.putInt("mood", num); // mood id used to set the right layout
        MoodFragment fragment = new MoodFragment();
        fragment.setArguments(arguments);
        return fragment;
    }

    /** When creating the view, inflate the corresponding layout based on the arguments */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int layoutId = R.layout.fragment_mood_sad;
        switch(getArguments().getInt("mood")){
            case 0:
                layoutId = R.layout.fragment_mood_sad;
                break;
            case 1:
                layoutId = R.layout.fragment_mood_disappointed;
                break;
            case 2:
                layoutId = R.layout.fragment_mood_normal;
                break;
            case 3:
                layoutId = R.layout.fragment_mood_happy;
                break;
            case 4:
                layoutId = R.layout.fragment_mood_superhappy;
                break;
        }
        return (ViewGroup) inflater.inflate(
                layoutId, container, false);
    }
}
