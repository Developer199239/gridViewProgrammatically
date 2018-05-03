package com.example.zeeshankhan.gridview;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomGridViewActivity extends BaseAdapter{

    private Context mContext;
    private final String[] gridViewString;
    private final int[] gridViewImageId;
    private final int rowHeight;


    public CustomGridViewActivity(Context context, String[] gridViewString,int[] gridViewImageId, int rowHeight) {
        mContext = context;
        this.gridViewImageId = gridViewImageId;
        this.gridViewString = gridViewString;
        this.rowHeight = rowHeight;
    }


    @Override
    public int getCount() {
        return gridViewString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        int cellWidth = 40;
        int cellHeight = 50;
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.gridview_layout, null);
            TextView textViewAndroid = (TextView) gridViewAndroid.findViewById(R.id.android_gridview_text);
            ImageView imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.android_gridview_image);
            textViewAndroid.setText(gridViewString[position]);
            imageViewAndroid.setImageResource(gridViewImageId[position]);

           LinearLayout parentLayout = (LinearLayout) gridViewAndroid.findViewById(R.id.parentLayout);
            parentLayout.setLayoutParams(new LinearLayout.LayoutParams(GridView.AUTO_FIT, rowHeight));

        } else {
            gridViewAndroid = (View) convertView;
        }
    return gridViewAndroid;
    }
}
