package com.thepcink.factsbook;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment{
int mCurrentPage;
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    /** Getting the arguments to the Bundle object */
    Bundle data = getArguments();

    /** Getting integer data of the key current_page from the bundle */
    mCurrentPage = data.getInt("current_page", 0);

}

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.myfragment_layout, container,false);
    TextView tv = (TextView ) v.findViewById(R.id.tv);
    Typeface font=Typeface.createFromAsset(getActivity().getAssets(), "butterfly.ttf");
    tv.setTypeface(font);
    tv.setText(R.string.a0+mCurrentPage);
    return v;

}

}