package com.example.ntinos.hobbytes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.ntinos.hobbytes.MapsActivity.EXTRA_NAME;

public class KeyPointInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_point_info);

        String KpName = getIntent().getStringExtra(EXTRA_NAME);
        String KpSnip = getIntent().getExtras().getString("Snippet");

        //Code to receive Image from Extras
        //TODO: Διορθωση τροπου μεταφορας της εικονας
        /*String imagePath = getIntent().getExtras().getString("Image");
        File filePath = getFileStreamPath(imagePath);
        Drawable image = Drawable.createFromPath(filePath.toString());*/

        TextView KeyPointName = (TextView) findViewById(R.id.KpInformation);
        KeyPointName.setText(KpSnip);
        TextView KeyPointSnip = (TextView) findViewById(R.id.KpName);
        KeyPointSnip.setText(KpName);

        ImageView KeyPointPic = (ImageView) findViewById(R.id.imageView2);
        //KeyPointPic.setImageDrawable(image);


    }
}
