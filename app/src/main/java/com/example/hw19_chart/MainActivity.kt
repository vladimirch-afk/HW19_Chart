package com.example.hw19_chart

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import com.jjoe64.graphview.series.PointsGraphSeries


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val graph = findViewById<View>(R.id.graph) as GraphView
        val series = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, -2.0),
                DataPoint(1.0, 5.0),
                DataPoint(2.0, 3.0),
                DataPoint(3.0, 2.0),
                DataPoint(4.0, 6.0)
            )
        )
        graph.addSeries(series)

        val graph1 = findViewById<View>(R.id.graph1) as GraphView
        val series1 = PointsGraphSeries(
            arrayOf(
                DataPoint(0.0, -2.0),
                DataPoint(1.0, 5.0),
                DataPoint(2.0, 3.0),
                DataPoint(3.0, 2.0),
                DataPoint(4.0, 6.0)
            )
        )
        graph.addSeries(series1)
        series1.shape = PointsGraphSeries.Shape.POINT

        val series2 = PointsGraphSeries(
            arrayOf(
                DataPoint(1.0, 4.0),
                DataPoint(2.0, 2.0),
                DataPoint(3.0, 1.0),
                DataPoint(4.0, 5.0)
            )
        )
        graph1.addSeries(series2)
        series2.shape = PointsGraphSeries.Shape.RECTANGLE
        series2.color = Color.RED

        val series3 = PointsGraphSeries(
            arrayOf(
                DataPoint(0.0, 0.0),
                DataPoint(1.0, 3.0),
                DataPoint(2.0, 1.0),
                DataPoint(3.0, 0.0),
                DataPoint(4.0, 4.0)
            )
        )
        graph1.addSeries(series3)
        series3.shape = PointsGraphSeries.Shape.TRIANGLE
        series3.color = Color.YELLOW

        val series4 = PointsGraphSeries(
            arrayOf(
                DataPoint(0.0, 1.0),
                DataPoint(1.0, 2.0),
                DataPoint(2.0, 0.0),
                DataPoint(3.0, -1.0),
                DataPoint(4.0, 3.0)
            )
        )
        graph1.addSeries(series4)
        series4.color = Color.GREEN
        series4.setCustomShape { canvas, paint, x, y, dataPoint ->
            paint.strokeWidth = 10f
            canvas.drawLine(x - 20, y - 20, x + 20, y + 20, paint)
            canvas.drawLine(x + 20, y - 20, x - 20, y + 20, paint)
        }
    }
}