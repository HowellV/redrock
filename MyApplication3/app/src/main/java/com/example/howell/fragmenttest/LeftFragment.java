package com.example.howell.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LeftFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup contauner, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment,contauner,false);
        return view;
    }


}
