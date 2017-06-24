package tk.zielony.carbonsamples.feature;

import android.os.Bundle;

import carbon.widget.TextView;
import tk.zielony.carbonsamples.R;
import tk.zielony.carbonsamples.Samples;
import tk.zielony.carbonsamples.SamplesActivity;

public class TextAppearanceActivity extends SamplesActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_appearance);

        Samples.initToolbar(this, getString(R.string.textappearanceActivity_title));

        TextView headline = findViewById(R.id.headline);
        headline.setText("Headline, &lt;b>Headline&lt;/b>, Headline, Headline, Headline, Headline, Headline, Headline, Headline, Headline, Headline, Headline, " +
                "Headline, ", android.widget.TextView.BufferType.SPANNABLE);
    }
}
