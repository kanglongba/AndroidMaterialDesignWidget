package com.bupt.edison.androidmaterialdesignwidget.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bupt.edison.androidmaterialdesignwidget.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabLayoutTwoFragment extends Fragment {


    public TabLayoutTwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_layout_two, container, false);
    }

}
