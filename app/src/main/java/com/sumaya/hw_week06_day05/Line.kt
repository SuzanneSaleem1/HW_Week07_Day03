package com.sumaya.hw_week06_day05

import android.graphics.PointF

class Line (val start: PointF){

        var end: PointF = start
        val left: Float
            get() = Math.min(start.x, end.x)

        val right: Float
            get() = Math.max(start.x, end.x)

        val top: Float
            get() = Math.min(start.y, end.y)

        val bottom: Float
            get() = Math.max(start.y, end.y)
    }
