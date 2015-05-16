package com.fl.kunj.fibclock;

/**
 * Created by kunj on 16-05-2015.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.*;

public class DrawView extends View {
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {

        Display mdisp = getWindowManager().getDefaultDisplay();
        Point mdispSize = new Point();
        mdisp.getSize(mdispSize);
        int maxX = mdispSize.x;
        int maxY = mdispSize.y;

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(0);
        canvas.drawRect(30, 30, 80, 80, paint);
        paint.setStrokeWidth(0);

        // FIB 1st block
        paint.setColor(Color.CYAN);
        canvas.drawRect(0, (3*maxY)/8, maxX, maxY, paint );
        // FIB 2nd Block
        paint.setColor(Color.YELLOW);
        canvas.drawRect(0, 0, maxX/2, (3*maxY)/8, paint );
        // FIB 3rd block
        paint.setColor(Color.CYAN);
        canvas.drawRect(maxX/2, 0, maxX, maxY/4, paint );
        //FIB 4th block
        paint.setColor(Color.YELLOW);
        canvas.drawRect((3*maxX)/4, maxY/4, maxX, (3*maxY)/8, paint );
        //FIB 5th block
        paint.setColor(Color.YELLOW);
        canvas.drawRect(maxX/2, maxY/4, (3*maxX)/4, (3*maxY)/8, paint );
    }

}
