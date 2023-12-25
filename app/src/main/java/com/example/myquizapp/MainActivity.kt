package com.example.myquizapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.view.View
import android.widget.Toast
import com.example.myquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    private lateinit var selectedImageUri: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        binding.v1.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, 45)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 45 && resultCode == RESULT_OK && data != null) {
            selectedImageUri = data.data!!
            binding.profileImage.setImageURI(selectedImageUri)

            binding.button.setOnClickListener {
                if (binding.input.text.toString().isEmpty())
                {
                    Toast.makeText(this,"Please Input your Name First",Toast.LENGTH_SHORT).show()
                }else{
                    val intent=Intent(this,QuestionActivity::class.java)
                    intent.putExtra("${setData.name}",binding.input.text.toString())
                    intent.putExtra("img",selectedImageUri)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}