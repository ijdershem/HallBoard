package com.example.hallboard;


import android.content.ClipData;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomeScreen extends AppCompatActivity {

//    private static final String LOGCAT = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

//        findViewById(R.id.card1).setOnTouchListener(new MyTouchListener());
//        findViewById(R.id.card1).setOnDragListener(new MyDragListener());
    }

//    private final class MyTouchListener implements View.OnTouchListener {
//        public boolean onTouch(View view, MotionEvent motionEvent) {
//            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
//                ClipData data = ClipData.newPlainText("","");
//                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
//                view.startDrag(data, shadowBuilder, view, 0);
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }
//    // TODO: Correctly implement drag and drop for a card; release comments and work
//    class MyDragListener implements View.OnDragListener {
//        @Override
//        public boolean onDrag(View v, DragEvent event) {
//            switch (event.getAction()) {
//                case DragEvent.ACTION_DRAG_STARTED:
//                    break;
//                case DragEvent.ACTION_DRAG_ENTERED:
//                    break;
//                case DragEvent.ACTION_DRAG_EXITED:
//                    break;
//                case DragEvent.ACTION_DROP:
//                    View view = (View) event.getLocalState();
//                    ViewGroup owner = (ViewGroup) view.getParent();
//                    owner.removeView(view);
//                    LinearLayout container =(LinearLayout) v;
//                    container.addView(view);
//                    view.setVisibility(View.VISIBLE);
//                    break;
//                case DragEvent.ACTION_DRAG_ENDED:
//                    break;
//                default:
//                    break;
//            }
//            return true;
//        }
//    }

}





