package excercise2

fun main() {

    /** Latihan 1 List ✅
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

    var evenNumber = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0) {
            evenNumber.add(i)
        }
    }

    println("List of even number $evenNumber")

    /*Latihan 2 Map ✅
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...*/
    // Buat di bawah sini

    var month = mapOf(1 to "January", 2 to "February", 3 to "Maret", 4 to "April", 5 to "May", 6 to "Juny", 7 to "July", 8 to "August", 9 to "September", 10 to "October", 11 to "November", 12 to "December")

    /*Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti: ✅
    - Jan -> January
    - Feb -> February
    - Dst...*/
    // Buat di bawah sini

    month.forEach { number, name ->
        println("$number -> $name")
    }

   /* Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut: ✅
    - "It's {$monthNow} now, I was born in {$birthMonth}"*/
    // Buat di bawah sini
    val monthNow = month[11]
    val birthMonth = month[12]
    println("It's $monthNow now, I was born in $birthMonth")
}