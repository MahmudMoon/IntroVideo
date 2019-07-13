package com.example.moon.introvideo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toolbar;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        // Note here that we DO NOT use setContentView();

        // Add your slide fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
//        addSlide(new fragOne());
//        addSlide(new twoFragment());
//        addSlide(new threeFragment());

        // Instead of fragments, you can also use our default slide.
        // Just create a `SliderPage` and provide title, description, background and image.
        // AppIntro will do the rest.
        SliderPage sliderPage = new SliderPage();
        sliderPage.setTitle("SamSung");
        sliderPage.setDescription("Best Phone ever");
        sliderPage.setImageDrawable(R.drawable.android_wht);
        sliderPage.setBgColor(Color.parseColor("#e55e2f"));
        addSlide(AppIntroFragment.newInstance(sliderPage));
        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#e55e2f"));
        setSeparatorColor(Color.parseColor("#e55e2f"));


        SliderPage sliderPage1 = new SliderPage();
        sliderPage1.setTitle("Huwai");
        sliderPage1.setDescription("Worst Phone ever");
        sliderPage1.setImageDrawable(R.drawable.an1);
        sliderPage1.setBgColor(Color.parseColor("#f30845"));
        addSlide(AppIntroFragment.newInstance(sliderPage1));

        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle("Xaomi");
        sliderPage2.setDescription("More than Worst");
        sliderPage2.setImageDrawable(R.drawable.an2);
        sliderPage2.setBgColor(Color.parseColor("#4614ff"));
        addSlide(AppIntroFragment.newInstance(sliderPage2));

        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle("SamSung");
        sliderPage3.setDescription("Best Phone ever");
        sliderPage3.setImageDrawable(R.drawable.android_wht);
        sliderPage3.setBgColor(Color.parseColor("#9332ff"));
        addSlide(AppIntroFragment.newInstance(sliderPage3));


        SliderPage sliderPage4 = new SliderPage();
        sliderPage4.setTitle("Huwai");
        sliderPage4.setDescription("Worst Phone ever");
        sliderPage4.setImageDrawable(R.drawable.an1);
        sliderPage4.setBgColor(Color.parseColor("#f30845"));
        addSlide(AppIntroFragment.newInstance(sliderPage4));

        SliderPage sliderPage5 = new SliderPage();
        sliderPage5.setTitle("Xaomi");
        sliderPage5.setDescription("More than Worst");
        sliderPage5.setImageDrawable(R.drawable.an2);
        sliderPage5.setBgColor(Color.parseColor("#d31cad"));
        addSlide(AppIntroFragment.newInstance(sliderPage5));


        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        if(newFragment!=null) {
            int solidColor = newFragment.getView().getSolidColor();
            setBarColor(solidColor);
            setSeparatorColor(solidColor);
        }


    }


}
