package com.example.scientific_uzbekistan

import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() ,ViewPager.OnPageChangeListener,SoundPool.OnLoadCompleteListener{

    private val SAMPLE_FILE: String="men_ham_namoz_oqiyman.pdf"

    private val pagenumber:Int=0
    private val pdfFileName=String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

       
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
    }


    override fun onPageScrollStateChanged(state: Int) {
    }

    override fun onLoadComplete(soundPool: SoundPool?, sampleId: Int, status: Int) {

    }
}