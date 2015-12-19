package com.example.howell.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Howell on 2015/12/18 0018.
 */
public class RightFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup contauner, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.left_fragment, contauner, false);
        return view;
    }
}
