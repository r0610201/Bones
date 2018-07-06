package com.example.dshemetov.bones

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.Button
import android.widget.TableRow

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mTitles: Array<String> = emptyArray()

    fun createGameTable() {

        val playersCount = 2

        val vMain = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT)
        vMain.width = 150
        vMain.height = 120
        vMain.setMargins(0, 0, 1, 1)

        val vTitle = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT)
        vTitle.width = 100
        vTitle.height = 120
        vTitle.setMargins(0, 0, 1, 1)

        for (i in 0..mTitles.size - 1) {

            val tRow: TableRow = TableRow(this)
            tRow.setBackgroundResource(R.color.BorderColor)

            for (j in 0..playersCount * 3) {

                val b = Button(this)
                if (j == 0) {
                    b.text = mTitles[i]
                    b.setBackgroundResource(R.drawable.background_title)
                    tRow.addView(b, vTitle)
                }
                else {
                    b.setBackgroundResource(R.drawable.background_available)
                    tRow.addView(b, vMain)
                }

            }

            mainTable.addView(tRow)

        }

    }

    fun createGridButton(){


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTitles = resources.getStringArray(R.array.short_titles)
        createGameTable()

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
