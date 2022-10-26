package com.example.aplikasilistview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val list = mutableListOf<Indonesia>()

        list.add(Indonesia("Kucing kampung", "Ciri-Ciri kucing Kampung."
                +" Ciri-ciri kucing kampung umumnya terlihat lebih ramping dibanding beberapa jenis kucing. Tubuhnya yang ramping ini membuat kucing kampung menjadi salah satu jenis kucing yang lebih lincah dibanding beberapa ras kucing lain. Bentuk tubuh kucing ini umumnya juga pendek dengan leher yang kecil.", R.drawable.kampung))

        list.add(Indonesia("Kucing Persia", "Ciri-Ciri Kucing Persia."
                +"Kucing persia memiliki ciri khas fisik dengan bulu panjang lebat, wajah bulat, dan bentuk hidung yang pesek dan menggemaskan. Pada umumnya, karakter dari kucing persia cenderung tenang. Sifatnya pun manja dan akan sering menempel pada pemiliknya.", R.drawable.persia))

        list.add(Indonesia("Kucing Birman", "Ciri-Ciri Kucing Birman."
                +"Kucing Birman memiliki tubuh sedang, wajah bulat, dan hidung khas kucing lokal Romawi. Bulunya dikenal panjang, lebat, lembut, dan tidak mudah kusut. Pada matanya, kucing ini biasanya memiliki warna mata yang terang dan indah seperti warna krem muda, ungu, cokelat, dan toska.", R.drawable.birman))

        list.add(Indonesia("Kucing Siam", "Ciri-Ciri Kucing Siam."
                +" Kucing Siam mempunyai tubuh ramping ,kaki dan ekor panjang diikuti mata yang berwarna biru." +
                "Kucing Siam berbulu pendek bisa dikenali dari bulu penanda di kakinya, ekornya, ataupun wajahnya yang berwarna ungu, biru, lynx, merah, atau coklat." , R.drawable.siam))

        list.add(Indonesia("kucing Sphynx","Ciri-Ciri Kucing Sphynx."
                +"Sphynx adalah kucing berukuran sedang dengan penampilan cukup unik dan mencolok, tidak lain dari bentuk tubuhnya yang tidak berbulu, kulit yang keriput dan telinga yang besar seperti kelelawar. Umumnya, kucing jenis ini mempunyai tubuh ramping dan berotot. " , R.drawable.sphynx))

        listView.adapter = PulauIndonesia( this, R.layout.listkucing, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Kamu Memilih kucing Kampung", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Kamu Memilih Kucing Persia", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Kamu Memilih Kucing Birman", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Kamu Memilih Kucing Siam", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Kamu Memilih Kucing Sphynx", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Apakah anda yakin ingin keluar?")
            .setPositiveButton("Ya",
                DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("Tidak",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
            .show()
    }
}