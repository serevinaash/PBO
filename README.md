<h1>Open/Closed Principle (OCP)</h1>
Prinsip ini menyatakan bahwa kelas seharusnya terbuka untuk ekstensi tetapi tertutup untuk modifikasi. Artinya, kita harus dapat menambahkan fungsionalitas baru tanpa mengubah kode yang sudah ada.

<h1>Liskov Substitution Principle (LSP)</h1>
Prinsip ini menyatakan bahwa objek dari sebuah superclass harus bisa digantikan dengan objek dari subclassnya tanpa mempengaruhi kebenaran dari program tersebut.

Berikut adalah contoh implementasi yang menggabungkan kedua prinsip tersebut:

<b>1. Open/Closed Principle (OCP)</b>
Misalkan kita punya kelas Shape yang merupakan superclass untuk berbagai bentuk geometris. Kita ingin menambahkan bentuk baru tanpa mengubah kode yang sudah ada
Penjelasan:
Shape adalah kelas abstrak yang mendefinisikan metode area().
Rectangle dan Circle adalah kelas konkret yang mengimplementasikan metode area() dari kelas Shape.
AreaCalculator menghitung total area dari berbagai bentuk. Jika kita ingin menambahkan bentuk baru (misalnya Triangle), kita hanya perlu membuat kelas baru yang meng-extend Shape tanpa mengubah kode AreaCalculator
<b>2. Liskov Substitution Principle (LSP)</b>
Untuk memastikan bahwa subclass dapat menggantikan superclass tanpa mengubah perilaku yang diharapkan, kita bisa membuat subclass yang menggantikan superclass dalam program.
Penjelasan:

Square adalah subclass dari Shape yang juga mengimplementasikan metode area().
Main membuat objek Square dan menggunakannya dalam perhitungan total area. Kelas Square dapat menggantikan kelas Shape tanpa mempengaruhi perilaku program, sehingga memenuhi prinsip Liskov Substitution.
Dengan demikian, program ini mengikuti prinsip Open/Closed dengan memungkinkan penambahan bentuk baru tanpa mengubah kode yang sudah ada, dan prinsip Liskov Substitution dengan memastikan subclass dapat menggantikan superclass tanpa mempengaruhi perilaku yang diharapkan.
