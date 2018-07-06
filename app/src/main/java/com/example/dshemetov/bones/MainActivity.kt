package com.example.dshemetov.bones

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.NotificationCompatSideChannelService
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..30) {

            var tRow: TableRow = TableRow(this)

            for (j in 1..20)  {

                var b: Button = Button(this)
                b.text = i.toString() + j.toString()
                b.width = 30

                //var tLayout: ViewGroup.LayoutParams = ViewGroup.LayoutParams(this)
                //tLayout.
                //b.setMargins(0, 0, paramInt3, paramInt4);

                if (j == 1)
                    b.setBackgroundResource(R.drawable.background_title)
                else
                    b.setBackgroundResource(R.drawable.background_available)

                tRow.addView(b)

            }

            mainTable.addView(tRow)

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
