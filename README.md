# Niang Apps 🐥

**Nama :** Anggita Risqi Nur Clarita

**NIM :** 312210450

**Kelas :** TI.22.A.4

**Mata Kuliah :** Pemrograman Mobile

**Dosen Pengampu :** Donny Maulana, S.Kom., M.M.S.I

## Daftar Isi <br>

| No  | Description   | Link                                                                                                                                       |
| --- | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
| 1   | Introduction  | [Click Here](#introduction)                                                                                                                |
| 2   | Splash Screen | [Click Here](#splash-screen)                                                                                                               |
| 3   | Menu-Menu     | [Click Here](#halaman-menu)                                                                                                                |
| 4   | Output        | [Click Here](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing)                                           |
| 5   | PDF           | [Click Here](https://github.com/AnggitaRisqiNC/MobileProgram2/files/13862087/Ujian.Akhir.Semester.Anggita.Risqi.Nur.Clarita_312210450.pdf) |

### Introduction

**Niang Apps** adalah aplikasi Android yang saya buat sebagai tugas mata kuliah Pemrograman Mobile. Aplikasi ini memiliki 9 menu, yaitu: **Hello**, **Count**, **Fibonacci**, **News**, **Chat**, **Alarm**, **Maps**, **Movie**, dan **None**. Setiap menu memiliki fungsinya masing-masing kecuali None. Dalam tugas ini, saya diperintahkan untuk membuat aplikasi Android menggunakan **bahasa pemrograman Java**.

### Splash Screen

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/d35eb074-6258-4955-8f9f-21cc9c081273"></a>

**Splashscreen** adalah tampilan awal yang muncul ketika aplikasi diluncurkan. Dalam **Niang Apps**, splashscreen menampilkan gambar **Axolotl** dan nama aplikasi **Niang Apps**. Gambar Axolotl di splashscreen **Niang Apps** ini dimaksudkan untuk memberikan kesan lucu, unik, dan menarik [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class SplashActivity extends AppCompatActivity {

      private static int SPLASH_SCREEN = 1250;

      Animation topAnim, bottomAnim;
      ImageView image;
      TextView slogan;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_splashlogo);
      ....
```

### Halaman Menu

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/dc3c3b3d-3d8d-41bc-8b23-f3d8c2c0c486"></a>

**Halaman menu** adalah halaman awal aplikasi yang menampilkan daftar menu-menu tersebut. Terdapat 9 menu, yaitu: **Hello**, **Count**, **Fibonacci**, **News**, **Chat**, **Alarm**, **Maps**, **Movie**, dan **None**. Setiap menu memiliki fungsinya masing-masing kecuali None. Tampilan ini dapat dibuat dengan menggunakan komponen LinierLayout, ImageView dan TextView [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class MainActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         findViewById(R.id.btnSetAlarm).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                  setAlarm();
      ....
}
```

### Menu 1: Hello

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/9ab64b4c-8d91-4026-810e-f97695c7cd42"></a>

Menu ini berisi tampilan tulisan **"Bagaimana Kabarnya?"** berwarna **biru**. Tampilan ini dapat dibuat dengan menggunakan komponen TextView, [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class HelloActivity extends AppCompatActivity {
      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_hello);
      }
   }
```

<br></br>

### Menu 2: Count

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/0eae209e-e4bd-482d-b7c9-45377dc047c8"></a>

Menu ini berisi project tentang bilangan toast count. Tampilan awal menu ini akan menampilkan angka 0. Ketika tombol "Count" diklik, angkanya akan **bertambah satu**. Tampilan ini dapat dibuat dengan menggunakan komponen Button dan TextView [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class CountActivity extends AppCompatActivity {
      private int nCount = 0;

      private TextView nShowCount;

      @SuppressLint("MissingInflatedId")
      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_count);
         nShowCount = findViewById(R.id.show_count);

      ....
}
```

### Menu 3: Fibonacci

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/d514ee7a-4365-4fed-8381-2f785f93af6f"></a>

Menu ini berisi project tentang bilangan Fibonacci. Tampilan awal menu ini akan menampilkan angka 0. Ketika tombol "Count" diklik, angkanya akan berubah menjadi **urutan bilangan Fibonacci**.

Sebelum tombol "Count" diklik, pengguna harus mengisi limit terlebih dahulu. **Limit** ini **menentukan jumlah bilangan Fibonacci yang akan ditampilkan**. Bilangan Fibonacci adalah urutan bilangan yang dimulai dengan 0 dan 1. Setiap bilangan selanjutnya adalah jumlah dua bilangan sebelumnya.

Angka-angka Fibonacci akan ditampilkan dalam **warna yang berbeda-beda** setiap berganti angka. Hal ini dilakukan untuk mempermudah membedakan setiap angka. Tampilan ini dapat dibuat dengan menggunakan komponen EditText, Button, dan TextView [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

<br></br>

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class FibonacciActivity extends AppCompatActivity {

      private long fibMinus1 = 0;
      private long fibMinus2 = 1;
      private long currentFib = 0;
      private TextView mShowFibonacci;
      private long i = 0;

      private long n = 0;
      private long limit = 0;

      private EditText mLimitInput;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_fibonacci);
         mShowFibonacci =findViewById(R.id.show_count);
         mLimitInput =findViewById(R.id.limit_input);
         updateFibonacciDisplay();
      }

      ....
}
```

### Menu 4: News

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/de7f024b-9083-430f-8854-88027f2b3c5f"></a>

Menu ini berisi project tentang berita kasus sianida. Tampilan awal menu ini akan menampilkan **berita kasus sianida yang dapat discroll**. Tampilan ini dapat dibuat dengan menggunakan komponen TextView, ScrollView, dan LinierLayout [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class ScrollingIcecold extends AppCompatActivity {
      @Override
      protected void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_scrollicecold);
      }
}
```

<br></br>

### Menu 5: Chat

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/44df785b-74d2-48d2-9543-f4e07c6ce243"></a>

Menu ini berisi tampilan chatting dimana kita bisa **send message** dan kita juga bisa **reply chat** itu. Tampilan ini dapat dibuat dengan menggunakan komponen EditText, Button, dan TextView [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini: (OneActivity.java)**

```java
public class OneActivity extends AppCompatActivity  {

      private static final String LOG_TAG = com.hello.Chat.OneActivity.class.getSimpleName();

      public static final String EXTRA_MESSAGE
               = "com.example.android.SecondActivity.extra.MESSAGE";

      public static final int TEXT_REQUEST = 1;

      private EditText mMessageEditText;

      ....
}
```

### Menu 6: Alarm

Menu ini berisi project tentang alarm. Ketika menu alarm diklik, maka secara otomatis akan mengarahkan ke **halaman alarm** di handphone kita. Tampilan ini dapat dibuat dengan menggunakan komponen Intent [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class AlarmActivity extends AppCompatActivity {

      private static final int SPLASH_SCREEN_TIMEOUT = 3000;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         getWindow().setFlags(
                  WindowManager.LayoutParams.FLAG_FULLSCREEN,
                  WindowManager.LayoutParams.FLAG_FULLSCREEN
         );
         setContentView(R.layout.activity_sleepalarm);

         new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                  Intent intent = new Intent(com.hello.Alarm.AlarmActivity.this, MainActivity.class);
                  startActivity(intent);
                  finish();
               }
         }, SPLASH_SCREEN_TIMEOUT);
      }
      public void createAlarm(String message, int hour, int minutes) {
         Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                  .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                  .putExtra(AlarmClock.EXTRA_HOUR, hour)
                  .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
         if (intent.resolveActivity(getPackageManager()) != null) {
               startActivity(intent);
         }
      }
}
```

### Menu 7: Maps

Menu ini berisi project tentang maps. Ketika menu maps diklik, maka secara otomatis akan mengarahkan ke **halaman Google Maps** yang ada di handphone kita. Tampilan ini dapat dibuat dengan menggunakan komponen Intent [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini:**

```java
public class MapsActivity extends AppCompatActivity {
      public void showMap(Uri geoLocation) {
         Intent intent= new Intent(Intent.ACTION_VIEW);
         intent.setData(geoLocation);
         if (intent.resolveActivity(getPackageManager()) != null) {
               startActivity(intent);
         }
      }
}
```

### Menu 8: Movie

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/ba25d6d8-db41-4742-bc44-a3feee7921e8"></a>

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/573643ec-4dfe-40b3-aa05-d12481cd9bcb"></a>

<img align="left" width="150" height="260" src="https://github.com/AnggitaRisqiNC/MobileProgram2/assets/115614419/1bf03ede-e260-4336-977f-83e8621ad467"></a>

<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>

Menu Movie menampilkan daftar film berdasarkan genre. Tampilan awal menu ini akan menampilkan daftar film bergenre romance. Ketika pengguna menggeser layar ke kiri, akan muncul daftar film bergenre action. Ketika pengguna menggeser layar ke kiri lagi, akan muncul daftar film bergenre thrillers.

Menu Movie menggunakan 3 fragment, masing-masing untuk genre **romance**, **action**, dan **thrillers**. Di setiap fragment, ada 3 film yang ditampilkan. Ketika mengklik salah satu film, akan muncul **video teaser/trailer** dan juga **sinopsis** dari film tersebut, [Output](https://drive.google.com/file/d/1zz0ege3rx7WsrB6NCaYc4gMsWL1MEvv8/view?usp=sharing).

**Berikut adalah sedikit kode java untuk membuat tampilan menu ini: (PagerActivity.java)**

```java
public class PagerActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_fragment);

         ViewPager viewPager = findViewById(R.id.viewPager);
         TabLayout tabLayout = findViewById(R.id.tab_layout);

         PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
         adapter.addFragment(new TabFragment1(), "Romance");
         adapter.addFragment(new TabFragment2(), "Action");
         adapter.addFragment(new TabFragment3(), "Thrillers");

         viewPager.setAdapter(adapter);
         tabLayout.setupWithViewPager(viewPager);
      }
}
```

### Menu 9: None

Menu ini **kosong**.

## Finish

<img align="left" width="150" height="150" src="https://octodex.github.com/images/mona-lovelace.jpg"></a>

Terima kasih telah meluangkan waktu untuk membaca penjelasan mengenai project **Pemrograman Mobile** Saya hingga akhir.

Saya harap penjelasan ini dapat memberikan gambaran yang jelas tentang aplikasi yang Saya buat di **Android Studio**. Untuk melihat **script yang lebih rinci** silahkan dapat di lihat langsung di dalam folder Ini [Main](https://github.com/AnggitaRisqiNC/MobileProgram2/tree/main/Main)

~ _**Anggita Risqi N**_
