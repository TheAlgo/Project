package com.segunfamisa.sample.bottomnav;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragment_compassion extends Fragment {
    private static final String ARG_TEXT = "arg_text";
    private static final String ARG_COLOR = "arg_color";

    private String mText;
    private int mColor;

    private View mContent;
    private TextView mTextView1,mtextview2,mtextview3;

    public static Fragment newInstance() {
        Fragment frag = new com.segunfamisa.sample.bottomnav.fragment_compassion();
        Bundle args = new Bundle();
        // args.putString(ARG_TEXT, text);
       // args.putInt(ARG_COLOR, color);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_compassion, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // retrieve text and color from bundle or savedInstanceState
        if (savedInstanceState == null) {
            Bundle args = getArguments();
            //mText = args.getString(ARG_TEXT);
            // mColor = args.getInt(ARG_COLOR);
        } //else {
        //mText = savedInstanceState.getString(ARG_TEXT);
        //mColor = savedInstanceState.getInt(ARG_COLOR);
        // }

        // initialize views
        mContent = view.findViewById(R.id.fragment_content);
        mTextView1 = (TextView) view.findViewById(R.id.textView1);
        mtextview2 = (TextView) view.findViewById(R.id.textView2);
        mtextview3 = (TextView) view.findViewById(R.id.textView9);



        // set text and background color
        mTextView1.setText("Sufferings");
        mtextview2.setText("Lives Saved");
        mtextview3.setText("152");
        //mContent.setBackgroundColor(mColor);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
      //  outState.putString(ARG_TEXT, mText);
       // outState.putInt(ARG_COLOR, mColor);
        super.onSaveInstanceState(outState);
    }
}