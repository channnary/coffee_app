package com.pechchannary.luxwalk;

import android.content.Context;
import android.content.Intent;

public class NavbarActivity {

    private Context context;

    public NavbarActivity(Context context) {
        this.context = context;
    }

    public boolean handleNavigation(int itemId) {
        if (itemId == R.id.home1) {
            navigateToHome();
            return true;
        } else if (itemId == R.id.favorite) {
            navigateToFavorite();
            return true;
        } else if (itemId == R.id.notification) {
            navigateToNotification();
            return true;
        } else if (itemId == R.id.setting) {
            navigateToSetting();
            return true;
        } else {
            return false;
        }
    }

    private void navigateToHome() {
        Intent notificationIntent = new Intent(context, HomeActivity.class);
        context.startActivity(notificationIntent);
    }

    private void navigateToFavorite() {
        Intent notificationIntent = new Intent(context, FavouriteActivity.class);
        context.startActivity(notificationIntent);
    }

    private void navigateToNotification() {
        Intent notificationIntent = new Intent(context, NotificationActivity.class);
        context.startActivity(notificationIntent);
    }

    private void navigateToSetting() {
        Intent notificationIntent = new Intent(context, ProfileActivity.class);
        context.startActivity(notificationIntent);
    }
}