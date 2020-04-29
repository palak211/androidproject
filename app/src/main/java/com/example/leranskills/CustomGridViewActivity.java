package com.example.leranskills;

import android.content.Context;
import android.widget.BaseAdapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.ImageView;
import android.widget.TextView;


public class CustomGridViewActivity extends BaseAdapter {

    private Context mContext;
   private final String[] gridViewString ;
    private final int[] gridViewImageId;

   public CustomGridViewActivity(Context context, String[] gridViewString, int[] gridViewImageId, String[] gridViewString1) {
       mContext = context;
       this.gridViewImageId = gridViewImageId;
       this.gridViewString = gridViewString1;
   }
    @Override
    public  int getCount() {
return gridViewString.length;
       }


    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewAndroid = new View(mContext);
            gridViewAndroid =inflater.inflate(R.layout.fragment_course,null);
            TextView textViewAndroid = (TextView) gridViewAndroid.findViewById(R.id.tv1);
            ImageView imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.gridimage);
            textViewAndroid.setText(gridViewString[i]);
            imageViewAndroid.setImageResource(gridViewImageId[i]);
        } else {
            gridViewAndroid = (View) convertView;
        }

        return gridViewAndroid;
    }
}



