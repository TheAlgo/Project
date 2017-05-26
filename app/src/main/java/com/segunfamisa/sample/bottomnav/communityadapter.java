package com.segunfamisa.sample.bottomnav;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by DHIRAJ KUMAR JAIN on 19-05-2017.
 */

public class communityadapter extends RecyclerView.Adapter<communityadapter.ViewHolder>  {

        //Member variables
        private ArrayList<Sport> mSportsData;
        private Context mContext;

        /**
         * Constructor that passes in the sports data and the context
         * @param sportsData ArrayList containing the sports data
         *
         */
                communityadapter(Context context,ArrayList<Sport> sportsData) {
            this.mSportsData = sportsData;
            this.mContext = context;
        }


        /**
         * Required method for creating the viewholder objects.
         * @param parent The ViewGroup into which the new View will be added after it is bound to an adapter position.
         * @param viewType The view type of the new View.
         * @return The newly create ViewHolder.
         */
        @Override
        public communityadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false));
        }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Sport currentSport = mSportsData.get(position);
        //Populate the textviews with data
        holder.bindTo(currentSport);
        Glide.with(mContext).load(currentSport.getImageResource()).into(holder.mSportsImage);


    }


        @Override
        public int getItemCount() {
            return mSportsData.size();
        }


        /**
         * ViewHolder class that represents each row of data in the RecyclerView
         */
        class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            //Member Variables for the TextViews
            private TextView mTitleText;
            private TextView mInfoText;
            private ImageView mSportsImage;

            /**
             * Constructor for the ViewHolder, used in onCreateViewHolder().
             * @param itemView The rootview of the list_item.xml layout file
             */
            ViewHolder(View itemView) {
                super(itemView);

                //Initialize the views
                mTitleText = (TextView)itemView.findViewById(R.id.title);
                mInfoText = (TextView)itemView.findViewById(R.id.subTitle);
                mSportsImage = (ImageView) itemView.findViewById(R.id.sportsImage);
                itemView.setOnClickListener(this);
            }

            void bindTo(Sport currentSport){
                //Populate the textviews with data
                mTitleText.setText(currentSport.getTitle());
                mInfoText.setText(currentSport.getInfo());

            }


            @Override
            public void onClick(View v) {

            }
        }
    }



