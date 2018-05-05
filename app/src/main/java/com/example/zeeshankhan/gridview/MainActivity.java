package com.example.zeeshankhan.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView androidGridView;

    String[] gridViewString = {
            "Alram", "Android", "Mobile", "Website", "Profile", "WordPress",
            "Alram", "Android", "Mobile", "Website", "Profile", "WordPress",
            "Alram", "Android", "Mobile", "Website", "Profile", "WordPress",

    } ;
    int[] gridViewImageId = {
            R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale,
            R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale,
            R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale, R.drawable.ui_elements_menu_icon_new_sim_sale,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
//        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.post(new Runnable(){
            public void run(){
                int height = androidGridView.getHeight()/3;
                final CustomGridAdapter adapterViewAndroid = new CustomGridAdapter(MainActivity.this, gridViewString, gridViewImageId,height);
                androidGridView.setAdapter(adapterViewAndroid);
            }
        });

        /*androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(MainActivity.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });*/

    }
}
