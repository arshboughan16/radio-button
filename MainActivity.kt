package com.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var rgGender : RadioGroup
    lateinit var rbHe : RadioButton
    lateinit var rbShe : RadioButton
    lateinit var rbOther :RadioButton
    lateinit var etOtherName : EditText
    lateinit var ivGender : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivGender = findViewById(R.id.ivGender)
        rbHe = findViewById(R.id.rbHe)
        rbShe = findViewById(R.id.rbShe)
        rbOther =findViewById(R.id.rbOther)
        rgGender = findViewById(R.id.rgGender)
        rgGender.setOnCheckedChangeListener {radiogroup,id->when(id){
            R.id.rbOther->{
                Toast.makeText(this,resources.getText(R.string.others),Toast.LENGTH_LONG).show()
                etOtherName.visibility=View.VISIBLE
            }
            else->{
                etOtherName.visibility=View.INVISIBLE
            }

        }
        }
    }
}