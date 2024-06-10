package com.pechchannary.luxwalk;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

public class backHomeActivity {

    public static void setupGoBackButton(Activity activity, int buttonId) {
        ImageView button = activity.findViewById(buttonId);

        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onBackPressed();
                }
            });
        }
    }
}
