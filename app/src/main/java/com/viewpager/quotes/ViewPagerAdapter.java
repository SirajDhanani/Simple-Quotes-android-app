package com.viewpager.quotes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    View one,two;

    private List<ViewPagerModel> modelList;
    private Context context;

    ViewPagerAdapter(List<ViewPagerModel> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;


    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        final ViewPagerModel object = modelList.get(position);


        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        assert layoutInflater != null;
        View view;
        view = layoutInflater.inflate(R.layout.viewpager_contents, container, false);

        container.addView(view);

        TextView quotes = view.findViewById(R.id.actualquote);
        quotes.setText(modelList.get(position).getQuotes());

        TextView quotetypes = view.findViewById(R.id.textquote);
        quotetypes.setText(modelList.get(position).getQuotetypes());

        TextView quoteauthor = view.findViewById(R.id.author);
        quoteauthor.setText(modelList.get(position).getQuoteauthor());

        ImageButton imageButton = view.findViewById(R.id.share_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String toShare = "''" +object.getQuotes() + "''" + "\n" +  "''" +(object.getQuoteauthor()) + "''" + " \n(sent by Quotify app)";
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, toShare);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                context.startActivity(shareIntent);

            }
        });


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
