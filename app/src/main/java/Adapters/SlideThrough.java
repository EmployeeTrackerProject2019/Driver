package Adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mi_5.driver.R;

public class SlideThrough extends PagerAdapter {
    private final Context context;


    public SlideThrough(Context context) {
        this.context = context;
    }

//create an array to hold the images and the descriptions

    private final String[] SlideDescriptions = {"Enjoy higher commission when you drive for vawlet", "Second", "Third", "Fourth"};

    private final int[] SlideImages = {R.drawable.logoo,R.drawable.logoo,R.drawable.logoo,R.drawable.logoo};

    @Override
    public int getCount() {
        return SlideDescriptions.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        assert layoutInflater != null;
        View view = layoutInflater.inflate(R.layout.layout_slidethrough, container, false);

        ImageView imageView = view.findViewById(R.id.slideImage);
        TextView TV1 = view.findViewById(R.id.txtWelcomeDes);

        imageView.setImageResource(SlideImages[position]);
        TV1.setText(SlideDescriptions[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);

    }
}
