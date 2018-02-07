package com.pace.cs639spring.hw1;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalDisplayFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.animal_display, container, false);

        final ImageView birdImg = view.findViewById(R.id.bird_img);
        final ImageView catImg = view.findViewById(R.id.cat_img);
        final ImageView dogImg = view.findViewById(R.id.dog_img);
        final TextView birdText = view.findViewById(R.id.bird_text);
        final TextView catText = view.findViewById(R.id.cat_text);
        final TextView dogText = view.findViewById(R.id.dog_text);
        ImageView blackSquare = view.findViewById(R.id.blackSquare);
        ImageView blueSquare = view.findViewById(R.id.blueSquare);
        ImageView greenSquare = view.findViewById(R.id.greenSquare);
        ImageView cyanSquare = view.findViewById(R.id.cyanSquare);
        ImageView redSquare = view.findViewById(R.id.redSquare);


/*
TEXT VISIBILITY & ANIMAL IMAGE CLICK LISTENERS
*/

        //create onclick for bird imageView and set visibility of text
        birdImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birdText.setVisibility(birdText.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                catText.setVisibility(View.INVISIBLE);
                dogText.setVisibility(View.INVISIBLE);
                //Toast.makeText(getActivity(),"This is my toast message",Toast.LENGTH_SHORT).show();
            }
        });

        //create onclick for cat imageView and set visibility of text
        catImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birdText.setVisibility(View.INVISIBLE);
                catText.setVisibility(catText.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                dogText.setVisibility(View.INVISIBLE);
                //Toast.makeText(getActivity(),"This is my toast message",Toast.LENGTH_SHORT).show();
            }
        });

        //create onclick for dog imageView and set visibility of text
        dogImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogText.setVisibility(dogText.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                birdText.setVisibility(View.INVISIBLE);
                catText.setVisibility(View.INVISIBLE);
                //Toast.makeText(getActivity(),"This is my toast message",Toast.LENGTH_SHORT).show();

            }
        });

/*
COLOR CLICK LISTENERS BELOW
 */

        //black color square click listener
        blackSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //determines if active based on if text view is visible
                if (birdText.getVisibility() == View.VISIBLE) {
                    birdImg.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                } else if (catText.getVisibility() == View.VISIBLE) {
                    catImg.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                } else if (dogText.getVisibility() == View.VISIBLE) {
                    dogImg.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
                } else{
                    Toast.makeText(getActivity(),"Please select an image", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //blue color square click listener
        blueSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //determines if active based on if text view is visible
                if (birdText.getVisibility() == View.VISIBLE) {
                    birdImg.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                } else if (catText.getVisibility() == View.VISIBLE) {
                    catImg.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                } else if (dogText.getVisibility() == View.VISIBLE) {
                    dogImg.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                } else{
                    Toast.makeText(getActivity(),"Please select an image", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //green color square click listener
        greenSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //determines if active based on if text view is visible
                if (birdText.getVisibility() == View.VISIBLE) {
                    birdImg.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
                } else if (catText.getVisibility() == View.VISIBLE) {
                    catImg.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
                } else if (dogText.getVisibility() == View.VISIBLE) {
                    dogImg.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
                } else{
                    Toast.makeText(getActivity(),"Please select an image", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //cyan color square click listener
        cyanSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //determines if active based on if text view is visible
                if (birdText.getVisibility() == View.VISIBLE) {
                    birdImg.setColorFilter(Color.CYAN, PorterDuff.Mode.SRC_IN);
                } else if (catText.getVisibility() == View.VISIBLE) {
                    catImg.setColorFilter(Color.CYAN, PorterDuff.Mode.SRC_IN);
                } else if (dogText.getVisibility() == View.VISIBLE) {
                    dogImg.setColorFilter(Color.CYAN, PorterDuff.Mode.SRC_IN);
                } else{
                    Toast.makeText(getActivity(),"Please select an image", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //red color square click listener
        redSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //determines if active based on if text view is visible
                if (birdText.getVisibility() == View.VISIBLE) {
                    birdImg.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                } else if (catText.getVisibility() == View.VISIBLE) {
                    catImg.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                } else if (dogText.getVisibility() == View.VISIBLE) {
                    dogImg.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                } else{
                    Toast.makeText(getActivity(),"Please select an image", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

}
