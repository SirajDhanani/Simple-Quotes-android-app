package com.viewpager.quotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.ToxicBakery.viewpager.transforms.DepthPageTransformer;
import com.ToxicBakery.viewpager.transforms.RotateDownTransformer;
import com.ToxicBakery.viewpager.transforms.ZoomOutSlideTransformer;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ViewPagerModel> modelList;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        modelList = new ArrayList<>();
        viewPager = findViewById(R.id.viewpager);
        String[] quotes = {
                "If you want to achieve greatness stop asking for permission",
                "Things work out best for those who make the best of how things work out.",
                "To live a creative life, we must lose our fear of being wrong.",
                "If you are not willing to risk the usual you will have to settle for the ordinary.",
                "Trust because you are willing to accept the risk, not because it's safe or certain.",
                "All our dreams can come true if we have the courage to pursue them.",
                "Good things come to people who wait, but better things come to those who go out and get them.",
                "If you do what you always did, you will get what you always got.",
                "Success is walking from failure to failure with no loss of enthusiasm.",
                "Just when the caterpillar thought the world was ending, he turned into a butterfly.",
                "Successful entrepreneurs are givers and not takers of positive energy.",
                "Whenever you see a successful person you only see the public glories, never the private sacrifices to reach them.",
                "Opportunities don't happen, you create them.",
                "Try not to become a person of success, but rather try to become a person of value.",





        };

        String[] quoteauther = {"- Anonymous", "- John Wooden", "- Anonymous", "- Jim Rohn", "- Anonymous",
                                 "- Walt Disney", "- Anonymous", "- Anonymous", "- Winston Churchill",
                                "- Proverb","- Anonymous", "- Vaibhav Shah", "- Chris Grosser", "- Albert Einstein",

        };

        String[] quotetypes = {"MOTIVATIONAL","MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL", "MOTIVATIONAL"};









        for (int i = 0; i < quotes.length ; i++) {

            ViewPagerModel viewPagerModel = new ViewPagerModel();
            viewPagerModel.setQuotes(quotes[i]);
            viewPagerModel.setQuotetypes(quotetypes[i]);
            viewPagerModel.setQuoteauthor(quoteauther[i]);

            modelList.add(viewPagerModel);
        }

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(modelList , this);
        viewPager.setPageTransformer(true,new RotateDownTransformer());


        viewPager.setAdapter(viewPagerAdapter);

    }


}
