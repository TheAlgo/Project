package com.segunfamisa.sample.bottomnav;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class fragment_community extends Fragment {
    //  private DatabaseReference mChildreference=mRootreference.child("message");
    private RecyclerView mRecyclerView;
    private ArrayList<Sport> mSportsData;
    private communityadapter mAdapter;
    private View mContent;
    private static final String ARG_TEXT = "arg_text";
    private static final String ARG_COLOR = "arg_color";
    private String mText;
    private int mColor;






    public static Fragment newInstance() {
        Fragment frag = new com.segunfamisa.sample.bottomnav.fragment_community();
        Bundle args = new Bundle();
        // args.putString(ARG_TEXT, text);
        //args.putInt(ARG_COLOR, color);
       frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //apollo=(TextView)findViewById(R.id.apollo);
        // Inflate the layout for this fragment
        //cmc.setText("Avaial");


       // FrameLayout fl = (FrameLayout)inflater.inflate(R.layout.fragment_fragment_community, container, false);
        final View view1 = inflater.inflate(R.layout.fragment_fragment_community, container, false);
        mRecyclerView = (RecyclerView)view1.findViewById(R.id.recyclerView);

        //Set the Layout Manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //Initialize the ArrayLIst that will contain the data
        mSportsData = new ArrayList<>();

        //Initialize the adapter and set it ot the RecyclerView
        mAdapter = new communityadapter(getActivity(),mSportsData);
        mRecyclerView.setAdapter(mAdapter);

        //Get the data
        initializeData();


        return view1;
    }
    private void initializeData() {
        //Get the resources from the XML file
        String[] sportsList = getResources().getStringArray(R.array.items);
        String[] sportsInfo = getResources().getStringArray(R.array.item_info);
        //String[] details=getResources().getStringArray(R.array.Details);
        TypedArray sportsImageResources =
                getResources().obtainTypedArray(R.array.item_images);

        //Clear the existing data (to avoid duplication)
        mSportsData.clear();

        //Create the ArrayList of Sports objects with the titles and information about each sport
        for(int i=0;i<sportsList.length;i++){
            mSportsData.add(new Sport(sportsList[i],sportsInfo[i],sportsImageResources.getResourceId(i,0)));
        }
        sportsImageResources.recycle();

        //Notify the adapter of the change
        mAdapter.notifyDataSetChanged();
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // retrieve text and color from bundle or savedInstanceState
        if (savedInstanceState == null) {
            Bundle args = getArguments();
           // mText = args.getString(ARG_TEXT);
            // mColor = args.getInt(ARG_COLOR);
        } //else {
       // mText = savedInstanceState.getString(ARG_TEXT);
       // mColor = savedInstanceState.getInt(ARG_COLOR);
         //}

        // initialize views
     //   mContent = view1.findViewById(R.id.fragment_content);


        // set text and background color
        // mTextView.setText(mText);
       // mContent.setBackgroundColor(mColor);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(ARG_TEXT, mText);
        outState.putInt(ARG_COLOR, mColor);
        super.onSaveInstanceState(outState);
    }

}


