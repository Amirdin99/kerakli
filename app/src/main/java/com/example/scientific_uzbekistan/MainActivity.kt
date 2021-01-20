package com.example.scientific_uzbekistan

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.scientificuzbekistan.adapters.AdapterScientific
import com.example.scientificuzbekistan.models.Birinchi
import com.example.scientificuzbekistan.models.ItemData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_view1.*
import android.view.Menu as AndroidViewMenu

class MainActivity : AppCompatActivity(), AdapterScientific.OnItemClickListener {
    private val data = ArrayList<ItemData>()
    private var adapter = AdapterScientific(data, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
        recycler.adapter = adapter
        recycler.layoutManager = GridLayoutManager(this, 2)

        issue.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        download.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        magazine.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        mind.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        health.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        space.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        news.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }


    override fun onCreateOptionsMenu(menu: AndroidViewMenu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.item) {
            val dialog = AlertDialog.Builder(this).create()
            dialog.setTitle("additional")
            dialog.setButton(
                AlertDialog.BUTTON_NEUTRAL, "yes", { dialog, which ->
                    val intent = Intent(this, MainActivity4::class.java)
                    startActivity(intent)
                }
            )
        }
        return super.onOptionsItemSelected(item)
    }
    private fun loadData() {

        data.add(Birinchi(R.drawable.books, "January 2021", "5$"))
        data.add(Birinchi(R.drawable.download1, "February 2021", "6$"))
        data.add(Birinchi(R.drawable.download2, "March 2021", "7$"))
        data.add(Birinchi(R.drawable.download3, "April 2021", "10$"))
        data.add(Birinchi(R.drawable.download4, "May 2021", "5$"))
        data.add(Birinchi(R.drawable.download5, "Juny 2021", "6$"))
        data.add(Birinchi(R.drawable.download6, "July 2021", "8$"))
        data.add(Birinchi(R.drawable.download7, "August 2021", "6$"))
        data.add(Birinchi(R.drawable.download8, "September 2021", "5$"))
        data.add(Birinchi(R.drawable.download9, "October 2021", "7$"))
        data.add(Birinchi(R.drawable.download10, "November 2021", "8$"))
        data.add(Birinchi(R.drawable.download11, "December 2021", "510$"))
    }


    override fun onItemClick(position: Int) {
        val intent = Intent(this, Data_Activity::class.java)

        when (position) {
            0 -> intent.apply {
                putExtra("rasmi", R.drawable.books)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            1 -> intent.apply {
                putExtra("rasmi", R.drawable.download1)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            2 -> intent.apply {
                putExtra("rasmi", R.drawable.download2)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            3 -> intent.apply {
                putExtra("rasmi", R.drawable.download3)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            4 -> intent.apply {
                putExtra("rasmi", R.drawable.download4)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            5 -> intent.apply {
                putExtra("rasmi", R.drawable.download5)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            6 -> intent.apply {
                putExtra("rasmi", R.drawable.download6)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            7 -> intent.apply {
                putExtra("rasmi", R.drawable.download7)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            8 -> intent.apply {
                putExtra("rasmi", R.drawable.download8)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            9 -> intent.apply {
                putExtra("rasmi", R.drawable.download9)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            10 -> intent.apply {
                putExtra("rasmi", R.drawable.download10)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }
            11 -> intent.apply {
                putExtra("rasmi", R.drawable.download11)
                putExtra("narxi", text2.text)
                startActivity(intent)

            }

        }
        startActivity(intent)


    }
}