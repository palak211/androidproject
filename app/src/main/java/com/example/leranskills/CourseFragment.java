package com.example.leranskills;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

public class CourseFragment extends Fragment {
    @NonNull

    public View OnCreateView(LayoutInflater inflater, @NonNull ViewGroup container, Bundle savedInstance){
        return inflater.inflate(R.layout.fragment_course,container,false);

    }

}
