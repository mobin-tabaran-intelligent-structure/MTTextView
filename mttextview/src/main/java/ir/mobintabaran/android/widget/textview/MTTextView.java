package ir.mobintabaran.android.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;


public class MTTextView extends AppCompatTextView {

    private static final String TAG = MTTextView.class.getSimpleName();

    public MTTextView(Context context) {
        super(context);
    }

    public MTTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public MTTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomFont(context, attrs);
    }

    protected void setCustomFont(Context ctx, AttributeSet attrs) {
        TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.MTTextView);
        String customFont = a.getString(R.styleable.MTTextView_textFont);
        setCustomFont(ctx, customFont);
        a.recycle();
    }

    public boolean setCustomFont(Context ctx, String asset) {
        if (asset != null && !asset.isEmpty()) {
            Typeface tf = Typeface.createFromAsset(ctx.getAssets(), asset);
            setTypeface(tf);
        } else {
            Log.w(TAG, "setCustomFont: font not set");
        }

        return true;
    }


}
