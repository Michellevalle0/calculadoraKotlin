package mx.itson.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(),OnClickListener {

    private lateinit var txtValor1: EditText
    private lateinit var txtValor2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtValor1 = findViewById(R.id.txtprimervalor)
        txtValor1 = findViewById(R.id.txtsegundorvalor)
        val sumar =  findViewById<Button>(R.id.btnSumar)
        sumar.setOnClickListener(this)
        val restar = findViewById<Button>(R.id.btnRestar)
        restar.setOnClickListener(this)
        val multiplicar = findViewById<Button>(R.id.btnMultiplicar)
        restar.setOnClickListener(this)
        val dividir = findViewById<Button>(R.id.btnDividir)
        restar.setOnClickListener(this)

    }

    fun sumar(a: Int, b: Int) = a + b
    fun resta(a: Int, b: Int) = a - b
    fun multiplicar(a: Int, b: Int) = a * b
    fun division(a: Int, b: Int) = a / b

    override fun onClick(v: View?) {
        when(v?.id){
            (R.id.btnSumar) ->{
                var resultado = sumar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt())
                Toast.makeText(applicationContext, "El resultado de la suma es:" .plus(resultado),Toast.LENGTH_SHORT).show()
            }
            (R.id.btnRestar) ->{
                var resultado = resta(txtValor1.text.toString().toInt(),txtValor2.text.toString().toInt())
                Toast.makeText(applicationContext, "El resultado de la resta es:" .plus(resultado),Toast.LENGTH_SHORT).show()
            }
            (R.id.btnMultiplicar) ->{
                var resultado = sumar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt())
                Toast.makeText(applicationContext, "El resultado de la multiplicacion es:" .plus(resultado),Toast.LENGTH_SHORT).show()
            }
            (R.id.btnDivision) ->{
                var resultado = sumar(txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt())
                Toast.makeText(applicationContext, "El resultado de la division es:" .plus(resultado),Toast.LENGTH_SHORT).show()
            }
        }

    }



}
