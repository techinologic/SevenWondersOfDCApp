package net.androidbootcamp.sevenwondersofdcapp;

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
                        Toast.makeText(getBaseContext(), "UDC Jazz Archives ", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 1:
                        Toast.makeText(getBaseContext(), "Lincoln Memorial", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 2:
                        Toast.makeText(getBaseContext(), "National Zoo", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 3:
                        Toast.makeText(getBaseContext(), "US Capitol", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 4:
                        Toast.makeText(getBaseContext(), "Washington Monument", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 5:
                        Toast.makeText(getBaseContext(), "The White House", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Wonders[position]);
                        break;
                    case 6:
                        Toast.makeText(getBaseContext(), "World War 2 Memorial", Toast.LENGTH_SHORT).show();
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
