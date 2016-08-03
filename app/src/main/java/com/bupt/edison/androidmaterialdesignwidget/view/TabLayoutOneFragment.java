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
public class TabLayoutOneFragment extends Fragment {
    private static final String TAB_POSITION = "tab_position";

    public static TabLayoutOneFragment getInstance(int tabPosition){
        TabLayoutOneFragment fragment = new TabLayoutOneFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(TAB_POSITION,tabPosition);
        fragment.setArguments(bundle);
        return fragment;
    }


    public TabLayoutOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_layout_one, container, false);
    }

}
