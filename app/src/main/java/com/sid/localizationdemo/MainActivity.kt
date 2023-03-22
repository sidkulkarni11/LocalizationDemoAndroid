package com.sid.localizationdemo

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.akexorcist.localizationactivity.ui.LocalizationActivity
import java.util.*


class MainActivity : LocalizationActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val langauageSpinner = findViewById<Spinner>(R.id.languageSpinner)

        var items = arrayOf(
            "",
            getString(R.string.english_language),
            getString(R.string.marathi_language),
            getString(
                R.string.hindi_language
            )
        )

        var textViewOne = findViewById<TextView>(R.id.textView1)

        textViewOne.setText(getString(R.string.hello_world))

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        langauageSpinner.adapter = adapter

        langauageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                var locale: Locale? = null
                if (selectedItem.equals(getString(R.string.marathi_language))) {
                    locale = Locale("mr")
                    var resources = baseContext.resources
//                    val configuration = resources.configuration
                    val configuration = resources.configuration
                    configuration.setToDefaults()
                    configuration.setLocale(locale)

//                    }
                  /*  val context: Context = MyContextWrapper.wrap(
                        baseContext ,
                        "mr"
                    )
                    getResources().updateConfiguration(
                        context.getResources().getConfiguration(),
                        context.getResources().getDisplayMetrics()
                    )*/
                    setLanguage("mr")
                    /*finish();
                    overridePendingTransition(0, 0);
                    startActivity(getIntent());
                    overridePendingTransition(0, 0);*/
                } else if (selectedItem.equals(getString(R.string.hindi_language))) {
                    locale = Locale("hi")
                    var resources = baseContext.resources
                    val configuration = resources.configuration
                    configuration.setToDefaults()
                    configuration.setLocale(locale)

                    setLanguage("hi")
                    /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        baseContext.createConfigurationContext(configuration)
                    } else {*/
//                    resources.updateConfiguration(configuration, resources.displayMetrics)
//                    }
                    /*finish();
                    overridePendingTransition(0, 0);
                    startActivity(getIntent());
                    overridePendingTransition(0, 0);*/
                } else if (selectedItem.equals(getString(R.string.english_language))) {
                    locale = Locale.getDefault()
                    var resources = baseContext.resources
                    val configuration = resources.configuration
                    configuration.setToDefaults()
                    configuration.setLocale(locale)

                    setLanguage("en")
                    /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                         baseContext.createConfigurationContext(configuration)
                     } else {*/
//                    resources.updateConfiguration(configuration, resources.displayMetrics)
//                    }

                    finish();
                    overridePendingTransition(0, 0);
                    startActivity(getIntent());
                    overridePendingTransition(0, 0);
                }
            }

        }
        /*  langauageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
              override fun onItemSelected(parent:
               AdapterView<*>, view: View?, position: Int, id: Long) {
                  val selectedItem = parent.getItemAtPosition(position).toString()
                  var locale :Locale ?= null

                  if(selectedItem.equals(getString(R.string.hindi_language))){
                      locale = Locale("hi")
                      var resources = this@MainActivity.resources
                      val configuration = resources.configuration
                      configuration.setLocale(locale)

                      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                          this@MainActivity.createConfigurationContext(configuration)
                      } else {
                          resources.updateConfiguration(configuration, resources.displayMetrics)
                      }
                      finish();
                      startActivity(intent)
                  }

                  else if(selectedItem.equals(getString(R.string.marathi_language))){
                      locale = Locale("mr")
                      var resources = this@MainActivity.resources
                      val configuration = resources.configuration
                      configuration.setLocale(locale)

                      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                          this@MainActivity.createConfigurationContext(configuration)
                      } else {
                          resources.updateConfiguration(configuration, resources.displayMetrics)
                      }
                      finish();
                      startActivity(intent)
                  }
                  else if(selectedItem.equals(getString(R.string.english_language))){
                      locale = Locale.getDefault()
                      var resources = this@MainActivity.resources
                      val configuration = resources.configuration
                      configuration.setLocale(locale)

                      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                          this@MainActivity.createConfigurationContext(configuration)
                      } else {
                          resources.updateConfiguration(configuration, resources.displayMetrics)
                      }
                      finish();
                      startActivity(intent)
                  }

              }

              override fun onNothingSelected(parent: AdapterView<*>) {
              }
          }*/

    }


}