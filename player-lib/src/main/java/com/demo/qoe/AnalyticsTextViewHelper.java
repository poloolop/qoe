package com.demo.qoe;

import android.os.Looper;
import android.widget.TextView;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.Assertions;

// TODO: Complete implementation
public class AnalyticsTextViewHelper  implements AnalyticsListener, Runnable {

    private final SimpleExoPlayer player;
    private final TextView textView;

    public AnalyticsTextViewHelper(SimpleExoPlayer player, TextView textView) {
        Assertions.checkArgument(player.getApplicationLooper() == Looper.getMainLooper());
        this.player = player;
        this.textView = textView;
    }


    @Override
    public void run() {

    }
}
