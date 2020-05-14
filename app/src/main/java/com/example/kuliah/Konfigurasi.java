package com.example.kuliah;

public class Konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    public static final String URL_ADD="http://192.168.1.50/mobile/insert.php";
    public static final String URL_GET_ALL = "http://192.168.1.50/mobile/view.php";
    public static final String URL_GET_STD = "http://192.168.1.50/mobile/view2.php";
    public static final String URL_UPDATE_STD = "http://192.168.1.50/mobile/update.php";
    public static final String URL_DELETE_STD = "http://192.168.1.50/mobile/delete.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_STD_NIM = "nim";
    public static final String KEY_STD_NAMA = "nama";
    public static final String KEY_STD_JURUSAN = "jurusan";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_NIM = "nim";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String STD_ID = "std_id";
}
