package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();
        ResepModel resep5 = new ResepModel();

        // TODO 5. Masukkan data ke List
            ResepModel resep1 = new ResepModel();
        resep1.setJudul("Sop Tekwan");
        resep1.setPoster("https://ewiksoehoed.files.wordpress.com/2012/10/tekwan.jpg");
        resep1.setSummary("tekwan juga merupakan olahan dengan bahan utamanya terbuat dari ikan dan adanya tambahan tepung tapioka. \n" +
                "Hidangan ini juga cukup praktis dibuat dan bisa diawetkan dalam lemari es untuk beberapa waktu.");
        resep1.setDetail(
                "Bahan-Bahan yang Diperlukan Untuk Membuat Sajian Sop Tekwan yang enak\n" +
                "\n" +
                "Bahan Utama Membuat Sop Tekwan:\n" +
                "\n" +
                "300 gr Daging Tenggiri dihaluskan.\n" +
                "1 gelas Tepung Sagu.\n" +
                "1 sdm Tepung Terigu.\n" +
                "200 gr Udang cincang.\n" +
                "1 gelas Jamur kuping kering, direndam.\n" +
                "2 sdm Kimlo (bunga sedap malam kering).\n" +
                "1 batang Daun bawang.\n" +
                "8 siung Bawang merah , ulek.\n" +
                "4 siung Bawang Putih.\n" +
                "3 sdm Kecap asin.\n" +
                "1 sdm Gula.\n" +
                "1/2 sdt Lada (Merica).\n" +
                "2 liter Kaldu udang.\n" +
                "Cara Memasak Sop TEKWAN yang lezat:\n" +
                "\n" +
                "Uleni daging ikan, sagu dan terigu, boleh tambah garam lada sedikit saja supaya tidak tawar. Jika dirasakan adonan sulit kalis (kadang dapat ikan yang rada kering dagingnya), boleh tambahkan air 4 sdm.\n" +
                "Bulatkan adonan sebesar ujung jempol dan rebus hingga matang dalam air mendidih. Tiriskan.\n" +
                "Tumis bumbu halus hingga harum. Masukkan udang cincang, tumis hingga harum.\n" +
                "Masukkan kimlo, jamur kuping, kecap asin, merica, gula. Boleh tambah garam sesuai selera.\n" +
                "Masukkan hasil tumisan ke dalam kaldu, juga masukkan bola bola ikan tenggiri.\n" +
                "Terakhir masukkan daun bawang.\n");

        listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Sate Madura");
            resep2.setPoster("http://www.tokomesin.com/wp-content/uploads/2015/08/Sate-Ayam-Madura-tokomesin.jpeg");
            resep2.setSummary("Sate Madura adalah makanan khas yang berasal dari kota Madura JawaTimur.");
            resep2.setDetail(
                    "Bahan Bahan :"+
                    "\n250 gram dada ayam"+
                    "\n1 sdm air jeruk nipis"+
                    "\n1/4 sdt garam"+

                    "\n\nBahan Bumbu :"+
                    "\n100 gram kacang (digoreng)"+
                    "\n2-3 buah bawang putih"+
                    "\n2 buah bawang merah"+
                    "\n3 buah kemiri (disangrai)"+
                    "\n1/2 sdt merica bubuk"+
                    "\n150 ml air"+
                    "\n3 sdm kecap"+
                    "\n1 sdm gula merah"+
                    "\n1/4 sdt garam (secukupnya)"+
                    "\n5 sdm minyak/secukupnya (untuk menumis)"+

                    "\n\nBahan Pelengkap :"+
                    "\nSecukupnya bawang goreng"+
                    "\nSecukupnya bawang merah (iris tipis)"+
                    "\nSecukupnya cabe rawit (iris)"+

                    "\n\nLangkah :"+
                    "\n1. Cuci ayam sampai bersih, potong berbentuk dadu. Lumuri ayam dengan jeruk nipis dan garam. Tusukkan ayam pada tusuk sate."+
                    "\n2. Haluskan semua bahan bumbu(aku bahannya dihaluskan pakai chopper/diulek, terus ditambah air. bisa juga diblender sih, tapi teksturnya lebih lembut). Tumis bumbu dengan minyak sambil diaduk hingga mengental. Matikan api."+
                    "\n3. Ambil 3 sdm bumbu, tambahkan 1 sdm kecap dan 1 sdm air sebagai bahan celupan sebelum dibakar.biarkan selama minimal 15 menit agar bumbu meresap."+
                    "\n4. Bakar sate hingga berwarna kecoklatan. Angkat, sajikan sate ayam dengan bumbu kacang dan bahan pelengkap."
            );
            listResep.add(resep2);

        resep3.setJudul("Model Tahu khas Palembang");
        resep3.setPoster("http://www.resepmantap.com/pic/masakan/model-tahu-palembang.jpg");
        resep3.setSummary("Model adalah salah satu jenis kuliner dari Sumatera Selatan, khususnya Palembang dengan bahan utamanya tahu cina.");
        resep3.setDetail(
                "Bahan yang Diperlukan Untuk Membuat Sajian Sedap Model Tahu khas Palembang\n" +
                "\n" +
                "Bahan Model\n" +
                "\n" +
                "½ resep adonan dasar\n" +
                "4 tahu putih dipotong 2 diagonal\n" +
                "Minyak untuk menumis dan menggoreng\n" +
                "Bahan Kuah:\n" +
                "\n" +
                "1250 ml air\n" +
                "1 batang bawang daun, simpulkan\n" +
                "2 cm jahe\n" +
                "1 batang daun seledri, simpulkan\n" +
                "150 g udang kupas, rebus, haluskan\n" +
                "¼ sdt gula pasir\n" +
                "Garam secukupnya\n" +
                "1 blok kaldu instan\n" +
                "4 buah kepala udang besar di pecahkan buang kulitnya\n" +
                "100 gram wortel, potong dadu kemudian rebus sebentar\n" +
                "Bahan Bumbu yang dihaluskan:" +
                "\n" +
                "6 siung bawang putih\n" +
                "1 ½ sdt tongcai\n" +
                "1 sdt lada butir\n" +
                "1 sdm ebi\n" +
                "Bahan Pelengkap :\n" +
                "\n" +
                "Mentimun cacah.\n" +
                "Sambal cabai rawit.\n" +
                "1 batang bawang daun, iris halus.\n" +
                "Kecap asin dan cuka putih.\n" +
                "1 batang seledri, iris halus.\n" +
                "\nCara Membuatnya: \n" +
                "\n" +
                "Bentuk adonan seperti bola Tenis dan pipihkan.\n" +
                "Bungkus tahu dengan adonan dasar tadi.\n" +
                "Goreng dalam minyak panas.\n" +
                "Angkat dan tiriskan.\n" +
                "Masukkan udang.\n" +
                "Aduk hingga anyir udang hilang.\n" +
                "Didihkan air, masukkan pecahan kepala udang dan kaldu instan.\n" +
                "Masukkan jahe, daun bawang dan saledri.\n" +
                "Masukkan garam, gula, cicip rasanya.\n" +
                "Masukkan Model sebentar sampai lunak. Dan angkat, tiriskan.\n" +
                "Potong kasar model tahu, letakkan di mangkuk saji.\n" +
                "Tambahkan soun.\n" +
                "Tuang kuah model .\n" +
                "Taburi bawang goreng, irisan saledri dan timun cincang.\n" +
                "Sajikan.\n" +
                "Jika rasa asin kurang tambahkan kecap asin.n" +
                "Jika  ada kurang asam, tetes sedikit cuka putih.\n" +
                "Untuk rasa pedas, beri sambal cabai rawit.");


            listResep.add(resep3);
        resep4.setJudul("Nasi Gudeg");
        resep4.setPoster("http://gudegyudjumpusat.com/wp-content/uploads/2015/12/Nasi-Gudeg-Ayam-Paha-Atas-Kecil.jpg");
        resep4.setSummary("Nasi Gudeg adalah makanan khas yang berasal dari kota kraton Yogyakarta.");
        resep4.setDetail(
                "Bahan Bahan :"+
                        "\n1 kilogram Nangka muda di potong potong"+
                        "\n200 gram gula merah di sisir"+
                        "\nSantan kelapa kental"+
                        "\n10 butir telur di rebus"+
                        "\nDaun salam 2 atau 3 lembar"+
                        "\n1 liter air kelapa"+
                        "\nLengkuas potong memanjang"+

                        "\n\nBumbu Halus"+

                        "\nBawang merah 15 siung"+
                        "\nBawang putih 10 siung"+
                        "\nKemiri 10 buah disangrai"+
                        "\nKetumbar 2 sendok teh"+
                        "\nSatu setengah sendok teh merica"+
                        "\nGaram"+

                        "\n\nLangkah :"+
                        "\n1. Cuci buah nangka dengan bersih"+
                        "\n2. Sediakan Kuali (kendil) untuk memasak, masukan daun salam kemudian lengkuas dan masukan pula nangka, telur rebus serta gula aren"+
                        "\n3. Masukan air kelapa setengahnya saja kemudian masukan bumbu yang sudah dihaluskan aduk hingga tercampur rata"+
                        "\n4. Masukan setengah lagi air kelapa ke dalam panci hingga buah nangka terendam. Kemudian masak"+
                        "\n5. Masak bahan bahan dengan panci tertutup selama sekitar dua jam. Jika airnya sudah berkurang bahkan habis pisahkan telur rebusnya"+
                        "\n6. Santan dituangkan sambil nangkanya diaduk aduk."+
                        "\n7. Telur rebus dimasukkan kembali hingga terendam bersama dengan nangka"+
                        "\n8. Masak bahan bahan dengan api kecil kurang lebih empat jam. Biarkan hingga berubah kecoklatan dan kuahnya habis."
        );

        listResep.add(resep4);
        resep5.setJudul("Sop Ayam");
        resep5.setPoster("http://farlys.com/wp-content/uploads/Sup-Ayam-dengan-Tomat.jpg");
        resep5.setSummary("Sop Ayam adalah masakan untuk keluarga, dengan citra rasa kaldu yang menggoda.");
        resep5.setDetail(
                "Bahan :"+
                        "\n1 ekor ayam kampung" +
                        "\nBawang seledri atau daun bawang (sesuai selera)" +
                        "\n2 buah tomat segar" +
                        "\n3 buah kentang" +
                        "\n1 buah wortel" +
                        "\n3 buah bawang putih" +
                        "\n1 sdm garam" +
                        "\n½ sdt merica" +
                        "\n½ sdm penyedap rasa (tambahan)" +
                        "\n1L air bersih" +
                        "\nBawang goreng (tambahan)"+

                        "\n\nLangkah :"+
                        "\n1. Potong ayam menjadi beberapa bagian sesuai selera (Anda dapat memisahkan bagian tulang dan daging jika diinginkan)."+
                        "\n2. Cuci kentang dan kupas kulitnya hingga bersih."+
                        "\n3. Potong kentang menjadi bagian-bagian kecil sesuai selera."+
                        "\n4. Kupas wortel dan cuci hingga besih."+
                        "\n5. Potong wortel sesuai selera."+
                        "\n6. Cuci tomat hingga bersih."+
                        "\n7. Potong tomat sesuai selera."+
                        "\n8. Cuci bawang seledri atau daun bawang lalu iris."+
                        "\n9. Potong dan haluskan bawang putih."+
                        "\n10. Tuang 1 liter air atau secukupnya dalam wadah."+
                        "\n11. Masukkan potongan ayam dan bawang putih dalam wadah dan godok selama kurang lebih setengah jam."+
                        "\n12. Masukkan kentang, tomat, wortel, daun seledri atau daun bawang."+
                        "\n13. Tambahkan 1 sdm garam, ½ sdt merica, ½ sdm penyedap rasa (jika diinginkan)."+
                        "\n14. Biarkan hingga kentang dan wortel menjadi empuk."+
                        "\n15. Tuang isi dan kuah sop ayam dalam mangkok."+
                        "\n16. Tambahkan bawang goreng jika perlu." +
                        "\n17. Sajikan.");

        listResep.add(resep5);

        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
