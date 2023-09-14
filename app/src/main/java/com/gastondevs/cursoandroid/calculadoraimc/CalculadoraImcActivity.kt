package com.gastondevs.cursoandroid.calculadoraimc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.aristidevs.androidmaster.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class CalculadoraImcActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private lateinit var btnSubtractWeight: FloatingActionButton
    private lateinit var btnPlusWeight: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_imc)
        initComponent()
        initListeners()
        initUI()
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }

        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }

        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "$result cm"
        }
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun initComponent() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }

        return ContextCompat.getColor(this, colorReference)

    }

    private fun initUI() {
        setGenderColor()
    }


}