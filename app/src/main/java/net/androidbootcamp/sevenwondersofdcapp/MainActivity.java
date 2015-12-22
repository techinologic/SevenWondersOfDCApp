package net.androidbootcamp.sevenwondersofdcapp;

/*
 Created by: Paolo Inocencion
 December 22, 2015
 Sources:
 All photos from google images, splashscreen was created using MSPaint.
 Some lines of code are from "PersonalPhotoApp" assingment5.

 */

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer[] Wonders = {R.drawable.jazzarchives,
            R.drawable.lincolnmemorial, R.drawable.nationalzoo,
            R.drawable.uscapitol, R.drawable.washingtonmonument,
            R.drawable.whitehouse,R.drawable.ww2memorial};

    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.wondersGridView);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);

        grid.setAdapter(new ImageAdapter(this));

        //displays corresponding name of image based on image position.
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(getBaseContext(), "UDC Jazz Archives " +
                                "\n4200 Connecticut Ave NW, Washington, DC 20008. ",
                                Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 1:
                        Toast.makeText(getBaseContext(), "Lincoln Memorial " +
                                "\n2 Lincoln Memorial Cir NW, Washington, DC 20037",
                                Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 2:
                        Toast.makeText(getBaseContext(), "National Zoo " +
                                "\n3001 Connecticut Ave NW, Washington, DC 20008",
                                Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 3:
                        Toast.makeText(getBaseContext(), "US Capitol " +
                                "\nEast Capitol St NE & First St SE, Washington, DC 20004",
                                Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 4:
                        Toast.makeText(getBaseContext(), "Washington Monument " +
                                "\n2 15th St NW, Washington, DC 20007\n",
                                Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 5:
                        Toast.makeText(getBaseContext(), "The White House " +
                                "\n1600 Pennsylvania Ave NW, Washington, DC 20500",
                                Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 6:
                        Toast.makeText(getBaseContext(), "World War 2 Memorial " +
                                "\n1750 Independence Ave SW, Washington, DC 20006",
                                Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                }
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return Wonders.length;
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
            pic = new ImageView(context);
            pic.setImageResource(Wonders[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,300));
            return pic;
        }
    }
}
