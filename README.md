# 5_AndroidCompose_YoannesDeDeo
Fitur yang harus ada pada aplikasi:

Halaman List

Menampilkan data dalam format List dengan jumlah minimal 10 item yang berbeda. Gunakanlah LazyList/LazyGrid untuk menyusun datanya. 

Memunculkan halaman detail ketika salah satu item ditekan. 

Halaman Detail

Menampilkan gambar dan informasi yang relevan pada halaman detail. 

Informasi yang relevan mencakup kesamaan informasi yang ditampilkan pada halaman utama dengan halaman detail.

Terdapat judul dan gambar yang sesuai dengan list

Terdapat informasi tambahan yang tidak sama dengan list

Halaman About

Menampilkan foto diri, nama, dan email yang terdaftar di Dicoding.

Dalam mengakses halaman about, pastikan terdapat tombol yang bisa digunakan untuk mengakses halamannya. Untuk cara mengaksesnya, Anda bisa mengimplementasikan:

Dengan menambahkan elemen View khusus (bisa option menu, tombol, atau tab) yang mengandung contentDescription “about_page”

Selain kriteria utama, terdapat kriteria opsional yang yang dapat Anda penuhi agar mendapat nilai yang lebih tinggi.

Fitur Pencarian

Aplikasi memiliki fitur pencarian berdasarkan kata kunci yang dimasukkan, dengan ketentuan:

Jika kolom pencarian tidak kosong, maka aplikasi hanya menampilkan data yang judulnya mengandung kata kunci yang dimasukkan.

Jika kolom pencariannya kosong, maka aplikasi menampilkan seluruh data.

Memanfaatkan ViewModel dalam membangun fitur pencarian.

Fitur Menambah & Menghapus Data

Aplikasi memiliki fitur untuk menambah dan menghapus data. Berikut beberapa skenario yang bisa diimplementasikan..

Menambah & menghapus data utama.

Menambah & menghapus data favorit.

Menambah & menghapus data keranjang.

Skenario sejenisnya.

Teknik penyimpanan cukup menggunakan fake List. Jika ingin menggunakan database asli atau API pun tidak masalah.

Jika data kosong, menampilkan informasi bahwa data kosong.
